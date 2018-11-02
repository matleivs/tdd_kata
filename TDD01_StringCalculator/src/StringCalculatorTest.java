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
    public void input_letters_throw_IllegalArgumentException() {
        calculate("abc");
    }


    @Test(expected = IllegalArgumentException.class)
    public void input_second_operand_is_missing_throw_IllegalArgumentException() {
        calculate("1+");
    }

    @Test(expected = IllegalArgumentException.class)
    public void input_first_operand_is_missing_throw_IllegalArgumentException() {
        calculate("+1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void input_first_and_second_operands_are_missing_throw_IllegalArgumentException() {
        calculate("+");
    }

    @Test
    public void input_0_return_0() {
        assert_calculate("0", 0);
    }

    @Test
    public void input_1_return_1() {
        assert_calculate("1", 1);
    }

    @Test
    public void input_negative1_return_negative1() {
        assert_calculate("-1", -1);
    }

    @Test
    public void input_two_digits_return_two_digits() {
        assert_calculate("12", 12);
    }

    @Test
    public void input_0_plus_0_return_0() {
        assert_calculate("0+0", 0);
    }

    @Test
    public void input_0_plus_1_return_1() {
        assert_calculate("0+1", 1);
    }

    @Test
    public void input_1_plus_0_return_1() {
        assert_calculate("1+0", 1);
    }

    @Test
    public void input_1_multiply_1_return_1() {
        assert_calculate("1*1", 1);
    }

    @Test
    public void input_1_multiply_2_return_2() {
        assert_calculate("1*2", 2);
    }

    @Test
    public void input_1_minus_1_return_0() {
        assert_calculate("1-1", 0);
    }

    @Test
    public void input_1_multiply_3_return_3() {
        assert_calculate("1*3", 3);
    }


    private void assert_calculate(String input, int expected) {
        int actual = calculate(input);

        Assert.assertEquals(expected, actual);
    }

    private int calculate(String expression) {
        return new StringCalculator().calculate(expression);
    }
}