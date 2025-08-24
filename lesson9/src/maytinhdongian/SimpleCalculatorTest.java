package maytinhdongian;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {

    @Test
    @DisplayName("Test addition with positive numbers")
    public void testAddPositive() {
        assertEquals(5, SimpleCalculator.add(2, 3));
    }

    @Test
    @DisplayName("Test addition with negative numbers")
    public void testAddNegative() {
        assertEquals(-5, SimpleCalculator.add(-2, -3));
    }

    @Test
    @DisplayName("Test addition with zero")
    public void testAddWithZero() {
        assertEquals(2, SimpleCalculator.add(2, 0));
    }

    @Test
    @DisplayName("Test addition with mixed signs")
    public void testAddMixed() {
        assertEquals(0, SimpleCalculator.add(-2, 2));
    }

    @Test
    @DisplayName("Test subtraction with positive numbers")
    public void testSubPositive() {
        assertEquals(1, SimpleCalculator.sub(3, 2));
    }

    @Test
    @DisplayName("Test subtraction with negative numbers")
    public void testSubNegative() {
        assertEquals(1, SimpleCalculator.sub(-2, -3));
    }

    @Test
    @DisplayName("Test subtraction with zero")
    public void testSubWithZero() {
        assertEquals(2, SimpleCalculator.sub(2, 0));
    }

    @Test
    @DisplayName("Test subtraction with mixed signs")
    public void testSubMixed() {
        assertEquals(-4, SimpleCalculator.sub(-2, 2));
    }
}
