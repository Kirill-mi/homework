package homework4.test;

import java.util.Comparator;

/**
 * Test for homework4
 * 05.02.2021
 * Mikhalochkin Kirill
 */
public class ComparatorSchool implements Comparator<School>{

    @Override
    public int compare(School o1, School o2) {
        return o1.getNumber().compareTo(o2.getNumber());
    }
}
