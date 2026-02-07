package io.github.nathanjrussell.twodimshapes.polygons.categories;

public class Square extends Rectangle{
    private final double sideLength;

    public Square(double sideLength) {
        super(sideLength,sideLength);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return this.sideLength;
    }


}
