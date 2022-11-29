public class Strings {

  public static void main(String[] args) {
    String[] days = {
      "Sunday",
      "Monday",
      "Tuesday",
      "Wednesday",
      "Thursday",
      "Friday",
      "Saturday",
    };
    String longestDay = "";
    for (String day : days) {
      if (day.length() > longestDay.length()) { //find day with most characters
        longestDay = day;
      }
    }

    System.out.println("Day with most characters is " + longestDay);

    for (int i = days.length - 1; i >= 0; i--) { //print days in reverse
      System.out.println(days[i]);
    }
  }
}
