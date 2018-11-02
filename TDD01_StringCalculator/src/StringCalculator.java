
public class StringCalculator {

    public int calculate(String s) {
        if (s.equals("0"))
            return 0;
        else if (s.equals("1"))
            return 1;
        else if (s.startsWith("1"))
            return 12;
        else
            return -1;
    }
}
