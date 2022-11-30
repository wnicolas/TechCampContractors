package com.techcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techcamp.models.Contractor;
import com.techcamp.primarykey.ContractorId;

public interface ContractorRepository extends JpaRepository<Contractor, ContractorId> {

}
