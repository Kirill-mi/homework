package homework5.comparator;

import homework5.dto.Student;

import java.util.Comparator;

/**
 * homework5
 * 08.02.2021
 * Mikhalochkin Kirill
 */
public class StudentScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getScore(), o2.getScore());
    }
}
