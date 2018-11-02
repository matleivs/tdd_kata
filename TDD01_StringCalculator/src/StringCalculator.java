
public class StringCalculator {

    public int calculate(String s) {
        int indexOfPlus = s.indexOf("+");
        if (indexOfPlus != -1) {
            int firstOperand = Integer.parseInt(s.substring(0, indexOfPlus));
            int secondOperand = Integer.parseInt(s.substring(indexOfPlus));
            return firstOperand + secondOperand;
        }
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }
}
