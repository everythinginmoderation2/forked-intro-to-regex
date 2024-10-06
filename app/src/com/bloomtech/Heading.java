package com.bloomtech;

public class Heading {
    private String direction;
    private float time;
    private float speedInKnots;

    public Heading(String direction, float time, float speedInKnots) {
        this.direction = direction;
        this.time = time;
        this.speedInKnots = speedInKnots;
    }

    public String getDirection() {
        return this.direction;
    }

    public float getTime() {
        return this.time;
    }

    public float getSpeedInKnots() {
        return this.speedInKnots;
    }

    @Override
    public String toString() {
        return String.format("Heading{direction=%s, time=%.2f, speed=%.2f}",
                direction, time, speedInKnots);
    }

    @Override
    public boolean equals(Object otherHeading) {
        Heading thatHeading = (Heading)otherHeading;
        return this.direction.equals(thatHeading.getDirection())
                && this.time == thatHeading.getTime()
                && this.speedInKnots == thatHeading.getSpeedInKnots();
    }
}
