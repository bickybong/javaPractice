public class BiNumber {

  public static void main(String[] args) {
    BiNumber numbers = new BiNumber(2, 3);

    System.out.println(numbers.add());
    System.out.println(numbers.multiply());

    numbers.doubles();

    System.out.println(numbers.getNumber1());
    System.out.println(numbers.getNumber2());
  }

  // state
  private int number1;
  private int number2;

  // constructor
  BiNumber(int number1, int number2) {
    this.number1 = number1;
    this.number2 = number2;
  }

  // methods
  public void doubles() {
    this.number1 *= 2;
    this.number2 *= 2;
  }

  public int multiply() {
    return this.number1 * this.number2;
  }

  public int add() {
    return this.number1 + this.number2;
  }

  public int getNumber1() {
    return this.number1;
  }

  public void setNumber1(int number1) {
    this.number1 = number1;
  }

  public int getNumber2() {
    return this.number2;
  }

  public void setNumber2(int number2) {
    this.number2 = number2;
  }
}
