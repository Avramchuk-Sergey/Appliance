package by.it.avramchuk.appliance.entity;

import java.io.Serializable;
import java.util.Objects;

public class Oven extends Appliance implements Serializable {
    private static final long serialVersionUID = 2L;

    private int powerConsumption;
    private int capacity;

    public Oven() {

    }

    public Oven(String brand, int weight, int guaranteePeriod, int powerConsumption, int capacity) {
        super("Oven", brand, weight, guaranteePeriod);
        this.powerConsumption = powerConsumption;
        this.capacity = capacity;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Oven oven = (Oven) o;
        return powerConsumption == oven.powerConsumption && capacity == oven.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, capacity);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumption=" + powerConsumption +
                ", capacity=" + capacity +
                '}';
    }
}
