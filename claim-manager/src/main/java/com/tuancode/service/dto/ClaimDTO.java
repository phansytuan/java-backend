package com.tuancode.service.dto;

import java.time.LocalDate;
import lombok.Data;

// tự động tạo ra các method getter, setter, hoặc có thể sử dụng @Data
@Data
public class ClaimDTO {

  private String code;
  private String customerName;
  private String nameProduct;
  private LocalDate claimDate;
  private String coverageProduct;
  private String statusName;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getNameProduct() {
    return nameProduct;
  }

  public void setNameProduct(String nameProduct) {
    this.nameProduct = nameProduct;
  }

  public LocalDate getClaimDate() {
    return claimDate;
  }

  public void setClaimDate(LocalDate claimDate) {
    this.claimDate = claimDate;
  }

  public String getCoverageProduct() {
    return coverageProduct;
  }

  public void setCoverageProduct(String coverageProduct) {
    this.coverageProduct = coverageProduct;
  }

  public String getStatusName() {
    return statusName;
  }

  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }
}
