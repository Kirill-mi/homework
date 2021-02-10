package homeworkHanoi;

import util.UserInput;

/**
 * homeworkHanoi
 * 02.02.2021
 * Mikhalochkin Kirill
 */
public class HanoiHand extends HanoiField implements IHanoi {
    private boolean flag = false;
    private int temp = 0;
    private int remember = 0;
    private int count = 0;


    @Override
    public void playGame(int[][] field) {
        int rings = field.length;
        int columns = field[0].length;
        while (!flag) {
            int fromColumn = putOfRing();
            if (fromColumn == 0) {
                saveField();
                break;
            }
            int toColumn = putOnRing();
            if (fromColumn > columns || toColumn > columns) {
                System.out.println("Number of columns too large");
                printField();
            } else {
                for (int i = 0; i < field.length; i++) {
                    if (field[i][fromColumn - 1] != 0) {
                        temp = field[i][fromColumn - 1];
                        field[i][fromColumn - 1] = 0;
                        remember = i;
                        break;
                    } else if (field[rings - 1][fromColumn - 1] == 0) {
                        System.out.println("There are not disks on column");
                        break;
                    }
                }
                if (field[rings - 1][toColumn - 1] == 0) {
                    field[rings - 1][toColumn - 1] = temp;
                    count++;
                    temp = 0;
                } else {
                    for (int i = 0; i < rings - 1; i++) {
                        if (field[i][toColumn - 1] == 0 && temp < field[i + 1][toColumn - 1]) {
                            field[i][toColumn - 1] = temp;
                            temp = 0;
                            count++;
                            break;
                        } else if (i == (rings - 2)) {
                            field[remember][fromColumn - 1] = temp;
                            temp = 0;
                            System.out.println("Move is not possible");
                        }
                    }
                }
                printField();
                flag = true;
                int count = 1;
                for (int[] element : field) {
                    if (element[columns - 1] == count) {
                        count++;
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
        }
        if (flag) {
            System.out.println("YOU ARE WINNER");
            System.out.println("You have made " + getCount() + " moves");
        }
    }

    @Override
    public int getCount() {
        return count;
    }

    public void printField() {
        super.printField();
    }

    public int putOfRing() {
        return UserInput.getUserInputInt("From column or 0 for SAVE GAME");
    }

    public int putOnRing() {
        return UserInput.getUserInputInt("To column");
    }
}
