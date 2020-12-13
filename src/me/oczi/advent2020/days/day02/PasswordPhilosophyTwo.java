package me.oczi.advent2020.days.day02;

public class PasswordPhilosophyTwo extends PasswordPhilosophyBase {

  @Override
  public void resolve() {
    for (String entry : INPUT) {
      PasswordEntry passwordEntry = new PasswordEntry(entry);
      String password = passwordEntry.getPassword();
      int firstIndex = passwordEntry.getFirstPolicyNumber();
      int lastIndex = passwordEntry.getLastPolicyNumber();
      char letter = passwordEntry.getLetter();
      char[] chars = password.toCharArray();
      boolean isFirst = false;
      boolean isLast = false;
      // Bad O(n).
      // I will not modify this because it's the final code.
      for (int i = 0; i < chars.length; i++) {
        int nonZeroIndex = i + 1;
        char c = chars[i];
        if (nonZeroIndex == firstIndex) {
          isFirst = c == letter;
        }
        if (nonZeroIndex == lastIndex) {
          isLast = c == letter;
        }
      }
      // Check if any of the two variables are true.
      if (isFirst || isLast) {
        // Check if only a one variable is true.
        if (isFirst != isLast) {
          ++accepted;
        }
      }
    }
    System.out.println("accepted = " + accepted);
  }
}
