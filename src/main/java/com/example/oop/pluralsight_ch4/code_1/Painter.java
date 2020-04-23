package com.example.oop.pluralsight_ch4.code_1;

import com.example.oop.pluralsight_ch4.code_1.common.Money;

import java.time.Duration;
import java.util.List;

public interface Painter {
    boolean isAvailable();
    Duration estimateTimeToPaint(double sqMeters);
    Money estimateCompensation(double sqMeters);
    String getName();

    default Velocity estimateVelocity(double sqMeters) {
        return new Velocity(sqMeters, this.estimateTimeToPaint(sqMeters));
    }

    static PaintersStream stream(List<Painter> painters) {
        return new PaintersStream(painters.stream());
    }
}
