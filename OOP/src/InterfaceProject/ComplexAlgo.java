package InterfaceProject;

public interface ComplexAlgo {
  int complexAlgo(int num1, int num2);

  default void nothing() { //default method with output
    System.out.println("Nothing");
  }
}
