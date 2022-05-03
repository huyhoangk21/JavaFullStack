package com.hoangle;

/**
 * This is HW1, problem 2
 * This is a cube class
 */
public class Cube {

    /**
     * The length of the sides
     */
    private double sideLength;

    /**
     * A constructor
     * @param sideLength the length of the sides
     */
    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    /**
     *
     * @return the length of the sides
     */
    public double getSideLength() {
        return sideLength;
    }

    /**
     *
     * @param sideLength the length of the sides
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    /**
     *
     * @return the surface area of the cube
     */
    public double surfaceArea() {
        return 6 * sideLength * sideLength;
    }

    /**
     *
     * @return the volume of the cube
     */
    public double volume() {
        return sideLength * sideLength * sideLength;
    }
}
