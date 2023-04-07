package com.insurance.billing.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String policyId;
    private String claimsId;
    private String billingAmount;
    private String transactionId;
    private String paymentType;
    private String claimDate;
    private String claimType;
    private String claimStatus;
    private String payoutAmount;
    private String payoutDate;
    private String claimDenialDetails;


}


