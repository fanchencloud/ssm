package cn.fanchencloud.ssm.service;

import cn.fanchencloud.ssm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Version: V1.0    <br/>
 * Datetime:   2022/6/13 2:03   <br/>
 * Description: 测试服务
 *
 * @author: chen
 */
@Service
public class TestService {

    private UserService userService;

    public String test() {
        System.out.println("Test 服务 查询 。。。。");
        User user = userService.getUserById(1);
        System.out.println(user);
        return "test";
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}