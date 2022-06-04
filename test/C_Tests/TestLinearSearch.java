package C_Tests;

import C_Searching.*;
import java.util.ArrayList;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fraz
 */
public class TestLinearSearch {
    
    public TestLinearSearch() {
    }
    
    @Test
    public void linearSearchStudent(){
        // Student to Find
        Student studentToFind = new Student("", "", new Enrollment(), 1001, "", "", "");
        
        // Create Student Array
        ArrayList<Student> students = new ArrayList();
        
        // Add 50 random id students
        Random rand = new Random();
        for (int i = 0; i < 100000; i++){
            int randInt = rand.nextInt(1000);
            students.add(new Student("", "", new Enrollment(), randInt, "", "", ""));
        }
        
        // Add the student we need to find
        students.add(studentToFind);
        
        // Add another 50 random id students
        for (int i = 0; i < 100000; i++){
            int randInt = rand.nextInt(1000);
            students.add(new Student("", "", new Enrollment(), randInt, "", "", ""));
        }
        
        // Create searching API class
        Searching_API linear = new Searching_API();
        
        
        // Find student
        int actual = linear.linearSearchStudent(students, studentToFind);
        int expected = 100000;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void linearSearchEnrollment(){
        // Enrollment to Find
        Enrollment enrollmentsToFind = new Enrollment(1001, "", "", "", new Course());
        
        // Create Enrollment Array
        ArrayList<Enrollment> enrollments = new ArrayList();
        
        // Add 50 random id enrollments
        Random rand = new Random();
        for (int i = 0; i < 100000; i++){
            int randInt = rand.nextInt(1000);
            enrollments.add(new Enrollment(randInt, "", "", "", new Course()));
        }
        
        // Add the enrollment we need to find
        enrollments.add(enrollmentsToFind);
        
        // Add another 50 random id enrollments
        for (int i = 0; i < 100000; i++){
            int randInt = rand.nextInt(1000);
            enrollments.add(new Enrollment(randInt, "", "", "", new Course()));
        }
        
        // Create searching API class
        Searching_API linear = new Searching_API();
        
        
        // Find student
        int actual = linear.linearSearchEnrollment(enrollments, enrollmentsToFind);
        int expected = 100000;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void linearSearchCourse(){
        // Course to Find
        Course courseToFind = new Course(1001, "", 0);
        
        // Create Course Array
        ArrayList<Course> courses = new ArrayList();
        
        // Add 50 random id courses
        Random rand = new Random();
        for (int i = 0; i < 100000; i++){
            int randInt = rand.nextInt(1000);
            courses.add(new Course(randInt, "", 0));
        }
        
        // Add the course we need to find
        courses.add(courseToFind);
        
        // Add another 50 random id courses
        for (int i = 0; i < 100000; i++){
            int randInt = rand.nextInt(1000);
            courses.add(new Course(randInt, "", 0));
        }
        
        // Create searching API class
        Searching_API linear = new Searching_API();
        
        
        // Find student
        int actual = linear.linearSearchCourse(courses, courseToFind);
        int expected = 100000;
        
        assertEquals(expected, actual);
    }
    
}
