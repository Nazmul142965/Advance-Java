package com.patu.nazmul_hasan.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Case {
    @Id
    @NotBlank(message = "Case Id is required")
    private String caseId;
    @NotBlank(message = "Case Title is required")
    private String caseTitle;
    @NotBlank(message = "Lead Detective is required")
    private String leadDetective;
    @NotBlank(message = "Priority is required")
    private String priority;
    @NotBlank(message = "Status is required")
    private String status;

}
