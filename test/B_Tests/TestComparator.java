package B_Tests;

import B_StudentEnrollment.Course;
import B_StudentEnrollment.Enrollment;
import B_StudentEnrollment.SortCourseByName;
import B_StudentEnrollment.SortCourseByCost;
import B_StudentEnrollment.SortEnrollmentByDateEnrolled;
import B_StudentEnrollment.SortStudentByProgram;
import B_StudentEnrollment.Student;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fraz
 */
public class TestComparator {
    
    public TestComparator() {
    }
    
    @Test
    public void testCourseByName(){
        Course c1 = new Course(1234, "Business", 200.5);
        Course c2 = new Course(1234, "Computer Science", 200.5);
        Course[] expected = {c1, c2};
        Course[] actual = {c2, c1};
        Arrays.sort(actual,new SortCourseByName());
        Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testCourseByCost(){
        Course c1 = new Course(1234, "Business", 200);
        Course c2 = new Course(1234, "Business", 100);
        Course[] expected = {c2, c1};
        Course[] actual = {c1, c2};
        Arrays.sort(actual,new SortCourseByCost());
        Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testEnrollmentByDate(){
        Enrollment e1 = new Enrollment(1234, "2020-05-10", "A", "2", new Course());
        Enrollment e2 = new Enrollment(1234, "2020-05-11", "A", "2", new Course());
        Enrollment[] expected = {e1,e2};
        Enrollment[] actual = {e2, e1};
        Arrays.sort(actual, new SortEnrollmentByDateEnrolled());
        Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testStudentByProgram(){
        Student s1 = new Student("Business", "5 June 2019", new Enrollment(), 1234, "John", "john@email.com", "+617832636");
        Student s2 = new Student("Computer", "5 June 2019", new Enrollment(), 1234, "John", "john@email.com", "+617832636");
        Student[] expected = {s1, s2};
        Student[] actual = {s2, s1};
        Arrays.sort(actual, new SortStudentByProgram());
        Assert.assertArrayEquals(expected, actual);
    }
}
