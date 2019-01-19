package main;

import config.DIConfig;
import consumer.App;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.EmailService;
import services.Service;

public class Client {
    public static void main(String[] args) {
        //cotext就代表应用程序
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);//传了配置文件
        App app = context.getBean(App.class);

        app.process("hi,aTang","tyy.com");
        App app2 = context.getBean(App.class);
        Service service1 = context.getBean(EmailService.class);
        Service service2 = context.getBean(EmailService.class);
        System.out.println("app1 .hascode:"+service1.hashCode());
        System.out.println("app2 .hascode:"+service2.hashCode());
        context.close();
    }
}
