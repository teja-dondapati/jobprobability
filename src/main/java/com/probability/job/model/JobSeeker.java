package com.probability.job.model;

public class JobSeeker {

    private int level;
    private int estimatedDays;
    private String positiveWays;

    // Default constructor
    public JobSeeker() {
    }

    // Parameterized constructor
    public JobSeeker(int level, int estimatedDays, String positiveWays) {
        this.level = level;
        this.estimatedDays = estimatedDays;
        this.positiveWays = positiveWays;
    }

    // Getter for level
    public int getLevel() {
        return level;
    }

    // Setter for level
    public void setLevel(int level) {
        this.level = level;
    }

    // Getter for estimatedDays
    public int getEstimatedDays() {
        return estimatedDays;
    }

    // Setter for estimatedDays
    public void setEstimatedDays(int estimatedDays) {
        this.estimatedDays = estimatedDays;
    }

    // Getter for positiveWays
    public String getPositiveWays() {
        return positiveWays;
    }

    // Setter for positiveWays
    public void setPositiveWays(String positiveWays) {
        this.positiveWays = positiveWays;
    }
}
