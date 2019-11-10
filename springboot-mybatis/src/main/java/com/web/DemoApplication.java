package com.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableScheduling   // 开启定时任务
//@MapperScan("com.suixingpay.dao")//或者直接在Mapper类上面添加注解@Mapper,建议使用MapperScan("com.suixingpay.dao")
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
