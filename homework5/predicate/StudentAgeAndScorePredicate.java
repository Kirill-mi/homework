package homework5.predicate;

import homework5.dto.Student;

import java.util.function.Predicate;

/**
 * homework5
 * 07.02.2021
 * Mikhalochkin Kirill
 */
public class StudentAgeAndScorePredicate implements Predicate<Student> {
    private final int age;
    private final double score;

    public StudentAgeAndScorePredicate(int age, double score) {
        this.age = age;
        this.score = score;
    }

    @Override
    public boolean test(Student student) {
        return student.getAge() >= age && student.getScore() > score;
    }
}
