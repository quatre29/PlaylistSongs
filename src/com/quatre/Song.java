package com.quatre;

public class Song {
    private String title;
    private double duration;

    public Song (String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }
    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }
}
