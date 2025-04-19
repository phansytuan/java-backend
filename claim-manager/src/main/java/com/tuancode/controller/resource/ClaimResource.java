package com.tuancode.controller.resource;

import com.tuancode.service.ClaimService;
import com.tuancode.service.dto.ClaimDTO;
import com.tuancode.service.dto.response.ResponsePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Pageable;
import java.time.LocalDate;
import java.util.List;

// bắt đầu viết tất cả api

/* đánh dấu đây là 1 controller trả về dữ liệu dạng json cho api */
@RestController
@RequestMapping("/api/claim")
public class ClaimResource {

    @Autowired
    private ClaimService claimService;

    @GetMapping()
    // ta cần trả về 1 danh sách tất cả yêu cầu bồi thường bảo hiểm
    // làm cho search field:
    public ResponseEntity<ResponsePage<List<ClaimDTO>>> getListClaim(
            @RequestParam(required = false) String claimCode, // require = false: có thể truyền vào param hoặc không
            @RequestParam(required = false) LocalDate fromDate,
            @RequestParam(required = false) LocalDate toDate,
            @RequestParam(required = false) String codeStatus,
            Pageable pageable
    ) {
        ResponsePage<List<ClaimDTO>> claimDTOS = claimService.getClaims(claimCode,fromDate,toDate,codeStatus,pageable);
        return ResponseEntity.ok(claimDTOS);
        // return dùng ResponseEntity để chuyển dữ liệu dạng Java dòng trên sang thành dạng JSON
    }
}
