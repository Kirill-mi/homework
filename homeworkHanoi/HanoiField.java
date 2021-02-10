package homeworkHanoi;

import util.UserInput;

import java.io.*;

/**
 * homeworkHanoi
 * 02.02.2021
 * Mikhalochkin Kirill
 */
public class HanoiField implements Serializable {
    private int rings;
    private int columns;
    private int[][] field;
    private boolean correct = true;
    private static final long serialVersionUID = 1L;

    public void setField() {

        do {
            rings = UserInput.getUserInputInt("Enter the number of rings");
            columns = UserInput.getUserInputInt("Enter the number of columns");
            if (3 > rings || rings > 20) {
                System.out.println("Number of rings from 3 to 20");
            } else if (3 > columns || columns > 8) {
                System.out.println("Number of columns from 3 to 8");
            } else {
                field = new int[rings][columns];
                correct = false;
            }
        } while (correct);
    }

    public int[][] getField() {
        return field;
    }

    public void creatorOfField() {
        int count = 1;
        for (int i = 0; i < field.length; i++) {
            field[i][0] = count;
            count++;
        }
    }

    public void printField() {
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
        try {
            Thread.sleep(2000);
            System.out.println("--------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void saveField() {
        ObjectOutputStream objectOutputStream = null;
        try {
            FileOutputStream outputStr = new FileOutputStream(
                    UserInput.getUserInputString("Input file name"));
            objectOutputStream = new ObjectOutputStream(outputStr);
            objectOutputStream.writeObject(field);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void loadField() {
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream inputStr = new FileInputStream(
                    UserInput.getUserInputString("Input file name"));
            objectInputStream = new ObjectInputStream(inputStr);
            this.field = (int[][]) objectInputStream.readObject();
            this.rings = field.length;
            this.columns = field[0].length;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
