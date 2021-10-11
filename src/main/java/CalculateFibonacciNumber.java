public class CalculateFibonacciNumber {

    public long fibonacci(long fibonacciNumber){
        if(fibonacciNumber < 0 || fibonacciNumber > 91)
            return -1;

        long first = 0;
        long second = 1;
        long count = fibonacciNumber;

        for (int i = 2; i <= fibonacciNumber; i++) {
            count = first + second;
            first = second;
            second = count;
        }
        return count;
    }
}
