package E_LinkedLists;

/**
 *
 * @author Fraz
 */
public class Student extends Person implements Comparable<Student>{
    
    private String program;
    private String dateRegistered;
    private Enrollment enrollment;

//<editor-fold defaultstate="collapsed" desc="normal methods">
    
    /**
     * No-arg Constructor
     */
    public Student() {
        super();
    }
    
    /**
     * All-arg Constructor
     * @param program
     * @param dateRegistered
     * @param enrollment
     * @param personID
     * @param name
     * @param email
     * @param telNum
     */
    public Student(String program, String dateRegistered, Enrollment enrollment, int personID, String name, String email, String telNum) {
        super(personID, name, email, telNum);
        this.program = program;
        this.dateRegistered = dateRegistered;
        this.enrollment = enrollment;
    }
    
    /**
     * Get the value of program
     *
     * @return the value of program
     */
    public String getProgram() {
        return program;
    }
    
    /**
     * Set the value of program
     *
     * @param program new value of program
     */
    public void setProgram(String program) {
        this.program = program;
    }
    
    /**
     * Get the value of dateRegistered
     *
     * @return the value of dateRegistered
     */
    public String getDateRegistered() {
        return dateRegistered;
    }
    
    /**
     * Set the value of dateRegistered
     *
     * @param dateRegistered new value of dateRegistered
     */
    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }
    
    /**
     * Get the value of enrollment
     *
     * @return the value of enrollment
     */
    public Enrollment getEnrollment() {
        return enrollment;
    }
    
    /**
     * Set the value of enrollment
     *
     * @param enrollment new value of enrollment
     */
    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }
    
    @Override
    public String toString() {
        return "Student{personID=" + super.personID + ", name=" + super.name + ", email=" + super.email + ", telNum=" + super.telNum + ", address=" + super.address + "program=" + program + ", dateRegistered=" + dateRegistered + ", enrollment=" + enrollment + '}';
    }
//</editor-fold>
    
    /**
     * Equals Method
     * Find if obj is either Student or Person and compare on personID
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
        
        try 
        {
            final Person other = (Person) obj;
            return this.personID == other.personID;
        } 
        catch (Exception ex)
        {
            return false;
        }
    } 
    
    /**
     * Hash Code Method
     * Use Person ID
     * @return hash
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.personID;
        return hash;
    }

    /**
     * Compare To method override
     * Java Auto-boxes int to Integer for comparison
     * @param o
     * @return int
     */
    @Override
    public int compareTo(Student student) {
        Integer i = this.personID;
        return i.compareTo(student.personID);
    }

}
