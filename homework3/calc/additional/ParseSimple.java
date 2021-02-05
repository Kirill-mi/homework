package homework3.calc.additional;

import util.UserInput;

import java.util.LinkedList;

public class ParseSimple {


    public boolean isOperation(char c) {
        return c == '+' || c == '-' || c == '/' || c == '*' || c == '^';
    }

    public int operatorsPriority(char operand) {
        switch (operand) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public void operator(LinkedList<Double> number, char operation) {
        double r = number.removeLast();
        double l = number.removeLast();
        switch (operation) {
            case '+':
                number.add(l + r);
                break;
            case '-':
                number.add(l - r);
                break;
            case '*':
                number.add(l * r);
                break;
            case '/':
                number.add(l / r);
                break;
            case '%':
                number.add(l % r);
                break;
            case '^':
                number.add(Math.pow(l, r));
                break;
        }
    }

    public double calculation(String stamp) {
        ParseSimple obj = new ParseSimple();
        LinkedList<Double> numbers = new LinkedList<>();
        LinkedList<Character> element = new LinkedList<>();

        for (int i = 0; i < stamp.length(); i++) {
            char c = stamp.charAt(i);

            if (c == '(') {
                element.add('(');
            } else if (c == ')') {
                while (element.getLast() != '(')
                    operator(numbers, element.removeLast());
                element.removeLast();
            } else if (obj.isOperation(c)) {
                while (!element.isEmpty() && obj.operatorsPriority(element.getLast()) >= obj.operatorsPriority(c))
                    operator(numbers, element.removeLast());
                element.add(c);
            } else {
                StringBuilder operand = new StringBuilder();
                while (i < stamp.length() && (Character.isDigit(stamp.charAt(i)) || stamp.charAt(i) == '.')) {
                    operand.append(stamp.charAt(i));
                    i++;
                }
                i--;
                numbers.add(Double.parseDouble(operand.toString()));
            }
        }

        while (!element.isEmpty()) {
            operator(numbers, element.removeLast());
        }
        return numbers.get(0);
    }

    public void calculateOfFormula() {
        ParseSimple object = new ParseSimple();
        String formula = UserInput.getUserInputString("Input expression: ");
        formula = formula.replaceAll(" +", "");

        System.out.println(object.calculation(formula));

    }
}
