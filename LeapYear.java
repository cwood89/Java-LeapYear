public class LeapYear {

  public static boolean checkYear(Object year) {
    int y;
    if (year instanceof String) {
      y = Integer.parseInt((String) year);
    } else if (year instanceof Integer) {
      y = (Integer) year;
    }
    return true;
  }

}