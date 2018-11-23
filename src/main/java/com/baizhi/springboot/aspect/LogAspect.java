package com.baizhi.springboot.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LogAspect {

    /*切入点*/
    @Pointcut(value = "execution(* com.baizhi.auction.service.*.*(..))")
    public void pp(){
        System.out.println("-----pp-----");

    }
    /*通知*/
    @Before(value = "pp()")
    public void testBefore(){
        System.out.println("------testBefore---");
    }

    @After(value = "pp()")
    public void testAfter(){
        System.out.println("------testAfter---");
    }

}
