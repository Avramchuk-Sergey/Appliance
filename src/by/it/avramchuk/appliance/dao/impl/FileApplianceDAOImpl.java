package by.it.avramchuk.appliance.dao.impl;

import by.it.avramchuk.appliance.dao.ApplianceDAO;
import by.it.avramchuk.appliance.dao.DAOException;
import by.it.avramchuk.appliance.entity.Appliance;
import by.it.avramchuk.appliance.entity.criteria.Criteria;
import by.it.avramchuk.appliance.dao.util.ApplianceCreator;
import by.it.avramchuk.appliance.dao.util.ApplianceDataMatcher;
import by.it.avramchuk.appliance.dao.util.ApplianceReader;
import by.it.avramchuk.appliance.dao.util.PathCreator;

import java.util.List;

public class FileApplianceDAOImpl implements ApplianceDAO {


    public static final String FILE_NAME = "appliances.txt";
    private final String pathToDataFile = PathCreator.getPathTo(FILE_NAME);


    @Override
    public List<Appliance> find(Criteria criteria) throws DAOException {

        ApplianceReader reader = new ApplianceReader(pathToDataFile);
        List<String> dataFromSource = reader.take();

        ApplianceDataMatcher matcher = new ApplianceDataMatcher(dataFromSource, criteria);
        List<String> matchingData = matcher.match();

        ApplianceCreator creator = new ApplianceCreator(matchingData);

        return creator.createAllAppliances();
    }
}
