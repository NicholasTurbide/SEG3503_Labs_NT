import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_tc01() {
    Date today = new Date(1700, 6, 20);
    Date expectedTomorrow = new Date(1700, 6, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc02() {
    Date today = new Date(2005, 4, 15);
    Date expectedTomorrow = new Date(2005, 4, 16);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc03() {
    Date today = new Date(1901, 7, 20);
    Date expectedTomorrow = new Date(1901, 7, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc04() {
    Date today = new Date(3456, 3, 27);
    Date expectedTomorrow = new Date(3456, 3, 28);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc05() {
    Date today = new Date(1500, 2, 17);
    Date expectedTomorrow = new Date(1500, 2, 18);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc06() {
    Date today = new Date(1700, 6, 29);
    Date expectedTomorrow = new Date(1700, 6, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc07() {
    Date today = new Date(1800, 11, 29);
    Date expectedTomorrow = new Date(1800, 11, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc08() {
    Date today = new Date(3453, 1, 29);
    Date expectedTomorrow = new Date(3453, 1, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc09() {
    Date today = new Date(444, 2, 29);
    Date expectedTomorrow = new Date(444, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc10() {
    Date today = new Date(2005, 4, 30);
    Date expectedTomorrow = new Date(2005, 5, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc11() {
    Date today = new Date(3453, 1, 30);
    Date expectedTomorrow = new Date(3453, 1, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc12() {
    Date today = new Date(3456, 3, 30);
    Date expectedTomorrow = new Date(3456, 3, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc13() {
    Date today = new Date(1901, 7, 31);
    Date expectedTomorrow = new Date(1901, 8, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc14() {
    Date today = new Date(3453, 1, 31);
    Date expectedTomorrow = new Date(3453, 2, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc15() {
    Date today = new Date(3456, 12, 31);
    Date expectedTomorrow = new Date(3457, 1, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_invalid_tc16() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 31)
    );
  }

  @Test
  void nextDate_invalid_tc17() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 29)
    );
  }

  @Test
  void nextDate_invalid_tc18() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(-1, 10, 20)
    );
  }

  @Test
  void nextDate_invalid_tc19() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1458, 15, 12)
    );
  }

  @Test
  void nextDate_invalid_tc20() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 6, -50)
    );
  }

  //Added Tests

  @Test
  void toStringCheck(){
    Date date = new Date(2022, 02, 14);
    assertEquals("2022/February/14", date.toString());
  }

  @Test
  void thirtyDayMonth(){
    Date date = new Date(2020, 9,29);
    Date expect = new Date(2020, 9,30);
    assertEquals(expect, date.nextDate());
  }

  @Test
  void incorrectLeap(){
    Date date = new Date(2019, 02, 28);
    Date notExpect= new Date(2019, 02, 29);
    assertEquals(false, notExpect.equals(date.nextDate()));
  }


  @Test
  void nextDateFeb28(){
    Date date = new Date(2022,02,28);
    Date expect = new Date(2022,03,1);
    assertEquals(expect, date.nextDate());
  }

  @Test
  void nextDateFeb29(){
    Date date = new Date(2020,02,28);
    Date expect = new Date(2020,02,29);
    assertEquals(expect, date.nextDate());
  }

  @Test
  void isLeapYear(){
    Date today = new Date(2020, 01, 05);
    assertEquals(true, today.isLeapYear());
  }

  @Test 
  void notDate(){
    Date date = new Date(2022, 05, 05);
    Object obj = new Object();
    assertEquals(false, date.equals(obj));
  }

  @Test
  void equals(){
    Date today1 = new Date(2022, 06, 14);
    Date today2 = new Date(2022, 06, 14);
    assertEquals(true, today1.equals(today2));
  }

  @Test
  void diffyear(){
    Date yesterYear = new Date(2021, 06, 14);
    Date thisYear = new Date(2022, 06, 14);
    assertEquals(false, yesterYear.equals(thisYear));
  }

  @Test
  void diffMonth(){
    Date yesterMonth = new Date(2022, 05, 14);
    Date today = new Date(2022, 06, 14);
    assertEquals(false, yesterMonth.equals(today));
  }

  @Test
  void diffDay(){
    Date yesterday = new Date(2022, 06, 13);
    Date today = new Date(2022, 06, 14);
    assertEquals(false, yesterday.equals(today));
  }

}