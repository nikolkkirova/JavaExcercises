package goods;

public abstract class Goods implements ItemForSale {
    private double overcharge; // надценка на стока; може да е процент или абсолютна стойност

    // Примерче:
    // 100 цена за производство
    // 5 надценка
    // 100 продажна цена


    public Goods(double overcharge) {
        this.overcharge = overcharge;
    }

    public double getOvercharge() {
        return overcharge;
    }

    public void setOvercharge(double overcharge) {
        this.overcharge = overcharge;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "overcharge=" + overcharge +
                '}';
    }

    // public abstract double productionPrice();
    // този метод, който идва от ItemForSale прави този клас Goods абстрактен,
    // защото този метод не може да се имплементира
    // не е нужно да го пишем и тук, има си го в ItemForSale

    @Override
    public double sellingPrice() {
        return this.productionPrice() +
                this.productionPrice()*this.getOvercharge()/100;
    }

    @Override
    public double profit() {
       return ItemForSale.super.profit() + 100;
    }
}
