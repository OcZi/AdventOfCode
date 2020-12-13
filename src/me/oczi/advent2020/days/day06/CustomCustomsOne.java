package me.oczi.advent2020.days.day06;

import java.util.HashMap;
import java.util.Map;

public class CustomCustomsOne extends CustomCustomsBase {

  @Override
  public void resolve() {
    int result = 0;
    Object unique = new Object();
    for (String group : INPUT_PROCESSED) {
      // Dictionary Map strategy.
      // Used like as a HashSet.
      Map<Character, Object> map = new HashMap<>();
      for (char c : group.toCharArray()) {
        if (c == ' ') continue;
        map.putIfAbsent(c, unique);
      }
      result += map.size();
    }
    System.out.println("Result: " + result);
  }
}
