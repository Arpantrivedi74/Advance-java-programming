interface Area {
    double PI = 3.14;
    double getArea();
}

class Circle implements Area {

    double r;

    Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return PI * r * r;
    }
}

public class AreaMain {
    public static void main(String[] args) {

        Circle c1 = new Circle(14.5);
        System.out.println("Area of Circle = " + c1.getArea());

        Circle c2 = new Circle(16.5);
        System.out.println("Area of Circle = " + c2.getArea());

        // Anonymous class for Rectangle
        Area r1 = new Area() {
            public double getArea() {
                int l = 10, b = 40;
                return l * b;
            }
        };

        System.out.println("Area of Rectangle = " + r1.getArea());
    }
}
