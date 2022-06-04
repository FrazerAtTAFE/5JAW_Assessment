package A_StudentEnrollment;

/**
 *
 * @author Fraz
 */
public class Course {
    
    private int courseCode;
    private String courseName;
    private double cost;

    //<editor-fold defaultstate="collapsed" desc="normal methods">
    public Course() {
    }
    
    public Course(int courseCode, String courseName, double cost) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.cost = cost;
    }
    
    /**
     * Get the value of courseCode
     *
     * @return the value of courseCode
     */
    public int getCourseCode() {
        return courseCode;
    }
    
    /**
     * Set the value of courseCode
     *
     * @param courseCode new value of courseCode
     */
    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }
    
    /**
     * Get the value of courseName
     *
     * @return the value of courseName
     */
    public String getCourseName() {
        return courseName;
    }
    
    /**
     * Set the value of courseName
     *
     * @param courseName new value of courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    /**
     * Get the value of cost
     *
     * @return the value of cost
     */
    public double getCost() {
        return cost;
    }
    
    /**
     * Set the value of cost
     *
     * @param cost new value of cost
     */
    public void setCost(double cost) {
        this.cost = cost;
    }
    
    @Override
    public String toString() {
        return "Course{" + "courseCode=" + courseCode + ", courseName=" + courseName + ", cost=" + cost + '}';
    }
//</editor-fold>

    /**
     * Hash Code Method
     * Use course code
     * @return hash
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.courseCode;
        return hash;
    }

    /**
     * Equals Method
     * Use Course Code
     * @param obj
     * @return 
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
        final Course other = (Course) obj;
        if (this.courseCode != other.courseCode) {
            return false;
        }
        return true;
    }

    
    
}
