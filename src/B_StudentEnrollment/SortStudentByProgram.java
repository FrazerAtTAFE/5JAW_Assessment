package B_StudentEnrollment;

import java.util.Comparator;

/**
 *
 * @author Fraz
 */
public class SortStudentByProgram implements Comparator<Student> {

    /**
     * Compare Student by Program Method
     * @param s1
     * @param s2
     * @return 
     */
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getProgram().compareTo(s2.getProgram());
    }
    
}
