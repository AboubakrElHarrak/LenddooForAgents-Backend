package com.Lenddoo.LenddooForAgentsBackend.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;

import org.springframework.context.annotation.Primary;

@Entity
public class CreateLead {
	
	@Id
	@SequenceGenerator(name = "create_sequence", sequenceName = "create_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "create_sequence")
	private Long IdCreate;
	
	@ManyToOne
	private Agent agent;
	
	@OneToOne
	private LeadDAO leadDAO;
	
	private Date creationDate;

	public CreateLead() {
		super();
	}

	public CreateLead(Agent agent, LeadDAO leadDAO, Date creationDate) {
		super();
		this.agent = agent;
		this.leadDAO = leadDAO;
		this.creationDate = creationDate;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public LeadDAO getLead() {
		return leadDAO;
	}

	public void setLead(LeadDAO leadDAO) {
		this.leadDAO = leadDAO;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
}
