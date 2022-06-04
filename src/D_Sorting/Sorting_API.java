package D_Sorting;

import java.util.Collection;
import D_Sorting.*;
import java.util.ArrayList;

/**
 *
 * @author Fraz
 */
public class Sorting_API {

    public ArrayList<Student> bubbleSortStudent(ArrayList<Student> students) {
        Student temp;
        for (int j = 0; j <= students.size() - 2; j++) {
            for (int i = 0; i <= students.size() - 2; i++) {
                if (students.get(i).personID > students.get(i + 1).personID) {
                    temp = students.get(i + 1);

                    students.set(i + 1, students.get(i));
                    students.set(i, temp);
                }
            }
        }
        return students;
    }

    public ArrayList<Enrollment> bubbleSortEnrollment(ArrayList<Enrollment> enrollments) {
        Enrollment temp;
        for (int j = 0; j <= enrollments.size() - 2; j++) {
            for (int i = 0; i <= enrollments.size() - 2; i++) {
                if (enrollments.get(i).getEnrollmentId() > enrollments.get(i + 1).getEnrollmentId()) {
                    temp = enrollments.get(i + 1);

                    enrollments.set(i + 1, enrollments.get(i));
                    enrollments.set(i, temp);
                }
            }
        }
        return enrollments;
    }

    public ArrayList<Course> bubbleSortCourse(ArrayList<Course> courses) {
        Course temp;
        for (int j = 0; j <= courses.size() - 2; j++) {
            for (int i = 0; i <= courses.size() - 2; i++) {
                if (courses.get(i).getCourseCode() > courses.get(i + 1).getCourseCode()) {
                    temp = courses.get(i + 1);

                    courses.set(i + 1, courses.get(i));
                    courses.set(i, temp);
                }
            }
        }
        return courses;
    }

    public ArrayList<Student> selectionSortStudent(ArrayList<Student> students) {

        Student temp;
        int min_key;

        for (int j = 0; j < students.size() - 1; j++) {
            min_key = j;

            for (int k = j + 1; k < students.size(); k++) {
                if (students.get(k).personID < students.get(min_key).personID) {
                    min_key = k;
                }
            }

            temp = students.get(min_key);
            students.set(min_key, students.get(j));
            students.set(j, temp);
        }

        return students;
    }

    public ArrayList<Enrollment> selectionSortEnrollment(ArrayList<Enrollment> enrollments) {
        Enrollment temp;
        int min_key;

        for (int j = 0; j < enrollments.size() - 1; j++) {
            min_key = j;

            for (int k = j + 1; k < enrollments.size(); k++) {
                if (enrollments.get(k).getEnrollmentId() < enrollments.get(min_key).getEnrollmentId()) {
                    min_key = k;
                }
            }

            temp = enrollments.get(min_key);
            enrollments.set(min_key, enrollments.get(j));
            enrollments.set(j, temp);
        }

        return enrollments;
    }

    public ArrayList<Course> selectionSortCourse(ArrayList<Course> courses) {
        Course temp;
        int min_key;

        for (int j = 0; j < courses.size() - 1; j++) {
            min_key = j;

            for (int k = j + 1; k < courses.size(); k++) {
                if (courses.get(k).getCourseCode() < courses.get(min_key).getCourseCode()) {
                    min_key = k;
                }
            }

            temp = courses.get(min_key);
            courses.set(min_key, courses.get(j));
            courses.set(j, temp);
        }

        return courses;
    }

    public ArrayList<Student> InsertionSortStudent(ArrayList<Student> students) {
        int n = students.size();
        for (int i = 1; i < n; i++) {
            Student key = students.get(i);
            int j = i - 1;

            while (j >= 0 && students.get(j).personID > key.personID) {
                students.set(j + 1, students.get(j));
                j = j - 1;
            }
            students.set(j + 1, key);
        }

        return students;
    }

    public ArrayList<Enrollment> InsertionSortEnrollment(ArrayList<Enrollment> enrollments) {
        int n = enrollments.size();
        for (int i = 1; i < n; i++) {
            Enrollment key = enrollments.get(i);
            int j = i - 1;

            while (j >= 0 && enrollments.get(j).getEnrollmentId() > key.getEnrollmentId()) {
                enrollments.set(j + 1, enrollments.get(j));
                j = j - 1;
            }
            enrollments.set(j + 1, key);
        }

        return enrollments;
    }

    public ArrayList<Course> InsertionSortCourse(ArrayList<Course> courses) {
        int n = courses.size();
        for (int i = 1; i < n; i++) {
            Course key = courses.get(i);
            int j = i - 1;

            while (j >= 0 && courses.get(j).getCourseCode()> key.getCourseCode()) {
                courses.set(j + 1, courses.get(j));
                j = j - 1;
            }
            courses.set(j + 1, key);
        }

        return courses;
    }
}
