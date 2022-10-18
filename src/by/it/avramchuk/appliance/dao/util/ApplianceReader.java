package by.it.avramchuk.appliance.dao.util;

import by.it.avramchuk.appliance.dao.DAOException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceReader {

    private final String sourcePath;

    public ApplianceReader(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public List<String> take() throws DAOException {

        List<String> appliances = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath))) {
            while (reader.ready()) {
                appliances.add(reader.readLine());
            }
        } catch (IOException e) {
            throw new DAOException(e);
        }

        return appliances;
    }
}
