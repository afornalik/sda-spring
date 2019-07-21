package spring;

public class Car {

    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(Engine engine) {
        this.engine = engine;
    }


}
