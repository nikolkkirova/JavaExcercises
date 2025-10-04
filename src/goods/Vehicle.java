package goods;

public class Vehicle extends Goods {
    private double materialCost;
    private double salaryCost;

    public Vehicle(double overcharge, double materialCost, double salaryCost) {
        super(overcharge);
        this.materialCost = materialCost;
        this.salaryCost = salaryCost;
    }

    public double getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(double materialCost) {
        this.materialCost = materialCost;
    }

    public double getSalaryCost() {
        return salaryCost;
    }

    public void setSalaryCost(double salaryCost) {
        this.salaryCost = salaryCost;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "materialCost=" + materialCost +
                ", salaryCost=" + salaryCost +
                "} " + super.toString();
    }

    @Override
    public double productionPrice() {
        return this.getMaterialCost() + this.getSalaryCost();
    }
}
