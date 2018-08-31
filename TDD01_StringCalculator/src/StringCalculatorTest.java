import org.junit.Assert;
import org.junit.Test;

/**
 * #1 Kata “String Calculator”:
 * <p>
 * Erstellt eine Funktion, die einen String entgegennimmt und
 * das Ergebnis der darin erhaltenen Rechnung zurückgibt.
 * Unterstützt werden sollen die vier Grundrechenarten (+,-,/,*) für Integerwerte.
 * Die Signatur sähe so aus: Number calculate(String expression)
 */
public class StringCalculatorTest {

    @Test
    public void create_instance() {
        new StringCalculator();
    }

    @Test
    public void invoke_calculate_method() {
        int actual = new StringCalculator().calculate("0");

        Assert.assertEquals(0, actual);
    }
}