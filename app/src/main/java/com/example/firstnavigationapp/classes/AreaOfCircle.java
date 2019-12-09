package com.example.firstnavigationapp.classes;

public class AreaOfCircle {

    private double radius;

    public AreaOfCircle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
