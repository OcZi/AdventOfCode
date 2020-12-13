package me.oczi.advent2020.days.day07;

public class HandyHaversacksTwo extends HandyHaversacksBase {

  @Override
  public void resolve() {
    String bagTarget = "shiny gold";
    Bag shinyGold = INPUT_PROCESSED.get(bagTarget);
    // Yes, always return a +1 of the real answer...
    long result = deepCountAllBags(shinyGold) - 1;
    System.out.println(
        String.format(
            "All the bags that can contains a %s: %s",
            bagTarget,
            result));
  }
}
