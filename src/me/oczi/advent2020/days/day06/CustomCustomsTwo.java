package me.oczi.advent2020.days.day06;

import java.util.HashMap;
import java.util.Map;

public class CustomCustomsTwo extends CustomCustomsBase {

  @Override
  public void resolve() {
    int result = 0;
    for (String group : INPUT_PROCESSED) {
      String[] subgroups = group.split(" ");
      // Same strategy of part one but
      // with a integer as Map value for count
      // the needed answered to sum with result.
      Map<Character, Integer> map = new HashMap<>();
      for (String subgroup : subgroups) {
        for (char c : subgroup.toCharArray()) {
          map.compute(c,
              (ch, i) -> i == null ? 1 : ++i);
        }
      }
      // I don't like the double iteration.
      for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        Integer value = entry.getValue();
        if (value == subgroups.length) {
          ++result;
        }
      }
    }
    System.out.println("Result: " + result);
  }
}
