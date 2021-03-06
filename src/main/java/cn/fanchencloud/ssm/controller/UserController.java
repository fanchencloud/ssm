package cn.fanchencloud.ssm.controller;

import cn.fanchencloud.ssm.entity.User;
import cn.fanchencloud.ssm.vo.Msg;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Version: V1.0    <br/>
 * Datetime:   2022/6/14 1:43   <br/>
 * Description: 用户接口
 *
 * @author: chen
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/getUser")
    public String getUser() {
        return "user";
    }

    @GetMapping("/getUser2")
    @ResponseBody
    public Msg getUserInfo() {
        logger.info("getUserInfo");
        User user = new User();
        user.setId(1);
        user.setName("chen");
        user.setAge(18);
        user.setBirthday(new Date());
        return Msg.success(user);
    }
}