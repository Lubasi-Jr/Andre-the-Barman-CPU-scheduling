package barScheduling;


import java.util.Comparator;

public class DrinkComparator implements Comparator<DrinkOrder>{

    @Override
    public int compare(DrinkOrder drink1, DrinkOrder drink2) {
        // Returns the drink with the lower prep time. So queue stores drink orders according to SJF
        return Integer.compare(drink1.getExecutionTime(), drink2.getExecutionTime());
    }

}
