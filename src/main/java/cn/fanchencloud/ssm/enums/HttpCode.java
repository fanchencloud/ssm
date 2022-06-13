package cn.fanchencloud.ssm.enums;

/**
 * Version: V1.0    <br/>
 * Datetime:   2022/4/21 2:47   <br/>
 * Description: Http状态码
 *
 * @author: chen
 */
public class HttpCode {
    /**
     * 未知异常
     */
    public static final int UNKNOWN = 100;

    /**
     * 请求方式不允许
     */
    public static final int REQUEST_METHOD_NOT_SUPPORT = 110;
    /**
     * 成功
     */
    public static final int SUCCESS = 200;

    /**
     * 错误请求
     */
    public static final int BAD_REQUEST = 400;
    /**
     * 未授权
     */
    public static final int UNAUTHORIZED = 401;
    /**
     * 禁止访问
     */
    public static final int PAYMENT_REQUIRED = 402;
    /**
     * 禁止访问
     */
    public static final int FORBIDDEN = 403;
    /**
     * 资源不存在
     */
    public static final int NOT_FOUND = 404;

    /**
     * 服务器内部错误
     */
    public static final int INTERNAL_ERROR = 500;

    private HttpCode() { /* compiled code */ }
}