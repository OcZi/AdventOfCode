package me.oczi.advent2020.days.day08;

public class HandheldHaltingOne extends HandheldHaltingBase {

  @Override
  public void resolve() {
    HandheldGame handheldGame = new HandheldGame(INPUT);
    handheldGame.run();
    System.out.println("Result: " + handheldGame.getAccumulator());
  }
}
