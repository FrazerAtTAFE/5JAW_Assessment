package C_Tests;

import C_Searching.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Fraz
 */
public class TestBinarySearch {
    @Test
    public void binarySearchStudent(){
        // Student to Find
        Student studentToFind = null;
        
        // Create Student Array
        ArrayList<Student> students = new ArrayList();
        
        // Add random id students
        Random rand = new Random();
        for (int i = 0; i < 100000; i++){
            int randInt = rand.nextInt(1000);
            students.add(new Student("", "", new Enrollment(), randInt, "", "", ""));
        }
        
        // Add the student we need to find
        studentToFind = new Student("", "", new Enrollment(), rand.nextInt(1000), "", "", "");
        students.add(studentToFind);
        
        // Add another more random id students
        for (int i = 0; i < 100000; i++){
            int randInt = rand.nextInt(1000);
            students.add(new Student("", "", new Enrollment(), randInt, "", "", ""));
        }
        
        // Create searching API class
        Searching_API linear = new Searching_API();
        
        
        // Find student
        int actual = linear.binarySearchStudent(students, studentToFind);
        int expected = 100000;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void binarySearchEnrollment(){
        // Enrollment to Find
        Enrollment enrollmentsToFind = new Enrollment(1001, "", "", "", new Course());
        
        // Create Enrollment Array
        ArrayList<Enrollment> enrollments = new ArrayList();
        
        // Add random id enrollments
        Random rand = new Random();
        for (int i = 0; i < 100000; i++){
            int randInt = rand.nextInt(1000);
            enrollments.add(new Enrollment(randInt, "", "", "", new Course()));
        }
        
        // Add the enrollment we need to find
        enrollments.add(enrollmentsToFind);
        
        // Add more random id enrollments
        for (int i = 0; i < 100000; i++){
            int randInt = rand.nextInt(1000);
            enrollments.add(new Enrollment(randInt, "", "", "", new Course()));
        }
        
        // Create searching API class
        Searching_API linear = new Searching_API();
        
        
        // Find enrollment
        int actual = linear.binarySearchEnrollment(enrollments, enrollmentsToFind);
        int expected = 100000;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void binarySearchCourse(){
        // Course to Find
        Course courseToFind = new Course(1001, "", 0);
        
        // Create Course Array
        ArrayList<Course> courses = new ArrayList();
        
        // Add random id courses
        Random rand = new Random();
        for (int i = 0; i < 100000; i++){
            int randInt = rand.nextInt(1000);
            courses.add(new Course(randInt, "", 0));
        }
        
        // Add the course we need to find
        courses.add(courseToFind);
        
        // Add more random id courses
        for (int i = 0; i < 100000; i++){
            int randInt = rand.nextInt(1000);
            courses.add(new Course(randInt, "", 0));
        }
        
        // Create searching API class
        Searching_API linear = new Searching_API();
        
        
        // Find course
        int actual = linear.binarySearchCourse(courses, courseToFind);
        int expected = 100000;
        
        assertEquals(expected, actual);
    }
}
