public class ComputerTest {
    public static void main(String[] args) {
        Processor processor = new Processor("MX-143","ASUS", "123xbas",2000,50);
        RAM ram = new RAM("MSA123", "ASROCK", "ABC123", 4096,60,1066);
        HardDrive hardDrive = new HardDrive("TTY123","Kingstone","MKO1230",256);
        Computer computer = new Computer(processor, ram, hardDrive);
        System.out.println(computer.toString());
        try {
            computer.processor.increaseTiming();
            computer.processor.increaseTiming();
            computer.processor.increaseTiming();
            computer.processor.increaseTiming();
            computer.processor.increaseTiming();
            computer.processor.increaseTiming();
            computer.processor.increaseTiming();
        } catch (TooHighTemperatureException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(computer.toString());

        try {
            computer.ram.increaseTiming();
            computer.ram.increaseTiming();
            computer.ram.increaseTiming();
            computer.ram.increaseTiming();
            computer.ram.increaseTiming();
        } catch (TooHighTemperatureException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(computer.toString());
    }
}
