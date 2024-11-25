import org.dmitryyarygin.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTests {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
    }

      @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(3, 2), "3 * 2 should equal 1");
    }

      @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.divide(6, 2), "6 / 2 should equal 2");
    }
}
