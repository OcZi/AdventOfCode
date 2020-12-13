package me.oczi.advent2020.days.day03;

public class TobogganTrajectoryOne extends TobogganTrajectoryBase {

  @Override
  public void resolve() {
    int x = 3;
    System.out.println("result: " + countTreeTrajectory(x, 1));
  }

  protected long countTreeTrajectory(int dx, int dy) {
    int countTrees = 0;
    int x = dx;
    int y = dy;
    while (y < MAP_LINE_MAX_HEIGHT) {
      char symbol = INPUT[y].charAt(x);
      if (symbol == TREE) ++countTrees;
      x = sumModulo(x, dx, MAP_LINE_MAX_WIDTH);
      y += dy;
    }
    return countTrees;
  }

  private int sumModulo(int x, int dx, int modulo) {
    return (x + dx) % modulo;
  }
}
