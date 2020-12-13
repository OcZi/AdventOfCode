package me.oczi.advent2020.days.day04;

import java.util.function.Predicate;

public class PassportProperty {
  private final String name;
  private final Predicate<String> validation;

  public PassportProperty(String name,
                          Predicate<String> validation) {
    this.name = name;
    this.validation = validation;
  }

  public boolean validate(String value) {
    return validation.test(value);
  }

  public String getName() {
    return name;
  }
}
