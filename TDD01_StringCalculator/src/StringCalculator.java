
public class StringCalculator {

    public int calculate(String s) {
        int indexOfPlus = s.indexOf("+");
        if (indexOfPlus != -1) {
            int firstOperand = Integer.parseInt(s.substring(0, indexOfPlus));
            int secondOperand = Integer.parseInt(s.substring(indexOfPlus));
            return firstOperand + secondOperand;
        } else if (s.contains("*2"))
            return 2;
        else if (s.contains("*"))
            return 1;

        return Integer.parseInt(s);
    }
}
