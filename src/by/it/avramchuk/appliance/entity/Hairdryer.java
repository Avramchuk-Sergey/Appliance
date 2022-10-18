package by.it.avramchuk.appliance.entity;

import java.io.Serializable;
import java.util.Objects;

public class Hairdryer extends Appliance implements Serializable {
    private static final long serialVersionUID = 4L;

    private int powerConsumption;
    private int numberOfModes;

    public Hairdryer() {

    }

    public Hairdryer(String brand, int weight, int guaranteePeriod, int powerConsumption, int numberOfModes) {
        super("Hairdryer", brand, weight, guaranteePeriod);
        this.powerConsumption = powerConsumption;
        this.numberOfModes = numberOfModes;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfModes() {
        return numberOfModes;
    }

    public void setNumberOfModes(int numberOfModes) {
        this.numberOfModes = numberOfModes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hairdryer hairdryer = (Hairdryer) o;
        return powerConsumption == hairdryer.powerConsumption && numberOfModes == hairdryer.numberOfModes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, numberOfModes);
    }

    @Override
    public String toString() {
        return "Hairdryer{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfModes=" + numberOfModes +
                '}';
    }
}
