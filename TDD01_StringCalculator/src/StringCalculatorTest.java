import org.junit.Assert;
import org.junit.Test;

/**
 * #1 Kata “String Calculator”:
 * <p>
 * Erstellt eine Funktion, die einen String entgegennimmt und
 * das Ergebnis der darin erhaltenen Rechnung zurückgibt.
 * Unterstützt werden sollen die vier Grundrechenarten (+,-,/,*) für Integerwerte (Annahme: Werte < 0 inkl.).
 * Die Signatur sähe so aus: Number calculate(String expression)
 * Annahme: bei ungültiger Eingabe -> throw IllegalArgumentException
 * <p>
 * <p>
 * <p>
 * 1+0 -> 0+1
 * 0+-1 -> -1
 * -1+0 -> -1
 * -1 + -1 = -2
 */
public class StringCalculatorTest {


    @Test(expected = IllegalArgumentException.class)
    public void test_invalid_input_throw_illegalArgumentException() {
        new StringCalculator().calculate("abc");
    }


    @Test(expected = IllegalArgumentException.class)
    public void test_input_secondOperandIsMissing_throw_illegalArgumentException() {
        new StringCalculator().calculate("1+");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_input_firstOperandIsMissing_throw_illegalArgumentException() {
        new StringCalculator().calculate("+1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_input_firstAndSecondOperandsAreMissing_throw_illegalArgumentException() {
        new StringCalculator().calculate("+");
    }

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

    @Test
    public void test_input_0plus0_return_0() {
        test_calculate("0+0", 0);
    }

    @Test
    public void test_input_0plus1_return_1() {
        test_calculate("0+1", 1);
    }

    @Test
    public void test_input_1plus0_return_1() {
        test_calculate("1+0", 1);
    }

    @Test
    public void test_input_1multiply1_return_1() {
        test_calculate("1*1", 1);
    }


    private void test_calculate(String input, int expected) {
        int actual = new StringCalculator().calculate(input);

        Assert.assertEquals(expected, actual);
    }
}