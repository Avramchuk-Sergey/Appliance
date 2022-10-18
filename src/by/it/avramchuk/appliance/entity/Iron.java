package by.it.avramchuk.appliance.entity;

import java.io.Serializable;
import java.util.Objects;

public class Iron extends Appliance implements Serializable {
    private static final long serialVersionUID = 3L;

    private int powerConsumption;
    private boolean steamFunction;

    public Iron() {

    }

    public Iron(String brand, int weight, int guaranteePeriod, int powerConsumption, boolean steamFunction) {
        super("Iron", brand, weight, guaranteePeriod);
        this.powerConsumption = powerConsumption;
        this.steamFunction = steamFunction;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public boolean isSteamFunction() {
        return steamFunction;
    }

    public void setSteamFunction(boolean steamFunction) {
        this.steamFunction = steamFunction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Iron iron = (Iron) o;
        return powerConsumption == iron.powerConsumption && steamFunction == iron.steamFunction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, steamFunction);
    }

    @Override
    public String toString() {
        return "Iron{" +
                "powerConsumption=" + powerConsumption +
                ", steamFunction=" + steamFunction +
                '}';
    }
}
