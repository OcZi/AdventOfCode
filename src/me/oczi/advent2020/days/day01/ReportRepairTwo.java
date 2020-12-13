package me.oczi.advent2020.days.day01;

public class ReportRepairTwo extends ReportRepairBase {

  @Override
  public void resolve() {
    // O(n 3)
    for (int one : input) {
      for (int two : input) {
        for (int three : input) {
          int result = one + two + three;
          if (result == TO_FOUND) {
            System.out.println("result of multiply: " + one * two * three);
            // break; ?
          }
        }
      }
    }
  }
}
