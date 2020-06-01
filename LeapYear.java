public class LeapYear {

  public static boolean checkYear(Object year) {
    int y = 0;
    if (year instanceof String) {
      y = Integer.parseInt((String) year);
    } else if (year instanceof Integer) {
      y = (Integer) year;
    }
    if (y > 9999) {
      throw new RuntimeException("Pick a smaller number.");
    }
    return true;
  }

}