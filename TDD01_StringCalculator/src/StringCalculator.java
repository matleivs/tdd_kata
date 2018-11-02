
public class StringCalculator {

    public int calculate(String s) {

        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
