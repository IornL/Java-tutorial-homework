package _2_2;

/**
 * Created by 28013 on 2016/9/27.
 */
public class CuboidClass {
    static class Rectangle {
        private double l, w;

        Rectangle(double _l, double _w) {
            l = _l;
            w = _w;
        }

        Rectangle() {
            l = w = 0;
        }

        public double area() {
            return l * w;
        }
    }

    static class Cuboid extends Rectangle {
        private double h;

        Cuboid(double _l, double _w, double _h) {
            super(_l, _w);
            h = _h;
        }

        public double volume() {
            return super.l * super.w * h;
        }
    }

    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(10, 5, 2);
        System.out.printf("Cubid's area is %f\n", cuboid.volume());
    }
}
