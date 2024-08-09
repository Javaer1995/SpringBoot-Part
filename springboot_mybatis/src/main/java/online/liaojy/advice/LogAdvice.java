package online.liaojy.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author liaojy
 * @date 2023/12/25 - 6:51
 */
@Component
@Aspect
@Order(5)
public class LogAdvice {

    @Before("execution(* online.liaojy.service.*.*.*(..))")
    public void beforeLog(JoinPoint joinPoint){
        // 获取连接点所对应目标方法所在类的名称
        String className = joinPoint.getSignature().getClass().getSimpleName();
        // 获取连接点所对应目标方法的名称
        String methodName = joinPoint.getSignature().getName();

        System.out.println(className+"类的"+methodName+"方法开始执行了！");
    }

}
