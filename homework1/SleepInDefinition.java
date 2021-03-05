package homework1;

public class SleepInDefinition {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        boolean weekday = true; // будни=true; выходные=false;
        boolean vocation = false;// отпуск=true; не отпуск=false;
        boolean sleep = sleepIn(weekday, vocation);
        if (sleep) {
            System.out.println("Спи спокойно, дорогой товарищ");
        } else {
            System.out.println("Пора на работу");
        }
    }
}
