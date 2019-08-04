package com.itmayiedu.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/08/04 19:09
 */
@FeignClient(name = "app-itmayiedu-member")
public interface MemberApiFeign {
    public String getMember();
}
