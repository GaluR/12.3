public class Processor extends Component{
    private static final int MAX_TEMPERATURE = 90;
    private int timing;
    private double actualTemperature;

    public Processor(String model, String producer, String serialNumber, int timing, double actualTemperature) throws TooHighTemperatureException {
        super(model, producer, serialNumber);
        tooHighTemperature(actualTemperature);
        this.timing = timing;
        this.actualTemperature = actualTemperature;
    }

    private void tooHighTemperature(double actualTemperature) throws TooHighTemperatureException {
        if(actualTemperature>MAX_TEMPERATURE) {
            throw new TooHighTemperatureException(MAX_TEMPERATURE, actualTemperature);
        }
    }

    public int getTiming() {
        return timing;
    }

    public void setTiming(int timing) {
        this.timing = timing;
    }

    public double getActualTemperature() {
        return actualTemperature;
    }

    public void increaseTiming() throws TooHighTemperatureException {
        tooHighTemperature(actualTemperature);
        actualTemperature += 10;
        timing += 100;
    }

    @Override
    public String toString() {
        return super.toString() + "Processor{" +
                "timing=" + timing +
                ", actualTemperature=" + actualTemperature +
                '}';
    }
}
