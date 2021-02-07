package homework4.test;

/**
 * test for homework4
 * 03.02.2021
 * Mikhalochkin Kirill
 */
public class School implements Comparable<School> {
    Integer number;
    String name;
    Integer age;
    School school;

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getNumber() {
        return number;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(School o) {
        return this.age.compareTo(o.age);
    }

    public void add(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age + '}';
    }
}
