public class TooHighTemperatureException extends Exception {
    public TooHighTemperatureException(int value, double value1) {
        super("Temperatura zbyt wysoka. Bezpieczna temperatura to " + value + ". Po zmianie: " + value1);
    }
}
