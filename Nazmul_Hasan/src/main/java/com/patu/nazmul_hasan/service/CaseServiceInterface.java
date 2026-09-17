package com.patu.nazmul_hasan.service;

import com.patu.nazmul_hasan.dto.CaseDto;
import com.patu.nazmul_hasan.model.Case;

import java.util.List;

public interface CaseServiceInterface {
    void saveCase(CaseDto caseDto);
    Case getCaseById(String caseId);
    Case getCaseByTitle(String caseTitle);
    Case getCaseByLeadDetective(String leadDetective);
    CaseDto updateCase(String caseid, CaseDto caseDto);
    void deleteCase(String caseId);
    List<Case> getAllCases();
    long getTotalCasesCount();
    long getOpenCasesCount();
    long getHighPriorityCasesCount();
}
