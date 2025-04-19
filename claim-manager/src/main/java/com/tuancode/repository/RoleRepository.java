package com.tuancode.repository;

import com.tuancode.entity.RoleEntity;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

  RoleEntity findByCodeAndDeletedIsFalse(String code);

  @Query(value = "select re from RoleEntity re " +
      " join re.users user where user.username = :username")
  Set<RoleEntity> findByUsername(String username);
}
