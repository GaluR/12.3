public class TooHighTemperatureException extends Exception {
    public TooHighTemperatureException(int value, double value1) {
        super("Nie można zwiększyć taktowania podzespołu. Bezpieczna temperatura to " + value + " a po podkręceniu temperatura będzie wynosiła" + value1);
    }
}
