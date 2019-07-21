package spring;

public class Computer {

    private Processor processor;

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Computer(Processor processor) {
        this.processor = processor;

    }
}
