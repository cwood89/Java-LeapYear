public class LeapYear {

  public static boolean checkYear(Object year) {
    int y = 0;
    if (year instanceof String) {
      y = Integer.parseInt((String) year);
    } else if (year instanceof Integer) {
      y = (Integer) year;
    }
    if (y > 9999 || y < 1000) {
      throw new RuntimeException("Pick a correct year number.");
    }
    if (y % 100 == 0 && y % 400 == 0) {
      return true;
    } else if (y % 4 == 0) {
      return true;
    } else {
      return false;
    }
  }

}