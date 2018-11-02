import org.junit.Assert;
import org.junit.Test;

/**
 * #1 Kata “String Calculator”:
 * <p>
 * Erstellt eine Funktion, die einen String entgegennimmt und
 * das Ergebnis der darin erhaltenen Rechnung zurückgibt.
 * Unterstützt werden sollen die vier Grundrechenarten (+,-,/,*) für Integerwerte (Annahme: Werte < 0 inkl.).
 * Die Signatur sähe so aus: Number calculate(String expression)
 * <p>
 * <p>
 * 12 -> 12
 * -23 -> -23
 * <p>
 * 0+0 -> 0
 * 0+1 -> 1
 * 1+0 -> 1
 * 1+0 -> 0+1
 * 0+-1 -> -1
 * -1+0 -> -1
 * -1 + -1 = -2
 */
public class StringCalculatorTest {


    @Test
    public void test_input_zero_return_0() {
        test_calculate("0", 0);
    }

    @Test
    public void test_input_1_return_1() {
        test_calculate("1", 1);
    }

    @Test
    public void test_input_negative1_return_negative1() {
        test_calculate("-1", -1);
    }


    @Test
    public void test_input_2digits_return_2digits() {
        test_calculate("12", 12);
    }

    private void test_calculate(String input, int expected) {
        int actual = new StringCalculator().calculate(input);

        Assert.assertEquals(expected, actual);
    }
}