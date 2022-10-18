package by.it.avramchuk.appliance.dao;

import by.it.avramchuk.appliance.dao.impl.FileApplianceDAOImpl;

public final class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();

    private final ApplianceDAO fileApplianceImpl = new FileApplianceDAOImpl();

    private DAOFactory(){

    }

    public static DAOFactory getInstance(){
        return instance;
    }

    public ApplianceDAO getApplianceDAO(){
        return fileApplianceImpl;
    }
}
