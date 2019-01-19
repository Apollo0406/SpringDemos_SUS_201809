package services;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

//public class EmailService implements Service,InitializingBean,DisposableBean {
public class EmailService implements Service{
    public boolean send(String msg,String rec){
        System.out.println("Email send to:"+rec+" with mag :{"+msg+"}");
        return true;
    }

    @PostConstruct
    public void init(){
        System.out.println("email post construct:email construct");
    }


    public void destroy() throws Exception {
        System.out.println("email destory");
    }

    public void afterPropertiesSet() throws Exception {
    System.out.println("email pre desroty");
    }

    private void xmlInt() {
        System.out.println("email XMLint");
    }

    private void xmlDestroy() {
        System.out.println("email xmldestory");
    }
}
