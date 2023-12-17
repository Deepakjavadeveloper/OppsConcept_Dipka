
abstract class Shape {
    abstract void draw();
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing the circle ");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing the nothing ");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Shape A1 = new Circle();
        Shape M1 = new Triangle();
        A1.draw();
        M1.draw();
    }
}
