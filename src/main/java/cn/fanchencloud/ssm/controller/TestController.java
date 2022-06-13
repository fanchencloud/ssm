package cn.fanchencloud.ssm.controller;

import cn.fanchencloud.ssm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Version: V1.0    <br/>
 * Datetime:   2022/6/13 1:45   <br/>
 * Description: 测试
 *
 * @author: chen
 */
@Controller
@RequestMapping("/test")
public class TestController {

    /**
     * 测试服务
     */
    private TestService testService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView test() {
        // 执行测试任务
        testService.test();
        ModelAndView modelAndView = new ModelAndView("test");
        modelAndView.addObject("name", "fanchencloud");
        modelAndView.getModel().put("age", 18);
        return modelAndView;
    }

    @Autowired
    public void setTestService(TestService testService) {
        this.testService = testService;
    }
}