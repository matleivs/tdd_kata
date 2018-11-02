
public class StringCalculator {

    public int calculate(String s) {

        int indexOfPlus = s.indexOf("+");
        if (indexOfPlus != -1) {
            return calculate(s.substring(0, indexOfPlus), "+", s.substring(indexOfPlus));
        } else {
            int indexOfStar = s.indexOf("*");

            if (indexOfStar != -1) {
                return calculate(s.substring(0, indexOfStar), "*", s.substring(indexOfStar + 1));
            } else {
                int indexOfMinus = s.indexOf("-");

                if (indexOfMinus != -1 && indexOfMinus != 0) {
                    return calculate(s.substring(0, indexOfMinus), "-", s.substring(indexOfMinus + 1));
                } else {
                    int indexOfSlash = s.indexOf("/");

                    if (indexOfSlash != -1) {
                        return calculate(s.substring(0, indexOfSlash), "/", s.substring(indexOfSlash + 1));
                    } else {
                        return Integer.parseInt(s);
                    }
                }
            }
        }
    }

    private int calculate(String firstOperand, String operator, String secondOperand) {
        int firstValue = Integer.parseInt(firstOperand);
        int secondValue = Integer.parseInt(secondOperand);

        switch (operator) {
            case "+":
                return firstValue + secondValue;
            case "-":
                return firstValue - secondValue;
            case "*":
                return firstValue * secondValue;
            case "/":
                return firstValue / secondValue;
            default:
                throw new IllegalArgumentException();
        }
    }

}
