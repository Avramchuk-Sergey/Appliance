package by.it.avramchuk.appliance.entity;

import java.io.Serializable;
import java.util.Objects;

public abstract class Appliance implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String brand;
    private int weight;
    private int guaranteePeriod;

    public Appliance() {
        name = "Unknown";
    }

    public Appliance(String name, String brand, int weight, int guaranteePeriod) {
        this.name = name;
        this.brand = brand;
        this.weight = weight;
        this.guaranteePeriod = guaranteePeriod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setLifetime(int lifetime) {
        this.guaranteePeriod = lifetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return weight == appliance.weight && guaranteePeriod == appliance.guaranteePeriod && Objects.equals(name, appliance.name) && Objects.equals(brand, appliance.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand, weight, guaranteePeriod);
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", weight=" + weight +
                ", guaranteePeriod=" + guaranteePeriod +
                '}';
    }
}
