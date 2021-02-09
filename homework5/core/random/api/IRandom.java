package homework5.core.random.api;

public interface IRandom {

    int randInt(int min, int max);

    double randDouble(double min, double max);

    String randString(int min, int max) ;

    boolean randBoolean();
}
