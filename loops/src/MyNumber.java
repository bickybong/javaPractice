public class MyNumber {

  public static void main(String[] args) {
    MyNumber num = new MyNumber(9);
    boolean isPrime = num.isPrime();
    System.out.println("isPrime " + isPrime);

    int sum = num.sumUpToN();
    System.out.println("sumUpToN " + sum);

    int sumOfDivisors = num.sumOfDivisors();
    System.out.println("sumOfDivisors " + sumOfDivisors);

    num.printNumberTriangle();
  }

  private int num;

  public MyNumber(int num) {
    this.num = num;
  }

  private void printNumberTriangle() {
    for (int i = 1; i < num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  private int sumOfDivisors() {
    int sum = 0;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }
    return sum;
  }

  private int sumUpToN() {
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      sum += i;
    }
    return sum;
  }

  private boolean isPrime() {
    if (num < 2) { //guard check
      return false;
    }
    for (int i = 2; i < num - 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
