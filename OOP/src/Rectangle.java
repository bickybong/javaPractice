public class Rectangle {

  private int length;
  private int width;

  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  public static void main(String[] args) {
    Rectangle rec1 = new Rectangle(5, 8);
    rec1.setLength(9);
    System.out.println(rec1);
  }

  public int getLength() {
    return this.length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getWidth() {
    return this.width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int area() {
    return length * width;
  }

  public int perimeter() {
    return 2 * (length * width);
  }

  public String toString() {
    return String.format(
      "length - %d, width - %d, area - %d, perimeter - %d",
      length,
      width,
      area(),
      perimeter()
    );
  }
}
