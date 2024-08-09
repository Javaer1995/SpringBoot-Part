package online.liaojy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liaojy
 * @date 2023/12/18 - 7:04
 */
@RestController
public class TestController {

    @Value("${my.name}")
    private String name;

    @RequestMapping("/readApplication")
    public String readApplication(){
        return "Hello，"+name+"!";
    }

}
