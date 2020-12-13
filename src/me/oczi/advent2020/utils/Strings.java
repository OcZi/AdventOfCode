package me.oczi.advent2020.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Utilities related to String
 * (Interface name like Guava *wink*)
 */
public interface Strings {

  /**
   * Split all empty line breaker of String
   * and replace all line break to join them.
   * @param string String to split and join.
   * @return Sections of the string into a List.
   */
  static List<String> splitAndJoinSections(String string) {
    String[] split = string.split("\n\n");
    List<String> strings = new ArrayList<>();
    for (String s : split) {
      strings.add(
          s.replace(
              "\n", " "));
    }
    return strings;
  }
}
