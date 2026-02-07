package io.github.nathanjrussell.twodimshapes.polygons;

public enum ShapeCategory {
    RECTANGLE("Rectangle"),
    TRIANGLE("Triangle");

    private final String categoryName;

    ShapeCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return this.categoryName;
    }
}
