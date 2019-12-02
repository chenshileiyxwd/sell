package com.imooc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName MyLocalAspect
 * @Description 切面处理类
 * @Author mrleier
 * @Date 2019/11/25 19:23
 * @Version 1.0
 **/
@Aspect
@Component
public class MyLocalAspect {
    @Before("execution(* com.imooc.controller.*.*(..))")
    public void beforeMethod(JoinPoint jp){
        String methodName = jp.getSignature().getName();
        System.out.println("【前置通知】the method 【" + methodName + "】 begins with " + Arrays.asList(jp.getArgs()));
    }

}

