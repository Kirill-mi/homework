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

    /**
     * Evaluates this predicate on the given argument.
     *
     * @param student the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     */
    @Override
    public boolean test(Student student) {
        return student.getAge() >= age && student.getScore() > score;
    }
}
