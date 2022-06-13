package cn.fanchencloud.ssm.entity;

import lombok.Data;
import lombok.ToString;

/**
 * Version: V1.0    <br/>
 * Datetime:   2022/6/13 14:29   <br/>
 * Description: 用户表实体类
 *
 * @author: chen
 */
@Data
@ToString
public class User {
    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户年龄
     */
    private Integer age;
}