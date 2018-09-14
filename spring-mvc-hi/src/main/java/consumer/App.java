package consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import services.Service;

@Component
public class App {
    //3.基于字段的方式
    @Autowired
    private Service service;

    /*
    //2.基于setter的方式
    @Autowired
    public void setService(Service service) {
        this.service = service;
    }*/

    /*  @Autowired  //自动找上面声明的service,去DIConfig 里面找 返回了class
    //1.基于构造函数的方式
        public App(Service service){
            this.service = service;
        }
    */

    public boolean process(String msg,String rec){
        return this.service.send(msg,rec);
    }
}
