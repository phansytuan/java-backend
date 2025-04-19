package com.tuancode.service;

import com.tuancode.service.dto.ClaimDTO;
import com.tuancode.service.dto.response.ResponsePage;
import org.springframework.data.domain.Pageable;
import java.time.LocalDate;
import java.util.List;

public interface ClaimService {
    // trả về 1 danh sách
    // List<ClaimDTO> getClaims
    ResponsePage<List<ClaimDTO>> getClaims(
        String claimCode,
        LocalDate fromDate,
        LocalDate toDate,
        String codeStatus,
        Pageable pageable
    );
}
