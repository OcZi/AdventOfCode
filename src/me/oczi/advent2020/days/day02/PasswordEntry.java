package me.oczi.advent2020.days.day02;

/**
 * POJO-style class for process PasswordEntry.
 * Used in {@link PasswordPhilosophyBase}.
 */
public class PasswordEntry {
  private final String password;
  private final int firstNumber;
  private final int lastNumber;
  private final char letter;

  public PasswordEntry(String entry) {
    String[] split = entry.split(":");
    String policy = split[0];
    this.password = split[1].trim();
    // The letter will be always the last index.
    int letterIndex = policy.length() - 1;
    this.letter = policy.charAt(letterIndex);
    policy = policy
        .substring(0, letterIndex)
        .trim();

    String[] interval = policy.split("-");
    this.firstNumber = Integer.parseInt(interval[0]);
    this.lastNumber = Integer.parseInt(interval[1]);
  }

  public String getPassword() {
    return password;
  }

  public int getLastPolicyNumber() {
    return lastNumber;
  }

  public int getFirstPolicyNumber() {
    return firstNumber;
  }

  public char getLetter() {
    return letter;
  }
}
