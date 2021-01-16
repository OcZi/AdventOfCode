package me.oczi.advent2020.days.day09;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.LongStream;

public class EncodingErrorUnique extends EncodingErrorBase {

  @Override
  public void resolve() {
    int firsts = 25;
    long found = 0;
    int start;
    int end;
    for (int i = firsts; i < INPUT.size(); i++) {
      Long res = INPUT.get(i);
      start = i - firsts;
      end = i;
      if (checkNumber(INPUT, start, end, res)) {
        System.out.println("Result: " + res);
        found = res;
        break;
      }
    }
    System.out.println("Contiguous: " + foundContiguousNumber(found));
  }

  public long foundContiguousNumber(long obj) {
    for (int i = 0; i < INPUT.size(); i++) {
      long sum = 0;
      for (int j = i; j < INPUT.size(); j++) {
        sum += INPUT.get(j);
        if (sum > obj) {
          break;
        }
        if (sum == obj) {
          LongStream stream = INPUT.parallelStream().mapToLong(l -> l);
          long min = stream
              .min()
              .orElseThrow(IllegalArgumentException::new);
          // TODO: this problem
          long max = -1;
          return min + max;
        }
      }
    }
    return 0;
  }

  public boolean checkNumber(List<Long> list, int start, int end, long obj) {
    Set<Long> longs = new HashSet<>();
    for (int j = start; j < end; j++) {
      for (int k = j; k < end; k++) {
        longs.add(list.get(j) + list.get(k));
      }
    }
    return !longs.contains(obj);
  }
}
