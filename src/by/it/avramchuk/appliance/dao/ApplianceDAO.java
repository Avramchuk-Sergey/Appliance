package by.it.avramchuk.appliance.dao;

import by.it.avramchuk.appliance.entity.Appliance;
import by.it.avramchuk.appliance.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
    List<Appliance> find(Criteria criteria) throws DAOException;
}
