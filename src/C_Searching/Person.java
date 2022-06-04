package C_Searching;


/**
 *
 * @author Fraz
 */
public class Person {
    
    protected int personID;
    protected String name;
    protected String email;
    protected String telNum;
    protected Address address;

    //<editor-fold defaultstate="collapsed" desc="normal methods">
    /**
     * No-arg Constructor
     */
    public Person() {
    }
    
    /**
     * All-arg Constructor
     * @param personID
     * @param name
     * @param email
     * @param telNum
     */
    public Person(int personID, String name, String email, String telNum) {
        this.personID = personID;
        this.name = name;
        this.email = email;
        this.telNum = telNum;
    }
    
    /**
     * Get the value of personID
     *
     * @return the value of personID
     */
    public int getPersonID() {
        return personID;
    }
    
    /**
     * Set the value of personID
     *
     * @param personID new value of personID
     */
    public void setPersonID(int personID) {
        this.personID = personID;
    }
    
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Get the value of telNum
     *
     * @return the value of telNum
     */
    public String getTelNum() {
        return telNum;
    }
    
    /**
     * Get the value of address
     *
     * @return the value of address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Set the value of address
     *
     * @param address new value of address
     */
    public void setAddress(Address address) {
        this.address = address;
    }
    
    /**
     * Set the value of telNum
     *
     * @param telNum new value of telNum
     */
    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }
    
    @Override
    public String toString() {
        return "Person{" + "personID=" + personID + ", name=" + name + ", email=" + email + ", telNum=" + telNum + ", address=" + address + '}';
    }
//</editor-fold>

    /**
     * Hash Code Method
     * @return hash
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.personID;
        return hash;
    }

    /**
     * Equals Method
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
        final Person other = (Person) obj;
        return this.personID == other.personID;
    }    
}
