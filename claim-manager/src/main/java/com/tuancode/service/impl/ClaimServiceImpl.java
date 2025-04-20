package com.tuancode.service.impl;

import com.tuancode.entity.ClaimEntity;
import com.tuancode.mapper.ClaimMapper;
import com.tuancode.repository.ClaimRepository;
import com.tuancode.service.ClaimService;
import com.tuancode.service.dto.ClaimDTO;
import com.tuancode.service.dto.response.ResponsePage;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class ClaimServiceImpl implements ClaimService {

  private final ClaimMapper claimMapper;
  @Autowired
  private ClaimRepository claimRepository;

  @Autowired
  public ClaimServiceImpl(ClaimMapper claimMapper) {
    this.claimMapper = claimMapper;
  }

  @Override
  public ResponsePage<List<ClaimDTO>> getClaims(String claimCode,
      LocalDate fromDate,
      LocalDate toDate,
      String codeStatus,
      Pageable pageable) {
    // 5 result entity class
    if (StringUtils.isEmpty(claimCode)) {
      claimCode = null; // nếu không truyền sẽ == null
    }
    if (StringUtils.isEmpty(codeStatus)) {
      codeStatus = null;
    }
    Page<ClaimEntity> pageEntity = claimRepository.findCondition(claimCode, fromDate, toDate,
        codeStatus, pageable);
    // convert data entity -> dto
    List<ClaimDTO> claimDTOs = new ArrayList<ClaimDTO>();
/*
        for (int i = 0; i < claimEntities.size(); i++) {
            ClaimEntity claimEntity = claimEntities.get(i);
            ClaimDTO claimDTO = new ClaimDTO();
            claimDTO.setCode(claimEntity.getCode()); // claim -> code
            claimDTO.setCustomerName(claimEntity.getCustomerEntity().getName()); // customer -> name
            claimDTO.setNameProduct(claimEntity.getInsuranceProductEntity().getName()); // insurance_product -> name
            claimDTO.setClaimDate(claimEntity.getClaimDate());
            claimDTO.setCoverageProduct(claimEntity.getInsuranceProductEntity().getCoverage()); // insurance_product -> coverage
            claimDTO.setStatusName(claimEntity.getClaimStatusEntity().getDescription()); // claim_status -> description
            claimDTOs.add(claimDTO);
        }
*/
    claimDTOs = pageEntity.map(entity -> claimMapper.toDto(entity)).stream().toList();
    ResponsePage<List<ClaimDTO>> response = new ResponsePage<>();
    response.setData(claimDTOs);
    response.setMessage("Success");
    response.setCode(HttpStatus.OK.value()); // 200
    response.setTotalElement(pageEntity.getTotalElements());
    response.setTotalPage(pageEntity.getTotalPages());
    response.setPageSize(pageable.getPageSize());
    response.setPageIndex(pageable.getPageNumber());
    return response;
  }
}
