import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeapYearTest {

  @Test(expected = RuntimeException.class)
  public final void shouldThrowExceptionIfNonNumberIsUsed() {
    LeapYear.checkYear("Two Thousand");
  }
}