
public class StringCalculator {

    public int calculate(String s) {

        int indexOfPlus = s.indexOf("+");
        if (indexOfPlus != -1) {
            int firstOperand = Integer.parseInt(s.substring(0, indexOfPlus));
            int secondOperand = Integer.parseInt(s.substring(indexOfPlus));
            return firstOperand + secondOperand;
        } else {
            int indexOfStar = s.indexOf("*");

            if (indexOfStar != -1) {
                int firstOperand = Integer.parseInt(s.substring(0, indexOfStar));
                int secondOperand = Integer.parseInt(s.substring(indexOfStar + 1));
                return firstOperand * secondOperand;
            } else {
                int indexOfMinus = s.indexOf("-");

                if (indexOfMinus != -1 && indexOfMinus != 0) {
                    int firstOperand = Integer.parseInt(s.substring(0, indexOfMinus));
                    int secondOperand = Integer.parseInt(s.substring(indexOfMinus + 1));
                    return firstOperand - secondOperand;
                } else {
                    return Integer.parseInt(s);
                }
            }
        }
    }
}
