public class MyChar {

  public static void main(String[] args) {
    MyChar ch = new MyChar('a');
    System.out.println(ch.isVowel());
    System.out.println(ch);
  }

  private char character;

  MyChar(char character) {
    this.character = character;
  }

  public boolean isVowel() {
    // a e i o u or A E I O U
    if (
      character == 'a' ||
      character == 'e' ||
      character == 'i' ||
      character == 'o' ||
      character == 'u' ||
      character == 'A' ||
      character == 'E' ||
      character == 'I' ||
      character == 'O' ||
      character == 'U'
    ) {
      return true;
    }
    return false;
  }
}
