package com.privatecare.springboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="pdfprocessor_record")
@Table(name="pdfprocessor_record")
public class PdfprocessorRecord implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="created")
	private String created;
	
	@Column(name="license_type")
	private String licenseType;
	
	@Column(name="email")
	private String email;
	
	@Column(name="subscribed")
	private Integer subscribed;
	
	@Column(name="employeeic")
	private String employeeic;
	
	@Column(name="application_sealed")
	private Integer applicationSealed;
	
	@Column(name="application_comments")
	private String applicationComments;
	
	@Column(name="application_updated")
	private Integer applicationUpdated;
	
	@Column(name="contractor_agree_sealed")
	private Integer contractorAgreeSealed;
	
	@Column(name="contractor_agree_comments")
	private String contractorAgreeComments;
	
	@Column(name="contractor_agree_updated")
	private Integer contractorAgreeUpdated;
	
	@Column(name="nursing_license_sealed")
	private Integer nursingLicenseSealed;
	
	@Column(name="nursing_license_valid_till")
	private String nursingLicenseValidTill;
	
	@Column(name="nursing_license_comments")
	private String nursingLicenseComments;
	
	@Column(name="nursing_license_updated")
	private Integer nursingLicenseUpdated;
	
	@Column(name="nursing_validation_sealed")
	private Integer nursingValidationSealed;
	
	@Column(name="nursing_validation_comments")
	private String nursingValidationComments;
	
	@Column(name="nursing_validation_updated")
	private Integer nursingValidationUpdated;
	
	@Column(name="hha_cert_sealed")
	private Integer hhaCertSealed;
	
	@Column(name="hha_cert_comments")
	private String hhaCertComments;
	
	@Column(name="hha_cert_updated")
	private Integer hhaCertUpdated;
	
	@Column(name="hha_doea_sealed")
	private Integer hhaDoeaSealed;
	
	@Column(name="hha_doea_comments")
	private String hhaDoeaComments;
	
	@Column(name="hha_doea_updated")
	private Integer hhaDoeaUpdated;
	
	@Column(name="hha_school_sealed")
	private Integer hhaSchoolSealed;
	
	@Column(name="hha_school_comments")
	private String hhaSchoolComments;
	
	@Column(name="hha_school_updated")
	private Integer hhaSchoolUpdated;
	
	@Column(name="oig_search_sealed")
	private Integer oigSearchSealed;
	
	@Column(name="oig_search_comments")
	private String oigSearchComments;
	
	@Column(name="oig_search_updated")
	private Integer oigSearchUpdated;
	
	@Column(name="drivinglicense_sealed")
	private Integer drivingLicenseSealed;
	
	@Column(name="drivinglicense_comments")
	private String dirvingLicenseComments;
	
	@Column(name="drivinglicense_valid_till")
	private String drivingLicenseValidTill;
	
	@Column(name="drivinglicense_updated")
	private Integer drivingLicenseUpdated;
	
	@Column(name="driving_verification_sealed")
	private Integer drivingVerificationSealed;
	
	@Column(name="driving_verification_comments")
	private String drivingVerificationComments;
	
	@Column(name="driving_verification_updated")
	private Integer drivingVerificationUpdated;
	
	@Column(name="social_security_sealed")
	private Integer socialSecuritySealed;
	
	@Column(name="social_security_comments")
	private String socialSecurityComments;
	
	@Column(name="social_security_updated")
	private Integer socialSecurityUpdated;
	
	@Column(name="cpr_cert_sealed")
	private Integer cprCertSealed;
	
	@Column(name="cpr_cert_valid_till")
	private String cprCertValidTill;

	@Column(name="cpr_cert_comments")
	private String cprCertComments;
	
	@Column(name="cpr_cert_updated")
	private Integer cprCertUpdated;
	
	@Column(name="statement_sealed")
	private Integer statementSealed;
	
	@Column(name="statement_comments")
	private String statementComments;
	
	@Column(name="statement_updated")
	private Integer statementUpdated;
	
	@Column(name="dr_verification_sealed")
	private Integer drVerificationSealed;
	
	@Column(name="dr_verification_comments")
	private String drVerificationComments;
	
	@Column(name="dr_verification_updated")
	private Integer drVerificationUpdated;
	
	@Column(name="assist_sealed")
	private Integer assistSealed;
	
	@Column(name="assist_comments")
	private String assistComments;
	
	@Column(name="assist_updated")
	private Integer assistUpdated;
	
	@Column(name="hiv_verification_sealed")
	private Integer hivVerificationSealed;
	
	@Column(name="hiv_verification_comments")
	private String hivVerificationComments;
	
	@Column(name="hiv_verification_updated")
	private Integer hivVerificationUpdated;
	
	@Column(name="ahca_attestation_sealed")
	private Integer ahcaAttestationSealed;
	
	@Column(name="ahca_attestation_comments")
	private String ahcaAttestationComments;
	
	@Column(name="ahca_attestation_updated")
	private Integer ahcaAttestationUpdated;
	
	@Column(name="ahca_level_sealed")
	private Integer ahcaLevelSealed;
	
	@Column(name="ahca_level_valid_till")
	private String ahcaLevelValidTill;
	
	@Column(name="ahca_level_comments")
	private String ahcaLevelComments;
	
	@Column(name="ahca_level_updated")
	private Integer ahcaLevelUpdated;
	
	@Column(name="privacy_sealed")
	private Integer privacySealed;
	
	@Column(name="privacy_comments")
	private String privacyComments;
	
	@Column(name="privacy_updated")
	private Integer privacyUpdated;
	
	@Column(name="references_sealed")
	private Integer referencesSealed;
	
	@Column(name="references_comments")
	private String referencesComments;
	
	@Column(name="references_updated")
	private Integer referencesUpdated;
	
	@Column(name="references2_sealed")
	private Integer references2Sealed;
	
	@Column(name="references2_comments")
	private String references2Comments;
	
	@Column(name="references2_updated")
	private Integer references2Updated;
	
	@Column(name="vaccination_sealed")
	private Integer vaccinationSealed;
	
	@Column(name="vaccination_comments")
	private String vaccinationComments;
	
	@Column(name="vaccination_updated")
	private Integer vaccinationUpdated;
	
	@Column(name="auto_insurance_sealed")
	private Integer autoInsuranceSealed;
	
	@Column(name="auto_insurance_valid_till")
	private String autoInsuranceValidTill;
	
	@Column(name="auto_insurance_comments")
	private String autoInsuranceComments;
	
	@Column(name="auto_insurance_updated")
	private Integer autoInsuranceUpdated;
	
	@Column(name="prof_liability_sealed")
	private Integer profLiabilitySealed;
	
	@Column(name="prof_liability_valid_till")
	private String profLiabilityValidTill;
	
	@Column(name="prof_liability_comments")
	private String profLiabilityComments;
	
	@Column(name="prof_liability_updated")
	private Integer profLiabilityUpdated;
	
	@Column(name="doea_level_sealed")
	private Integer doeaLevelSealed;
	
	@Column(name="doea_level_comments")
	private String doeaLevelComments;
	
	@Column(name="doea_level_updated")
	private Integer doeaLevelUpdated;
	
	@Column(name="doea_sealed")
	private Integer doeaSealed;
	
	@Column(name="doea_comments")
	private String doeaComments;
	
	@Column(name="doea_updated")
	private Integer doeaUpdated;
	
	@Column(name="alzheimer_sealed")
	private Integer alzheimerSealed;
	
	@Column(name="alzheimer_comments")
	private String alzheimerComments;
	
	@Column(name="alzheimer_updated")
	private Integer alzheimerUpdated;
	
	@Column(name="domestic_sealed")
	private Integer domesticSealed;
	
	@Column(name="domestic_comments")
	private String domesticComments;
	
	@Column(name="domestic_updated")
	private Integer domesticUpdated;
	
	@Column(name="hipaa_sealed")
	private Integer hippaSealed;
	
	@Column(name="hipaa_comments")
	private String hipaaComments;
	
	@Column(name="hipaa_updated")
	private Integer hipaaUpdated;
	
	@Column(name="ceu_sealed")
	private Integer ceuSealed;
	
	@Column(name="ceu_comments")
	private String ceuComments;
	
	@Column(name="ceu_updated")
	private Integer ceuUpdated;
	
	@Column(name="deposit_sealed")
	private Integer depositSealed;
	
	@Column(name="deposit_comments")
	private String depositComments;
	
	@Column(name="deposit_updated")
	private Integer depositUpdated;
	
	@Column(name="w9_sealed")
	private Integer w9Sealed;
	
	@Column(name="w9_comments")
	private String w9Comments;
	
	@Column(name="w9_updated")
	private Integer w9Updated;
	
	@Column(name="ein_sealed")
	private Integer einSealed;
	
	@Column(name="ein_comments")
	private String einComments;
	
	@Column(name="ein_updated")
	private Integer einUpdated;
	
	@Column(name="everify_sealed")
	private Integer everifySealed;
	
	@Column(name="everify_comments")
	private String everifyComments;
	
	@Column(name="everify_updated")
	private Integer everifyUpdated;
	
	@Column(name="ahca_roster_sealed")
	private Integer ahcaRosterSealed;
	
	@Column(name="ahca_roster_comments")
	private String ahcaRosterComments;
	
	@Column(name="ahca_roster_updated")
	private Integer ahcaRosterUpdated;
	
	@Column(name="doea_roster_sealed")
	private Integer doeaRosterSealed;
	
	@Column(name="doea_roster_comments")
	private String doeaRosterComments;
	
	@Column(name="doea_roster_updated")
	private Integer doeaRosterUpdated;
	
	@Column(name="confirmation_sealed")
	private Integer confirmationSealed;
	
	@Column(name="confirmation_comments")
	private String confirmationComments;
	
	@Column(name="confirmation_updated")
	private Integer confirmationUpdated;
	
	@Column(name="finalized")
	private Integer finalized;
	
	@Column(name="archived")
	private Integer archived;
	
	@Column(name="hr_mail_sent")
	private String hrMailSent;
	
	@Column(name="sup_mail_sent")
	private String supMailSent;
	
	@Column(name="adm_mail_sent")
	private String admMailSent;
	
	@Column(name="has_new_rejections")
	private Integer hasNewRejections;
	
	@Column(name="ahca_attestation_sealed_by_id")
	private Integer ahcaAttestationSealedById;

	@Column(name="ahca_level_sealed_by_id")
	private Integer ahcaLevelSealedById;
	
	@Column(name="ahca_roster_sealed_by_id")
	private Integer ahcaRosterSealedById;
	
	@Column(name="alzheimer_sealed_by_id")
	private Integer alzheimerSealedById;
	
	@Column(name="application_sealed_by_id")
	private Integer applicationSealedById;
	
	@Column(name="archived_by_id")
	private Integer archivedById;
	
	@Column(name="assist_sealed_by_id")
	private Integer assistSealedById;
	
	@Column(name="auto_insurance_sealed_by_id")
	private Integer autoInsuranceSealedById;
	
	@Column(name="ceu_sealed_by_id")
	private Integer ceuSealedById;
	
	@Column(name="confirmation_sealed_by_id")
	private Integer confirmationSealedById;
	
	@Column(name="contractor_agree_sealed_by_id")
	private Integer contractorAgreeSealedById;
	
	@Column(name="cpr_cert_sealed_by_id")
	private Integer cprCertSealedById;
	
	@Column(name="created_by_id")
	private Integer createdById;
	
	@Column(name="deposit_sealed_by_id")
	private Integer depositSealedById;
	
	@Column(name="doea_level_sealed_by_id")
	private Integer doeaLevelSealedById;
	
	@Column(name="doea_roster_sealed_by_id")
	private Integer doeaRosterSealedById;
	
	@Column(name="doea_sealed_by_id")
	private Integer doeaSealedById;
	
	@Column(name="domestic_sealed_by_id")
	private Integer domesticSealedById;
	
	@Column(name="dr_verification_sealed_by_id")
	private Integer drVerificationSealedById;
	
	@Column(name="drivinglicense_sealed_by_id")
	private Integer drivingLicenseSealedById;
	
	@Column(name="driving_verification_sealed_by_id")
	private Integer drivingVerificationSealedById;
	
	@Column(name="ein_sealed_by_id")
	private Integer einSealedById;
	
	@Column(name="everify_sealed_by_id")
	private Integer everifySealedById;
	
	@Column(name="finalized_by_id")
	private Integer finalizedById;
	
	@Column(name="hha_cert_sealed_by_id")
	private Integer hhaCertSealedById;
	
	@Column(name="hha_doea_sealed_by_id")
	private Integer hhaDoeaSealedById;
	
	@Column(name="hha_school_sealed_by_id")
	private Integer hhaSchoolSealedById;
	
	@Column(name="hipaa_sealed_by_id")
	private Integer hipaaSealedById;
	
	@Column(name="hiv_verification_sealed_by_id")
	private Integer hivVerificationSealedById;
	
	@Column(name="nursing_license_sealed_by_id")
	private Integer nursingLicenseSealedById;
	
	@Column(name="nursing_validation_sealed_by_id")
	private Integer nursingValidationSealedById;
	
	@Column(name="oig_search_sealed_by_id")
	private Integer oigSearchSealedById;
	
	@Column(name="privacy_sealed_by_id")
	private Integer privacySealedById;
	
	@Column(name="prof_liability_sealed_by_id")
	private Integer profLiabilitySealedById;
	
	@Column(name="references2_sealed_by_id")
	private Integer references2SealedById;
	
	@Column(name="references_sealed_by_id")
	private Integer referencesSealedById;
	
	@Column(name="social_security_sealed_by_id")
	private Integer socialSecuritySealedById;
	
	@Column(name="statement_sealed_by_id")
	private Integer statementSealedById;
	
	@Column(name="vaccination_sealed_by_id")
	private Integer vaccinationSealedById;
	
	@Column(name="w9_sealed_by_id")
	private Integer w9SealedById;
	
	@Column(name="sex_comments")
	private String sexComments;
	
	@Column(name="sex_sealed_by_id")
	private Integer sexSealedById;
	
	@Column(name="sex_updated")
	private Integer sexUpdated;
	
	@Column(name="ss4_comments")
	private String ss4Comments;
	
	@Column(name="ss4_sealed")
	private Integer ss4Sealed;
	
	@Column(name="ss4_sealed_by_id")
	private Integer ss4SealedById;
	
	@Column(name="ss4_updated")
	private Integer ss4Updated;
	
	@Column(name="adrd_comments")
	private String adrdComments;
	
	@Column(name="adrd_sealed")
	private Integer adrdSealed;
	
	@Column(name="adrd_sealed_by_id")
	private Integer adrdSealedById;
	
	@Column(name="adrd_updated")
	private Integer adrdUpdated;
	
	@Column(name="employment_agree_comments")
	private String employmentAgreeComments;
	
	@Column(name="employment_agree_sealed")
	private Integer employmentAgreeSealed;
	
	@Column(name="employment_agree_sealed_by_id")
	private Integer employmentAgreeSealedById;
	
	@Column(name="employment_agree_updated")
	private Integer employmentAgreeUpdated;
	
	@Column(name="ppd_comments")
	private String ppdComments;
	
	@Column(name="ppd_sealed")
	private Integer ppdSealed;
	
	@Column(name="ppd_sealed_by_id")
	private Integer ppdSealedById;
	
	@Column(name="ppd_updated")
	private Integer ppdUpdated;
	
	@Column(name="w4_comments")
	private String w4Comments;
	
	@Column(name="w4_sealed")
	private Integer w4Sealed;
	
	@Column(name="w4_sealed_by_id")
	private Integer w4SealedById;
	
	@Column(name="w4_updated")
	private Integer w4Updated;
	
	@Column(name="hha_skills_comments")
	private String hhaSkillsComments;
	
	@Column(name="hha_skills_sealed")
	private Integer hhaSkillsSealed;
	
	@Column(name="hha_skills_sealed_by_id")
	private Integer hhaSkillsSealedById;
	
	@Column(name="hha_skills_updated")
	private Integer hhaSkillsUpdated;
	
	@Column(name="sex_sealed")
	private Integer sexSealed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSubscribed() {
		return subscribed;
	}

	public void setSubscribed(Integer subscribed) {
		this.subscribed = subscribed;
	}

	public String getEmployeeic() {
		return employeeic;
	}

	public void setEmployeeic(String employeeic) {
		this.employeeic = employeeic;
	}

	public Integer getApplicationSealed() {
		return applicationSealed;
	}

	public void setApplicationSealed(Integer applicationSealed) {
		this.applicationSealed = applicationSealed;
	}

	public String getApplicationComments() {
		return applicationComments;
	}

	public void setApplicationComments(String applicationComments) {
		this.applicationComments = applicationComments;
	}

	public Integer getApplicationUpdated() {
		return applicationUpdated;
	}

	public void setApplicationUpdated(Integer applicationUpdated) {
		this.applicationUpdated = applicationUpdated;
	}

	public Integer getContractorAgreeSealed() {
		return contractorAgreeSealed;
	}

	public void setContractorAgreeSealed(Integer contractorAgreeSealed) {
		this.contractorAgreeSealed = contractorAgreeSealed;
	}

	public String getContractorAgreeComments() {
		return contractorAgreeComments;
	}

	public void setContractorAgreeComments(String contractorAgreeComments) {
		this.contractorAgreeComments = contractorAgreeComments;
	}

	public Integer getContractorAgreeUpdated() {
		return contractorAgreeUpdated;
	}

	public void setContractorAgreeUpdated(Integer contractorAgreeUpdated) {
		this.contractorAgreeUpdated = contractorAgreeUpdated;
	}

	public Integer getNursingLicenseSealed() {
		return nursingLicenseSealed;
	}

	public void setNursingLicenseSealed(Integer nursingLicenseSealed) {
		this.nursingLicenseSealed = nursingLicenseSealed;
	}

	public String getNursingLicenseValidTill() {
		return nursingLicenseValidTill;
	}

	public void setNursingLicenseValidTill(String nursingLicenseValidTill) {
		this.nursingLicenseValidTill = nursingLicenseValidTill;
	}

	public String getNursingLicenseComments() {
		return nursingLicenseComments;
	}

	public void setNursingLicenseComments(String nursingLicenseComments) {
		this.nursingLicenseComments = nursingLicenseComments;
	}

	public Integer getNursingLicenseUpdated() {
		return nursingLicenseUpdated;
	}

	public void setNursingLicenseUpdated(Integer nursingLicenseUpdated) {
		this.nursingLicenseUpdated = nursingLicenseUpdated;
	}

	public Integer getNursingValidationSealed() {
		return nursingValidationSealed;
	}

	public void setNursingValidationSealed(Integer nursingValidationSealed) {
		this.nursingValidationSealed = nursingValidationSealed;
	}

	public String getNursingValidationComments() {
		return nursingValidationComments;
	}

	public void setNursingValidationComments(String nursingValidationComments) {
		this.nursingValidationComments = nursingValidationComments;
	}

	public Integer getNursingValidationUpdated() {
		return nursingValidationUpdated;
	}

	public void setNursingValidationUpdated(Integer nursingValidationUpdated) {
		this.nursingValidationUpdated = nursingValidationUpdated;
	}

	public Integer getHhaCertSealed() {
		return hhaCertSealed;
	}

	public void setHhaCertSealed(Integer hhaCertSealed) {
		this.hhaCertSealed = hhaCertSealed;
	}

	public String getHhaCertComments() {
		return hhaCertComments;
	}

	public void setHhaCertComments(String hhaCertComments) {
		this.hhaCertComments = hhaCertComments;
	}

	public Integer getHhaCertUpdated() {
		return hhaCertUpdated;
	}

	public void setHhaCertUpdated(Integer hhaCertUpdated) {
		this.hhaCertUpdated = hhaCertUpdated;
	}

	public Integer getHhaDoeaSealed() {
		return hhaDoeaSealed;
	}

	public void setHhaDoeaSealed(Integer hhaDoeaSealed) {
		this.hhaDoeaSealed = hhaDoeaSealed;
	}

	public String getHhaDoeaComments() {
		return hhaDoeaComments;
	}

	public void setHhaDoeaComments(String hhaDoeaComments) {
		this.hhaDoeaComments = hhaDoeaComments;
	}

	public Integer getHhaDoeaUpdated() {
		return hhaDoeaUpdated;
	}

	public void setHhaDoeaUpdated(Integer hhaDoeaUpdated) {
		this.hhaDoeaUpdated = hhaDoeaUpdated;
	}

	public Integer getHhaSchoolSealed() {
		return hhaSchoolSealed;
	}

	public void setHhaSchoolSealed(Integer hhaSchoolSealed) {
		this.hhaSchoolSealed = hhaSchoolSealed;
	}

	public String getHhaSchoolComments() {
		return hhaSchoolComments;
	}

	public void setHhaSchoolComments(String hhaSchoolComments) {
		this.hhaSchoolComments = hhaSchoolComments;
	}

	public Integer getHhaSchoolUpdated() {
		return hhaSchoolUpdated;
	}

	public void setHhaSchoolUpdated(Integer hhaSchoolUpdated) {
		this.hhaSchoolUpdated = hhaSchoolUpdated;
	}

	public Integer getOigSearchSealed() {
		return oigSearchSealed;
	}

	public void setOigSearchSealed(Integer oigSearchSealed) {
		this.oigSearchSealed = oigSearchSealed;
	}

	public String getOigSearchComments() {
		return oigSearchComments;
	}

	public void setOigSearchComments(String oigSearchComments) {
		this.oigSearchComments = oigSearchComments;
	}

	public Integer getOigSearchUpdated() {
		return oigSearchUpdated;
	}

	public void setOigSearchUpdated(Integer oigSearchUpdated) {
		this.oigSearchUpdated = oigSearchUpdated;
	}

	public Integer getDrivingLicenseSealed() {
		return drivingLicenseSealed;
	}

	public void setDrivingLicenseSealed(Integer drivingLicenseSealed) {
		this.drivingLicenseSealed = drivingLicenseSealed;
	}

	public String getDirvingLicenseComments() {
		return dirvingLicenseComments;
	}

	public void setDirvingLicenseComments(String dirvingLicenseComments) {
		this.dirvingLicenseComments = dirvingLicenseComments;
	}

	public String getDrivingLicenseValidTill() {
		return drivingLicenseValidTill;
	}

	public void setDrivingLicenseValidTill(String drivingLicenseValidTill) {
		this.drivingLicenseValidTill = drivingLicenseValidTill;
	}

	public Integer getDrivingLicenseUpdated() {
		return drivingLicenseUpdated;
	}

	public void setDrivingLicenseUpdated(Integer drivingLicenseUpdated) {
		this.drivingLicenseUpdated = drivingLicenseUpdated;
	}

	public Integer getDrivingVerificationSealed() {
		return drivingVerificationSealed;
	}

	public void setDrivingVerificationSealed(Integer drivingVerificationSealed) {
		this.drivingVerificationSealed = drivingVerificationSealed;
	}

	public String getDrivingVerificationComments() {
		return drivingVerificationComments;
	}

	public void setDrivingVerificationComments(String drivingVerificationComments) {
		this.drivingVerificationComments = drivingVerificationComments;
	}

	public Integer getDrivingVerificationUpdated() {
		return drivingVerificationUpdated;
	}

	public void setDrivingVerificationUpdated(Integer drivingVerificationUpdated) {
		this.drivingVerificationUpdated = drivingVerificationUpdated;
	}

	public Integer getSocialSecuritySealed() {
		return socialSecuritySealed;
	}

	public void setSocialSecuritySealed(Integer socialSecuritySealed) {
		this.socialSecuritySealed = socialSecuritySealed;
	}

	public String getSocialSecurityComments() {
		return socialSecurityComments;
	}

	public void setSocialSecurityComments(String socialSecurityComments) {
		this.socialSecurityComments = socialSecurityComments;
	}

	public Integer getSocialSecurityUpdated() {
		return socialSecurityUpdated;
	}

	public void setSocialSecurityUpdated(Integer socialSecurityUpdated) {
		this.socialSecurityUpdated = socialSecurityUpdated;
	}

	public Integer getCprCertSealed() {
		return cprCertSealed;
	}

	public void setCprCertSealed(Integer cprCertSealed) {
		this.cprCertSealed = cprCertSealed;
	}

	public String getCprCertValidTill() {
		return cprCertValidTill;
	}

	public void setCprCertValidTill(String cprCertValidTill) {
		this.cprCertValidTill = cprCertValidTill;
	}

	public String getCprCertComments() {
		return cprCertComments;
	}

	public void setCprCertComments(String cprCertComments) {
		this.cprCertComments = cprCertComments;
	}

	public Integer getCprCertUpdated() {
		return cprCertUpdated;
	}

	public void setCprCertUpdated(Integer cprCertUpdated) {
		this.cprCertUpdated = cprCertUpdated;
	}

	public Integer getStatementSealed() {
		return statementSealed;
	}

	public void setStatementSealed(Integer statementSealed) {
		this.statementSealed = statementSealed;
	}

	public String getStatementComments() {
		return statementComments;
	}

	public void setStatementComments(String statementComments) {
		this.statementComments = statementComments;
	}

	public Integer getStatementUpdated() {
		return statementUpdated;
	}

	public void setStatementUpdated(Integer statementUpdated) {
		this.statementUpdated = statementUpdated;
	}

	public Integer getDrVerificationSealed() {
		return drVerificationSealed;
	}

	public void setDrVerificationSealed(Integer drVerificationSealed) {
		this.drVerificationSealed = drVerificationSealed;
	}

	public String getDrVerificationComments() {
		return drVerificationComments;
	}

	public void setDrVerificationComments(String drVerificationComments) {
		this.drVerificationComments = drVerificationComments;
	}

	public Integer getDrVerificationUpdated() {
		return drVerificationUpdated;
	}

	public void setDrVerificationUpdated(Integer drVerificationUpdated) {
		this.drVerificationUpdated = drVerificationUpdated;
	}

	public Integer getAssistSealed() {
		return assistSealed;
	}

	public void setAssistSealed(Integer assistSealed) {
		this.assistSealed = assistSealed;
	}

	public String getAssistComments() {
		return assistComments;
	}

	public void setAssistComments(String assistComments) {
		this.assistComments = assistComments;
	}

	public Integer getAssistUpdated() {
		return assistUpdated;
	}

	public void setAssistUpdated(Integer assistUpdated) {
		this.assistUpdated = assistUpdated;
	}

	public Integer getHivVerificationSealed() {
		return hivVerificationSealed;
	}

	public void setHivVerificationSealed(Integer hivVerificationSealed) {
		this.hivVerificationSealed = hivVerificationSealed;
	}

	public String getHivVerificationComments() {
		return hivVerificationComments;
	}

	public void setHivVerificationComments(String hivVerificationComments) {
		this.hivVerificationComments = hivVerificationComments;
	}

	public Integer getHivVerificationUpdated() {
		return hivVerificationUpdated;
	}

	public void setHivVerificationUpdated(Integer hivVerificationUpdated) {
		this.hivVerificationUpdated = hivVerificationUpdated;
	}

	public Integer getAhcaAttestationSealed() {
		return ahcaAttestationSealed;
	}

	public void setAhcaAttestationSealed(Integer ahcaAttestationSealed) {
		this.ahcaAttestationSealed = ahcaAttestationSealed;
	}

	public String getAhcaAttestationComments() {
		return ahcaAttestationComments;
	}

	public void setAhcaAttestationComments(String ahcaAttestationComments) {
		this.ahcaAttestationComments = ahcaAttestationComments;
	}

	public Integer getAhcaAttestationUpdated() {
		return ahcaAttestationUpdated;
	}

	public void setAhcaAttestationUpdated(Integer ahcaAttestationUpdated) {
		this.ahcaAttestationUpdated = ahcaAttestationUpdated;
	}

	public Integer getAhcaLevelSealed() {
		return ahcaLevelSealed;
	}

	public void setAhcaLevelSealed(Integer ahcaLevelSealed) {
		this.ahcaLevelSealed = ahcaLevelSealed;
	}

	public String getAhcaLevelValidTill() {
		return ahcaLevelValidTill;
	}

	public void setAhcaLevelValidTill(String ahcaLevelValidTill) {
		this.ahcaLevelValidTill = ahcaLevelValidTill;
	}

	public String getAhcaLevelComments() {
		return ahcaLevelComments;
	}

	public void setAhcaLevelComments(String ahcaLevelComments) {
		this.ahcaLevelComments = ahcaLevelComments;
	}

	public Integer getAhcaLevelUpdated() {
		return ahcaLevelUpdated;
	}

	public void setAhcaLevelUpdated(Integer ahcaLevelUpdated) {
		this.ahcaLevelUpdated = ahcaLevelUpdated;
	}

	public Integer getPrivacySealed() {
		return privacySealed;
	}

	public void setPrivacySealed(Integer privacySealed) {
		this.privacySealed = privacySealed;
	}

	public String getPrivacyComments() {
		return privacyComments;
	}

	public void setPrivacyComments(String privacyComments) {
		this.privacyComments = privacyComments;
	}

	public Integer getPrivacyUpdated() {
		return privacyUpdated;
	}

	public void setPrivacyUpdated(Integer privacyUpdated) {
		this.privacyUpdated = privacyUpdated;
	}

	public Integer getReferencesSealed() {
		return referencesSealed;
	}

	public void setReferencesSealed(Integer referencesSealed) {
		this.referencesSealed = referencesSealed;
	}

	public String getReferencesComments() {
		return referencesComments;
	}

	public void setReferencesComments(String referencesComments) {
		this.referencesComments = referencesComments;
	}

	public Integer getReferencesUpdated() {
		return referencesUpdated;
	}

	public void setReferencesUpdated(Integer referencesUpdated) {
		this.referencesUpdated = referencesUpdated;
	}

	public Integer getReferences2Sealed() {
		return references2Sealed;
	}

	public void setReferences2Sealed(Integer references2Sealed) {
		this.references2Sealed = references2Sealed;
	}

	public String getReferences2Comments() {
		return references2Comments;
	}

	public void setReferences2Comments(String references2Comments) {
		this.references2Comments = references2Comments;
	}

	public Integer getReferences2Updated() {
		return references2Updated;
	}

	public void setReferences2Updated(Integer references2Updated) {
		this.references2Updated = references2Updated;
	}

	public Integer getVaccinationSealed() {
		return vaccinationSealed;
	}

	public void setVaccinationSealed(Integer vaccinationSealed) {
		this.vaccinationSealed = vaccinationSealed;
	}

	public String getVaccinationComments() {
		return vaccinationComments;
	}

	public void setVaccinationComments(String vaccinationComments) {
		this.vaccinationComments = vaccinationComments;
	}

	public Integer getVaccinationUpdated() {
		return vaccinationUpdated;
	}

	public void setVaccinationUpdated(Integer vaccinationUpdated) {
		this.vaccinationUpdated = vaccinationUpdated;
	}

	public Integer getAutoInsuranceSealed() {
		return autoInsuranceSealed;
	}

	public void setAutoInsuranceSealed(Integer autoInsuranceSealed) {
		this.autoInsuranceSealed = autoInsuranceSealed;
	}

	public String getAutoInsuranceValidTill() {
		return autoInsuranceValidTill;
	}

	public void setAutoInsuranceValidTill(String autoInsuranceValidTill) {
		this.autoInsuranceValidTill = autoInsuranceValidTill;
	}

	public String getAutoInsuranceComments() {
		return autoInsuranceComments;
	}

	public void setAutoInsuranceComments(String autoInsuranceComments) {
		this.autoInsuranceComments = autoInsuranceComments;
	}

	public Integer getAutoInsuranceUpdated() {
		return autoInsuranceUpdated;
	}

	public void setAutoInsuranceUpdated(Integer autoInsuranceUpdated) {
		this.autoInsuranceUpdated = autoInsuranceUpdated;
	}

	public Integer getProfLiabilitySealed() {
		return profLiabilitySealed;
	}

	public void setProfLiabilitySealed(Integer profLiabilitySealed) {
		this.profLiabilitySealed = profLiabilitySealed;
	}

	public String getProfLiabilityValidTill() {
		return profLiabilityValidTill;
	}

	public void setProfLiabilityValidTill(String profLiabilityValidTill) {
		this.profLiabilityValidTill = profLiabilityValidTill;
	}

	public String getProfLiabilityComments() {
		return profLiabilityComments;
	}

	public void setProfLiabilityComments(String profLiabilityComments) {
		this.profLiabilityComments = profLiabilityComments;
	}

	public Integer getProfLiabilityUpdated() {
		return profLiabilityUpdated;
	}

	public void setProfLiabilityUpdated(Integer profLiabilityUpdated) {
		this.profLiabilityUpdated = profLiabilityUpdated;
	}

	public Integer getDoeaLevelSealed() {
		return doeaLevelSealed;
	}

	public void setDoeaLevelSealed(Integer doeaLevelSealed) {
		this.doeaLevelSealed = doeaLevelSealed;
	}

	public String getDoeaLevelComments() {
		return doeaLevelComments;
	}

	public void setDoeaLevelComments(String doeaLevelComments) {
		this.doeaLevelComments = doeaLevelComments;
	}

	public Integer getDoeaLevelUpdated() {
		return doeaLevelUpdated;
	}

	public void setDoeaLevelUpdated(Integer doeaLevelUpdated) {
		this.doeaLevelUpdated = doeaLevelUpdated;
	}

	public Integer getDoeaSealed() {
		return doeaSealed;
	}

	public void setDoeaSealed(Integer doeaSealed) {
		this.doeaSealed = doeaSealed;
	}

	public String getDoeaComments() {
		return doeaComments;
	}

	public void setDoeaComments(String doeaComments) {
		this.doeaComments = doeaComments;
	}

	public Integer getDoeaUpdated() {
		return doeaUpdated;
	}

	public void setDoeaUpdated(Integer doeaUpdated) {
		this.doeaUpdated = doeaUpdated;
	}

	public Integer getAlzheimerSealed() {
		return alzheimerSealed;
	}

	public void setAlzheimerSealed(Integer alzheimerSealed) {
		this.alzheimerSealed = alzheimerSealed;
	}

	public String getAlzheimerComments() {
		return alzheimerComments;
	}

	public void setAlzheimerComments(String alzheimerComments) {
		this.alzheimerComments = alzheimerComments;
	}

	public Integer getAlzheimerUpdated() {
		return alzheimerUpdated;
	}

	public void setAlzheimerUpdated(Integer alzheimerUpdated) {
		this.alzheimerUpdated = alzheimerUpdated;
	}

	public Integer getDomesticSealed() {
		return domesticSealed;
	}

	public void setDomesticSealed(Integer domesticSealed) {
		this.domesticSealed = domesticSealed;
	}

	public String getDomesticComments() {
		return domesticComments;
	}

	public void setDomesticComments(String domesticComments) {
		this.domesticComments = domesticComments;
	}

	public Integer getDomesticUpdated() {
		return domesticUpdated;
	}

	public void setDomesticUpdated(Integer domesticUpdated) {
		this.domesticUpdated = domesticUpdated;
	}

	public Integer getHippaSealed() {
		return hippaSealed;
	}

	public void setHippaSealed(Integer hippaSealed) {
		this.hippaSealed = hippaSealed;
	}

	public String getHipaaComments() {
		return hipaaComments;
	}

	public void setHipaaComments(String hipaaComments) {
		this.hipaaComments = hipaaComments;
	}

	public Integer getHipaaUpdated() {
		return hipaaUpdated;
	}

	public void setHipaaUpdated(Integer hipaaUpdated) {
		this.hipaaUpdated = hipaaUpdated;
	}

	public Integer getCeuSealed() {
		return ceuSealed;
	}

	public void setCeuSealed(Integer ceuSealed) {
		this.ceuSealed = ceuSealed;
	}

	public String getCeuComments() {
		return ceuComments;
	}

	public void setCeuComments(String ceuComments) {
		this.ceuComments = ceuComments;
	}

	public Integer getCeuUpdated() {
		return ceuUpdated;
	}

	public void setCeuUpdated(Integer ceuUpdated) {
		this.ceuUpdated = ceuUpdated;
	}

	public Integer getDepositSealed() {
		return depositSealed;
	}

	public void setDepositSealed(Integer depositSealed) {
		this.depositSealed = depositSealed;
	}

	public String getDepositComments() {
		return depositComments;
	}

	public void setDepositComments(String depositComments) {
		this.depositComments = depositComments;
	}

	public Integer getDepositUpdated() {
		return depositUpdated;
	}

	public void setDepositUpdated(Integer depositUpdated) {
		this.depositUpdated = depositUpdated;
	}

	public Integer getW9Sealed() {
		return w9Sealed;
	}

	public void setW9Sealed(Integer w9Sealed) {
		this.w9Sealed = w9Sealed;
	}

	public String getW9Comments() {
		return w9Comments;
	}

	public void setW9Comments(String w9Comments) {
		this.w9Comments = w9Comments;
	}

	public Integer getW9Updated() {
		return w9Updated;
	}

	public void setW9Updated(Integer w9Updated) {
		this.w9Updated = w9Updated;
	}

	public Integer getEinSealed() {
		return einSealed;
	}

	public void setEinSealed(Integer einSealed) {
		this.einSealed = einSealed;
	}

	public String getEinComments() {
		return einComments;
	}

	public void setEinComments(String einComments) {
		this.einComments = einComments;
	}

	public Integer getEinUpdated() {
		return einUpdated;
	}

	public void setEinUpdated(Integer einUpdated) {
		this.einUpdated = einUpdated;
	}

	public Integer getEverifySealed() {
		return everifySealed;
	}

	public void setEverifySealed(Integer everifySealed) {
		this.everifySealed = everifySealed;
	}

	public String getEverifyComments() {
		return everifyComments;
	}

	public void setEverifyComments(String everifyComments) {
		this.everifyComments = everifyComments;
	}

	public Integer getEverifyUpdated() {
		return everifyUpdated;
	}

	public void setEverifyUpdated(Integer everifyUpdated) {
		this.everifyUpdated = everifyUpdated;
	}

	public Integer getAhcaRosterSealed() {
		return ahcaRosterSealed;
	}

	public void setAhcaRosterSealed(Integer ahcaRosterSealed) {
		this.ahcaRosterSealed = ahcaRosterSealed;
	}

	public String getAhcaRosterComments() {
		return ahcaRosterComments;
	}

	public void setAhcaRosterComments(String ahcaRosterComments) {
		this.ahcaRosterComments = ahcaRosterComments;
	}

	public Integer getAhcaRosterUpdated() {
		return ahcaRosterUpdated;
	}

	public void setAhcaRosterUpdated(Integer ahcaRosterUpdated) {
		this.ahcaRosterUpdated = ahcaRosterUpdated;
	}

	public Integer getDoeaRosterSealed() {
		return doeaRosterSealed;
	}

	public void setDoeaRosterSealed(Integer doeaRosterSealed) {
		this.doeaRosterSealed = doeaRosterSealed;
	}

	public String getDoeaRosterComments() {
		return doeaRosterComments;
	}

	public void setDoeaRosterComments(String doeaRosterComments) {
		this.doeaRosterComments = doeaRosterComments;
	}

	public Integer getDoeaRosterUpdated() {
		return doeaRosterUpdated;
	}

	public void setDoeaRosterUpdated(Integer doeaRosterUpdated) {
		this.doeaRosterUpdated = doeaRosterUpdated;
	}

	public Integer getConfirmationSealed() {
		return confirmationSealed;
	}

	public void setConfirmationSealed(Integer confirmationSealed) {
		this.confirmationSealed = confirmationSealed;
	}

	public String getConfirmationComments() {
		return confirmationComments;
	}

	public void setConfirmationComments(String confirmationComments) {
		this.confirmationComments = confirmationComments;
	}

	public Integer getConfirmationUpdated() {
		return confirmationUpdated;
	}

	public void setConfirmationUpdated(Integer confirmationUpdated) {
		this.confirmationUpdated = confirmationUpdated;
	}

	public Integer getFinalized() {
		return finalized;
	}

	public void setFinalized(Integer finalized) {
		this.finalized = finalized;
	}

	public Integer getArchived() {
		return archived;
	}

	public void setArchived(Integer archived) {
		this.archived = archived;
	}

	public String getHrMailSent() {
		return hrMailSent;
	}

	public void setHrMailSent(String hrMailSent) {
		this.hrMailSent = hrMailSent;
	}

	public String getSupMailSent() {
		return supMailSent;
	}

	public void setSupMailSent(String supMailSent) {
		this.supMailSent = supMailSent;
	}

	public String getAdmMailSent() {
		return admMailSent;
	}

	public void setAdmMailSent(String admMailSent) {
		this.admMailSent = admMailSent;
	}

	public Integer getHasNewRejections() {
		return hasNewRejections;
	}

	public void setHasNewRejections(Integer hasNewRejections) {
		this.hasNewRejections = hasNewRejections;
	}

	public Integer getAhcaAttestationSealedById() {
		return ahcaAttestationSealedById;
	}

	public void setAhcaAttestationSealedById(Integer ahcaAttestationSealedById) {
		this.ahcaAttestationSealedById = ahcaAttestationSealedById;
	}

	public Integer getAhcaLevelSealedById() {
		return ahcaLevelSealedById;
	}

	public void setAhcaLevelSealedById(Integer ahcaLevelSealedById) {
		this.ahcaLevelSealedById = ahcaLevelSealedById;
	}

	public Integer getAhcaRosterSealedById() {
		return ahcaRosterSealedById;
	}

	public void setAhcaRosterSealedById(Integer ahcaRosterSealedById) {
		this.ahcaRosterSealedById = ahcaRosterSealedById;
	}

	public Integer getAlzheimerSealedById() {
		return alzheimerSealedById;
	}

	public void setAlzheimerSealedById(Integer alzheimerSealedById) {
		this.alzheimerSealedById = alzheimerSealedById;
	}

	public Integer getApplicationSealedById() {
		return applicationSealedById;
	}

	public void setApplicationSealedById(Integer applicationSealedById) {
		this.applicationSealedById = applicationSealedById;
	}

	public Integer getArchivedById() {
		return archivedById;
	}

	public void setArchivedById(Integer archivedById) {
		this.archivedById = archivedById;
	}

	public Integer getAssistSealedById() {
		return assistSealedById;
	}

	public void setAssistSealedById(Integer assistSealedById) {
		this.assistSealedById = assistSealedById;
	}

	public Integer getAutoInsuranceSealedById() {
		return autoInsuranceSealedById;
	}

	public void setAutoInsuranceSealedById(Integer autoInsuranceSealedById) {
		this.autoInsuranceSealedById = autoInsuranceSealedById;
	}

	public Integer getCeuSealedById() {
		return ceuSealedById;
	}

	public void setCeuSealedById(Integer ceuSealedById) {
		this.ceuSealedById = ceuSealedById;
	}

	public Integer getConfirmationSealedById() {
		return confirmationSealedById;
	}

	public void setConfirmationSealedById(Integer confirmationSealedById) {
		this.confirmationSealedById = confirmationSealedById;
	}

	public Integer getContractorAgreeSealedById() {
		return contractorAgreeSealedById;
	}

	public void setContractorAgreeSealedById(Integer contractorAgreeSealedById) {
		this.contractorAgreeSealedById = contractorAgreeSealedById;
	}

	public Integer getCprCertSealedById() {
		return cprCertSealedById;
	}

	public void setCprCertSealedById(Integer cprCertSealedById) {
		this.cprCertSealedById = cprCertSealedById;
	}

	public Integer getCreatedById() {
		return createdById;
	}

	public void setCreatedById(Integer createdById) {
		this.createdById = createdById;
	}

	public Integer getDepositSealedById() {
		return depositSealedById;
	}

	public void setDepositSealedById(Integer depositSealedById) {
		this.depositSealedById = depositSealedById;
	}

	public Integer getDoeaLevelSealedById() {
		return doeaLevelSealedById;
	}

	public void setDoeaLevelSealedById(Integer doeaLevelSealedById) {
		this.doeaLevelSealedById = doeaLevelSealedById;
	}

	public Integer getDoeaRosterSealedById() {
		return doeaRosterSealedById;
	}

	public void setDoeaRosterSealedById(Integer doeaRosterSealedById) {
		this.doeaRosterSealedById = doeaRosterSealedById;
	}

	public Integer getDoeaSealedById() {
		return doeaSealedById;
	}

	public void setDoeaSealedById(Integer doeaSealedById) {
		this.doeaSealedById = doeaSealedById;
	}

	public Integer getDomesticSealedById() {
		return domesticSealedById;
	}

	public void setDomesticSealedById(Integer domesticSealedById) {
		this.domesticSealedById = domesticSealedById;
	}

	public Integer getDrVerificationSealedById() {
		return drVerificationSealedById;
	}

	public void setDrVerificationSealedById(Integer drVerificationSealedById) {
		this.drVerificationSealedById = drVerificationSealedById;
	}

	public Integer getDrivingLicenseSealedById() {
		return drivingLicenseSealedById;
	}

	public void setDrivingLicenseSealedById(Integer drivingLicenseSealedById) {
		this.drivingLicenseSealedById = drivingLicenseSealedById;
	}

	public Integer getDrivingVerificationSealedById() {
		return drivingVerificationSealedById;
	}

	public void setDrivingVerificationSealedById(Integer drivingVerificationSealedById) {
		this.drivingVerificationSealedById = drivingVerificationSealedById;
	}

	public Integer getEinSealedById() {
		return einSealedById;
	}

	public void setEinSealedById(Integer einSealedById) {
		this.einSealedById = einSealedById;
	}

	public Integer getEverifySealedById() {
		return everifySealedById;
	}

	public void setEverifySealedById(Integer everifySealedById) {
		this.everifySealedById = everifySealedById;
	}

	public Integer getFinalizedById() {
		return finalizedById;
	}

	public void setFinalizedById(Integer finalizedById) {
		this.finalizedById = finalizedById;
	}

	public Integer getHhaCertSealedById() {
		return hhaCertSealedById;
	}

	public void setHhaCertSealedById(Integer hhaCertSealedById) {
		this.hhaCertSealedById = hhaCertSealedById;
	}

	public Integer getHhaDoeaSealedById() {
		return hhaDoeaSealedById;
	}

	public void setHhaDoeaSealedById(Integer hhaDoeaSealedById) {
		this.hhaDoeaSealedById = hhaDoeaSealedById;
	}

	public Integer getHhaSchoolSealedById() {
		return hhaSchoolSealedById;
	}

	public void setHhaSchoolSealedById(Integer hhaSchoolSealedById) {
		this.hhaSchoolSealedById = hhaSchoolSealedById;
	}

	public Integer getHipaaSealedById() {
		return hipaaSealedById;
	}

	public void setHipaaSealedById(Integer hipaaSealedById) {
		this.hipaaSealedById = hipaaSealedById;
	}

	public Integer getHivVerificationSealedById() {
		return hivVerificationSealedById;
	}

	public void setHivVerificationSealedById(Integer hivVerificationSealedById) {
		this.hivVerificationSealedById = hivVerificationSealedById;
	}

	public Integer getNursingLicenseSealedById() {
		return nursingLicenseSealedById;
	}

	public void setNursingLicenseSealedById(Integer nursingLicenseSealedById) {
		this.nursingLicenseSealedById = nursingLicenseSealedById;
	}

	public Integer getNursingValidationSealedById() {
		return nursingValidationSealedById;
	}

	public void setNursingValidationSealedById(Integer nursingValidationSealedById) {
		this.nursingValidationSealedById = nursingValidationSealedById;
	}

	public Integer getOigSearchSealedById() {
		return oigSearchSealedById;
	}

	public void setOigSearchSealedById(Integer oigSearchSealedById) {
		this.oigSearchSealedById = oigSearchSealedById;
	}

	public Integer getPrivacySealedById() {
		return privacySealedById;
	}

	public void setPrivacySealedById(Integer privacySealedById) {
		this.privacySealedById = privacySealedById;
	}

	public Integer getProfLiabilitySealedById() {
		return profLiabilitySealedById;
	}

	public void setProfLiabilitySealedById(Integer profLiabilitySealedById) {
		this.profLiabilitySealedById = profLiabilitySealedById;
	}

	public Integer getReferences2SealedById() {
		return references2SealedById;
	}

	public void setReferences2SealedById(Integer references2SealedById) {
		this.references2SealedById = references2SealedById;
	}

	public Integer getReferencesSealedById() {
		return referencesSealedById;
	}

	public void setReferencesSealedById(Integer referencesSealedById) {
		this.referencesSealedById = referencesSealedById;
	}

	public Integer getSocialSecuritySealedById() {
		return socialSecuritySealedById;
	}

	public void setSocialSecuritySealedById(Integer socialSecuritySealedById) {
		this.socialSecuritySealedById = socialSecuritySealedById;
	}

	public Integer getStatementSealedById() {
		return statementSealedById;
	}

	public void setStatementSealedById(Integer statementSealedById) {
		this.statementSealedById = statementSealedById;
	}

	public Integer getVaccinationSealedById() {
		return vaccinationSealedById;
	}

	public void setVaccinationSealedById(Integer vaccinationSealedById) {
		this.vaccinationSealedById = vaccinationSealedById;
	}

	public Integer getW9SealedById() {
		return w9SealedById;
	}

	public void setW9SealedById(Integer w9SealedById) {
		this.w9SealedById = w9SealedById;
	}

	public String getSexComments() {
		return sexComments;
	}

	public void setSexComments(String sexComments) {
		this.sexComments = sexComments;
	}

	public Integer getSexSealedById() {
		return sexSealedById;
	}

	public void setSexSealedById(Integer sexSealedById) {
		this.sexSealedById = sexSealedById;
	}

	public Integer getSexUpdated() {
		return sexUpdated;
	}

	public void setSexUpdated(Integer sexUpdated) {
		this.sexUpdated = sexUpdated;
	}

	public String getSs4Comments() {
		return ss4Comments;
	}

	public void setSs4Comments(String ss4Comments) {
		this.ss4Comments = ss4Comments;
	}

	public Integer getSs4Sealed() {
		return ss4Sealed;
	}

	public void setSs4Sealed(Integer ss4Sealed) {
		this.ss4Sealed = ss4Sealed;
	}

	public Integer getSs4SealedById() {
		return ss4SealedById;
	}

	public void setSs4SealedById(Integer ss4SealedById) {
		this.ss4SealedById = ss4SealedById;
	}

	public Integer getSs4Updated() {
		return ss4Updated;
	}

	public void setSs4Updated(Integer ss4Updated) {
		this.ss4Updated = ss4Updated;
	}

	public String getAdrdComments() {
		return adrdComments;
	}

	public void setAdrdComments(String adrdComments) {
		this.adrdComments = adrdComments;
	}

	public Integer getAdrdSealed() {
		return adrdSealed;
	}

	public void setAdrdSealed(Integer adrdSealed) {
		this.adrdSealed = adrdSealed;
	}

	public Integer getAdrdSealedById() {
		return adrdSealedById;
	}

	public void setAdrdSealedById(Integer adrdSealedById) {
		this.adrdSealedById = adrdSealedById;
	}

	public Integer getAdrdUpdated() {
		return adrdUpdated;
	}

	public void setAdrdUpdated(Integer adrdUpdated) {
		this.adrdUpdated = adrdUpdated;
	}

	public String getEmploymentAgreeComments() {
		return employmentAgreeComments;
	}

	public void setEmploymentAgreeComments(String employmentAgreeComments) {
		this.employmentAgreeComments = employmentAgreeComments;
	}

	public Integer getEmploymentAgreeSealed() {
		return employmentAgreeSealed;
	}

	public void setEmploymentAgreeSealed(Integer employmentAgreeSealed) {
		this.employmentAgreeSealed = employmentAgreeSealed;
	}

	public Integer getEmploymentAgreeSealedById() {
		return employmentAgreeSealedById;
	}

	public void setEmploymentAgreeSealedById(Integer employmentAgreeSealedById) {
		this.employmentAgreeSealedById = employmentAgreeSealedById;
	}

	public Integer getEmploymentAgreeUpdated() {
		return employmentAgreeUpdated;
	}

	public void setEmploymentAgreeUpdated(Integer employmentAgreeUpdated) {
		this.employmentAgreeUpdated = employmentAgreeUpdated;
	}

	public String getPpdComments() {
		return ppdComments;
	}

	public void setPpdComments(String ppdComments) {
		this.ppdComments = ppdComments;
	}

	public Integer getPpdSealed() {
		return ppdSealed;
	}

	public void setPpdSealed(Integer ppdSealed) {
		this.ppdSealed = ppdSealed;
	}

	public Integer getPpdSealedById() {
		return ppdSealedById;
	}

	public void setPpdSealedById(Integer ppdSealedById) {
		this.ppdSealedById = ppdSealedById;
	}

	public Integer getPpdUpdated() {
		return ppdUpdated;
	}

	public void setPpdUpdated(Integer ppdUpdated) {
		this.ppdUpdated = ppdUpdated;
	}

	public String getW4Comments() {
		return w4Comments;
	}

	public void setW4Comments(String w4Comments) {
		this.w4Comments = w4Comments;
	}

	public Integer getW4Sealed() {
		return w4Sealed;
	}

	public void setW4Sealed(Integer w4Sealed) {
		this.w4Sealed = w4Sealed;
	}

	public Integer getW4SealedById() {
		return w4SealedById;
	}

	public void setW4SealedById(Integer w4SealedById) {
		this.w4SealedById = w4SealedById;
	}

	public Integer getW4Updated() {
		return w4Updated;
	}

	public void setW4Updated(Integer w4Updated) {
		this.w4Updated = w4Updated;
	}

	public String getHhaSkillsComments() {
		return hhaSkillsComments;
	}

	public void setHhaSkillsComments(String hhaSkillsComments) {
		this.hhaSkillsComments = hhaSkillsComments;
	}

	public Integer getHhaSkillsSealed() {
		return hhaSkillsSealed;
	}

	public void setHhaSkillsSealed(Integer hhaSkillsSealed) {
		this.hhaSkillsSealed = hhaSkillsSealed;
	}

	public Integer getHhaSkillsSealedById() {
		return hhaSkillsSealedById;
	}

	public void setHhaSkillsSealedById(Integer hhaSkillsSealedById) {
		this.hhaSkillsSealedById = hhaSkillsSealedById;
	}

	public Integer getHhaSkillsUpdated() {
		return hhaSkillsUpdated;
	}

	public void setHhaSkillsUpdated(Integer hhaSkillsUpdated) {
		this.hhaSkillsUpdated = hhaSkillsUpdated;
	}

	public Integer getSexSealed() {
		return sexSealed;
	}

	public void setSexSealed(Integer sexSealed) {
		this.sexSealed = sexSealed;
	}

}
