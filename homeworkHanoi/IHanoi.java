package homeworkHanoi;

public interface IHanoi {

    void playGame(int[][] field);

    int getCount();

    void printField();

    void creatorOfField();

    int putOfRing();

    int putOnRing();

    void setField();

    int[][] getField();

    void loadField();
}
