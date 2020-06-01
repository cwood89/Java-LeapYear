import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeapYearTest {

  @Test(expected = RuntimeException.class)
  public final void shouldThrowExceptionIfNonNumberIsUsed() {
    LeapYear.checkYear("Two Thousand");
  }

  @Test
  public final void shouldAcceptStringsAndIntegers() {
    assertEquals(true, LeapYear.checkYear("2020"));
    assertEquals(true, LeapYear.checkYear(2020));
  }

  @Test(expected = RuntimeException.class)
  public final void shouldOnlyAcceptFourDigitNumbers() {
    LeapYear.checkYear("20201");
    LeapYear.checkYear("202");
  }

  @Test
  public final void shouldDetermineIfGivenYearIsLeapYear() {
    assertEquals(true, LeapYear.checkYear("2020"));
    assertEquals(false, LeapYear.checkYear(2021));
  }
}