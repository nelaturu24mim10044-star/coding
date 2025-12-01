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

        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 8)
        };

        String[] names = {"Circle", "Rectangle", "Triangle"};

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Area of " + names[i] + " = " + shapes[i].calculateArea());
        }
    }
}

OUTPUT:
Area of Circle = 78.5
Area of Rectangle = 24.0
Area of Triangle = 12.0
