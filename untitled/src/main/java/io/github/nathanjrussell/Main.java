package io.github.nathanjrussell;

import io.github.nathanjrussell.twodimshapes.polygons.Polygon;
import io.github.nathanjrussell.twodimshapes.polygons.ShapeCategory;
import io.github.nathanjrussell.twodimshapes.polygons.categories.Rectangle;
import io.github.nathanjrussell.twodimshapes.polygons.categories.Square;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Polygon p1 = new Polygon(4, ShapeCategory.RECTANGLE); not possible bc Polygon is abstract
        Rectangle r1 = new Rectangle(4,6);
        System.out.println("Length: " + r1.getLength());
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Num Sides: " + r1.getNumSides());
        System.out.println("Category Name:" + r1.getShapeCategory().getCategoryName());

        Polygon rr1 = new Rectangle(5,6);
//        System.out.println("Length: " + rr1.getLength()); // will not work bc not part of polygon
//        System.out.println("Width: " + rr1.getWidth());  //will not work bc not part of polygon
        System.out.println("Num Sides: " + rr1.getNumSides());
        System.out.println("Area: " + rr1.getArea());
        System.out.println("Perimeter: " +  rr1.getPerimeter());
        System.out.println("Category Name:" + rr1.getShapeCategory().getCategoryName());

        Square s1 = new Square(4);
        System.out.println("Length: " + s1.getLength());
        System.out.println("Width: " + s1.getWidth());
        System.out.println("Num Sides: " + s1.getNumSides());
        System.out.println("SideLength: " + s1.getSideLength());
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter " + s1.getPerimeter());
        System.out.println("Category Name:" + s1.getShapeCategory().getCategoryName());
    }
}