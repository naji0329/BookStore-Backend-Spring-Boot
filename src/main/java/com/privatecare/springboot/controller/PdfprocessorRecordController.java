package com.privatecare.springboot.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.privatecare.springboot.entity.ApplicationRequest;
import com.privatecare.springboot.entity.AuthUser;
import com.privatecare.springboot.entity.CaregiverUploadRequest;
import com.privatecare.springboot.entity.PdfprocessorRecord;
import com.privatecare.springboot.entity.PdfprocessorRecordAhcaAttestation;
import com.privatecare.springboot.entity.PdfprocessorRecordAhcaLevel;
import com.privatecare.springboot.entity.PdfprocessorRecordAhcaRoster;
import com.privatecare.springboot.entity.PdfprocessorRecordAlzheimer;
import com.privatecare.springboot.entity.PdfprocessorRecordApplication;
import com.privatecare.springboot.entity.PdfprocessorRecordAssist;
import com.privatecare.springboot.entity.PdfprocessorRecordAutoInsurance;
import com.privatecare.springboot.entity.PdfprocessorRecordCeu;
import com.privatecare.springboot.entity.PdfprocessorRecordCprCert;
import com.privatecare.springboot.entity.PdfprocessorRecordDeposit;
import com.privatecare.springboot.entity.PdfprocessorRecordDoea;
import com.privatecare.springboot.entity.PdfprocessorRecordDoeaLevel;
import com.privatecare.springboot.entity.PdfprocessorRecordDoeaRoster;
import com.privatecare.springboot.entity.PdfprocessorRecordDomestic;
import com.privatecare.springboot.entity.PdfprocessorRecordDrivingVerification;
import com.privatecare.springboot.entity.PdfprocessorRecordDrivinglicense;
import com.privatecare.springboot.entity.PdfprocessorRecordEin;
import com.privatecare.springboot.entity.PdfprocessorRecordHhaCert;
import com.privatecare.springboot.entity.PdfprocessorRecordHipaa;
import com.privatecare.springboot.entity.PdfprocessorRecordHivVerification;
import com.privatecare.springboot.entity.PdfprocessorRecordNursingLicense;
import com.privatecare.springboot.entity.PdfprocessorRecordNursingValidation;
import com.privatecare.springboot.entity.PdfprocessorRecordOigSearch;
import com.privatecare.springboot.entity.PdfprocessorRecordPrivacy;
import com.privatecare.springboot.entity.PdfprocessorRecordProfLiability;
import com.privatecare.springboot.entity.PdfprocessorRecordReferences;
import com.privatecare.springboot.entity.PdfprocessorRecordSocialSecurity;
import com.privatecare.springboot.entity.PdfprocessorRecordSs4;
import com.privatecare.springboot.entity.PdfprocessorRecordStatement;
import com.privatecare.springboot.entity.PdfprocessorRecordVaccination;
import com.privatecare.springboot.entity.PdfprocessorRecordW9;
import com.privatecare.springboot.entity.PdfprocessorRecordfile;
import com.privatecare.springboot.services.IPdfprocessorRecordAhcaAttestationService;
import com.privatecare.springboot.services.IPdfprocessorRecordAhcaLevelService;
import com.privatecare.springboot.services.IPdfprocessorRecordAhcaRosterService;
import com.privatecare.springboot.services.IPdfprocessorRecordAlzheimerService;
import com.privatecare.springboot.services.IPdfprocessorRecordApplicationService;
import com.privatecare.springboot.services.IPdfprocessorRecordAssistService;
import com.privatecare.springboot.services.IPdfprocessorRecordAutoInsuranceService;
import com.privatecare.springboot.services.IPdfprocessorRecordCeuService;
import com.privatecare.springboot.services.IPdfprocessorRecordCprCertService;
import com.privatecare.springboot.services.IPdfprocessorRecordDepositService;
import com.privatecare.springboot.services.IPdfprocessorRecordDoeaLevelService;
import com.privatecare.springboot.services.IPdfprocessorRecordDoeaRosterService;
import com.privatecare.springboot.services.IPdfprocessorRecordDoeaService;
import com.privatecare.springboot.services.IPdfprocessorRecordDomesticService;
import com.privatecare.springboot.services.IPdfprocessorRecordDrivingVerificationService;
import com.privatecare.springboot.services.IPdfprocessorRecordDrivinglicenseService;
import com.privatecare.springboot.services.IPdfprocessorRecordEinService;
import com.privatecare.springboot.services.IPdfprocessorRecordHhaCertService;
import com.privatecare.springboot.services.IPdfprocessorRecordHipaaService;
import com.privatecare.springboot.services.IPdfprocessorRecordHivVerificationService;
import com.privatecare.springboot.services.IPdfprocessorRecordNursingLicenseService;
import com.privatecare.springboot.services.IPdfprocessorRecordNursingValidationService;
import com.privatecare.springboot.services.IPdfprocessorRecordOigSearchService;
import com.privatecare.springboot.services.IPdfprocessorRecordPrivacyService;
import com.privatecare.springboot.services.IPdfprocessorRecordProfLiabilityService;
import com.privatecare.springboot.services.IPdfprocessorRecordReferencesService;
import com.privatecare.springboot.services.IPdfprocessorRecordService;
import com.privatecare.springboot.services.IPdfprocessorRecordSocialSecurityService;
import com.privatecare.springboot.services.IPdfprocessorRecordSs4Service;
import com.privatecare.springboot.services.IPdfprocessorRecordStatementService;
import com.privatecare.springboot.services.IPdfprocessorRecordVaccinationService;
import com.privatecare.springboot.services.IPdfprocessorRecordW9Service;
import com.privatecare.springboot.services.IPdfprocessorRecordfileService;

