package online.liaojy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liaojy
 * @date 2023/12/10 - 21:22
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello,springboot2!";
    }

}
