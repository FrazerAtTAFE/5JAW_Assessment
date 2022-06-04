package B_StudentEnrollment;

import java.util.Comparator;

/**
 *
 * @author Fraz
 */
public class SortCourseByCost implements Comparator<Course>{

    /**
     * Compare Method
     * Compares based on cost of course
     * Java Auto-boxes cost to Double for comparison method
     * @param c1
     * @param c2
     * @return int
     */
    @Override
    public int compare(Course c1, Course c2) {
        Double c1_cost = c1.getCost();
        return c1_cost.compareTo(c2.getCost());
    } 
    
}
