package consumer;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import services.Service;

import javax.annotation.PostConstruct;

public class XMLApp implements InitializingBean,DisposableBean {
    private Service service;
    @Autowired
    public void setService(Service service) {
        this.service = service;
    }

    public boolean process(String msg,String rec){
        return this.service.send(msg,rec);
    }
    private void xmlInt() {
        System.out.println("xmlapp XML int");
    }

    private void xmlDestroy() {
        System.out.println("xmlapp xmldestory");
    }

    @PostConstruct
    public void init(){
        System.out.println("xmlapp post construct:email construct");
    }


    public void destroy() throws Exception {
        System.out.println("xmlapp destory");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("xmlapp init init");
    }
}
