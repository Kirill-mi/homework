package homework2.arrays;

/**
 * homework2.task2.3
 * 27.01.2021
 * Mikhalochkin Kirill
 */
public class WhileOperation implements IArraysOperation {
    private final StringBuilder result = new StringBuilder();
    private final int[] container;

    public WhileOperation(int[] container) {
        this.container = container;
    }


    @Override
    public String printAllElements() {
        int i = 0;
        result.setLength(0);
        while (i < container.length) {
            result.append(container[i]).append(" ");
            i++;
        }
        return result.toString();
    }

    @Override
    public String printEvenPositionElements() {
        int i = 0;
        result.setLength(0);
        while (i < container.length) {
            result.append(container[i]).append(" ");
            i += 2;
        }
        return result.toString();
    }

    @Override
    public String printContraryElements() {
        int i = container.length - 1;
        while (i >= 0) {
            result.append(container[i]).append(" ");
            i--;
        }
        return result.toString();
    }
}
