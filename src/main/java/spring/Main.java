package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

       // helloWorld.getMessage();
       // helloWorld.setMessage2("new value");

        HelloWorld h2 =(HelloWorld)context.getBean("helloWorld");

       // h2.getMessage();
       // h2.getMessage2();

        AddBean add = (AddBean) context.getBean("addBean");

        add.add();

        add.setFirst(14);

        AddBean sum = (AddBean) context.getBean("addBean");

        sum.add();
    }
}
