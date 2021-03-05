package homework1;

import util.UserInputNotStatic;

public class FormatNumber {
    private final UserInputNotStatic userInputNotStatic;

    public FormatNumber(UserInputNotStatic userInputNotStatic) {
        this.userInputNotStatic = userInputNotStatic;
    }

    public String createPhoneNumber(Integer[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", (Object[]) numbers);
    }

    public Integer[] inputNumbers() {
        Integer[] numbers = new Integer[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = userInputNotStatic.getUserInputInt("Введите цифру номера:");
        }
        return numbers;
    }
}
