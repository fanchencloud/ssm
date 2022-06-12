package cn.fanchencloud.ssm.service;

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

    public String test() {
        System.out.println("Test 服务 查询 。。。。");
        return "test";
    }
}