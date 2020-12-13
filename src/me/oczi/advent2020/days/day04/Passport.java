package me.oczi.advent2020.days.day04;

import java.util.HashMap;
import java.util.Map;

/**
 * Another POJO-style class
 * for the {@link PassportProcessingBase} Puzzle.
 */
public class Passport {
  private Map<String, String> properties = new HashMap<>();

  public Passport(String line) {
    for (String s : line.split(" ")) {
      String[] split = s.split(":");
      String dataName = split[0];
      String value = split[1];
      properties.put(dataName, value);
    }
  }

  public boolean validateNameProperty(PassportProperty... properties) {
    for (PassportProperty property : properties) {
      if (!this.properties.containsKey(
          property.getName())) {
        return false;
      }
    }
    return true;
  }

  public boolean validateEntireProperty(PassportProperty... properties) {
    for (PassportProperty property : properties) {
      if (!this.properties.containsKey(
          property.getName())) {
        return false;
      }
      String value = this.properties
          .get(property.getName());
      if (!property.validate(value)) {
        return false;
      }
    }
    return true;
  }

  public Map<String, String> getProperties() {
    return properties;
  }
}
