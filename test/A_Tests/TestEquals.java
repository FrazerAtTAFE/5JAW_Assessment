package A_Tests;

import A_StudentEnrollment.Course;
import A_StudentEnrollment.Address;
import A_StudentEnrollment.Student;
import A_StudentEnrollment.Enrollment;
import A_StudentEnrollment.Person;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fraz
 */
public class TestEquals {
    
    public TestEquals() {
    }
    
    @Test
    public void testAddressTrue(){
        Address a1 = new Address(1, "King", "CRAFERS", 1234, "SA");
        Address a2 = new Address(1, "King", "CRAFERS", 1234, "SA");
        boolean expected = true;
        boolean actual = a1.equals(a2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddressFalse(){
        Address a1 = new Address(1, "King", "CRAFERS", 1234, "SA");
        Address a2 = new Address(2, "Queen", "ADELAIDE", 4567, "WA");
        boolean expected = false;
        boolean actual = a1.equals(a2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPersonTrue(){
        Person p1 = new Person(1234, "John", "John@email.com", "+612352345");
        Person p2 = new Person(1234, "John", "John@email.com", "+612352345");
        boolean expected = true;
        boolean actual = p1.equals(p2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPersonFalse(){
        Person p1 = new Person(1234, "John", "John@email.com", "+612352345");
        Person p2 = new Person(4567, "Mary", "Mary@email.com", "+617483028");
        boolean expected = false;
        boolean actual = p1.equals(p2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStudentTrue(){
        Student s1 = new Student("Cooking", "10 June 2018", new Enrollment(), 1234, "Bob", "bob@email.com", "+61234567");
        Student s2 = new Student("Cooking", "10 June 2018", new Enrollment(), 1234, "Bob", "bob@email.com", "+61234567");
        boolean expected = true;
        boolean actual = s1.equals(s2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testStudentFalse(){
        Student s1 = new Student("Cooking", "10 June 2018", new Enrollment(), 1234, "Bob", "bob@email.com", "+61234567");
        Student s2 = new Student("IT", "11 December 2017", new Enrollment(), 4567, "Richard", "richard@email.com", "+61234567");
        boolean expected = false;
        boolean actual = s1.equals(s2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEnrollmentTrue(){
        Enrollment e1 = new Enrollment(1234, "15 July 2020", "A", "2", new Course());
        Enrollment e2 = new Enrollment(1234, "15 July 2020", "A", "2", new Course());
        boolean expected = true;
        boolean actual = e1.equals(e2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEnrollmentFalse(){
        Enrollment e1 = new Enrollment(1234, "15 July 2020", "A", "2", new Course());
        Enrollment e2 = new Enrollment(4567, "20 February 2017", "B", "1", new Course());
        boolean expected = false;
        boolean actual = e1.equals(e2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCourseTrue(){
        Course c1 = new Course(1234, "Loading Truck", 200.0);
        Course c2 = new Course(1234, "Loading Truck", 200.0);
        boolean expected = true;
        boolean actual = c1.equals(c2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCourseFalse(){
        Course c1 = new Course(1234, "Loading Truck", 200.0);
        Course c2 = new Course(4567, "Building Bridge", 500.0);
        boolean expected = false;
        boolean actual = c1.equals(c2);
        assertEquals(expected, actual);
    }
}
