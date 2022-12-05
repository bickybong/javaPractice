package InterfaceExercise;

public class Plane implements Flyable {

  public static void main(String[] args) {
    Flyable[] flyingObjects = { new Bird(), new Plane() };
    for (Flyable obj : flyingObjects) {
      obj.fly();
    }
  }

  @Override
  public void fly() {
    // TODO Auto-generated method stub
    System.out.println("Flying with fuel");
  }
}
