package B_StudentEnrollment;

import java.time.LocalDate;
import java.util.Comparator;

/**
 *
 * @author Fraz
 */
public class SortEnrollmentByDateEnrolled implements Comparator<Enrollment>{

    /**
     * Compares Enrollment by Date Enrolled Method
     * Converts date with 'YYYY-MM-DD' format otherwise returns 0
     * @param e1
     * @param e2
     * @return 
     */
    @Override
    public int compare(Enrollment e1, Enrollment e2) {
        try{
            LocalDate date1 = LocalDate.parse(e1.getDateEnrolled());
            LocalDate date2 = LocalDate.parse(e2.getDateEnrolled());
            return date1.compareTo(date2);
        }
        catch (Exception e){
            return 0;
        }
    }    
}
