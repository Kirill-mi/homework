package test.homework2.arrays;

import homework2.arrays.IArraysOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * homework2test
 * 02.03.2021
 * Mikhalochkin Kirill
 */
public class ArraysOperationsBaseTest {
    public final IArraysOperation operation;

    public ArraysOperationsBaseTest(IArraysOperation operation) {
        this.operation = operation;
    }

    @Test
    public void TestPrintAllElements() {
        assertEquals("1 2 3 ", operation.printAllElements());
    }
    @Test
    public void TestPrintEvenPositionElements() {
        assertEquals("1 3 ", operation.printEvenPositionElements());
    }
    @Test
    public void TestPrintContraryElements() {
        assertEquals("3 2 1 ", operation.printContraryElements());
    }
}

