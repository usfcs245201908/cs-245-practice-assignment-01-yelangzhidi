public class Practice01MathRecursive {
  
  public int fib(int n) {
    if (n == 0 || n == 1)
      return n;
    return fib(n-1) + fib(n-2);
  }
  public int fact(int n) {
    if (n == 1)
      return 1;
    return fact(n-1);
  }
  
}
