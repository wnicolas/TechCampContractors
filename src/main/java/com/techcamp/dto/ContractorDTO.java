package com.techcamp.dto;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import com.techcamp.models.ContractorType;
import com.techcamp.primarykey.ContractorId;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class ContractorDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Contractor
	 */

	private ContractorId id;

	private String name;

	private String surname;

	private String contractorType;

	public ContractorDTO(ContractorId id, String name, String surname, String contractorType) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.contractorType = contractorType;
	}

	public ContractorDTO() {
		super();
	}

	public ContractorId getId() {
		return id;
	}

	public void setId(ContractorId id) {
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

	public String getContractorType() {
		return contractorType;
	}

	public void setContractorType(String contractorType) {
		this.contractorType = contractorType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contractorType, id, name, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContractorDTO other = (ContractorDTO) obj;
		return Objects.equals(contractorType, other.contractorType) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}

}
