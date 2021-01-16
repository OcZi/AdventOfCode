package me.oczi.advent2020.days.day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HandheldGame {
  private final List<String> bootCode;
  private final List<Integer> visitedLines = new ArrayList<>();
  private int accumulator;
  private int jumps;

  public HandheldGame(String... bootCode) {
    this(Arrays.asList(bootCode));
  }

  public HandheldGame(List<String> bootCode) {
    this.bootCode = bootCode;
  }

  public void processCode(String line) {
    String[] split = line.split(" ");
    String varName = split[0];
    if (varName.equals("nop")) {
      return;
    }
    String varValue = split[1];
    int varIntValue = Integer.parseInt(varValue);
    switch (varName) {
      case "acc":
        accumulator += varIntValue;
        break;
      case "jmp":
        jumps += varIntValue;
        break;
    }
  }

  public boolean run() {
    int i = 0;
    while (i < bootCode.size()) {
      String line = bootCode.get(i);
      processCode(line);
      i = jumps == 0
          ? ++i
          : i + jumps;
      jumps = 0;
      if (visitedLines.contains(i)) {
        return false;
      }
      visitedLines.add(i);
    }
    return true;
  }

  public int getAccumulator() {
    return accumulator;
  }

  public int getJumps() {
    return jumps;
  }
}
