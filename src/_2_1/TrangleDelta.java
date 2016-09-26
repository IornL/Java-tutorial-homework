package _2_1;

/**
 * Created by 28013 on 2016/9/26.
 */
public class TrangleDelta {
    static class Triangle {
        private double lineA, lineB;

        public double getArea() {
            return lineA * lineB / 2;
        }

        public double getPerimeter() {
            return lineA + lineB + Math.sqrt(lineA * lineA + lineB * lineB);
        }

        Triangle(double _lineA, double _lineB) {
            lineA = _lineA;
            lineB = _lineB;
        }

    }

    static double areaDelta(Triangle t1, Triangle t2) {
        return t1.getArea() - t2.getArea();
    }

    static double perimeterDelta(Triangle t1, Triangle t2) {
        return t1.getPerimeter() - t2.getPerimeter();
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(6, 8), t2 = new Triangle(3, 4);
        System.out.printf("Delta of perimeter: %f\nDelta of area: %f",
                areaDelta(t1, t2), perimeterDelta(t1, t2));
    }
}
