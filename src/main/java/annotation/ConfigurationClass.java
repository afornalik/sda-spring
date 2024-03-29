package annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {


    @Bean
    public CustomEventPublisher customEventPublisher() {
        return new CustomEventPublisher();
    }

    @Bean
    public CustomEventHandler customEventHandler() {
        return new CustomEventHandler();
    }

    @Bean
    public CStartEventHandler cStartEventHandler() {
        return new CStartEventHandler();
    }

    @Bean
    public PersonBean personBean() {
        return new PersonBean();
    }

    @Bean
    public Room room() {
        Room room = new Room();
        room.setBed(bed());
        room.setChair(chair());
        room.setTable(table());
        return  room;
    }

    @Bean
    public Table table() {
        return new Table();
    }

    @Bean
    public Bed bed() {
        return new Bed();
    }

    @Bean
    public Chair chair() {
        return new Chair();
    }
}
