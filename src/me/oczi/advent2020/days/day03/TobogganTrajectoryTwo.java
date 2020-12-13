package me.oczi.advent2020.days.day03;

public class TobogganTrajectoryTwo extends TobogganTrajectoryOne {
  private final int[][] SLOPES = {{1, 1}, {3, 1}, {5, 1}, {7, 1}, {1, 2}};

  @Override
  public void resolve() {
    long result = 1;
    for (int[] slope : SLOPES) {
      int x = slope[0];
      int y = slope[1];
      long trajectory = countTreeTrajectory(x, y);
      result *= trajectory;
    }
    System.out.println("result: " + result);
  }
}
