package com.Lenddoo.LenddooForAgentsBackend.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Payment {
	
	@Id
	@SequenceGenerator(name = "Payment_sequence", sequenceName = "Payment_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Payment_sequence")
	private Long IdPayment;
	
	private String Ref;
	
	private Date Date;
	
	private Double Amount;
	
	private String Status;
	
	@OneToOne
	private LeadDAO leadDAO;

	public Payment() {
		super();
	}

	public Payment(String ref, java.util.Date date, Double amount, String status, LeadDAO leadDAO) {
		super();
		Ref = ref;
		Date = date;
		Amount = amount;
		Status = status;
		this.leadDAO = leadDAO;
	}

	public String getRef() {
		return Ref;
	}

	public void setRef(String ref) {
		Ref = ref;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public Double getAmount() {
		return Amount;
	}

	public void setAmount(Double amount) {
		Amount = amount;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public LeadDAO getLead() {
		return leadDAO;
	}

	public void setLead(LeadDAO leadDAO) {
		this.leadDAO = leadDAO;
	}
}
