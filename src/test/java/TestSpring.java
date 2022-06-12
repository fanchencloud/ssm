import cn.fanchencloud.ssm.service.TestService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Version: V1.0    <br/>
 * Datetime:   2022/6/13 2:05   <br/>
 * Description: 测试Spring
 *
 * @author: chen
 */
public class TestSpring {

    @Test
    public void testSpring() {
        // 加载Spring配置文件
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取对象
        TestService testService = applicationContext.getBean(TestService.class);
        // 调用方法
        String result = testService.test();
        System.out.println(result);
    }
}