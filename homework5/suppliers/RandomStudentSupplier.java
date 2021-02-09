package homework5.suppliers;


import homework5.utils.GlobalCounter;
import homework5.core.random.api.IRandom;
import homework5.dto.Student;

import java.util.function.Supplier;

/**
 * homework5
 * 07.02.2021
 * Mikhalochkin Kirill
 */
public class RandomStudentSupplier implements Supplier<Student> {

    private final IRandom random;
    private final GlobalCounter counter;

    public RandomStudentSupplier(GlobalCounter counter, IRandom random) {
        this.random = random;
        this.counter = counter;
    }

    @Override
    public Student get() {
        return new Student(
                counter.getAndInc(),
                random.randString(3, 10),
                random.randInt(7, 17),
                random.randDouble(0, 10),
                random.randBoolean()
        );
    }
}
