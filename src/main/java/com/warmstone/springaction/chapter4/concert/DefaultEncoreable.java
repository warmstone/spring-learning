package com.warmstone.springaction.chapter4.concert;

import org.springframework.stereotype.Component;

/**
 * @author pengshun
 * @date 2022-09-18 17:58
 * @description
 */
@Component
public class DefaultEncoreable implements Encoreable{
    @Override
    public void performEncore() {
        System.out.println("defaultEncoreable...");
    }
}
