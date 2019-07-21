package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        PersonBean personBean = (PersonBean) context.getBean("personBean");

 //    ((AnnotationConfigApplicationContext)context).refresh();
 //       personBean.setName("Hania");
 //       System.out.println(personBean.getName());

        Room room = (Room) context.getBean("room");

        CustomEventPublisher customEventPublisher = context.getBean(CustomEventPublisher.class);
        customEventPublisher.publisher();

        System.out.println(room.getBed().getSize());
        System.out.println(room.getChair().getSize());
        System.out.println(room.getTable().getSize());
    }
}
