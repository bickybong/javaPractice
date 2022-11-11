public class MultiplicationTable {

  public static void main(String[] args) {
    MultiplicationTable table = new MultiplicationTable();
    // table.print();
    table.print(7);
    // table.print(6, 11, 22);
  }

  void print() {
    print(5, 1, 10);
  }

  void print(int table) {
    print(table, 1, 10);
  }

  void print(int table, int from, int to) {
    for (int i = from; i <= to; i++) {
      System.out.printf("%d X %d = %d", table, i, table * i).println();
    }
  }
}
