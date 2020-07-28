package com.itheima;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot启动类2
 * SpringBoot启动类1
 * SpringBoot启动类3
 * SpringBoot启动类4
 * @author lenovo
 *
 */
@SpringBootApplication
@MapperScan("com.itheima.mapper")
//作用：指定要变成实现类的接口所在的包，然后包下面的所有接口在编译之后都会生成相应的实现类
//添加@MapperScan(“com.test.dao”)注解以后，com.test.dao包下面的接口类，在编译之后都会生成相应的实现类
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
