package B_Tests;

import B_StudentEnrollment.Course;
import B_StudentEnrollment.Enrollment;
import B_StudentEnrollment.Student;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fraz
 */
public class TestComparable {
    
    public TestComparable() {
    }
    
    @Test
    public void testCourseLower(){
        Course c1 = new Course(1234, "Business", 200.5);
        Course c2 = new Course(2345, "Business", 200.5);
        int expected = -1;
        int actual = c1.compareTo(c2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void TestCourseHigher(){
        Course c1 = new Course(1234, "Business", 200.5);
        Course c2 = new Course(2345, "Business", 200.5);
        int expected = 1;
        int actual = c2.compareTo(c1);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEnrollmentLower(){
        Enrollment c1 = new Enrollment(1234, "5 June 2020", "A", "2", new Course());
        Enrollment c2 = new Enrollment(4567, "5 June 2020", "A", "2", new Course());
        int expected = -1;
        int actual = c1.compareTo(c2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void TestEnrollmentHigher(){
        Enrollment c1 = new Enrollment(1234, "5 June 2020", "A", "2", new Course());
        Enrollment c2 = new Enrollment(4567, "5 June 2020", "A", "2", new Course());
        int expected = 1;
        int actual = c2.compareTo(c1);
        assertEquals(expected, actual);
    }
    @Test
    public void testStudentLower(){
        Student c1 = new Student("Business", "5 June 2019", new Enrollment(), 1234, "John", "john@email.com", "+617832636");
        Student c2 = new Student("Business", "5 June 2019", new Enrollment(), 4567, "John", "john@email.com", "+617832636");
        int expected = -1;
        int actual = c1.compareTo(c2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void TestStudentHigher(){
        Student c1 = new Student("Business", "5 June 2019", new Enrollment(), 1234, "John", "john@email.com", "+617832636");
        Student c2 = new Student("Business", "5 June 2019", new Enrollment(), 4567, "John", "john@email.com", "+617832636");
        int expected = 1;
        int actual = c2.compareTo(c1);
        assertEquals(expected, actual);
    }
}
