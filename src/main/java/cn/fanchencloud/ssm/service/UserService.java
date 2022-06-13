package cn.fanchencloud.ssm.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.fanchencloud.ssm.mapper.UserMapper;
/**
 * Version: V1.0    <br/>
 * Datetime:   2022/6/13 15:39   <br/>
 * Description: ${DES}
 *
 * @author: chen
 */
@Service
public class UserService{

    @Resource
    private UserMapper userMapper;

}
