package _2_1;

import java.util.Scanner;

/**
 * Created by 28013 on 2016/9/26.
 */
public class Root {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("No real root");
        } else {
            System.out.printf("x1 = %f, x2 = %f", (-b + Math.sqrt(delta)) / 2 / a, (-b - Math.sqrt(delta)) / 2 / a);
        }
    }
}
