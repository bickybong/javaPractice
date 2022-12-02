public class Fan {

  private String make;
  private double radius;
  private String color;
  private boolean isOn;
  private int speed;

  public Fan(
    String make,
    double radius,
    String color,
    boolean isOn,
    int speed
  ) {
    this.make = make;
    this.radius = radius;
    this.color = color;
    this.isOn = isOn;
    this.speed = speed;
  }

  public static void main(String[] args) {
    Fan fan1 = new Fan("Mistral", 3.6, "red", true, 0);
    fan1.switchOn();
    System.out.println(fan1);
    fan1.setSpeed(4);
    System.out.println(fan1);
    fan1.switchOff();
    System.out.println(fan1);
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void switchOn() {
    this.isOn = true;
    setSpeed(5);
  }

  public void switchOff() {
    this.isOn = false;
    setSpeed(0);
  }

  public String toString() { //print the state
    return String.format(
      "make - %s, radius - %f, color - %s, isOn - %b, speed - %d",
      make,
      radius,
      color,
      isOn,
      speed
    );
  }
}
