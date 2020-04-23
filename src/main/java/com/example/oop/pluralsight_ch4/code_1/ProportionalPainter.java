package com.example.oop.pluralsight_ch4.code_1;

import com.example.oop.pluralsight_ch4.code_1.common.Money;
import com.example.oop.pluralsight_ch4.code_1.common.MoneyRate;

import java.time.Duration;

public class ProportionalPainter implements Painter {
    private String name;
    private double sqMetersPerHour;
    private MoneyRate rate;

    public ProportionalPainter(String name, double sqMetersPerHour, MoneyRate rate) {
        this.name = name;
        this.sqMetersPerHour = sqMetersPerHour;
        this.rate = rate;
    }

    @Override
    public String getName() { return this.name; }

    @Override
    public boolean isAvailable() {
        return true;
    }

    private int getSecondsToPaint(double sqMeters) {
        return (int)(sqMeters / this.sqMetersPerHour * 3600);
    }

    @Override
    public Duration estimateTimeToPaint(double sqMeters) {
        return Duration.ofSeconds(this.getSecondsToPaint(sqMeters));
    }

    @Override
    public Money estimateCompensation(double sqMeters) {
        return this.rate.getTotalFor(this.estimateTimeToPaint(sqMeters));
    }

    public String toString() {
        return String.format(
            "%s painting %.2f sq. meters per hour at rate %s",
            this.getName(), this.sqMetersPerHour, this.rate);
    }
}
