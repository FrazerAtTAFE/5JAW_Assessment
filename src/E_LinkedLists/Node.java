package E_LinkedLists;

/**
 * Node 
 * Node for double direction linked list
 * @author Fraz
 */
public class Node<T> {

    public T value;
    public Node next;
    public Node previous;

    /**
     * Constructor
     *
     * @param value
     */
    public Node(T value) {
        this.value = value;
    }

    /**
     * Get value of the node
     *
     * @return
     */
    public T getValue() {
        return value;
    }

    /**
     * Set value of the node
     *
     * @param value
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Get the next linked node
     *
     * @return
     */
    public Node getNext() {
        return next;
    }

    /**
     * Set the next linked Node
     *
     * @param next
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * Get the previous linked Node
     *
     * @param next
     */
    public Node getPrevious() {
        return previous;
    }

    /**
     * Set the previous linked Node
     *
     * @param next
     */
    public void setPrevious(Node previous) {
        this.previous = previous;
    }

}
