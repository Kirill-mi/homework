package homework5.dto;

import java.util.Objects;

/**
 * homework5
 * 03.02.2021
 * Mikhalochkin Kirill
 */
public class Student implements Comparable<Student> {
    private final int id;
    private final String name;
    private final int age;
    private final double score;
    private final boolean olympic;

    public Student(int id, String name, int age, double score, boolean olympic) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.olympic = olympic;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", olympic=" + olympic +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
