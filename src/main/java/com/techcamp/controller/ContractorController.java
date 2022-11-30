package com.techcamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techcamp.dto.ContractorDTO;
import com.techcamp.service.ContractorService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api/contractor")
public class ContractorController {

	@Autowired
	private ContractorService contractorService;

	@GetMapping
	public ResponseEntity<List<ContractorDTO>> getAllContractor() {
		List<ContractorDTO> workDays = contractorService.getAllContractors();
		return new ResponseEntity<List<ContractorDTO>>(workDays, HttpStatus.OK);
	}

}
