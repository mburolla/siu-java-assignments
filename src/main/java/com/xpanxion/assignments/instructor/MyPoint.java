package com.xpanxion.assignments.instructor;

public final class MyPoint {

    //
    // Data members
    //

    private final int x;
    private final int y;

    //
    // Constructors
    //

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //
    // Public methods
    //

    /**
     * √[(x₂ - x₁)² + (y₂ - y₁)²]
     */
    public double distance(MyPoint point) {
        double dx = Math.pow((this.x - point.x), 2);
        double dy = Math.pow((this.y - point.y), 2);
        return Math.sqrt(dx + dy);
    }
}
