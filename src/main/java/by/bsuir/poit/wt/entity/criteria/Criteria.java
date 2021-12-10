package by.bsuir.poit.wt.entity.criteria;

import java.util.HashMap;
import java.util.Map;


public class Criteria {

    private final String groupSearchName;

    private final Map<String, Object> criteria;


    public Criteria ( String groupSearchName ) {
        this.groupSearchName = groupSearchName;
        this.criteria = new HashMap<> ();
    }


    public String getGroupSearchName ( ) {
        return groupSearchName;
    }


    public void add ( String searchCriteria, Object value ) {
        criteria.put (searchCriteria, value);
    }


    public Map<String, Object> getCriteria ( ) {
        return criteria;
    }
}
