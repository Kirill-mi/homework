package homework5.predicate;

import homework5.dto.Student;

import java.util.function.Predicate;

/**
 * homework5
 * 09.02.2021
 * Mikhalochkin Kirill
 */
public class StudentAgePredicate implements Predicate<Student> {
    int age;

    public StudentAgePredicate(int age) {
        this.age = age;
    }

    @Override
    public boolean test(Student student) {
        return student.getAge() == age;
    }
}
