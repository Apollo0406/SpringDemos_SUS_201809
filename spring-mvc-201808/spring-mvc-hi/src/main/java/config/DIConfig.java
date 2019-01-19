package config;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import services.EmailService;
import services.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration //注解此类是配置文件
@ComponentScan(value = {"consumer"}) //告诉bean在什么地方，让此class被扫描到
public class DIConfig implements InitializingBean,DisposableBean {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Service getService(){
        return (Service) new EmailService();
    }

    @PostConstruct
    public void init(){
        System.out.println("post construct");
    }


    public void afterPropertiesSet() throws Exception {
        System.out.println("initBean init");
    }


    @PreDestroy
    public void finish(){
        System.out.println("finish");
    }


    public void destroy() throws Exception {
        System.out.println("disposiable destory");
    }


}
