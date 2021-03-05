package homework1;

import homework1.api.ICommunicationPrinter;

import java.util.Objects;

public class ChoiceNameVersion2 implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {
        String result;
        String nameOne = "Вася";
        String nameTwo = "Анастасия";
        if (Objects.equals(name, nameOne)) {
            result = "Привет!\nЯ тебя так долго ждал";
        } else if (Objects.equals(name, nameTwo)) {
            result = "Я тебя так долго ждал";
        } else {
            result = "Добрый день. А вы кто?";
        }
        return result;
    }
}
