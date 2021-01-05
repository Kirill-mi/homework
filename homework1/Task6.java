package homework1;

public class Task6 {
    public static String createPhoneNumber(int[] numbers) {
        String createPhoneNumber = "(";
        for (int i = 0; i < 3; i++) {
            createPhoneNumber = createPhoneNumber + numbers[i];
        }
        createPhoneNumber = createPhoneNumber + ") ";
        for (int i = 3; i < 6; i++) {
            createPhoneNumber = createPhoneNumber + numbers[i];
        }
        createPhoneNumber = createPhoneNumber + "-";
        for (int i = 6; i < 10; i++) {
            createPhoneNumber = createPhoneNumber + numbers[i];
        }
        return createPhoneNumber;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String formatNumber = createPhoneNumber(numbers);
        System.out.println(formatNumber);
    }
}

