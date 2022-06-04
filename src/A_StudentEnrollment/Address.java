package A_StudentEnrollment;


import java.util.Objects;

/**
 * Address Class
 * @author Fraz
 */
public class Address {
    
    private int number;
    private String street;
    private String suburb;
    private int postcode;  
    private String state;
    
     
    //<editor-fold defaultstate="collapsed" desc="Normal Methods">   
    /**
     * No-arg Constuctor
     */
    public Address() {
    }

    /**
     * All-arg Constructor
     * @param Number
     * @param street
     * @param suburb
     * @param postcode
     * @param state 
     */
    public Address(int Number, String street, String suburb, int postcode, String state) {
        this.number = Number;
        this.street = street;
        this.suburb = suburb;
        this.postcode = postcode;
        this.state = state;
    }

    /**
     * Get the value of number
     *
     * @return the value of number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Set the value of number
     *
     * @param Number new value of number
     */
    public void setNumber(int Number) {
        this.number = Number;
    }

    /**
     * Get the value of street
     *
     * @return the value of street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Set the value of street
     *
     * @param street new value of street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Get the value of suburb
     *
     * @return the value of suburb
     */
    public String getSuburb() {
        return suburb;
    }

    /**
     * Set the value of suburb
     *
     * @param suburb new value of suburb
     */
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }
    
    /**
     * Get the value of postcode
     *
     * @return the value of postcode
     */
    public int getPostcode() {
        return postcode;
    }

    /**
     * Set the value of postcode
     *
     * @param postcode new value of postcode
     */
    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    /**
     * Get the value of state
     *
     * @return the value of state
     */
    public String getState() {
        return state;
    }

    /**
     * Set the value of state
     *
     * @param state new value of state
     */
    public void setState(String state) {
        this.state = state;
    }
    
      @Override
    public String toString() {
        return "Address{" + "Number=" + number + ", street=" + street + ", suburb=" + suburb + ", postcode=" + postcode + ", state=" + state + '}';
    }
    //</editor-fold>

    /**
     * Equals method
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if (this.number != other.number) {
            return false;
        }
        if (this.postcode != other.postcode) {
            return false;
        }
        if (!this.street.equals(other.street)) {
            return false;
        }
        if (!this.suburb.equals(other.suburb)) {
            return false;
        }
        if (!this.state.equals(other.state)) {
            return false;
        }
        return true;
    }

    /**
     * Hash Code method
     * @return hash
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.number;
        hash = 67 * hash + this.street.hashCode();
        hash = 67 * hash + this.suburb.hashCode();
        hash = 67 * hash + this.postcode;
        hash = 67 * hash + this.state.hashCode();
        return hash;
    }    
}