@Controller
@CrossOrigin
@RequestMapping("record")
public class PdfprocessorRecordController {
	
	@Autowired
	private IPdfprocessorRecordService recordService;
	
	@Autowired
	private IPdfprocessorRecordfileService recordfileService;
	
	@Autowired
	private IPdfprocessorRecordHhaCertService hhaCertService;
	
	@Autowired
	private IPdfprocessorRecordDrivinglicenseService drivingliceseService;
	
	@Autowired
	private IPdfprocessorRecordSocialSecurityService socialSecurityService;

	@Autowired
	private IPdfprocessorRecordCprCertService cprCertService;
	
	@Autowired
	private IPdfprocessorRecordStatementService statementService;
	
	@Autowired
	private IPdfprocessorRecordAssistService assistService;
	
	@Autowired
	private IPdfprocessorRecordHivVerificationService hivVerificationService;
	
	@Autowired
	private IPdfprocessorRecordVaccinationService vaccinationService;
	
	@Autowired
	private IPdfprocessorRecordAutoInsuranceService autoInsuranceService;
	
	@Autowired
	private IPdfprocessorRecordProfLiabilityService profLiabilityService;
	
	@Autowired
	private IPdfprocessorRecordAlzheimerService alzheimerService;
	
	@Autowired
	private IPdfprocessorRecordDomesticService domesticService;
	
	@Autowired
	private IPdfprocessorRecordHipaaService hipaaService;
	
	@Autowired
	private IPdfprocessorRecordDepositService depositService;
	
	@Autowired
	private IPdfprocessorRecordW9Service w9Service;
	
	@Autowired
	private IPdfprocessorRecordSs4Service ss4Service;
	
	@Autowired
	private IPdfprocessorRecordApplicationService applicationService;
	
	@Autowired
	private IPdfprocessorRecordNursingLicenseService nursingLicenseService;
	
	@Autowired
	private IPdfprocessorRecordNursingValidationService nursingValidationService;

	@Autowired
	private IPdfprocessorRecordOigSearchService oigSearchService;
	
	@Autowired
	private IPdfprocessorRecordDrivingVerificationService drivingVerificationService;
	
	@Autowired
	private IPdfprocessorRecordAhcaAttestationService ahcaAttestationService;
	
	@Autowired
	private IPdfprocessorRecordAhcaLevelService ahcaLevelService;
	
	@Autowired
	private IPdfprocessorRecordPrivacyService privacyService;
	
	@Autowired
	private IPdfprocessorRecordReferencesService referencesService;
	
	@Autowired
	private IPdfprocessorRecordDoeaLevelService doeaLevelService;

	@Autowired
	private IPdfprocessorRecordDoeaService doeaService;
	
	@Autowired
	private IPdfprocessorRecordCeuService ceuService;
	
	@Autowired
	private IPdfprocessorRecordEinService einService;
	
	@Autowired
	private IPdfprocessorRecordAhcaRosterService ahcaRosterService;
	
	@Autowired
	private IPdfprocessorRecordDoeaRosterService doeaRosterService;
	
