package providers;

public class TaxiDriver extends RegisteredProvider {
    private double distance; // изминат път
    private double pricePerKm; // цена на километър

    public TaxiDriver(String regNumber, double distance, double pricePerKm) {
        super(regNumber);
        this.distance = distance;
        this.pricePerKm = pricePerKm;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public void setPricePerKm(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    @Override
    public String toString() {
        return "TaxiDriver{" +
                "distance=" + distance +
                ", pricePerKm=" + pricePerKm +
                "} " + super.toString();
    }

    @Override
    public double earnings() {
        return this.getDistance() * this.getPricePerKm();
    }
}
