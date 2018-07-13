package com.leofont.didemo;

import com.leofont.didemo.controllers.ConstructorInjectedController;
import com.leofont.didemo.controllers.GetterInjectedController;
import com.leofont.didemo.controllers.MyController;
import com.leofont.didemo.controllers.PropertyInjectedController;
import com.leofont.didemo.examplebeans.FakeDataSource;
import com.leofont.didemo.examplebeans.FakeJMSBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();

/*
        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
*/
        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());

        FakeJMSBroker fakeJMSBroker = (FakeJMSBroker) ctx.getBean(FakeJMSBroker.class);

        System.out.println((fakeJMSBroker.getUser()));

    }
}
