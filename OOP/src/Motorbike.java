public class Motorbike {

  public static void main(String[] args) {
    Motorbike ducati = new Motorbike();
    Motorbike honda = new Motorbike();
    ducati.start();
    honda.start();
  }

  void start() {
    System.out.println("Bike Started");
  }
}
