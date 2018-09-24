package main;

import consumer.XMLApp;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XMLClient {
    public static void main(String[]args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        XMLApp app = context.getBean(XMLApp.class);
        app.process("anser","tyy");
        context.close();
    }

}