	@PostMapping("/caregiverupload")
	public ResponseEntity<String> create(@RequestBody List<CaregiverUploadRequest> requestList){
		System.out.println(requestList);
		for(int i=0; i<requestList.size(); i++) {
			PdfprocessorRecordfile savedRecordfile = new PdfprocessorRecordfile();
			CaregiverUploadRequest request = requestList.get(i);
			if(!StringUtils.isEmpty(request.getFileUrl())) {
				PdfprocessorRecordfile recordfile = new PdfprocessorRecordfile();
				recordfile.setFilename(request.getFileUrl());
				recordfile.setVerifiedById(null);
				savedRecordfile = recordfileService.add(recordfile);
			
				PdfprocessorRecord savedRecord = new PdfprocessorRecord();
				savedRecord.setEmail(request.getEmail());
				savedRecord.setName(request.getFirstname());
				savedRecord.setSurname(request.getLastname());
				String pattern = "yyyy-MM-dd";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
				savedRecord.setCreated(simpleDateFormat.format(new Date()));
				savedRecord.setLicenseType(request.getLicenseType());
				savedRecord.setSubscribed(request.getSubscribed());
				savedRecord = recordService.add(savedRecord);
				
				switch(request.getKey()) {
					case "hhaCert":
						PdfprocessorRecordHhaCert hhaCert = new PdfprocessorRecordHhaCert();
						hhaCert.setRecordId(savedRecord.getId());
						hhaCert.setRecordfileId(savedRecordfile.getId());
						hhaCertService.add(hhaCert);
					case "drivinglicense":
						PdfprocessorRecordDrivinglicense drivinglicense = new PdfprocessorRecordDrivinglicense();
						drivinglicense.setRecordId(savedRecord.getId());
						drivinglicense.setRecordfileId(savedRecordfile.getId());
						drivingliceseService.add(drivinglicense);
					case "socialSecurity":
						PdfprocessorRecordSocialSecurity socialSecurity = new PdfprocessorRecordSocialSecurity();
						socialSecurity.setRecordId(savedRecord.getId());
						socialSecurity.setRecordfileId(savedRecordfile.getId());
						socialSecurityService.add(socialSecurity);
					case "cprCert":
						PdfprocessorRecordCprCert cprCert = new PdfprocessorRecordCprCert();
						cprCert.setRecordId(savedRecord.getId());
						cprCert.setRecordfileId(savedRecordfile.getId());
						cprCertService.add(cprCert);
					case "statement":
						PdfprocessorRecordStatement statement = new PdfprocessorRecordStatement();
						statement.setRecordId(savedRecord.getId());
						statement.setRecordfileId(savedRecordfile.getId());
						statementService.add(statement);
					case "assist":
						PdfprocessorRecordAssist assist = new PdfprocessorRecordAssist();
						assist.setRecordId(savedRecord.getId());
						assist.setRecordfileId(savedRecordfile.getId());
						assistService.add(assist);
					case "hivVerfication":
						PdfprocessorRecordHivVerification hivVerfication = new PdfprocessorRecordHivVerification();
						hivVerfication.setRecordId(savedRecord.getId());
						hivVerfication.setRecordfileId(savedRecordfile.getId());
						hivVerificationService.add(hivVerfication);
					case "vaccination":
						PdfprocessorRecordVaccination vaccination = new PdfprocessorRecordVaccination();
						vaccination.setRecordId(savedRecord.getId());
						vaccination.setRecordfileId(savedRecordfile.getId());
						vaccinationService.add(vaccination);
					case "autoInsurance":
						PdfprocessorRecordAutoInsurance autoInsurance = new PdfprocessorRecordAutoInsurance();
						autoInsurance.setRecordId(savedRecord.getId());
						autoInsurance.setRecordfileId(savedRecordfile.getId());
						autoInsuranceService.add(autoInsurance);
					case "profLiability":
						PdfprocessorRecordProfLiability profLiability = new PdfprocessorRecordProfLiability();
						profLiability.setRecordId(savedRecord.getId());
						profLiability.setRecordfileId(savedRecordfile.getId());
						profLiabilityService.add(profLiability);
					case "alzheimer":
						PdfprocessorRecordAlzheimer alzheimer = new PdfprocessorRecordAlzheimer();
						alzheimer.setRecordId(savedRecord.getId());
						alzheimer.setRecordfileId(savedRecordfile.getId());
						alzheimerService.add(alzheimer);
					case "domestic":
						PdfprocessorRecordDomestic domestic = new PdfprocessorRecordDomestic();
						domestic.setRecordId(savedRecord.getId());
						domestic.setRecordfileId(savedRecordfile.getId());
						domesticService.add(domestic);
					case "hipaa":
						PdfprocessorRecordHipaa hipaa = new PdfprocessorRecordHipaa();
						hipaa.setRecordId(savedRecord.getId());
						hipaa.setRecordfileId(savedRecordfile.getId());
						hipaaService.add(hipaa);
					case "deposit":
						PdfprocessorRecordDeposit deposit = new PdfprocessorRecordDeposit();
						deposit.setRecordId(savedRecord.getId());
						deposit.setRecordfileId(savedRecordfile.getId());
						depositService.add(deposit);
					case "w9":
						PdfprocessorRecordW9 w9 = new PdfprocessorRecordW9();
						w9.setRecordId(savedRecord.getId());
						w9.setRecordfileId(savedRecordfile.getId());
						w9Service.add(w9);
					case "ss4":
						PdfprocessorRecordSs4 ss4 = new PdfprocessorRecordSs4();
						ss4.setRecordId(savedRecord.getId());
						ss4.setRecordfileId(savedRecordfile.getId());
						ss4Service.add(ss4);
					default:
						return null;
						
				}
			}
		}
		return new ResponseEntity<String>(HttpStatus.OK);	
	}
	
