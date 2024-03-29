package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

        // helloWorld.getMessage();
        // helloWorld.setMessage2("new value");

        HelloWorld h2 = (HelloWorld) context.getBean("helloWorld");

        // h2.getMessage();
        // h2.getMessage2();

        AddBean add = (AddBean) context.getBean("addBean");

        //  add.add();
        //  add.setFirst(14);

        AddBean sum = (AddBean) context.getBean("addBean");

        //  sum.add();


        SingletonBean singletonBean = (SingletonBean) context.getBean("singletonBean");

//        singletonBean.setFirst("hello");
//        singletonBean.setNumber(32.4);
//
//        System.out.println(singletonBean.action());
//        System.out.println(singletonBean.action2());

        SingletonBean singletonBean1 = (SingletonBean) context.getBean("singletonBean");
//
//        System.out.println(singletonBean1.action2());
//        System.out.println(singletonBean1.action());

//        context.close();

        BeanTemplate beanTemplate = (BeanTemplate) context.getBean("beanTemplate");

//        System.out.println(beanTemplate.getValue1());
//        System.out.println(beanTemplate.getValue2());
//        System.out.println(beanTemplate.getValue3());

        Computer computer = (Computer) context.getBean("computer");

//        System.out.println(computer.getProcessor().getCPU());


//        Car car = (Car) context.getBean("car");
//
//        System.out.println(car.getEngine().getPower());

        SpringCollection springCollection = (SpringCollection) context.getBean("collection");

        springCollection.getListNames().forEach(System.out::println);
        System.out.println();

        springCollection.getSetNames().forEach(System.out::println);
        System.out.println();

        springCollection.getMapNames().forEach((k,v) -> System.out.println(k +" " + v));
        System.out.println();
    }
}
