package E_LinkedLists;

import java.util.ArrayList;

/**
 * Single Direction Linked List
 * @author Fraz
 */
public class LinkedList<T> {

    Node_single<T> head;
    Node_single<T> tail;
    int count = 0;

    public Node_single<T> getHead() {
        return head;
    }

    public void setHead(Node_single<T> head) {
        this.head = head;
    }

    public Node_single<T> getTail() {
        return tail;
    }

    public void setTail(Node_single<T> tail) {
        this.tail = tail;
    }

    public void addFirst(Node_single<T> node) {
        Node_single<T> temp = head;
        head = node;
        head.next = temp;
        count++;

        if (count == 1) {
            tail = head;
        }
    }

    public void addLast(Node_single<T> node) {
        if (count == 0) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        count++;
    }

    public void removeFirst() {
        if (count != 0) {
            head = head.next;
            count--;
            if (count == 0) {
                tail = null;
            }
        }
    }

    /**
     * Insert a new node at a position in the linked list
     * @param pos
     * @param node 
     */
    public void insert(int pos, Node_single<T> node) {
        if (pos > count) {
            return;
        }
        Node_single<T> before = head;
        for (int i = 0; i < pos - 1; i++) {
            before = before.next;
        }
        Node_single<T> after = before.next;

        before.next = node;
        node.next = after;
        count++;
    }

    /**
     * Remove node at position without breaking the linked list
     * @param pos 
     */
    public void remove(int pos) {
        if (pos > count) {
            return;
        }
        
        Node_single<T> before = head;
        for (int i = 0; i < pos - 1; i++) {
            before = before.next;
        }
        Node_single<T> after = before.next.next;
        before.next = after;
        count--;
    }

    /**
     * Check if the list contains the node value
     * @param item
     * @return 
     */
    public boolean contains(T item) {
        Node_single<T> current = head;
        while (current != null) {
            if (current.value.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Remove the last Node
     */
    public void removeLast() {
        if (count != 0) {
            if (count == 1) {
                head = null;
                tail = null;
            } else {
                Node_single<T> current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                current.next = null;
                tail = current;
            }
            count--;
        }
    }

    /**
     * Print all the values of the linked list in order
     * @return 
     */
    public ArrayList<T> returnValues() {
        ArrayList<T> listOfvalues = new ArrayList<>();
        Node_single<T> current = head;
        while (current != null) {
            {
                listOfvalues.add(current.value);
            }
            current = current.next;
        }
        return listOfvalues;
    }
}
