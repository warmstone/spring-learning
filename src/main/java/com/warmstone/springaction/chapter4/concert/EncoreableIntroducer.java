package com.warmstone.springaction.chapter4.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author pengshun
 * @date 2022-09-18 17:55
 * @description
 */
@Aspect
public class EncoreableIntroducer {

    /**
     * 通过 @DeclareParents 增加额外的方法，
     * value 是通配符，匹配要增强的类，defaultImpl 是默认实现
     */
    @DeclareParents(value = "com.warmstone.springaction.chapter4.concert.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
