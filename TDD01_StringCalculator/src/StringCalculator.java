
public class StringCalculator {

    public int calculate(String s) {

        int indexOfOperator = s.indexOf("+");
        if (indexOfOperator != -1) {

            return calculate(s.substring(0, indexOfOperator), s.charAt(indexOfOperator), s.substring(indexOfOperator));
        } else {
            indexOfOperator = s.indexOf("*");

            if (indexOfOperator != -1) {
                return calculate(s.substring(0, indexOfOperator), s.charAt(indexOfOperator), s.substring(indexOfOperator + 1));
            } else {
                indexOfOperator = s.indexOf("-");

                if (indexOfOperator != -1 && indexOfOperator != 0) {
                    return calculate(s.substring(0, indexOfOperator), s.charAt(indexOfOperator), s.substring(indexOfOperator + 1));
                } else {
                    indexOfOperator = s.indexOf("/");

                    if (indexOfOperator != -1) {
                        return calculate(s.substring(0, indexOfOperator), s.charAt(indexOfOperator), s.substring(indexOfOperator + 1));
                    } else {
                        return Integer.parseInt(s);
                    }
                }
            }
        }
    }

    private int calculate(String firstOperand, char operator, String secondOperand) {
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
