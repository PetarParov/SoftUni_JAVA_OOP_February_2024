package PolymorphismExercises.Vehicles_01.entities;

import PolymorphismExercises.Vehicles_01.interfaces.Vehicle;

public abstract class VehicleImpl implements Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumptionPerKm;

    protected VehicleImpl(double fuelQuantity, double fuelConsumptionPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    protected void setFuelConsumptionPerKm(double index) {
        this.fuelConsumptionPerKm += index;
    }

    protected void setFuelQuantity(double liters) {
        this.fuelQuantity += liters;
    }
}
