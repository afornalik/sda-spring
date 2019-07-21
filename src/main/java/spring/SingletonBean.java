package spring;

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
       return number;
    }

    public String action2(){
        return first;
    }
}
