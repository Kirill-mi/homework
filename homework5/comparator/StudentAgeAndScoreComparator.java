package homework5.comparator;

import homework5.dto.Student;

import java.util.Comparator;

/**
 * homework5
 * 06.02.2021
 * Mikhalochkin Kirill
 */
public class StudentAgeAndScoreComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() != o2.getAge()) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else {
            return Double.compare(o1.getScore(), o2.getScore());
        }
    }
}
