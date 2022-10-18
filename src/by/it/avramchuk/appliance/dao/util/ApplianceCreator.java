package by.it.avramchuk.appliance.dao.util;

import static by.it.avramchuk.appliance.entity.criteria.SearchCriteria.*;

import by.it.avramchuk.appliance.entity.Appliance;
import by.it.avramchuk.appliance.entity.Hairdryer;
import by.it.avramchuk.appliance.entity.Iron;
import by.it.avramchuk.appliance.entity.Oven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplianceCreator {

    public static final String DATA_DELIMITER = ",\s*";
    public static final String FIELD_DELIMITER = "=";
    public static final String OVEN = "Oven";
    public static final String IRON = "Iron";
    public static final String HAIRDRYER = "Hairdryer";

    private final List<String> dataFromSource;

    public ApplianceCreator(List<String> dataFromSource) {
        this.dataFromSource = dataFromSource;
    }

    public List<Appliance> createAllAppliances() {

        List<Appliance> appliances = new ArrayList<>();

        //NAME=Oven, BRAND=Samsung,   WEIGHT=10, GUARANTEE_PERIOD=2, POWER_CONSUMPTION=800, CAPACITY=10
        for (String data : dataFromSource) {
            appliances.add(createAppliance(data));
        }

        return appliances;
    }

    private Appliance createAppliance(String data) {
        Map<String, String> fieldValues = getFieldValues(data);
        String applianceName = fieldValues.get(NAME);

        return switch (applianceName) {
            case OVEN -> createOven(fieldValues);
            case IRON -> createIron(fieldValues);
            case HAIRDRYER -> createHairDryer(fieldValues);
            default -> createLaptop(fieldValues);
        };
    }

    private Map<String, String> getFieldValues(String data) {
        String[] fieldsPattern = data.split(DATA_DELIMITER);
        Map<String, String> fieldsValues = new HashMap<>();

        for (String pattern : fieldsPattern) {
            String[] keyAndValue = pattern.split(FIELD_DELIMITER);
            fieldsValues.put(keyAndValue[0], keyAndValue[1]) ;
        }
        return fieldsValues;
    }

    private Appliance createOven(Map<String, String> fields) {
        String brand = fields.get(BRAND);
        int weight = Integer.parseInt(fields.get(WEIGHT));
        int guaranteePeriod = Integer.parseInt(fields.get(GUARANTEE_PERIOD));
        int powerConsumption = Integer.parseInt(fields.get(POWER_CONSUMPTION));
        int capacity = Integer.parseInt(fields.get(CAPACITY));

        return new Oven(brand, weight, guaranteePeriod, powerConsumption, capacity);
    }

    private Appliance createIron(Map<String, String> fields) {
        String brand = fields.get(BRAND);
        int weight = Integer.parseInt(fields.get(WEIGHT));
        int guaranteePeriod = Integer.parseInt(fields.get(GUARANTEE_PERIOD));
        int powerConsumption = Integer.parseInt(fields.get(POWER_CONSUMPTION));
        boolean steamFunction = Boolean.parseBoolean(fields.get(STEAM_FUNCTION));

        return new Iron(brand, weight, guaranteePeriod, powerConsumption, steamFunction);
    }

    private Appliance createHairDryer(Map<String, String> fields) {
        String brand = fields.get(BRAND);
        int weight = Integer.parseInt(fields.get(WEIGHT));
        int guaranteePeriod = Integer.parseInt(fields.get(GUARANTEE_PERIOD));
        int powerConsumption = Integer.parseInt(fields.get(POWER_CONSUMPTION));
        int numberOfModes = Integer.parseInt(fields.get(NUMBER_OF_MODES));

        return new Hairdryer(brand, weight, guaranteePeriod, powerConsumption, numberOfModes);
    }

    private Appliance createLaptop(Map<String, String> fields) {
        String brand = fields.get(BRAND);
        int weight = Integer.parseInt(fields.get(WEIGHT));
        int guaranteePeriod = Integer.parseInt(fields.get(GUARANTEE_PERIOD));
        int batteryCapacity = Integer.parseInt(fields.get(BATTERY_CAPACITY));
        int displayInches = Integer.parseInt(fields.get(DISPLAY_INCHES));

        return new Oven(brand, weight, guaranteePeriod, batteryCapacity, displayInches);
    }
}
