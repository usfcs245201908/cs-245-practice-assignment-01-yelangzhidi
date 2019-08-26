/**
 * Practice 01 Math Recursive
 * CS 245 - First practice assignment
 * Recursive class of factorial and Fibonacci functions.
 * @author Wei Tian
 */

public class Practice01MathRecursive implements Practice01Math{
  /**
   * This function is a recursive way to get Fibonacci of number n.
   */
  public int fib(int n) {
    if (n == 0 || n == 1)
      return n;
    return fib(n-1) + fib(n-2);
  }

  /**
   * This function is a recursive way to get factorial of number n.
   */
  public int fact(int n) {
    if (n == 0)
      return 1;
    if (n < 0)
      throw new IndexOutOfBoundsException() ; //handle exception of out of range: negative integer.
    return n * fact(n-1);
  }
  
}
