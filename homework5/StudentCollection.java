package homework5;

import homework5.comparator.StudentNameComparator;
import homework5.comparator.StudentScoreComparator;
import homework5.comparator.StudentAgeAndScoreComparator;
import homework5.core.random.Java8Random;
import homework5.dto.Student;
import homework5.predicate.StudentAgeAndScorePredicate;
import homework5.predicate.StudentAgePredicate;
import homework5.suppliers.RandomStudentSupplier;
import homework5.utils.GlobalCounter;
import homework5.utils.SortStudent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * homework5
 * 03.02.2021
 * Mikhalochkin Kirill
 */
public class StudentCollection {


    public static void main(String[] args) {
        Supplier<Student> supplier = new RandomStudentSupplier(new GlobalCounter(), new Java8Random());
        Predicate<Student> predicate = new StudentAgeAndScorePredicate(12, 8);
        StudentNameComparator studentNameComparator = new StudentNameComparator();
        StudentScoreComparator studentScoreComparator = new StudentScoreComparator();
        List<Student> filteredStudent = flow(supplier, predicate);
        printTop(sortStudent(filteredStudent, studentNameComparator), 10);
        printTop(sortStudent(filteredStudent, studentScoreComparator.reversed()), 10);
        List<Student> sort = sortStudent(filteredStudent, new StudentAgeAndScoreComparator());
        for (int i = 12; i < 17; i++) {
            printTop(sortByPredicate(sort, new StudentAgePredicate(i)), 10);
        }
    }

    public static List<Student> flow(Supplier<Student> supplier, Predicate<Student> predicate) {
        List<Student> data = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            data.add(supplier.get());
        }
        System.out.println(data);

        return sortByPredicate(data, predicate);
    }

    public static List<Student> sortByPredicate(List<Student> data, Predicate<Student> predicate) {
        List<Student> filteredStudent = new ArrayList<>();
        for (Student value : data) {
            if (predicate.test(value)) {
                filteredStudent.add(value);

            }
        }
        return filteredStudent;
    }

    public static List<Student> sortStudent(List<Student> students, Comparator<Student> comparator) {
        return SortStudent.bubbleSort(students, comparator);
    }

    public static void printTop(List<Student> data, int top) {
        if (data.size() < top) {
            for (Student datum : data) {
                System.out.print(datum);
            }
        } else {
            for (int i = 0; i < top; i++) {
                System.out.print(data.get(i));
            }
        }
        System.out.println();
    }
}
