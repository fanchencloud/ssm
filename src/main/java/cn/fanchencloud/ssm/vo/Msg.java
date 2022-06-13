package cn.fanchencloud.ssm.vo;


import cn.fanchencloud.ssm.enums.HttpCode;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by handsome programmer.
 * ProjectName: academyProject
 * User: chen
 * Date: 2021/12/2
 * Time: 0:48
 * Description: 统一返回格式
 *
 * @author chen
 */
@Data
@Accessors(chain = true)
public class Msg<T> {
    /**
     * 状态码
     */
    @JSONField(ordinal = 1)
    private int code;

    /**
     * 返回内容
     */
    @JSONField(ordinal = 2)
    private String msg;

    /**
     * 数据对象
     */
    @JSONField(ordinal = 3)
    private T data;

    /**
     * 私有化构造函数，防止手动创建实例
     */
    private Msg() {
    }

    /**
     * 私有化全参构造函数
     *
     * @param code 状态码
     * @param msg  消息
     * @param data 数据
     */
    private Msg(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static Msg<Void> success() {
        return Msg.msg(null);
    }

    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static <T> Msg<T> success(T data) {
        return Msg.success("success", data);
    }

    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @return 成功消息
     */
    public static Msg<Void> msg(String msg) {
        return Msg.success(msg, null);
    }

    /**
     * 返回成功消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static <T> Msg<T> success(String msg, T data) {
        return new Msg<>(HttpCode.SUCCESS, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @return 警告消息
     */
    public static Msg<Void> error() {
        return Msg.error("操作失败");
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static Msg<Void> error(String msg) {
        return Msg.error(msg, null);
    }

    /**
     * 返回错误消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static <T> Msg<T> error(String msg, T data) {
        return new Msg<>(HttpCode.UNKNOWN, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @param code 状态码
     * @param msg  返回内容
     * @return 警告消息
     */
    public static Msg<Void> code(int code, String msg) {
        return new Msg<>(code, msg, null);
    }

    /**
     * 资源不存在
     */
    public static Msg<Void> notFound() {
        return new Msg<>(HttpCode.NOT_FOUND, "资源不存在", null);
    }

    /**
     * 资源不存在
     *
     * @param message 返回内容
     */
    public static Msg<Void> notFound(String message) {
        return new Msg<>(HttpCode.NOT_FOUND, message, null);
    }

    /**
     * 系统错误
     */
    public static Msg<Void> systemError() {
        return new Msg<>(HttpCode.INTERNAL_ERROR, "系统处理异常", null);
    }

    /**
     * 系统错误
     *
     * @param message 返回内容
     */
    public static Msg<Void> systemError(String message) {
        return new Msg<>(HttpCode.INTERNAL_ERROR, message, null);
    }

    /**
     * 无权限访问
     */
    public static Msg<Void> noPermission() {
        return new Msg<>(HttpCode.FORBIDDEN, "无权限访问", null);
    }

}