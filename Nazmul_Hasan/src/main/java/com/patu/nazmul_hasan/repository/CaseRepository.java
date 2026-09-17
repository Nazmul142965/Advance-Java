package com.patu.nazmul_hasan.repository;


import com.patu.nazmul_hasan.dto.CaseDto;
import com.patu.nazmul_hasan.model.Case;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaseRepository extends MongoRepository<Case, String> {
    Case findByCaseId(String caseId);
    List <Case>findByCaseTitle(String caseTitle);
    Case findByLeadDetective(String leadDetective);
    List<Case> findByCaseIdIn(List<String> caseIds);
    long count();
    long countByStatus(String status);
    long countByPriority(String priority);
}

