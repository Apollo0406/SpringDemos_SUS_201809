package consumer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Arrays;

public class AwareApp implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext invoke");
        System.out.println("setApplicationContext :: Bean name = "
                            + Arrays.toString(applicationContext.getBeanDefinitionNames()));

    }

    @Override
    public void setBeanFactoy(BeanFactory beanFactoy ) throws Exception{
        System.out.println("setBeanFactoy INVOKE");
        System.out.println("setBeanFactoy Scopo="
        +(beanFactoy.isPrototype(("email")?"yes":"no")));
    }
    @Override
    public void setBeanClassLoader(ClassLoader classLoader){
        System.out.println("setBeanClassLoader invoke");
        System.out.println("setBeanClassLoader :: ClassLoader name:"
                            +classLoader.getClass().toString());
    }

    public void setBeanName(){

    }
}
