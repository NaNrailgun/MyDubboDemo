package com.nanrailgun;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        //加载xml配置文件启动
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/ApplicationContext.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }
}
