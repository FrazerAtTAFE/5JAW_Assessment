package D_Sorting;

/**
 *
 * @author Fraz
 */
public class Enrollment implements Comparable<Enrollment>{
   
    private int enrollmentId;
    private String dateEnrolled;
    private String grade;
    private String semester;
    private Course course;

    //<editor-fold defaultstate="collapsed" desc="normal methods">
    /**
     * No-arg Constructor
     */
    public Enrollment() {
    }
    
    /**
     * All-arg Constructor
     * @param dateEnrolled
     * @param grade
     * @param semester
     * @param course
     */
    public Enrollment(int courseId, String dateEnrolled, String grade, String semester, Course course) {
        this.enrollmentId = courseId;
        this.dateEnrolled = dateEnrolled;
        this.grade = grade;
        this.semester = semester;
        this.course = course;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }
    
    /**
     * Get the value of dateEnrolled
     *
     * @return the value of dateEnrolled
     */
    public String getDateEnrolled() {
        return dateEnrolled;
    }
    
    /**
     * Set the value of dateEnrolled
     *
     * @param dateEnrolled new value of dateEnrolled
     */
    public void setDateEnrolled(String dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }
    
    /**
     * Get the value of grade
     *
     * @return the value of grade
     */
    public String getGrade() {
        return grade;
    }
    
    /**
     * Set the value of grade
     *
     * @param grade new value of grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    /**
     * Get the value of semester
     *
     * @return the value of semester
     */
    public String getSemester() {
        return semester;
    }
    
    /**
     * Set the value of semester
     *
     * @param semester new value of semester
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    /**
     * Get the value of course
     *
     * @return the value of course
     */
    public Course getCourse() {
        return course;
    }
    
    /**
     * Set the value of course
     *
     * @param course new value of course
     */
    public void setCourse(Course course) {
        this.course = course;
    }
    
    @Override
    public String toString() {
        return "Enrollment{" + "courseId=" + enrollmentId + "dateEnrolled=" + dateEnrolled + ", grade=" + grade + ", semester=" + semester + ", course=" + course + '}';
    }
//</editor-fold>

    /**
     * Hash code method
     * use enrollmentId
     * @return hash
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.enrollmentId;
        return hash;
    }

    /**
     * Equals method
     * use enrollmentId
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
        final Enrollment other = (Enrollment) obj;
        if (this.enrollmentId != other.enrollmentId) {
            return false;
        }
        return true;
    }

    /**
     * Compare To method override
     * Java Auto-boxes int to Integer for comparison
     * @param o
     * @return int
     */
    @Override
    public int compareTo(Enrollment enrollment) {
        Integer i = this.enrollmentId;
        return i.compareTo(enrollment.enrollmentId);
    }

    
}
