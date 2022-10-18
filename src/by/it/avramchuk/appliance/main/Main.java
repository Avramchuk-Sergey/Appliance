package by.it.avramchuk.appliance.main;

import static by.it.avramchuk.appliance.entity.criteria.SearchCriteria.*;

import by.it.avramchuk.appliance.dao.ApplianceDAO;
import by.it.avramchuk.appliance.dao.DAOException;
import by.it.avramchuk.appliance.dao.DAOFactory;
import by.it.avramchuk.appliance.entity.criteria.Criteria;
import by.it.avramchuk.appliance.view.Printer;

public class Main {

    public static void main(String[] args) throws DAOException {

        ApplianceDAO fileImpl = DAOFactory.getInstance().getApplianceDAO();
        Printer printer = new Printer();

        Criteria criteria = new Criteria();
        criteria.add(NAME, "Iron");
        criteria.add(STEAM_FUNCTION, false);

        printer.printAppliance(fileImpl.find(criteria));

    }
}
