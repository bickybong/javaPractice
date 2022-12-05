package AbstractExample;

public class Cat extends Animal {

  public static void main(String[] args) {
    Animal[] animals = { new Cat(), new Dog() };
    for (Animal animal : animals) {
      animal.bark();
    }
  }

  @Override
  void bark() {
    // TODO Auto-generated method stub
    System.out.println("Meow Meow");
  }
}
