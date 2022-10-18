package by.it.avramchuk.appliance.dao.util;

import by.it.avramchuk.appliance.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;

public class ApplianceDataMatcher {

    private final List<String> dataFromSource;
    private final Criteria criteria;

    public ApplianceDataMatcher(List<String> dataFromSource, Criteria criteria) {
        this.dataFromSource = dataFromSource;
        this.criteria = criteria;
    }

    public List<String> match() {

        List<String> applianceDataResult = new ArrayList<>();
        List<String> searchPatterns = criteria.makeSearchPatterns();

        for (String data : dataFromSource) {
            if (checkMatches(data, searchPatterns)) {
                applianceDataResult.add(data);
            }
        }
        return applianceDataResult;
    }

    private boolean checkMatches(String data, List<String> searchPatterns) {

        for (String searchPattern : searchPatterns) {
            if (!data.contains(searchPattern)) {
                return false;
            }
        }
        return true;
    }
}
