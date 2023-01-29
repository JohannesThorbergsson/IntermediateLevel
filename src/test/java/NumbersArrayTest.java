import org.example.NumbersArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumbersArrayTest {
    NumbersArray numbersArrayTest = new NumbersArray();
    @Test
    void testNumbersToString() {
        Assertions.assertEquals("five", numbersArrayTest.getNumberString(5));
    }

    @Test
    void testOneToHundredMod3() {
        Assertions.assertEquals("#30", numbersArrayTest.oneToHundred()[29]);
    }
    @Test
    void testOneToHundredMod5() {
        Assertions.assertEquals("$35", numbersArrayTest.oneToHundred()[34]);
    }
    @Test
    void testOneToHundredNotMod3Or5() {
        Assertions.assertEquals("43", numbersArrayTest.oneToHundred()[42]);
    }

}
