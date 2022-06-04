package B_StudentEnrollment;

import java.util.Comparator;

/**
 *
 * @author Fraz
 */
public class SortCourseByName implements Comparator<Course>{

    /**
     * Compare Method
     * Compares based on name of course
     * @param c1
     * @param c2
     * @return int
     */
    @Override
    public int compare(Course c1, Course c2) {
        return c1.getCourseName().compareTo(c2.getCourseName());
    }    
}
