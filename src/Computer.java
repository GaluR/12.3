public class Computer {
    Processor processor;
    RAM ram;
    HardDrive hardDrive;

    public Computer(Processor processor, RAM ram, HardDrive hardDrive) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                ", hardDrive=" + hardDrive +
                '}';
    }
}
