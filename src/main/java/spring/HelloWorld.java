package spring;

public class HelloWorld {

    private String message;
    private String message2;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public String getMessage2() {
        return message2;
    }

    public void setMessage2(String message2) {
       this.message2 = message2;
    }
}
