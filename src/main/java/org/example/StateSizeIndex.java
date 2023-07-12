package org.example;

import java.util.HashMap;
import java.util.Map;

public class StateSizeIndex implements FactIndex {
    private final Map<String,Integer> stateSizeIndex;

    public StateSizeIndex() {
        stateSizeIndex = new HashMap<>();
        stateSizeIndex.put("Missouri", 69715);
        stateSizeIndex.put("Delaware", 2498);
        stateSizeIndex.put("New York", 54556);
        stateSizeIndex.put("Arizona", 113998);
        stateSizeIndex.put("Arkansas", 53179);
        stateSizeIndex.put("Kansas", 82278);

    }
    // Get sizes of Missouri, Kansas, Arkansas, Delaware, Arizona, New York
    public int getFact(String stateName) {
        if (!stateSizeIndex.containsKey(stateName)) {
            return 0;  // an error occurred!
        }
        return stateSizeIndex.get(stateName);
    }
}
