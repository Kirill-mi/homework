package homework2.arrays;

/**
 * homework2.task2.3
 * 27.01.2021
 * Mikhalochkin Kirill
 */
public class ForOperation implements IArraysOperation {
    private final StringBuilder result = new StringBuilder();
    private final int[] container;

    public ForOperation(int[] container) {
        this.container = container;
    }

    @Override
    public String printAllElements() {
        result.setLength(0);
        for (int i = 0; i < container.length; i++) {
            result.append(container[i]).append(" ");
        }
        return result.toString();
    }

    @Override
    public String printEvenPositionElements() {
        result.setLength(0);
        for (int c = 0; c < container.length; c++) {
            if (c % 2 == 0) {
                result.append(container[c]).append(" ");
            }
        }
        return result.toString();
    }

    @Override
    public String printContraryElements() {
        result.setLength(0);
        for (int i = container.length - 1; i >= 0; i--) {
            result.append(container[i]).append(" ");
        }
        return result.toString();
    }
}
