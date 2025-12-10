class Shape {
    double calculateArea() {
        return 0;
    }
}
class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}
class Rectangle extends Shape {
    double l, b;
    Rectangle(double l, double b) { this.l = l; this.b = b; }

    double calculateArea() {
        return l * b;
    }
}
class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) { base = b; height = h; }

    double calculateArea() {
        return 0.5 * base * height;
    }
}
public class Main {
    public static void main(String[] args) {

        Shape s;

        s = new Circle(5);
        System.out.println("Area of Circle = " + s.calculateArea());

        s = new Rectangle(4, 6);
        System.out.println("Area of Rectangle = " + s.calculateArea());

        s = new Triangle(3, 8);
        System.out.println("Area of Triangle = " + s.calculateArea());
    }
}

// OUTPUT:
// Area of Circle = 78.5
// Area of Rectangle = 24.0
// Area of Triangle = 12.0


