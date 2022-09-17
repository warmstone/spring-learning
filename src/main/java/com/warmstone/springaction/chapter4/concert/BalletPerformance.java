package com.warmstone.springaction.chapter4.concert;

import org.springframework.stereotype.Component;

/**
 * @author pengshun
 * @date 2022-09-17 22:29
 * @description
 */
@Component
public class BalletPerformance implements Performance{
    @Override
    public void perform() {
        System.out.println("Ballet performance...");
    }
}
