public class ComputerTest {
    public static void main(String[] args) throws TooHighTemperatureException {
        Processor processor = new Processor("MX-143","ASUS", "123xbas",2000,90);
        RAM ram = new RAM("MSA123", "ASROCK", "ABC123", 4096,60,1066);
        HardDrive hardDrive = new HardDrive("TTY123","Kingstone","MKO1230",256);
        Computer computer = new Computer(processor, ram, hardDrive);
        System.out.println(computer.toString());
        try {
            computer.getProcessor().increaseTiming();
            computer.getProcessor().increaseTiming();
            computer.getProcessor().increaseTiming();
            computer.getProcessor().increaseTiming();
            computer.getProcessor().increaseTiming();
            computer.getProcessor().increaseTiming();
            computer.getProcessor().increaseTiming();
            computer.getRam().increaseTiming();
            computer.getRam().increaseTiming();
            computer.getRam().increaseTiming();
            computer.getRam().increaseTiming();
            computer.getRam().increaseTiming();
        } catch (TooHighTemperatureException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(computer.toString());
    }
}
