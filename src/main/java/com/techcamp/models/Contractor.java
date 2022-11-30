package com.techcamp.models;

import com.techcamp.primarykey.ContractorId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "CONTRACTOR")
@IdClass(ContractorId.class)
public class Contractor {
	@Id
	@Column(name = "TYPE_ID")
	private String contractorTypeId;

	@Id
	@Column(name = "NUMBER_ID")
	private String contractorNumberId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "SURNAME")
	private String surname;

	@Column(name = "FK_ID_CONTRACTOR_TYPE")
	private String contractorType;

	public Contractor(String contractorTypeId, String contractorNumberId, String name, String surname,
			String contractorType) {
		super();
		this.contractorTypeId = contractorTypeId;
		this.contractorNumberId = contractorNumberId;
		this.name = name;
		this.surname = surname;
		this.contractorType = contractorType;
	}

	public Contractor() {
		super();
	}

	public String getContractorTypeId() {
		return contractorTypeId;
	}

	public void setContractorTypeId(String contractorTypeId) {
		this.contractorTypeId = contractorTypeId;
	}

	public String getContractorNumberId() {
		return contractorNumberId;
	}

	public void setContractorNumberId(String contractorNumberId) {
		this.contractorNumberId = contractorNumberId;
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

	public String getContractorType() {
		return contractorType;
	}

	public void setContractorType(String contractorType) {
		this.contractorType = contractorType;
	}

}
