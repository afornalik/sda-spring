package spring;

import java.util.Random;

public class SingletonBean {

    private String first;
    private Double number;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public Double action() {
        if (number== null){
          //  System.out.println( Math.random());
        }
       return number;
    }

    public String action2(){
        return first;
    }

    public void initial() {

    }

    public void destroy() {
        System.out.println("Destroy method");
    }


}
