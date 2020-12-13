package me.oczi.advent2020.days.day04;

public class PassportProcessingOne extends PassportProcessingBase {

  @Override
  public void resolve() {
    int validPassports = 0;
    for (String entry : INPUT_PROCESSED) {
      Passport passport = new Passport(entry);
      if (passport.validateNameProperty(NEEDED_PROPERTY_NAMES)) {
        ++validPassports;
      }
    }
    System.out.println("Valid Passports: " + validPassports);
  }
}
