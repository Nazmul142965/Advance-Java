package com.patu.nazmul_hasan.controller;

import com.patu.nazmul_hasan.dto.CaseDto;
import com.patu.nazmul_hasan.model.Case;
import com.patu.nazmul_hasan.service.CaseServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/case")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class CaseController {
    private final CaseServiceInterface caseService;

    @GetMapping
    public List<Case> getAll() {
        return caseService.getAllCases();
    }



    @PostMapping
    public void addCase(@RequestBody CaseDto caseDto) {
        caseService.saveCase(caseDto);
    }

    @PutMapping("/{id}")
    public CaseDto update(@PathVariable String id, @RequestBody CaseDto caseDto) {
        return caseService.updateCase(id, caseDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCase(@PathVariable String id) {
        caseService.deleteCase(id);
    }

    @GetMapping("/search/{name}")
    public Case getByTitle(@PathVariable String name) {
        return caseService.getCaseByTitle(name);
    }

    @GetMapping("/detective/{leadDetective}")
    public Case getByLeadDetective(@PathVariable String leadDetective) {
        return caseService.getCaseByLeadDetective(leadDetective);
    }

    @GetMapping("/{caseId}")
    public Case getCaseById(@PathVariable String caseId) {
        return caseService.getCaseById(caseId);
    }


    @GetMapping("/metrics/total")
    public long getTotal() {
        return caseService.getTotalCasesCount();
    }

    @GetMapping("/metrics/open")
    public long getOpen() {
        return caseService.getOpenCasesCount();
    }

    @GetMapping("/metrics/high-priority")
    public long getHighPriority() {
        return caseService.getHighPriorityCasesCount();
    }

}
