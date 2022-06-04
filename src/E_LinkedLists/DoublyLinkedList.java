package E_LinkedLists;

import java.util.ArrayList;

/**
 *
 * @author Fraz
 */
public class DoublyLinkedList<T> {

    Node<T> head;
    Node<T> tail;
    int count = 0;

    public void addFirst(Node<T> node) {
        Node<T> temp = head;
        head = node;
        head.next = temp;
        if (count == 0) {
            tail = head;
        } else {
            temp.previous = head;
        }
        count++;
    }

    public void addLast(Node<T> node) {
        if (count == 0) {
            head = node;
        } else {
            tail.next = node;
            node.previous = tail;
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
            } else {
                head.previous = null;
            }
        }
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
                tail.previous.next = null;
                tail = tail.previous;
            }
            count--;
        }
    }

    /**
     * Insert a new node at a position in the linked list
     *
     * @param pos
     * @param node
     */
    public void insert(int pos, Node<T> node) {
        if (pos > count) {
            return;
        }
        Node<T> before = head;
        for (int i = 0; i < pos - 1; i++) {
            before = before.next;
        }
        Node<T> after = before.next;

        before.next = node;
        node.next = after;
        count++;
    }

    /**
     * Remove node at position without breaking the linked list
     *
     * @param pos
     */
    public void remove(int pos) {
        if (pos > count) {
            return;
        }

        Node<T> before = head;
        for (int i = 0; i < pos - 1; i++) {
            before = before.next;
        }
        Node<T> after = before.next.next;
        before.next = after;
        count--;
    }

    /**
     * Check if the list contains the node value
     *
     * @param item
     * @return
     */
    public boolean contains(T item) {
        Node<T> current = head;
        while (current != null) {
            if (current.value.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Return all the values of the linked list in order
     * @return 
     */
    public ArrayList<T> returnValues() {
        ArrayList<T> listOfvalues = new ArrayList<>();
        Node<T> current = head;
        while (current != null) {
            {
                listOfvalues.add(current.value);
            }
            current = current.next;
        }
        return listOfvalues;
    }

    /**
     * Return all the values of the linked list in reverse order
     * @return 
     */
    public ArrayList<T> returnValuesReverse() {
        ArrayList<T> listOfvalues = new ArrayList<>();
        Node<T> current = tail;
        while (current != null) {
            {
                listOfvalues.add(current.value);
            }
            current = current.previous;
        }
        return listOfvalues;
    }

}
