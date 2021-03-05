package homework2.arrays;

/**
 * homework2.task2.3
 * 27.01.2021
 * Mikhalochkin Kirill
 */
public class ArraysOperation implements IArraysOperation {
    private final int[] container = CreatorOfArray.arrayFromConsole();
    private final IArraysOperation iArraysOperation = new ForOperation(container);

    @Override
    public String printAllElements() {
        return iArraysOperation.printAllElements();
    }

    @Override
    public String printEvenPositionElements() {
        return iArraysOperation.printEvenPositionElements();
    }

    @Override
    public String printContraryElements() {
        return iArraysOperation.printContraryElements();
    }
}
