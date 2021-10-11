import static org.junit.jupiter.api.Assertions.*;

class CalculateFibonacciNumberTest {

    @org.junit.jupiter.api.Test
    void fibonacciIsNegative() {
        CalculateFibonacciNumber calculateFibonacciNumber = new CalculateFibonacciNumber();
        long actual = calculateFibonacciNumber.fibonacci(-1);
        long expected = -1;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void fibonacciIsGreater(){
        CalculateFibonacciNumber calculateFibonacciNumber = new CalculateFibonacciNumber();
        long actual = calculateFibonacciNumber.fibonacci(10000);
        long expected = -1;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void fibonacciIsInRange(){
        CalculateFibonacciNumber calculateFibonacciNumber = new CalculateFibonacciNumber();
        long actual = calculateFibonacciNumber.fibonacci(10);
        long expected = 55;
        assertEquals(expected, actual);
    }


}