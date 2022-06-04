package C_Searching;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Fraz
 */
public class Searching_API {

    public int linearSearchStudent(Collection<Student> students, Student s) {
        int index = 0;
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student currentStudent = iterator.next();
            if (currentStudent.getPersonID() == s.getPersonID()) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int linearSearchEnrollment(Collection<Enrollment> enrollments, Enrollment e) {
        int index = 0;
        Iterator<Enrollment> iterator = enrollments.iterator();
        while (iterator.hasNext()) {
            Enrollment currentEnrollment = iterator.next();
            if (currentEnrollment.getEnrollmentId() == e.getEnrollmentId()) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int linearSearchCourse(Collection<Course> courses, Course c) {
        int index = 0;
        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()) {
            Course currentCourse = iterator.next();
            if (currentCourse.getCourseCode() == c.getCourseCode()) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int binarySearchStudent(Collection<Student> students, Student s) {
        Student[] studentsArray = students.toArray(new Student[students.size()]);

        int searchElement = s.getPersonID();
        int min = 0;
        int n = studentsArray.length;
        int max = n - 1;
        do {
            int mid = (min + max) / 2;
            if (searchElement > studentsArray[mid].getPersonID()) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
            if (studentsArray[mid].getPersonID() == searchElement) {
                return mid;
            }
            if (min > max) {
                break;
            }
        } while (min <= max);
        return -1;
    }

    public int binarySearchEnrollment(Collection<Enrollment> enrollments, Enrollment e) {
        Enrollment[] enrollmentsArray = enrollments.toArray(new Enrollment[enrollments.size()]);

        int searchElement = e.getEnrollmentId();
        int min = 0;
        int n = enrollmentsArray.length;
        int max = n - 1;
        do {
            int mid = (min + max) / 2;
            if (searchElement > enrollmentsArray[mid].getEnrollmentId()) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
            if (enrollmentsArray[mid].getEnrollmentId() == searchElement) {
                return mid;
            }
            if (min > max) {
                break;
            }
        } while (min <= max);
        return -1;
    }

    public int binarySearchCourse(Collection<Course> courses, Course c) {
        Course[] coursesArray = courses.toArray(new Course[courses.size()]);

        int searchElement = c.getCourseCode();
        int min = 0;
        int n = coursesArray.length;
        int max = n - 1;
        do {
            int mid = (min + max) / 2;
            if (searchElement > coursesArray[mid].getCourseCode()) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
            if (coursesArray[mid].getCourseCode() == searchElement) {
                return mid;
            }
            if (min > max) {
                break;
            }
        } while (min <= max);
        return -1;
    }

}
