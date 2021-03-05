package homeworkHanoi;

import util.UserInput;

/**
 * homeworkHanoi
 * 02.02.2021
 * Mikhalochkin Kirill
 */
public class Hanoi {
    public static void main(String[] args) {
        int rings = 4;
        int columns = 3;
        int a = 1;
        int[][] field = new int[rings][columns];
        boolean flag = false;

        for (int i = 0; i < field.length; i++) {
            field[i][0] = a;
            a++;
        }
        printField(rings, columns, field);
        a = 1;
        while (!flag) {

            int from = UserInput.getUserInputInt("From column");
            int to = UserInput.getUserInputInt("To column");
            int temp = 0;
            int remember = 0;
            for (int i = 0; i < field.length; i++) {
                if (field[i][from - 1] != 0) {
                    temp = field[i][from - 1];
                    field[i][from - 1] = 0;
                    remember = i;
                    break;
                } else if (field[rings - 1][from - 1] == 0) {
                    System.out.println("There are not disks on column");
                    printField(rings, columns, field);
                    break;
                }
            }
            if (field[rings - 1][to - 1] == 0) {
                field[rings - 1][to - 1] = temp;
            } else {
                for (int i = 0; i < rings - 1; i++) {
                    if (field[i][to - 1] == 0 && temp < field[i + 1][to - 1]) {
                        field[i][to - 1] = temp;
                        break;
                    } else if (i == (rings - 2)) {
                        field[remember][from - 1] = temp;
                        System.out.println("Move is not possible");
                    }
                }
            }
            printField(rings, columns, field);
            flag = true;
            for (int i = 0; i < field.length; i++) {
                if (field[i][columns - 1] == a) {
                    a++;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println("You are winner");
    }

    public static void printField(int rings, int columns, int[][] field) {
        for (int i = 0; i < rings; i++) {
            for (int j = 0; j < columns; j++) {
                if (field[i][j] == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(field[i][j]);
                }
            }
            System.out.println();
        }
    }
}
