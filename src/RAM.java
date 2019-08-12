public class RAM extends  Component{
    private static final int MAX_TEMPERATURE = 95;
    private double quantity;
    private int actualTemperature;
    private int timing;

    public RAM(String model, String producer, String serialNumber, double quantity, int actualTemperature, int timing) throws TooHighTemperatureException {
        super(model, producer, serialNumber);
        this.quantity = quantity;
        this.actualTemperature = actualTemperature;
        this.timing = timing;
        tooHighTemperature(actualTemperature);
    }

    private void tooHighTemperature(int actualTemperature) throws TooHighTemperatureException {
        if(actualTemperature>MAX_TEMPERATURE){
            throw new TooHighTemperatureException(MAX_TEMPERATURE, actualTemperature);
        }
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getActualTemperature() {
        return actualTemperature;
    }

    public int getTiming() {
        return timing;
    }

    public void setTiming(int timing) {
        this.timing = timing;
    }

    public void increaseTiming() throws TooHighTemperatureException {
        tooHighTemperature(actualTemperature);
        actualTemperature += 15;
        timing += 100;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "quantity=" + quantity +
                ", actualTemperature=" + actualTemperature +
                ", timing=" + timing +
                '}';
    }
}
