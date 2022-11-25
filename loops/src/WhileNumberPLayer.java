public class WhileNumberPLayer {

  private int limit;

  public WhileNumberPLayer(int i) {
    this.limit = i;
  }

  public static void main(String[] args) {
    WhileNumberPLayer player = new WhileNumberPLayer(81);
    player.printSquaresToLimit();
    player.printCubesToLimit();
  }

  private void printCubesToLimit() {
    int i = 1;
    int cube = 1;
    System.out.println("cubes:");
    while (cube < this.limit) {
      i++;
      System.out.print(cube + " ");
      cube = i * i * i;
    }
    System.out.println();
  }

  private void printSquaresToLimit() {
    int i = 1;
    int square = 1;
    System.out.println("squares:");
    while (square < this.limit) {
      i++;
      System.out.print(square + " ");
      square = i * i;
    }
    System.out.println();
  }
}
