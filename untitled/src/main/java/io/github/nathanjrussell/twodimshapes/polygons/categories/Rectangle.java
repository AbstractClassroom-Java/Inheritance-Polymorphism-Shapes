package io.github.nathanjrussell.twodimshapes.polygons.categories;

import io.github.nathanjrussell.twodimshapes.polygons.Polygon;
import io.github.nathanjrussell.twodimshapes.polygons.ShapeCategory;

public class Rectangle extends Polygon {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        super(4, ShapeCategory.RECTANGLE);
        this.length = length;
        this.width = width;

    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea() {
        System.out.println("This is from Rectangle");
        return this.length * this. width;
    }

    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }


}
