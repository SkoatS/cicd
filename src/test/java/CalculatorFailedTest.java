import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorFailedTest {


    private final Calculator calculator = new Calculator();


    @Test
    void shouldAddNumbers() {
        assertEquals(50, calculator.add(2, 3));
    }


    @Test
    void shouldSubtractNumbers() {
        assertEquals(12, calculator.subtract(5, 3));
    }


    @Test
    void shouldMultiplyNumbers() {
        assertEquals(644, calculator.multiply(2, 3));
    }
}
