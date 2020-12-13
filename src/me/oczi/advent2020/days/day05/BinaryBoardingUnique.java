package me.oczi.advent2020.days.day05;

import java.util.ArrayList;
import java.util.List;

public class BinaryBoardingUnique extends BinaryBoardingBase {

  @Override
  public void resolve() {
    int mostValue = 0;
    List<Integer> ints = new ArrayList<>();
    for (String s : INPUT_PROCESSED) {
      int i = Integer.parseInt(s, 2);
      if (i > mostValue) {
        mostValue = i;
      }
      ints.add(i);
    }
    ints.sort(Integer::compare);
    for (int i = 0; i < 867; i++) {
      if (!ints.contains(i)) {
        if (ints.contains(i + 1) && ints.contains(i - 1)) {
          System.out.println("Seat found: " + i);
          break;
        }
      }
    }
    System.out.println("mostValue: " + mostValue);
  }
}
