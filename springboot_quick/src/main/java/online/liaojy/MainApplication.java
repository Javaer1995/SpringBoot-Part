package online.liaojy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liaojy
 * @date 2023/12/10 - 21:01
 */
// @SpringBootApplication 注解标识的类，为Spring Boot应用程序的启动类
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        /*
        * 该方法是启动 Spring Boot 应用程序的关键步骤，
        * 它会创建应用程序上下文、创建ioc容器、自动配置及启动应用程序（web项目会启动内置的Tomcat），并处理命令行参数。
        * */
        SpringApplication.run(MainApplication.class,args);
    }

}
