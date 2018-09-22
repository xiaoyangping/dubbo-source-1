package com.bjcoder;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

/**
 * Description:
 *
 * @author <a href="mailto:zhangmoujiang@songxiaocai.com">Moujiang.Zhang</a>
 * @Date Create on 2018/9/12
 * @since version1.0 Copyright 2015 SXC All Rights Reserved.
 */
@EnableDubbo(scanBasePackages = "com.bjcoder.service")
@SpringBootApplication
@ImportResource(locations = "classpath:provider.xml")
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
