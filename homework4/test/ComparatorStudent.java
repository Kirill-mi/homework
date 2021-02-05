package homework4.test;

import java.util.Comparator;

/**
 * Test for homework4
 * 05.02.2021
 * Mikhalochkin Kirill
 */
public class ComparatorStudent implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNumber().compareTo(o2.getNumber());
    }
}
