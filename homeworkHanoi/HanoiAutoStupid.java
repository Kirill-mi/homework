package homeworkHanoi;


import java.util.Random;

/**
 * homeworkHanoi
 * 03.02.2021
 * Mikhalochkin Kirill
 */
public class HanoiAutoStupid extends HanoiHand {
    private int columns;
    Random random = new Random();

    @Override
    public void setField() {
        super.setField();
    }


    public void playGame(int[][] field) {
        super.playGame(field);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public void printField() {
        super.printField();
    }

    @Override
    public void creatorOfField() {
        super.creatorOfField();
    }

    @Override
    public int putOfRing() {
        int[][] temp = getField();
        columns = temp[0].length;
        return random.nextInt(columns) + 1;
    }

    @Override
    public int putOnRing() {
        int[][] temp = getField();
        columns = temp[0].length;
        return random.nextInt(columns) + 1;
    }
}
