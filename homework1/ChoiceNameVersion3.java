package homework1;

import homework1.api.ICommunicationPrinter;

public class ChoiceNameVersion3 implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        String result;
        switch (name) {
            case "Вася": {
                result = "Привет!\nЯ тебя так долго ждал";
                break;
            }
            case "Анастасия": {
                result = "Я тебя так долго ждал";
                break;
            }
            default: {
                result = "Добрый день. А вы кто?";
                break;
            }
        }
        return result;
    }
}
