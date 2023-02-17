package com.privatecare.springboot.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.privatecare.springboot.util.FileUploadResponse;
import com.privatecare.springboot.util.FileUtil;

@Controller
@CrossOrigin
@RequestMapping("/file")
public class FileController {
	
//    private static final Logger logger = LoggerFactory.getLogger(FileController.class);
//
//    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//    public ResponseEntity<String> uploadFile(@RequestParam MultipartFile file) {
//        logger.info(String.format("File name '%s' uploaded successfully.", file.getOriginalFilename()));
//        return new ResponseEntity<String>(file.getOriginalFilename(), HttpStatus.OK);
//    }
    
    @PostMapping("/upload")
    public ResponseEntity<FileUploadResponse> uploadFiles(@RequestParam("files") MultipartFile file) {
        try {
            createDirIfNotExist();
            String fileName = "";
            // read and write the file to the local folder
            byte[] bytes = new byte[0];
            try {
                bytes = file.getBytes();
                Files.write(Paths.get(FileUtil.folderPath + file.getOriginalFilename()), bytes);
                fileName = file.getOriginalFilename();
            } catch (IOException e) {
            }
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new FileUploadResponse("Files uploaded successfully: " + fileName, fileName));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED)
                    .body(new FileUploadResponse("Exception to upload files!", null));
        }
    }
    
    /**
     * Create directory to save files, if not exist
     */
    private void createDirIfNotExist() {
        //create directory to save the files
        File directory = new File(FileUtil.folderPath);
        if (! directory.exists()){
            directory.mkdir();
        }
    }
    
    /**
     * Method to get the list of files from the file storage folder.
     * @return file
     */
    @GetMapping("/files")
    public ResponseEntity<String[]> getListFiles() {
        return ResponseEntity.status(HttpStatus.OK).body( new File(FileUtil.folderPath).list());
    }
    
    @RequestMapping("/download")
    public ResponseEntity downloadFile(@RequestParam String fileName) throws IOException {
        
        File file = new File(fileName);
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + file.getName())
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .contentLength(file.length()) 
                .body(resource);
    }
    
    @RequestMapping(value = "/previewPDF", method = RequestMethod.GET, produces = MediaType.APPLICATION_PDF_VALUE)
    void getFile(@RequestParam("fileUrl") String fileUrl, HttpServletResponse response) throws IOException {

        String fileName = fileUrl;
        String path = FileUtil.folderPath + fileName;

        File file = new File(path);
        FileInputStream inputStream = new FileInputStream(file);

        response.setContentType("application/pdf");
        response.setContentLength((int) file.length());
        response.setHeader("Content-Disposition", "inline;filename=\"" + fileName + "\"");

        FileCopyUtils.copy(inputStream, response.getOutputStream());

    }
    
//    @RequestMapping(value="/getpdf", method=RequestMethod.POST)
//    public ResponseEntity<byte[]> getPDF(@RequestBody String json) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_PDF);
//        // Here you have to set the actual filename of your pdf
//        String filename = "output.pdf";
//        headers.setContentDispositionFormData(filename, filename);
//        headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
//        ResponseEntity<byte[]> response = new ResponseEntity<>(contents, headers, HttpStatus.OK);
//        return response;
//    }
}
