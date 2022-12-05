package InterfaceProject;

public class Project {

  public static void main(String[] args) {
    ComplexAlgo algo = new RealAlgo();
    System.out.println(algo.complexAlgo(5, 7));
    algo.nothing();
  }
}
