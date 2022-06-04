/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Tests;

import D_Sorting.Enrollment;
import D_Sorting.Sorting_API;
import D_Sorting.Student;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fraz
 */
public class InsertionSort {
    
    public InsertionSort() {
    }
    
    @Test
    public void selectionSortStudent() {
        // Create Student Array
        ArrayList<Student> students = new ArrayList();
        
        // Add random id students
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int randInt = rand.nextInt(1000);
            students.add(new Student("", "", new Enrollment(), randInt, "", "", ""));
        }
        
        Sorting_API sapi = new Sorting_API();
        ArrayList<Student> sorted = sapi.InsertionSortStudent(students);
        
        boolean expected = true;
        boolean actual = isSorted(sorted);        
        
        assertEquals(expected, actual);
    }

    public static boolean isSorted(List<Student> listOfStrings) {
        Iterator<Student> iter = listOfStrings.iterator();
        Student current, previous = iter.next();
        while (iter.hasNext()) {
            current = iter.next();
            if (previous.compareTo(current) > 0) {
                return false;
            }
            previous = current;
        }
        return true;
    }
    
}
