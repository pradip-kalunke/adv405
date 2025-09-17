package com.tka;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
@Aspect // dependency
public class MyAppPrechecks {

    // Define pointcut for pay() and shop() methods in com.tka.MyAppn class
    @Pointcut("execution(* com.tka.MyAppn.pay(..)) || execution(* com.tka.MyAppn.shop(..))")
    public void myPointCutsPayShop() {}

    // Before advice using the pointcut method name
    @Before("myPointCutsPayShop()")
    public void beforeCode() {
        System.out.println("\n before >>User get Logged in..");
    }

    // After advice for all methods in com.tka.MyAppn
    @After("execution(* com.tka.MyAppn.*(..))")
    public void afterCode() {
        System.out.println(" after >> api done >> index page");
    }
}

