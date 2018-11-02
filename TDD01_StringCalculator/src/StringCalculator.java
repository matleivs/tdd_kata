
public class StringCalculator {

    public int calculate(String s) {

        int indexOfOperator = s.indexOf("+");
        if (indexOfOperator == -1) {
            indexOfOperator = s.indexOf("*");
            if (indexOfOperator == -1) {
                indexOfOperator = s.indexOf("-");
                if (indexOfOperator == -1 || indexOfOperator == 0) {
                    indexOfOperator = s.indexOf("/");
                    if (indexOfOperator == -1) {
                        return Integer.parseInt(s);
                    }
                }
            }
        }
        return calculate(s, indexOfOperator);
    }

    private int calculate(String input, int indexOfOperator) {
        char operator = input.charAt(indexOfOperator);

        String firstOperand = input.substring(0, indexOfOperator);
        String secondOperand = input.substring(indexOfOperator + 1);

        int firstValue = Integer.parseInt(firstOperand);
        int secondValue = Integer.parseInt(secondOperand);

        switch (operator) {
            case '+':
                return firstValue + secondValue;
            case '-':
                return firstValue - secondValue;
            case '*':
                return firstValue * secondValue;
            case '/':
                return firstValue / secondValue;
            default:
                throw new IllegalArgumentException();
        }
    }

}
