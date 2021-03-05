package homework2.arrays;

/**
 * homework2
 * 01.03.2021
 * Mikhalochkin Kirill
 */
public class DoWhileOperation implements IArraysOperation {

    private final int[] container;
    private final StringBuilder result = new StringBuilder();

    public DoWhileOperation(int[] container) {
        this.container = container;
    }

    @Override
    public String printAllElements() {
        int i = 0;
        result.setLength(0);
        do {
            result.append(container[i]).append(" ");
            i++;
        } while (i < (container.length));
        return result.toString();
    }

    @Override
    public String printEvenPositionElements() {
        int i = 0;
        result.setLength(0);
        do {
            result.append(container[i]).append(" ");
            i += 2;
        } while (i < (container.length));
        return result.toString();
    }

    @Override
    public String printContraryElements() {
        int i = container.length - 1;
        result.setLength(0);
        do {
            result.append(container[i]).append(" ");
            i--;
        } while (i >= 0);
        return result.toString();
    }
}
