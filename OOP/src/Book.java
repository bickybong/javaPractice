public class Book {

  public static void main(String[] args) {
    // Book artOfComputerProgramming = new Book(100);
    // Book effectiveJava = new Book(50);
    Book cleanCode = new Book(45);

    // artOfComputerProgramming.setNoOfCopies(100);
    // effectiveJava.setNoOfCopies(50);
    // cleanCode.setNoOfCopies(45);

    cleanCode.decreaseNoOfCopies(50);
    System.out.println(cleanCode.getNoOfCopies());
  }

  // state
  private int noOfCopies;

  // constructor
  Book(int noOfCopies) {
    this.noOfCopies = noOfCopies;
  }

  // methods
  public int getNoOfCopies() {
    return this.noOfCopies;
  }

  public void setNoOfCopies(int noOfCopies) {
    if (noOfCopies > 0) {
      this.noOfCopies = noOfCopies;
    }
  }

  public void increaseNoOfCopies(int howMuch) {
    setNoOfCopies(noOfCopies + howMuch);
  }

  public void decreaseNoOfCopies(int howMuch) {
    setNoOfCopies(noOfCopies - howMuch);
  }
}
