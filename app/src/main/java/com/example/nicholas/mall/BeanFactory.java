package com.example.nicholas.mall;

/**
 * Created by nicholas on 8 March  2019.
 */

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Beans.xml"));
        Mall obj = (Mall) factory.getBean("Mall");
        obj.getMessage();
    }
}