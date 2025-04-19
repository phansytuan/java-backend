package com.tuancode.repository;

import com.tuancode.entity.UserEntity;
import java.time.LocalDate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

  @Query(value = "select ue from UserEntity ue" +
      " where (:code is null or ue.code = :code) " +
      " and (:fromDate is null or ue.createdDate >= :fromDate)" +
      " and (:toDate is null or ue.createdDate <= :toDate) " +
      " and (:phone is null or ue.phone = :phone)")

  Page<UserEntity> search(String code,
                          LocalDate fromDate,
                          LocalDate toDate,
                          String phone,
                          Pageable pageable);

  UserEntity findByUsername(String username);
}

