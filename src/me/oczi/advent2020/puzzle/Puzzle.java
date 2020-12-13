package me.oczi.advent2020.puzzle;

/**
 * Representation of a AdventOfCode Puzzle.
 * @param <T> Type of input to return.
 */
public interface Puzzle<T> {

  /**
   * Resolve the puzzle.
   * Will print the result in the console.
   */
  void resolve();

  /**
   * Get input of puzzle.
   * @return Input of puzzle.
   */
  T getInput();
}
