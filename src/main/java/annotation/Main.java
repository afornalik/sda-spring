package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        PersonBean personBean = (PersonBean) context.getBean("personBean");

        personBean.setName("Hania");
        System.out.println(personBean.getName());
    }
}
