package com.techcamp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techcamp.dto.ContractorDTO;
import com.techcamp.models.Contractor;
import com.techcamp.repository.ContractorRepository;
import com.techcamp.utils.MapperUtil;

@Service
public class ContractorService {
	@Autowired
	private ContractorRepository contractorRepository;

	public List<ContractorDTO> getAllContractors() {

		List<Contractor> contractors = this.contractorRepository.findAll();
		return contractors.stream().map(contractor -> MapperUtil.mapToContractorDTO(contractor)).collect(Collectors.toList());

	}

}
