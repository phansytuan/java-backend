package com.tuancode.service.dto.response;

import lombok.Data;

public class ResponsePage<T> extends Response{

  private Integer pageSize;
  private Integer pageIndex;
  private Integer totalPage;
  private Long totalElement;

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public Integer getTotalPage() {
    return totalPage;
  }

  public void setTotalPage(Integer totalPage) {
    this.totalPage = totalPage;
  }

  public Long getTotalElement() {
    return totalElement;
  }

  public void setTotalElement(Long totalElement) {
    this.totalElement = totalElement;
  }
}
