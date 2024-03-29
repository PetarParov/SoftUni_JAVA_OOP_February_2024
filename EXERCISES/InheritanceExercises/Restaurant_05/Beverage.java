package InheritanceExercises.Restaurant_05;

import java.math.BigDecimal;

public class Beverage extends Product {
    private double milliliters;

    public Beverage(String name, BigDecimal price, double milliliters) {
        super(name, price);
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return this.milliliters;
    }

    protected void setMilliliters(double milliliters) {
        this.milliliters = milliliters;
    }
}