package rocks.zipcode.assessment2.collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {

    Map<Integer, String> monthMap = new TreeMap<>();

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        monthMap.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        if(isValidNumber(monthNumber)){
            return monthMap.get(monthNumber);
        }
        else{
            return null;
        }
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
           if (isValidMonth(monthName)) {
               for (Map.Entry<Integer, String> e : monthMap.entrySet()) {
                   if (e.getValue().equals(monthName)) {
                       return e.getKey();
                   }
               }
           }
           return null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return monthMap.keySet().contains(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return monthMap.values().contains(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        int size = 0;
        for(Map.Entry<Integer, String> e : monthMap.entrySet()){
            size++;
        }
        return size;
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        monthMap.put(monthNumber, monthName);

    }
}
