package com.insurance.billing.service;

import com.insurance.billing.entity.Billing;
import com.insurance.billing.repository.BillingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class BillingService {

    @Autowired
    private BillingRepository billingRepository;

    public Billing saveDepartment(Billing billing) {
        log.info("Inside saveDepartment of BillingService");
        return billingRepository.save(billing);
    }

    public Billing findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById of BillingService");
        return billingRepository.findByDepartmentId(departmentId);
    }


}
