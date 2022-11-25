public class Switch {

  public static void main(String[] args) {
    // System.out.println(nameOfDay(5));
    System.out.println(isWeekDay(6));
  }

  public static boolean isWeekDay(int dayNo) {
    switch (dayNo) {
      //   case 0:
      //   case 6:
      //     return false;
      case 2:
      case 3:
      case 4:
      case 5:
      case 1:
        return true;
      default:
        return false;
    }
  }

  public static String nameOfDay(int dayNo) {
    switch (dayNo) {
      case 0:
        return "Sunday";
      case 1:
        return "Monday";
      case 2:
        return "Tuesday";
      case 3:
        return "Wednesday";
      case 4:
        return "Thursday";
      case 5:
        return "Friday";
      case 6:
        return "Saturday";
      default:
        return "";
    }
  }
}
