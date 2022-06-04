package E_Tests;

import E_LinkedLists.Node_single;
import org.junit.Test;
import static org.junit.Assert.*;
import E_LinkedLists.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Fraz
 */
public class LinkedListTest {

    public LinkedListTest() {
    }

    @Test
    public void findLinkedList() {
        Student s1 = new Student("Business", "2018-03-06", new Enrollment(), 1234, "john", "john@email.com", "+61345345");
        Student s2 = new Student("Cooking", "2020-03-06", new Enrollment(), 4567, "mary", "mary@email.com", "+61238742");
        Student s3 = new Student("IT", "2019-03-06", new Enrollment(), 7891, "bob", "bob@email.com", "+612834023");
        Student s4 = new Student("SPY", "2016-03-06", new Enrollment(), 7363, "james", "james@email.com", "+612834023");
        Node_single n1 = new Node_single(s1);
        Node_single n2 = new Node_single(s2);
        Node_single n3 = new Node_single(s3);
        Node_single n4 = new Node_single(s4);

        LinkedList ll = new LinkedList();
        ll.addFirst(n1);
        ll.addLast(n2);
        ll.addLast(n3);
        ll.addLast(n4);

        boolean expected = true;
        boolean actual = ll.contains(s4);

        assertEquals(expected, actual);
    }

    @Test
    public void removeLinkedList() {
        Student s1 = new Student("Business", "2018-03-06", new Enrollment(), 1234, "john", "john@email.com", "+61345345");
        Student s2 = new Student("Cooking", "2020-03-06", new Enrollment(), 4567, "mary", "mary@email.com", "+61238742");
        Student s3 = new Student("IT", "2019-03-06", new Enrollment(), 7891, "bob", "bob@email.com", "+612834023");
        Node_single n1 = new Node_single(s1);
        Node_single n2 = new Node_single(s2);
        Node_single n3 = new Node_single(s3);

        LinkedList ll = new LinkedList();
        ll.addFirst(n1);
        ll.addLast(n2);
        ll.addLast(n3);

        ArrayList<Student> expected = new ArrayList(Arrays.asList(s1, s2));
        ll.remove(2);
        ArrayList actual = ll.returnValues();

        assertEquals(expected, actual);
    }

    @Test
    public void insertLinkedList() {
        Student s1 = new Student("Business", "2018-03-06", new Enrollment(), 1234, "john", "john@email.com", "+61345345");
        Student s2 = new Student("Cooking", "2020-03-06", new Enrollment(), 4567, "mary", "mary@email.com", "+61238742");
        Student s3 = new Student("IT", "2019-03-06", new Enrollment(), 7891, "bob", "bob@email.com", "+612834023");
        Student s4 = new Student("SPY", "2016-03-06", new Enrollment(), 7363, "james", "james@email.com", "+612834023");
        Node_single n1 = new Node_single(s1);
        Node_single n2 = new Node_single(s2);
        Node_single n3 = new Node_single(s3);
        Node_single n4 = new Node_single(s4);

        LinkedList ll = new LinkedList();
        ll.addFirst(n1);
        ll.addLast(n2);
        ll.addLast(n3);

        ArrayList<Student> expected = new ArrayList(Arrays.asList(s1, s4, s2, s3));
        ll.insert(1, n4);
        ArrayList actual = ll.returnValues();

        assertEquals(expected, actual);
    }

    @Test
    public void returnValuesLinkedList() {
        Student s1 = new Student("Business", "2018-03-06", new Enrollment(), 1234, "john", "john@email.com", "+61345345");
        Student s2 = new Student("Cooking", "2020-03-06", new Enrollment(), 4567, "mary", "mary@email.com", "+61238742");
        Student s3 = new Student("IT", "2019-03-06", new Enrollment(), 7891, "bob", "bob@email.com", "+612834023");
        Node_single n1 = new Node_single(s1);
        Node_single n2 = new Node_single(s2);
        Node_single n3 = new Node_single(s3);

        LinkedList ll = new LinkedList();
        ll.addFirst(n1);
        ll.addLast(n2);
        ll.addLast(n3);

        ArrayList<Student> expected = new ArrayList(Arrays.asList(s1, s2, s3));
        ArrayList<Student> actual = ll.returnValues();

        assertEquals(expected, actual);
    }

}