	@PostMapping("/addApplicant")
	public ResponseEntity<String> addApplicant(@RequestBody ApplicationRequest applicationRequest){
		List<CaregiverUploadRequest> requestList = applicationRequest.getCaregiverUploadRequestList();
		PdfprocessorRecord savedRecord = new PdfprocessorRecord();
		savedRecord.setEmail(applicationRequest.getEmail());
		savedRecord.setName(applicationRequest.getFirstname());
		savedRecord.setSurname(applicationRequest.getLastname());
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		savedRecord.setCreated(simpleDateFormat.format(new Date()));
		savedRecord.setLicenseType(applicationRequest.getLicenseType());
		savedRecord.setSubscribed(applicationRequest.getSubscribed());
		savedRecord = recordService.add(savedRecord);
		
		for(int i=0; i<requestList.size(); i++) {
			PdfprocessorRecordfile savedRecordfile = new PdfprocessorRecordfile();
			CaregiverUploadRequest request = requestList.get(i);
			if(!StringUtils.isEmpty(request.getFileUrl())) {
				PdfprocessorRecordfile recordfile = new PdfprocessorRecordfile();
				recordfile.setFilename(request.getFileUrl());
				recordfile.setVerifiedById(null);
				savedRecordfile = recordfileService.add(recordfile);
				
				switch(request.getKey()) {
					case "application":
						PdfprocessorRecordApplication application = new PdfprocessorRecordApplication();
						application.setRecordId(savedRecord.getId());
						application.setRecordfileId(savedRecordfile.getId());
						applicationService.add(application);
						break;
					case "nursingLicense":
						PdfprocessorRecordNursingLicense nursingLicense = new PdfprocessorRecordNursingLicense();
						nursingLicense.setRecordId(savedRecord.getId());
						nursingLicense.setRecordfileId(savedRecordfile.getId());
						nursingLicenseService.add(nursingLicense);
						break;
					case "nursingValidation":
						PdfprocessorRecordNursingValidation nursingValidation = new PdfprocessorRecordNursingValidation();
						nursingValidation.setRecordId(savedRecord.getId());
						nursingValidation.setRecordfileId(savedRecordfile.getId());
						nursingValidationService.add(nursingValidation);
						break;
					case "oigSearch":
						PdfprocessorRecordOigSearch oigSearch = new PdfprocessorRecordOigSearch();
						oigSearch.setRecordId(savedRecord.getId());
						oigSearch.setRecordfileId(savedRecordfile.getId());
						oigSearchService.add(oigSearch);
						break;
					case "drivingVerification":
						PdfprocessorRecordDrivingVerification drivingVerification = new PdfprocessorRecordDrivingVerification();
						drivingVerification.setRecordId(savedRecord.getId());
						drivingVerification.setRecordfileId(savedRecordfile.getId());
						drivingVerificationService.add(drivingVerification);
						break;
					case "ahcaAttestation":
						PdfprocessorRecordAhcaAttestation ahcaAttestation = new PdfprocessorRecordAhcaAttestation();
						ahcaAttestation.setRecordId(savedRecord.getId());
						ahcaAttestation.setRecordfileId(savedRecordfile.getId());
						ahcaAttestationService.add(ahcaAttestation);
						break;
					case "ahcaLevel":
						PdfprocessorRecordAhcaLevel ahcaLevel = new PdfprocessorRecordAhcaLevel();
						ahcaLevel.setRecordId(savedRecord.getId());
						ahcaLevel.setRecordfileId(savedRecordfile.getId());
						ahcaLevelService.add(ahcaLevel);
						break;
					case "privacy":
						PdfprocessorRecordPrivacy privacy = new PdfprocessorRecordPrivacy();
						privacy.setRecordId(savedRecord.getId());
						privacy.setRecordfileId(savedRecordfile.getId());
						privacyService.add(privacy);
						break;
					case "references":
						PdfprocessorRecordReferences references = new PdfprocessorRecordReferences();
						references.setRecordId(savedRecord.getId());
						references.setRecordfileId(savedRecordfile.getId());
						referencesService.add(references);
						break;
					case "doeaLevel":
						PdfprocessorRecordDoeaLevel doeaLevel = new PdfprocessorRecordDoeaLevel();
						doeaLevel.setRecordId(savedRecord.getId());
						doeaLevel.setRecordfileId(savedRecordfile.getId());
						doeaLevelService.add(doeaLevel);
						break;
					case "doea":
						PdfprocessorRecordDoea doea = new PdfprocessorRecordDoea();
						doea.setRecordId(savedRecord.getId());
						doea.setRecordfileId(savedRecordfile.getId());
						doeaService.add(doea);
						break;
					case "ceu":
						PdfprocessorRecordCeu ceu = new PdfprocessorRecordCeu();
						ceu.setRecordId(savedRecord.getId());
						ceu.setRecordfileId(savedRecordfile.getId());
						ceuService.add(ceu);
						break;
					case "ein":
						PdfprocessorRecordEin ein = new PdfprocessorRecordEin();
						ein.setRecordId(savedRecord.getId());
						ein.setRecordfileId(savedRecordfile.getId());
						einService.add(ein);
						break;
					case "ahcaRoster":
						PdfprocessorRecordAhcaRoster ahcaRoster = new PdfprocessorRecordAhcaRoster();
						ahcaRoster.setRecordId(savedRecord.getId());
						ahcaRoster.setRecordfileId(savedRecordfile.getId());
						ahcaRosterService.add(ahcaRoster);
						break;
					case "doeaRoster":
						PdfprocessorRecordDoeaRoster doeaRoster = new PdfprocessorRecordDoeaRoster();
						doeaRoster.setRecordId(savedRecord.getId());
						doeaRoster.setRecordfileId(savedRecordfile.getId());
						doeaRosterService.add(doeaRoster);
						break;
					case "hhaCert":
						PdfprocessorRecordHhaCert hhaCert = new PdfprocessorRecordHhaCert();
						hhaCert.setRecordId(savedRecord.getId()); 
						hhaCert.setRecordfileId(savedRecordfile.getId());
						hhaCertService.add(hhaCert);
						break;
					case "drivinglicense":
						PdfprocessorRecordDrivinglicense drivinglicense = new PdfprocessorRecordDrivinglicense();
						drivinglicense.setRecordId(savedRecord.getId());
						drivinglicense.setRecordfileId(savedRecordfile.getId());
						drivingliceseService.add(drivinglicense);
						break;
					case "socialSecurity":
						PdfprocessorRecordSocialSecurity socialSecurity = new PdfprocessorRecordSocialSecurity();
						socialSecurity.setRecordId(savedRecord.getId());
						socialSecurity.setRecordfileId(savedRecordfile.getId());
						socialSecurityService.add(socialSecurity);
						break;
					case "cprCert":
						PdfprocessorRecordCprCert cprCert = new PdfprocessorRecordCprCert();
						cprCert.setRecordId(savedRecord.getId());
						cprCert.setRecordfileId(savedRecordfile.getId());
						cprCertService.add(cprCert);
						break;
					case "statement":
						PdfprocessorRecordStatement statement = new PdfprocessorRecordStatement();
						statement.setRecordId(savedRecord.getId());
						statement.setRecordfileId(savedRecordfile.getId());
						statementService.add(statement);
						break;
					case "assist":
						PdfprocessorRecordAssist assist = new PdfprocessorRecordAssist();
						assist.setRecordId(savedRecord.getId());
						assist.setRecordfileId(savedRecordfile.getId());
						assistService.add(assist);
						break;
					case "hivVerfication":
						PdfprocessorRecordHivVerification hivVerfication = new PdfprocessorRecordHivVerification();
						hivVerfication.setRecordId(savedRecord.getId());
						hivVerfication.setRecordfileId(savedRecordfile.getId());
						hivVerificationService.add(hivVerfication);
						break;
					case "vaccination":
						PdfprocessorRecordVaccination vaccination = new PdfprocessorRecordVaccination();
						vaccination.setRecordId(savedRecord.getId());
						vaccination.setRecordfileId(savedRecordfile.getId());
						vaccinationService.add(vaccination);
						break;
					case "autoInsurance":
						PdfprocessorRecordAutoInsurance autoInsurance = new PdfprocessorRecordAutoInsurance();
						autoInsurance.setRecordId(savedRecord.getId());
						autoInsurance.setRecordfileId(savedRecordfile.getId());
						autoInsuranceService.add(autoInsurance);
						break;
					case "profLiability":
						PdfprocessorRecordProfLiability profLiability = new PdfprocessorRecordProfLiability();
						profLiability.setRecordId(savedRecord.getId());
						profLiability.setRecordfileId(savedRecordfile.getId());
						profLiabilityService.add(profLiability);
						break;
					case "alzheimer":
						PdfprocessorRecordAlzheimer alzheimer = new PdfprocessorRecordAlzheimer();
						alzheimer.setRecordId(savedRecord.getId());
						alzheimer.setRecordfileId(savedRecordfile.getId());
						alzheimerService.add(alzheimer);
						break;
					case "domestic":
						PdfprocessorRecordDomestic domestic = new PdfprocessorRecordDomestic();
						domestic.setRecordId(savedRecord.getId());
						domestic.setRecordfileId(savedRecordfile.getId());
						domesticService.add(domestic);
						break;
					case "hipaa":
						PdfprocessorRecordHipaa hipaa = new PdfprocessorRecordHipaa();
						hipaa.setRecordId(savedRecord.getId());
						hipaa.setRecordfileId(savedRecordfile.getId());
						hipaaService.add(hipaa);
						break;
					case "deposit":
						PdfprocessorRecordDeposit deposit = new PdfprocessorRecordDeposit();
						deposit.setRecordId(savedRecord.getId());
						deposit.setRecordfileId(savedRecordfile.getId());
						depositService.add(deposit);
						break;
					case "w9":
						PdfprocessorRecordW9 w9 = new PdfprocessorRecordW9();
						w9.setRecordId(savedRecord.getId());
						w9.setRecordfileId(savedRecordfile.getId());
						w9Service.add(w9);
						break;
					case "ss4":
						PdfprocessorRecordSs4 ss4 = new PdfprocessorRecordSs4();
						ss4.setRecordId(savedRecord.getId());
						ss4.setRecordfileId(savedRecordfile.getId());
						ss4Service.add(ss4);
						break;
					default:
						break;
						
				}
			}
		}
		return new ResponseEntity<String>(HttpStatus.OK);	
	}
	
