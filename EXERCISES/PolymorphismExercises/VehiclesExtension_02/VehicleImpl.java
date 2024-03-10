package PolymorphismExercises.VehiclesExtension_02;

public class VehicleImpl implements Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumptionPerKm;

    public VehicleImpl(double fuelQuantity, double fuelConsumptionPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    @Override
    public void drive() {

    }

    @Override
    public void refuel() {

    }
}
