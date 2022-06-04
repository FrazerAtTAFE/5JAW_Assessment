package E_LinkedLists;

/**
 * Node Single
 * Node for single direction linked list
 * @author Fraz
 */
public class Node_single<T> {
    public T value;
    public Node_single next;
    
    /**
     * Constructor
     * @param value 
     */
    public Node_single(T value)
    {
        this.value = value;
    }

    /**
     * Get value of the node
     * @return 
     */
    public T getValue() {
        return value;
    }

    /**
     * Set value of the node
     * @param value 
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Get the next linked node
     * @return 
     */
    public Node_single getNext() {
        return next;
    }

    /**
     * Set the next linked Node
     * @param next 
     */
    public void setNext(Node_single next) {
        this.next = next;
    }    
}
