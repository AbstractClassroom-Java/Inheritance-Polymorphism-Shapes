package io.github.nathanjrussell.twodimshapes.polygons;

public abstract class Polygon {
    private final int numSides;
    private final ShapeCategory shapeCategory;

    public Polygon(int numSides, ShapeCategory shapeCategory) {
        this.numSides = numSides;
        this.shapeCategory = shapeCategory;
    }

    public int getNumSides() {
        return this.numSides;
    }

    public ShapeCategory getShapeCategory() {
        return this.shapeCategory;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
