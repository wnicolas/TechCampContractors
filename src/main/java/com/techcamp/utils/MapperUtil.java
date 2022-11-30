package com.techcamp.utils;

import com.techcamp.dto.ContractorDTO;
import com.techcamp.models.Contractor;
import com.techcamp.primarykey.ContractorId;

public class MapperUtil {

	public static ContractorDTO mapToContractorDTO(Contractor contractor) {
		ContractorDTO contractorDTO = new ContractorDTO();
		contractorDTO.setId(new ContractorId(contractor.getContractorTypeId(), contractor.getContractorNumberId()));
		contractorDTO.setName(contractor.getName());
		contractorDTO.setSurname(contractor.getSurname());
		return contractorDTO;
	}

	

}
