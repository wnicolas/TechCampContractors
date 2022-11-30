package com.techcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techcamp.models.ContractorType;

public interface ContractorTypeRepository extends JpaRepository<ContractorType, Integer> {

}
