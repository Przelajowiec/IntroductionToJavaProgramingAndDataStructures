package pl.harrier.java.roz9;

import java.time.LocalTime;

public class Stoper {
    private LocalTime startTime;
    private LocalTime stopTime;

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getStopTime() {
        return stopTime;
    }

    public void start() {
        startTime = LocalTime.now();
    }

    public void stop() {
        stopTime = LocalTime.now();
    }

    public Stoper() {
        this.startTime = LocalTime.now();
    }

    public Long getElapseTime() {
        return (stopTime.toNanoOfDay() - startTime.toNanoOfDay()) / 1000000;
    }
}
