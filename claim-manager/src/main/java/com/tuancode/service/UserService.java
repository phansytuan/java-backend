package com.tuancode.service;

import org.springframework.data.domain.Pageable;
import com.tuancode.service.dto.UserDTO;
import com.tuancode.service.dto.response.Response;
import com.tuancode.service.dto.response.ResponsePage;
import java.time.LocalDate;
import java.util.List;


public interface UserService {

  Response<UserDTO> saveUser(UserDTO user);

  ResponsePage<List<UserDTO>> getAllUser(
      String code,
      LocalDate fromDate,
      LocalDate toDate,
      String phone,
      Pageable pageable);

  Response<UserDTO> getDetailUser(Long id);

  Response<UserDTO> getCurrentUser();
}
