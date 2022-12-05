package Abstract;

public class Recipe1 extends Recipe {

  public static void main(String[] args) {
    Recipe1 recipe = new Recipe1();
    recipe.execute();
  }

  @Override
  void cleanup() {
    System.out.println("Clean up the utensils");
  }

  @Override
  void doTheDish() {
    System.out.println("Do the dishes");
  }

  @Override
  void getReady() {
    System.out.println("Get the raw materials");
    System.out.println("Get the utensils");
  }
}
