package itmayiedu.api.service.api;

import api.service.IOrderService;
import com.itmayiedu.api.entity.UserEntity;
import com.itmayiedu.base.ResponseBase;
import itmayiedu.api.service.api.feign.MemberServiceFeigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/08/04 21:17
 */
@RestController
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private MemberServiceFeigin memberServiceFeigin;

    @RequestMapping("/orderToMember")
    @Override
    public String orderToMember(@RequestParam("name") String name) {
        UserEntity user = memberServiceFeigin.getMember(name);
        return user == null ? "没有找到用户信息" : user.toString();
    }

    @Override
    public ResponseBase orderToMemberUserInfo() {
        return null;
    }

    @Override
    public ResponseBase orderInfo() {
        return null;
    }
}
