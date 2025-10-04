package goods;

public interface ItemForSale {
    double productionPrice(); // цена за производство
    double sellingPrice(); // продажна цена
    default double profit() { // печалба
        return this.sellingPrice() - this.productionPrice();
    }
}
