package Recursion;

class RecursionFibonacci {
  public static void main(String[] args) {
    RecursionFibonacci recursion = new RecursionFibonacci();
    var rec = recursion.fibonacci(-2);
    System.out.println(rec);

  }

  public int fibonacci(int n) {
    if (n<0) {
      return -1;
    }
    if (n==0 || n==1) {
      return n;
    }
    return fibonacci(n-1) + fibonacci(n-2);
  }



}
