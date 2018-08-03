import org.junit.Test;

/**
 * #1 Kata “String Calculator”:
 * <p>
 * Erstellt eine Funktion, die einen String entgegennimmt und das Ergebnis der darin erhaltenen Rechnung zurückgibt.
 * Unterstützt werden sollen die vier Grundrechenarten (+,-,/,*) für Integerwerte.
 * Die Signatur sähe so aus: Number calculate(String expression)
 */
public class StringCalculatorTest {

    @Test
    public void test() {
        new StringCalculator();
    }

    @Test
    public void test1() {
        new StringCalculator().calculate("0");
    }
}