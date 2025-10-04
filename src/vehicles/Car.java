package vehicles;

public class Car extends Vehicle {
    private boolean isWagon; // дали е комби

    public Car() {
    }

    public Car(Engine engine, boolean isWagon) {
        super(engine);
        this.isWagon = isWagon;
    }

    public boolean isWagon() {
        return isWagon;
    }

    public void setWagon(boolean wagon) {
        isWagon = wagon;
    }

    @Override
    public String toString() {
        return "Car{" +
                "isWagon=" + isWagon +
                "} " + super.toString();
    }
}
