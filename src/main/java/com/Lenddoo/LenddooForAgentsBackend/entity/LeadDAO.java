package com.Lenddoo.LenddooForAgentsBackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class LeadDAO {
	
	@Id
	@SequenceGenerator(name = "Lead_sequence", sequenceName = "Lead_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Lead_sequence")
	private Long IdLead;
	
	private String QualificationStatus;
	
	private Float Progress;
	
	private String CurrentStep;
	
	private String FirstName;
	
	private String LastName;
	
	private String Email;
	
	private String Mobile;
	
	private Boolean NeedsAMortgage;
	
	private String Residence;
	
	private Boolean AppartementVisited;
	
	private Boolean OfferMade;
	
	private Double PropertyValue;
	
	private Double MortgageAmount;

	public LeadDAO() {
		super();
	}

	public LeadDAO(String qualificationStatus, Float progress, String currentStep, String firstName, String lastName,
			String email, String mobile, Boolean needsAMortgage, String residence, Boolean appartementVisited,
			Boolean offerMade, Double propertyValue, Double mortgageAmount) {
		super();
		QualificationStatus = qualificationStatus;
		Progress = progress;
		CurrentStep = currentStep;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Mobile = mobile;
		NeedsAMortgage = needsAMortgage;
		Residence = residence;
		AppartementVisited = appartementVisited;
		OfferMade = offerMade;
		PropertyValue = propertyValue;
		MortgageAmount = mortgageAmount;
	}

	public String getQualificationStatus() {
		return QualificationStatus;
	}

	public void setQualificationStatus(String qualificationStatus) {
		QualificationStatus = qualificationStatus;
	}

	public Float getProgress() {
		return Progress;
	}

	public void setProgress(Float progress) {
		Progress = progress;
	}

	public String getCurrentStep() {
		return CurrentStep;
	}

	public void setCurrentStep(String currentStep) {
		CurrentStep = currentStep;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public Boolean getNeedsAMortgage() {
		return NeedsAMortgage;
	}

	public void setNeedsAMortgage(Boolean needsAMortgage) {
		NeedsAMortgage = needsAMortgage;
	}

	public String getResidence() {
		return Residence;
	}

	public void setResidence(String residence) {
		Residence = residence;
	}

	public Boolean getAppartementVisited() {
		return AppartementVisited;
	}

	public void setAppartementVisited(Boolean appartementVisited) {
		AppartementVisited = appartementVisited;
	}

	public Boolean getOfferMade() {
		return OfferMade;
	}

	public void setOfferMade(Boolean offerMade) {
		OfferMade = offerMade;
	}

	public Double getPropertyValue() {
		return PropertyValue;
	}

	public void setPropertyValue(Double propertyValue) {
		PropertyValue = propertyValue;
	}

	public Double getMortgageAmount() {
		return MortgageAmount;
	}

	public void setMortgageAmount(Double mortgageAmount) {
		MortgageAmount = mortgageAmount;
	}
	
}
