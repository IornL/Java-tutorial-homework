package _2_2;

import java.util.Scanner;

/**
 * Created by 28013 on 2016/9/27.
 */
public class Gcd_lcm {
    static class Gcd {
        public static int gcd(int a, int b) {
            if (a < b) {
                int t = a;
                a = b;
                b = t;
            }
            return b == 0 ? a : gcd(b, a % b);
        }
    }

    static class Lcm extends Gcd {
//        public static int gcd(int a, int b) {
//            return a * b / Gcd.gcd(a, b);
//        }

        public static int lcm(int a, int b) {
            return a * b / gcd(a, b);
        }

    }

    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.printf(" lcm(%d, %d) is %d", a, b, Lcm.lcm(a, b));
    }
}
