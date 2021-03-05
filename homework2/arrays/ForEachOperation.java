package homework2.arrays;

/**
 * homework2.task2.3
 * 27.01.2021
 * Mikhalochkin Kirill
 */
public class ForEachOperation implements IArraysOperation {
    private final int[] container;
    private final StringBuilder result = new StringBuilder();

    public ForEachOperation(int[] container) {
        this.container = container;
    }

    @Override
    public String printAllElements() {
        result.setLength(0);
        for (int elementOfArray : container) {
            result.append(elementOfArray).append(" ");
        }
        return result.toString();
    }

    @Override
    public String printEvenPositionElements() {
        int count = 0;
        result.setLength(0);
        for (int elementOfArray : container) {
            if (count % 2 == 0) {
                result.append(elementOfArray).append(" ");
            }
            count++;
        }
        return result.toString();
    }

    @Override
    public String printContraryElements() {
        result.setLength(0);
        int count = container.length - 1;
        int[] reverseArray = new int[container.length];
        for (int element : container) {
            reverseArray[count] = element;
            count--;
        }
        for (int reverseElement : reverseArray) {
            result.append(reverseElement).append(" ");
        }
        return result.toString();
    }
}
