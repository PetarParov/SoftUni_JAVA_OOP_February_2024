package InterfacesAndAbstractionLab.CarShopExtended_02;

public interface Rentable extends Car {
    Integer getMinRentDay();
    Double getPricePerDay();
}