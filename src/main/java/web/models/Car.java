package web.models;

public class Car {
    private long UIN;
    private String model;
    private carEquipment equipment;

    public Car(long UIN, String model, carEquipment equipment) {
        this.UIN = UIN;
        this.model = model;
        this.equipment = equipment;
    }

    public enum carEquipment {
        BASIC,
        STANDARD,
        COMFORT
    }

    public long getUIN() {
        return UIN;
    }

    public String getModel() {
        return model;
    }

    public carEquipment getEquipment() {
        return equipment;
    }

    @Override
    public String toString() {
        return "This car have " +
                "UIN=" + UIN +
                ", model='" + model + '\'' +
                ", equipment=" + equipment;
    }
}



