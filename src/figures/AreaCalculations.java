package figures;

public interface AreaCalculations { // калкулации, свързани с лица

    double area();
    default double totalArea(Figure figure) {
        if (validation()) {
            return this.area() + figure.area();
        }
        return 0;
    }

    private boolean validation() {
        return true;
    }

    static void test() {
        System.out.println("AreaCalculations");
    }
}
