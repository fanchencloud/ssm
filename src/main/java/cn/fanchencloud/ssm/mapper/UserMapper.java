package cn.fanchencloud.ssm.mapper;

import cn.fanchencloud.ssm.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Version: V1.0    <br/>
 * Datetime:   2022/6/13 14:29   <br/>
 * Description: 用户表数据访问接口
 *
 * @author: chen
 */
@Mapper
public interface UserMapper {

    /**
     * 根据id查询用户
     *
     * @param id 用户id
     * @return 用户
     */
    User selectUserById(int id);
}