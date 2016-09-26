package _2_1;

/**
 * Created by 28013 on 2016/9/26.
 */
public class ComplexClass {
    static class Complex {
        private double real, imaginary;

        Complex(double _real, double _imaginary) {
            real = _real;
            imaginary = _imaginary;
        }

        public Complex add(Complex b) {
            return new Complex(real + b.real, imaginary + b.imaginary);
        }

        public Complex minus(Complex b) {
            return new Complex(real - b.real, imaginary - b.imaginary);
        }

        public Complex times(Complex b) {
            return new Complex(real * b.real - imaginary * b.imaginary, imaginary * b.real + real * b.imaginary);
        }

        public Complex devide(Complex b) {
            return new Complex((real * b.real + imaginary * b.imaginary) / (b.real * b.real + b.imaginary * b.imaginary), (imaginary * b.real - real * b.imaginary) / (b.real * b.real + b.imaginary * b.imaginary));
        }

        public String display() {
           return String.format("%f+%fi", real, imaginary);
        }
    }
    public static void main(String[] args){
        Complex a = new Complex(1,2), b = new Complex(3,4);
        Complex sum = a.add(b);
        Complex delta = a.minus(b);
        Complex prodect = a.times(b);
        Complex quetient = a.devide(b);
        System.out.printf("a:%s\t b:%s\nsum: %s\ndelta: %s\nprodect: %s\nquetient: %s\n",
                a.display(),b.display(),sum.display(), delta.display(), prodect.display(), quetient.display());
    }
}
