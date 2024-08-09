package online.liaojy.filter;



import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author liaojy
 * @date 2023/12/20 - 16:44
 */
@Component
public class TestFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("TestFilter --> doFilter()");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
