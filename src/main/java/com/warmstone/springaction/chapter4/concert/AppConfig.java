package com.warmstone.springaction.chapter4.concert;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author pengshun
 * @date 2022-09-17 22:21
 * @description
 */
//@Configuration
// 默认使用JDK动态代理，是基于接口的，注入的时候必须注入接口，如果注入的是类，会报
// BeanNotOfRequiredTypeException 异常，要么修改为注入接口，要么修改 proxyTargetClass = true
//@EnableAspectJAutoProxy(proxyTargetClass = true)
//@EnableAspectJAutoProxy
//@ComponentScan(basePackages = "com.warmstone.springaction.chapter4")
public class AppConfig {
}
