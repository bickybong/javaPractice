public class Motorbike {

  public static void main(String[] args) {
    Motorbike ducati = new Motorbike();
    Motorbike honda = new Motorbike();
    ducati.start();
    honda.start();

    ducati.setSpeed(100);

    ducati.decreaseSpeed(50);
    honda.increaseSpeed(100);

    System.out.println(ducati.getSpeed());
    System.out.println(honda.getSpeed());
  }

  // state
  private int speed;

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
    this.speed += add;
  }

  public void decreaseSpeed(int minus) {
    this.speed -= minus;
  }

  void start() {
    System.out.println("Bike Started");
  }
}
