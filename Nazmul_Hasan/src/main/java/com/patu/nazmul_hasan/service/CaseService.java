package com.patu.nazmul_hasan.service;

import com.patu.nazmul_hasan.dto.CaseDto;
import com.patu.nazmul_hasan.model.Case;
import com.patu.nazmul_hasan.repository.CaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CaseService implements CaseServiceInterface{

    private final CaseRepository caseRepository;

    @Override
    public void saveCase(CaseDto caseDto) {
        Case case1 = new Case(caseDto.caseId(), caseDto.caseTitle(), caseDto.leadDetective(), caseDto.priority(), caseDto.status());
        caseRepository.save(case1);
    }

    @Override
    public Case getCaseById(String caseId) {
        return caseRepository.findByCaseId(caseId);
    }

    @Override
    public Case getCaseByTitle(String caseTitle) {
        return caseRepository.findByCaseTitle(caseTitle).get(0);
    }

    @Override
    public Case getCaseByLeadDetective(String leadDetective) {
        return caseRepository.findByLeadDetective(leadDetective);
    }

    @Override
    public CaseDto updateCase(String caseId, CaseDto caseDto) {
        Case existingCase = caseRepository.findByCaseId(caseId);
        if (existingCase != null) {
            existingCase.setCaseTitle(caseDto.caseTitle());
            existingCase.setLeadDetective(caseDto.leadDetective());
            existingCase.setPriority(caseDto.priority());
            existingCase.setStatus(caseDto.status());
            caseRepository.save(existingCase);
            return caseDto;
        }
        return null;
    }

    @Override
    public void deleteCase(String caseId) {
        Case c = caseRepository.findByCaseId(caseId);
        if(c != null) {
            caseRepository.delete(c);
        }

    }

    @Override
    public List<Case> getAllCases() {
        return caseRepository.findAll();
    }

    @Override
    public long getTotalCasesCount() {
        return caseRepository.count();
    }

    @Override
    public long getOpenCasesCount() {
        return caseRepository.countByStatus("Open");
    }

    @Override
    public long getHighPriorityCasesCount() {
        return caseRepository.countByPriority("High");
    }



}
