/**
 * Practice 01 Math Recursive
 * CS 245 - First practice assignment
 * Recursive class of factorial and Fibonacci functions.
 * @author Wei Tian
 */

public class Practice01MathIterative implements Practice01Math {
    public int fib(int n) {
        int privousPrivousNum, privousNum = 0;
        int fib = 1;
        for(int i = 1; i < n; i++) {
            privousPrivousNum = privousNum;
            privousNum = fib;
            fib = privousNum + privousPrivousNum;
        }
        return fib;
    }

    public int fact(int n) {
        int fact =1;
        for(int i =1; i <= n; i++)
            fact *= i;
        return fact;
    }
}
