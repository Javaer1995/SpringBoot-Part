package online.liaojy.config;

import online.liaojy.interceptor.TestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author liaojy
 * @date 2023/12/20 - 7:04
 */
// 配置类只要放在启动类所在的包或者子包即可生效
@Configuration
public class SpringMVCConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        TestInterceptor testInterceptor = new TestInterceptor();
        registry.addInterceptor(testInterceptor).addPathPatterns("/**");
    }

}
