package me.oczi.advent2020.days.day04;

public class PassportProcessingTwo extends PassportProcessingBase {
  
  @Override
  public void resolve() {
    int validPassports = 0;
    for (String entry : INPUT_PROCESSED) {
      Passport passport = new Passport(entry);
      if (passport.validateEntireProperty(NEEDED_PROPERTY_NAMES)) {
        ++validPassports;
      }
    }
    System.out.println("Valid Passports: " + validPassports);
  }
}
