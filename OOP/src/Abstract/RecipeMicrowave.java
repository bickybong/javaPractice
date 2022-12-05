package Abstract;

public class RecipeMicrowave extends Recipe {

  public static void main(String[] args) {
    RecipeMicrowave recipe = new RecipeMicrowave();
    recipe.execute();
  }

  @Override
  void cleanup() {
    System.out.println("Switch off the microwave");
  }

  @Override
  void doTheDish() {
    System.out.println("Put into microwave");
    System.out.println("Take out of microwave");
  }

  @Override
  void getReady() {
    System.out.println("Get the raw materials");
    System.out.println("Switch on the microwave");
  }
}
