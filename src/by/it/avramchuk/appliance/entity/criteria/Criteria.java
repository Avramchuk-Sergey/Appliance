package by.it.avramchuk.appliance.entity.criteria;

import java.io.Serializable;
import java.util.*;

public class Criteria implements Serializable {
    private static final long serialVersionUID = 6L;

    private Map<String, Object> criteria;

    public Criteria() {
        criteria = new HashMap<>();
    }

    public Map<String, Object> getCriteria() {
        return criteria;
    }

    public void setCriteria(Map<String, Object> criteria) {
        this.criteria = criteria;
    }

    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public List<String> makeSearchPatterns() {
        List<String> patterns = new ArrayList<>();
        Set<Map.Entry<String, Object>> entries = criteria.entrySet();

        for (Map.Entry<String, Object> entry : entries) {
            String pattern = entry.getKey() + "=" + entry.getValue();
            patterns.add(pattern);
        }

        return patterns;
    }
}
