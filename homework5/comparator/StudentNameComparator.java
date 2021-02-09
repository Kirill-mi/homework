package homework5.comparator;

import homework5.dto.Student;

import java.util.Comparator;

/**
 * homework5
 * 06.02.2021
 * Mikhalochkin Kirill
 */
public class StudentNameComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
