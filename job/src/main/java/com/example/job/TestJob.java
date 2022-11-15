package com.example.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author luzhonghe
 * @date 2022/11/14
 */
@Component
public class TestJob {
    
    @Scheduled(fixedDelay = 1000L)
    public void test() {
        System.out.println("666");
    }
    
}
