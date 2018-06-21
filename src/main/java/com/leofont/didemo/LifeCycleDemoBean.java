package com.leofont.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {

        System.out.println("## I´m in the LifeCycleBean Constructor");
    }

    @Override
    public void setBeanName(String name) {

        System.out.println("## My bean name is: " + name);
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("## The lifecycle has been terminated");

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("## The lifecycle has its properties set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        System.out.println("## Bean Factory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## ApplicationContext  has been set");

    }

    @PostConstruct
    public void PostConstruct() {

        System.out.println("## PostConstruct annotated method has been called");

    }

    @PreDestroy
    public void PreDestroy() {

        System.out.println("## PreDestroy annotated method has been called");

    }

    public void beforeInit() {

        System.out.println("## beforeInit called by bean Post Processor");

    }

    public void afterInit() {

        System.out.println("## afterInit called by bean Post Processor");

    }
}
