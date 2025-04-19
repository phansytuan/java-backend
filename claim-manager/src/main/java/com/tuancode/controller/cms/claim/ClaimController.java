package com.tuancode.controller.cms.claim;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cms")
public class ClaimController {

    @GetMapping("/claim-manager")
    public String getClaimManager() {
        return "cms/claim/claim-manager";
    }

    @GetMapping("/claim-detail")
    public String claimDetail() {
        return "cms/claim/detail-claim";
    }
}
