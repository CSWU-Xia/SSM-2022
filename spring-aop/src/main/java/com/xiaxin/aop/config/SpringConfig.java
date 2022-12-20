package com.xiaxin.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.xiaxin.aop")
//开启aspect切面注解支持
@EnableAspectJAutoProxy
public class SpringConfig {
}
