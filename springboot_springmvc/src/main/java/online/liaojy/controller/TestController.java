package online.liaojy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liaojy
 * @date 2023/12/20 - 6:14
 */
@RestController
public class TestController {

    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        System.out.println("TestController --> testInterceptor()");
        return "testInterceptor()";
    }

}
