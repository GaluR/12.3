public class RAM extends  Component{
    private static final int MAX_TEMPERATURE = 95;
    private double quantity;
    private int actualTemperature;
    private int timing;

    public RAM(String model, String producer, String serialNumber, double quantity, int actualTemperature, int timing) {
        super(model, producer, serialNumber);
        this.quantity = quantity;
        this.actualTemperature = actualTemperature;
        this.timing = timing;
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

    public void setActualTemperature(int actualTemperature) {
        this.actualTemperature = actualTemperature;
    }

    public int getTiming() {
        return timing;
    }

    public void setTiming(int timing) {
        this.timing = timing;
    }

    public void increaseTiming() throws TooHighTemperatureException {
        if(actualTemperature>=MAX_TEMPERATURE-15){
            throw new TooHighTemperatureException(MAX_TEMPERATURE, actualTemperature+15);
        }
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
