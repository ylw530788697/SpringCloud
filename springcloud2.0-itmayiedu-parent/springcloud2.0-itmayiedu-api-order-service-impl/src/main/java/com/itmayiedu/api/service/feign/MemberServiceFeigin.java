package com.itmayiedu.api.service.feign;

import com.itmayiedu.api.service.IMemberService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author v_liwenyang
 */
@FeignClient("app-itmayiedu-member")
public interface MemberServiceFeigin extends IMemberService {
}
