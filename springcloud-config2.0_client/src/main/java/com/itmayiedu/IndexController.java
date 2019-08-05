package com.itmayiedu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author evanYang
 */
@RestController
//@RefreshScope
public class IndexController {
    @Value("${itmayieduInfo}")
    private String itmayieduInfo;
    @RequestMapping("/name")
    private String name(){
        return  itmayieduInfo;
    }
}
