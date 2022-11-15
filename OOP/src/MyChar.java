public class MyChar {

  public static void main(String[] args) {
    // MyChar ch = new MyChar('a');
    // System.out.println(ch.isVowel());
    // System.out.println(ch.isConsonant());
    // System.out.println(ch.isDigit());
    // System.out.println(ch.isAlphabet());
    MyChar.printLowerCaseAlphabets();
    MyChar.printUpperCaseAlphabets();
  }

  private char character;

  MyChar(char character) {
    this.character = character;
  }

  public static void printLowerCaseAlphabets() {
    for (char ch = 'a'; ch <= 'z'; ch++) {
      System.out.println(ch);
    }
  }

  public static void printUpperCaseAlphabets() {
    for (char ch = 'A'; ch <= 'Z'; ch++) {
      System.out.println(ch);
    }
  }

  public boolean isDigit() {
    if (character >= 48 && character <= 57) { // between 0-9
      return true;
    }
    return false;
  }

  public boolean isConsonant() {
    if (isAlphabet() && !isVowel()) { //between a-z
      return true;
    }
    return false;
  }

  public boolean isAlphabet() {
    if (character >= 97 && character <= 122) { //between a-z
      return true;
    } else if (character >= 65 && character <= 90) { //between A-Z
      return true;
    }
    return false;
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
