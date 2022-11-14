public class Motorbike {

  public static void main(String[] args) {
    Motorbike ducati = new Motorbike(100);
    Motorbike honda = new Motorbike(200);
    Motorbike bukati = new Motorbike();
    System.out.println(ducati.getSpeed());
    System.out.println(honda.getSpeed());
    System.out.println(bukati.getSpeed());

    ducati.start();
    honda.start();

    ducati.decreaseSpeed(50);
    System.out.println(ducati.getSpeed());
    // honda.increaseSpeed(100);
    // System.out.println(honda.getSpeed());
  }

  // state
  private int speed;

  // constructor
  Motorbike() { //default constructor for no arg input
    this(5);
  }

  Motorbike(int speed) {
    this.speed = speed;
  }

  // methods
  public int getSpeed() {
    return this.speed;
  }

  public void setSpeed(int speed) {
    if (speed > 0) {
      this.speed = speed;
    }
  }

  public void increaseSpeed(int add) {
    setSpeed(this.speed + add);
  }

  public void decreaseSpeed(int minus) {
    setSpeed(this.speed - minus);
  }

  void start() {
    System.out.println("Bike Started");
  }
}
