package com.tuancode.repository;

import com.tuancode.entity.ClaimEntity;
import java.time.LocalDate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

// triển khai spring data jpa
@Repository
public interface ClaimRepository extends JpaRepository<ClaimEntity,Long> {

  /*
      select * from claim c
      inner join claim_status status on c.status_id = status.id
      where (:claimCode is null or c.code =:claimCode)
      and (:fromDate is null or c.claim_date >= :fromDate)
      and (:toDate is null or c.claim_date <= :toDate)
      and (:codeStatus is null or status.code =:codeStatus)
      limit :pageSize offset :pageIndex;
  */

  @Query(value ="select c from ClaimEntity c " +
      " inner join c.claimStatusEntity status" +
      " where (:claimCode is null or c.code = :claimCode) " +
      "and (:fromDate is null or c.claimDate >= :fromDate) " +
      "and (:toDate is null or c.claimDate <= :toDate)" +
      "and (:statusCode is null or status.code = :statusCode)"
  )
  Page<ClaimEntity> findCondition(
      @Param("claimCode")String claimCode,
      @Param("fromDate") LocalDate fromDate,
      @Param("toDate") LocalDate toDate,
      @Param("statusCode") String statusCode,
      Pageable pageable); // truyền vào tự động phân trang
}
