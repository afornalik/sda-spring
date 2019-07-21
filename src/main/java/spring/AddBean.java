package spring;

public class AddBean {

    private Integer first;
    private Integer second;

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public void add(){

        System.out.println("Sum of two value is : "+(first+second));
    }
}
