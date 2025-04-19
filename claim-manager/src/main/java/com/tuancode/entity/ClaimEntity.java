
package com.tuancode.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "claim")
public class ClaimEntity extends BaseEntity {

    private String code;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customerEntity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private InsuranceProductEntity insuranceProductEntity;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private ClaimStatusEntity claimStatusEntity;

    private LocalDate claimDate;
    private String description;
    private Double amount;

    public ClaimEntity() {

    }
    // Getters and Setters

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }

    public InsuranceProductEntity getInsuranceProductEntity() {
        return insuranceProductEntity;
    }

    public void setInsuranceProductEntity(InsuranceProductEntity insuranceProductEntity) {
        this.insuranceProductEntity = insuranceProductEntity;
    }

    public ClaimStatusEntity getClaimStatusEntity() {
        return claimStatusEntity;
    }

    public void setClaimStatusEntity(ClaimStatusEntity claimStatusEntity) {
        this.claimStatusEntity = claimStatusEntity;
    }

    public LocalDate getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(LocalDate claimDate) {
        this.claimDate = claimDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
