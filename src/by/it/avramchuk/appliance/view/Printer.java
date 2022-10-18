package by.it.avramchuk.appliance.view;

import by.it.avramchuk.appliance.entity.Appliance;

import java.util.List;

public class Printer {

    public void printAppliance(List<Appliance> appliances) {

        for (Appliance appliance : appliances) {
            System.out.println(appliance);
        }
    }
}
