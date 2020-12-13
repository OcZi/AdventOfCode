package me.oczi.advent2020.days.day01;

import java.util.HashSet;
import java.util.Set;

public class ReportRepairOne extends ReportRepairBase {
  private static Set<Integer> set = new HashSet<>();

  @Override
  public void resolve() {
    for (int i : input) {
      set.add(i);
      int result = TO_FOUND - i;

      if (set.contains(result)) {
        System.out.println("result: " + (i * result));
        // break; ?
      }
    }
  }
}