	@GetMapping("/getApplicantByEmail")
	@ResponseBody
	public ResponseEntity<List<CaregiverUploadRequest>> getApplicantByEmail(@RequestParam("email") String email) {
		List<CaregiverUploadRequest> list = new ArrayList<CaregiverUploadRequest>();
		return new ResponseEntity<List<CaregiverUploadRequest>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/getApplicationById/{id}")
	@ResponseBody
	public ResponseEntity<PdfprocessorRecord> getApplicationById(@PathVariable("id") int id) {
		PdfprocessorRecord record = recordService.getApplicationById(id);
		return new ResponseEntity<PdfprocessorRecord>(record, HttpStatus.OK);
	}
	
	@GetMapping("/getApplicationRecordById/{id}")
	@ResponseBody
	public ResponseEntity<PdfprocessorRecordApplication> getApplicationRecordById(@PathVariable("id") int id) {
		PdfprocessorRecordApplication application = applicationService.getApplicationRecordById(id);
		if(application != null) {
			PdfprocessorRecord record = recordService.getApplicationById(application.getRecordId());
			application.setRecord(record);
			PdfprocessorRecordfile recordfile = recordfileService.getRecordfileById(application.getRecordfileId());
			application.setRecordfile(recordfile);
		}
		return new ResponseEntity<PdfprocessorRecordApplication>(application, HttpStatus.OK);
	}
}
