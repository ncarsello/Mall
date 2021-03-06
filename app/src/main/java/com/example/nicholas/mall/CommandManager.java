package com.example.nicholas.mall;
package Facility

// an attempt at a bean factory
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CommandManager implements BeanFactoryAware {

    private BeanFactory beanFactory;

    public Object process(Map commandState) {
        Command command = createCommand();
        command.setState(commandState);
        return command.execute();
    }

    protected Command createCommand() {
        return (Command) this.beanFactory.getBean("command"); // notice the Spring API dependency
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}