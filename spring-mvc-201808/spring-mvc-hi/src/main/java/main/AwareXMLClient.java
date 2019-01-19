package main;

import consumer.AwareApp;
import consumer.XMLApp;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AwareXMLClient {
    public static void main(String[]args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AwareContext.xml");
        XMLApp ji  = context.getBean(XMLApp.class);
        context.close();
    }

}
