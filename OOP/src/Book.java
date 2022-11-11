public class Book {

  public static void main(String[] args) {
    Book artOfComputerProgramming = new Book();
    Book effectiveJava = new Book();
    Book cleanCode = new Book();

    artOfComputerProgramming.setNoOfCopies(100);
    effectiveJava.setNoOfCopies(50);
    cleanCode.setNoOfCopies(45);
  }

  // state
  private int noOfCopies;

  // method

  public int getNoOfCopies() {
    return this.noOfCopies;
  }

  public void setNoOfCopies(int noOfCopies) {
    this.noOfCopies = noOfCopies;
  }
}
