package com.example.oop.pluralsight_ch4.code_6;

import java.util.List;
import java.util.stream.Stream;

public interface PaintingScheduler {
    Stream<WorkAssignment> schedule(List<Painter> painters, double sqMeters);
}
