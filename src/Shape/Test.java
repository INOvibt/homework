package Shape;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        ShapePrinter a = new ConsoleShapePrinter();
        a.print(circle);

        Parallelepiped parallelepiped = new Parallelepiped();
        ShapePrinter b = new ConsoleShapePrinter();
        b.print(parallelepiped);

        Rectangle rectangle = new Rectangle();
        ShapePrinter c = new ConsoleShapePrinter();
        c.print(rectangle);

        Square square = new Square();
        ShapePrinter d = new ConsoleShapePrinter();
        d.print(square);

        Triangle triangle = new Triangle();
        ShapePrinter e = new ConsoleShapePrinter();
        e.print(triangle);


    }
}
