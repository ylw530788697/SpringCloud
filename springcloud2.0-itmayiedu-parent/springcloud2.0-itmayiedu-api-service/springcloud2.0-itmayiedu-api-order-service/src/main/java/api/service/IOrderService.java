package api.service;

import com.itmayiedu.base.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/08/04 21:07
 */
public interface IOrderService {
    // 订单服务调用会员服务接口信息 feign
    @RequestMapping("/orderToMember")
    public String orderToMember(String name);

    // 订单服务接口调用会员服务接口
    @RequestMapping("/orderToMemberUserInfo")
    public ResponseBase orderToMemberUserInfo();

    // 订单服务接口
    @RequestMapping("/orderInfo")
    public ResponseBase orderInfo();

    @RequestMapping("/")
    public String order();
}
