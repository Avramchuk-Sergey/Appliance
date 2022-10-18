package by.it.avramchuk.appliance.entity;

import java.io.Serializable;
import java.util.Objects;

public class Laptop extends Appliance implements Serializable {
    private static final long serialVersionUID = 5L;

    private int batteryCapacity;
    private int displayInches;

    public Laptop() {

    }

    public Laptop(String brand, int weight, int guaranteePeriod, int batteryCapacity, int displayInches) {
        super("Laptop", brand, weight, guaranteePeriod);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return batteryCapacity == laptop.batteryCapacity && displayInches == laptop.displayInches;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity, displayInches);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                '}';
    }
}
