package com.techcamp.primarykey;

import java.io.Serializable;
import java.util.Objects;

public class ContractorId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String contractorTypeId;
	private String contractorNumberId;

	public ContractorId(String contractorTypeId, String contractorNumberId) {
		super();
		this.contractorTypeId = contractorTypeId;
		this.contractorNumberId = contractorNumberId;
	}

	public ContractorId() {
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

	@Override
	public int hashCode() {
		return Objects.hash(contractorNumberId, contractorTypeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContractorId other = (ContractorId) obj;
		return Objects.equals(contractorNumberId, other.contractorNumberId)
				&& Objects.equals(contractorTypeId, other.contractorTypeId);
	}

}
