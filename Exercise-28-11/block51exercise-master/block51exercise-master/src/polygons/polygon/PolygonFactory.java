package polygons.polygon;

public class PolygonFactory {

    public static Polygon drawSquare() {
        return new Square(50,50);
    }

    public static Polygon drawTriangle() {
        return new Triangle(100,100);
    }

    public static Polygon drawRectangle() {
        return new Rectangle(50,150);
    }

}
