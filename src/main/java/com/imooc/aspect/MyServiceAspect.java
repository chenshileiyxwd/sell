package com.imooc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName MyServiceAspect
 * @Description TODO
 * @Author mrleier
 * @Date 2019/11/25 20:10
 * @Version 1.0
 **/
@Aspect
@Component
public class MyServiceAspect {
    @Before("execution(* com.imooc.service.*.*(..))")
    public void beforeMethod(JoinPoint jp){
        String methodName = jp.getSignature().getName();
        System.out.println("【前置通知】the method 【" + methodName + "】 begins with " + Arrays.asList(jp.getArgs()));
    }
}
