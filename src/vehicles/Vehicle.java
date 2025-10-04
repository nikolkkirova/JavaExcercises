package vehicles;

public class Vehicle { // базов клас Превозно средство
    private Engine engine;

    public Vehicle() {
    }

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine=" + engine +
                '}';
    }
}
