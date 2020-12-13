package me.oczi.advent2020.days.day07;

import java.util.HashMap;
import java.util.Map;

public class Bag {
  private static final String EMPTY_BAG = "no other bags";
  private final String name;
  private final Map<String, Integer> bags = new HashMap<>();

  public Bag(String name, String properties) {
    this.name = name;
    properties = properties.replace(".", "");
    if (properties.equals(EMPTY_BAG)) return;
    for (String subBags : properties.split(", ")) {
      // The first space in properties will be after that the quantity of bags.
      int indexOfNumber = subBags.indexOf(" ");
      int numberOfSubBags = Integer.parseInt(
          subBags.substring(0, indexOfNumber));

      // The last space in properties will be before that "bag(s)".
      int indexOfLastSpace = subBags.lastIndexOf(" ");
      String subBagName = subBags
          .substring(indexOfNumber + 1, indexOfLastSpace);
      bags.put(subBagName, numberOfSubBags);
    }
  }

  public String getName() {
    return name;
  }

  public Map<String, Integer> getBags() {
    return bags;
  }
}
