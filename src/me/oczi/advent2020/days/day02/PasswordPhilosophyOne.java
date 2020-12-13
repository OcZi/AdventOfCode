package me.oczi.advent2020.days.day02;

public class PasswordPhilosophyOne extends PasswordPhilosophyBase {

  @Override
  public void resolve() {
    for (String entry : INPUT) {
      PasswordEntry passwordEntry = new PasswordEntry(entry);
      String password = passwordEntry.getPassword();
      int atLeast = passwordEntry.getFirstPolicyNumber();
      int atMost = passwordEntry.getLastPolicyNumber();
      char letter = passwordEntry.getLetter();
      int count = 0;
      for (char c : password.toCharArray()) {
        if (c == letter) {
          ++count;
        }
      }
      if (count >= atLeast && count <= atMost) {
        ++accepted;
      }
    }
    System.out.println("accepted = " + accepted);
  }
}
