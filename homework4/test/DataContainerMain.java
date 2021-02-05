package homework4.test;

import homework4.DataContainer;


/**
 * Test file for homework4
 * 01.02.2021
 * Mikhalochkin Kirill
 */
public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] numbers = {null, 9, 8, 3, 0, null, 1, 3, null};
        String[] names = {null, null, "Маша", "Саша", "Паша", "Каша", null};
        DataContainer<Integer> dataNumbers = new DataContainer<>(numbers);
        DataContainer<String> dataNames = new DataContainer<>(names);
        DataContainer<Student> students = new DataContainer<>(Student.class);
        for (int i = 5; i > 0; i--) {
            Student student = new Student();
            student.setNumber(i + 1);
            student.setName("name" + (i));
            student.setAge((int) (Math.random() * 10 + 7));
            students.add(student);
        }

        System.out.println(dataNames.toString());
        System.out.println("Элемент удален: " + dataNames.delete("Паша"));
        System.out.println("Элемент добавлен на поз: " + dataNames.add("Конь"));
        System.out.println("Элемент удален: " + dataNames.delete(1));
        System.out.println("До сортировки: " + dataNames);
        dataNames.sort(String::compareTo);
        System.out.println("После сортировки вложенным компаратором : " + dataNames);

        System.out.println(dataNumbers.toString());
        System.out.println("Элемент удален: " + dataNumbers.delete(0));
        System.out.println("Элемент добавлен на поз: " + dataNumbers.add(6));
        System.out.println("До сортировки: " + dataNumbers);
        dataNumbers.sort(Integer::compareTo);
        System.out.println("После сортировки вложенным компаратором : " + dataNumbers);

        System.out.println(students.toString());
        System.out.println("Comparable age:");
        students.sort(students);
        System.out.println("Comparator number:");
        students.sort(students, new ComparatorStudent());
    }
}
