package com.insurance.billing.controller;

import com.insurance.billing.entity.Billing;
import com.insurance.billing.repository.BillingRepository;
import com.insurance.billing.service.BillingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/billings")
@Slf4j
public class BillingController {

    @Autowired
    private BillingService billingService;
    @Autowired
    BillingRepository billingRepository;

    @DeleteMapping("/{id}")
    public Billing deleteBill(@PathVariable("id") Long departmentId) {
        Billing billing = billingRepository.getOne(departmentId);
        billingRepository.delete(billing);
        return billing;
    }

    @PutMapping("/")
    public Billing saveOrUpdateBill(@RequestBody Billing billing) {
        billingRepository.save(billing);
        return billing;
    }

    @PostMapping("/")
    public Billing saveDepartment(@RequestBody Billing billing) {
        log.info("Inside saveDepartment method of BillingController");
        return billingService.saveDepartment(billing);
    }

    @GetMapping("/{id}")
    public Billing findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Inside findDepartmentById method of BillingController");
        return billingService.findDepartmentById(departmentId);
    }

}
