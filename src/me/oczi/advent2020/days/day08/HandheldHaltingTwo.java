package me.oczi.advent2020.days.day08;

import me.oczi.advent2020.utils.Strings;

import java.util.Arrays;
import java.util.List;

public class HandheldHaltingTwo extends HandheldHaltingBase {

  @Override
  public void resolve() {
    List<String> inputList = Arrays.asList(INPUT);
    for (int i = 0; i < inputList.size(); i++) {
      String unchanged = inputList.get(i);
      if (!Strings.contains(unchanged, "jmp", "nop")) {
        continue;
      }
      String changed = switchLine(unchanged);
      inputList.set(i, changed);
      HandheldGame game = new HandheldGame(inputList);
      if (!game.run()) {
        inputList.set(i, unchanged);
      } else {
        System.out.println("Result: " + game.getAccumulator());
        break;
      }
    }
  }

  protected String switchLine(String line) {
    String[] split = line.split(" ");
    switch (split[0]) {
      case "jmp":
        line = line.replace("jmp", "nop");
        break;
      case "nop":
        line = line.replace("nop", "jmp");
        break;
      default:
        break;
    }
    return line;
  }
}
