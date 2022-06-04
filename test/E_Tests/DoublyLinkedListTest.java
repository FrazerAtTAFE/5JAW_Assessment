/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_Tests;

import E_LinkedLists.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fraz
 */
public class DoublyLinkedListTest {

    public DoublyLinkedListTest() {
    }

    @Test
    public void findLinkedList() {
        Student s1 = new Student("Business", "2018-03-06", new Enrollment(), 1234, "john", "john@email.com", "+61345345");
        Student s2 = new Student("Cooking", "2020-03-06", new Enrollment(), 4567, "mary", "mary@email.com", "+61238742");
        Student s3 = new Student("IT", "2019-03-06", new Enrollment(), 7891, "bob", "bob@email.com", "+612834023");
        Student s4 = new Student("SPY", "2016-03-06", new Enrollment(), 7363, "james", "james@email.com", "+612834023");
        Node n1 = new Node(s1);
        Node n2 = new Node(s2);
        Node n3 = new Node(s3);
        Node n4 = new Node(s4);

        DoublyLinkedList<Student> dll = new DoublyLinkedList<>();
        dll.addFirst(n1);
        dll.addLast(n2);
        dll.addLast(n3);
        dll.addLast(n4);

        boolean expected = true;
        boolean actual = dll.contains(s4);

        assertEquals(expected, actual);
    }

    @Test
    public void removeLinkedList() {
        Student s1 = new Student("Business", "2018-03-06", new Enrollment(), 1234, "john", "john@email.com", "+61345345");
        Student s2 = new Student("Cooking", "2020-03-06", new Enrollment(), 4567, "mary", "mary@email.com", "+61238742");
        Student s3 = new Student("IT", "2019-03-06", new Enrollment(), 7891, "bob", "bob@email.com", "+612834023");
        Node n1 = new Node(s1);
        Node n2 = new Node(s2);
        Node n3 = new Node(s3);

        DoublyLinkedList<Student> dll = new DoublyLinkedList<>();
        dll.addFirst(n1);
        dll.addLast(n2);
        dll.addLast(n3);

        ArrayList<Student> expected = new ArrayList(Arrays.asList(s1, s2));
        dll.remove(2);
        ArrayList actual = dll.returnValues();

        assertEquals(expected, actual);
    }

    @Test
    public void insertLinkedList() {
        Student s1 = new Student("Business", "2018-03-06", new Enrollment(), 1234, "john", "john@email.com", "+61345345");
        Student s2 = new Student("Cooking", "2020-03-06", new Enrollment(), 4567, "mary", "mary@email.com", "+61238742");
        Student s3 = new Student("IT", "2019-03-06", new Enrollment(), 7891, "bob", "bob@email.com", "+612834023");
        Student s4 = new Student("SPY", "2016-03-06", new Enrollment(), 7363, "james", "james@email.com", "+612834023");
        Node n1 = new Node(s1);
        Node n2 = new Node(s2);
        Node n3 = new Node(s3);
        Node n4 = new Node(s4);

        DoublyLinkedList<Student> dll = new DoublyLinkedList<>();
        dll.addFirst(n1);
        dll.addLast(n2);
        dll.addLast(n3);

        ArrayList<Student> expected = new ArrayList(Arrays.asList(s1, s4, s2, s3));
        dll.insert(1, n4);
        ArrayList actual = dll.returnValues();

        assertEquals(expected, actual);
    }

    @Test
    public void returnValuesLinkedList() {
        Student s1 = new Student("Business", "2018-03-06", new Enrollment(), 1234, "john", "john@email.com", "+61345345");
        Student s2 = new Student("Cooking", "2020-03-06", new Enrollment(), 4567, "mary", "mary@email.com", "+61238742");
        Student s3 = new Student("IT", "2019-03-06", new Enrollment(), 7891, "bob", "bob@email.com", "+612834023");
        Node n1 = new Node(s1);
        Node n2 = new Node(s2);
        Node n3 = new Node(s3);

        DoublyLinkedList<Student> dll = new DoublyLinkedList<>();
        dll.addFirst(n1);
        dll.addLast(n2);
        dll.addLast(n3);

        ArrayList<Student> expected = new ArrayList(Arrays.asList(s1, s2, s3));
        ArrayList<Student> actual = dll.returnValues();

        assertEquals(expected, actual);
    }

    @Test
    public void returnValuesReversedLinkedList() {
        Student s1 = new Student("Business", "2018-03-06", new Enrollment(), 1234, "john", "john@email.com", "+61345345");
        Student s2 = new Student("Cooking", "2020-03-06", new Enrollment(), 4567, "mary", "mary@email.com", "+61238742");
        Student s3 = new Student("IT", "2019-03-06", new Enrollment(), 7891, "bob", "bob@email.com", "+612834023");
        Node n1 = new Node(s1);
        Node n2 = new Node(s2);
        Node n3 = new Node(s3);

        DoublyLinkedList<Student> dll = new DoublyLinkedList<>();
        dll.addFirst(n1);
        dll.addLast(n2);
        dll.addLast(n3);

        ArrayList<Student> expected = new ArrayList(Arrays.asList(s3, s2, s1));
        ArrayList<Student> actual = dll.returnValuesReverse();

        assertEquals(expected, actual);
    }
}
