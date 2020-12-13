package me.oczi.advent2020.days.day07;

public class HandyHaversacksOne extends HandyHaversacksBase {

  @Override
  public void resolve() {
    int result = 0;
    String bagTarget = "shiny gold";
    for (Bag value : INPUT_PROCESSED.values()) {
      int count = deepCountOfBags(bagTarget, value);
      if (count >= 1) ++result;
    }
    System.out.println(
        String.format(
            "Count of %s in all bags: %s",
            bagTarget,
            result));
  }
}
