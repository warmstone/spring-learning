package com.warmstone.springaction.chapter4.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author pengshun
 * @date 2022-09-17 22:20
 * @description
 */
@Aspect
@Component
public class Audience {

    @Pointcut(value = "execution(* com.warmstone.springaction.chapter4.concert.Performance.perform(..))")
    public void perform(){}

//    @Before("perform()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

//    @Before("perform()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

//    @After("perform()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

//    @AfterThrowing("perform()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

    /**
     * 环绕通知
     */
    @Around("perform()")
    public Object watchPerformance(ProceedingJoinPoint joinPoint) {
        Object object = null;
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            object = joinPoint.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable e) {
            System.out.println("Demanding a refund");
        }
        return object;
    }

}
