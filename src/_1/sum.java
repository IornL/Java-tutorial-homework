package _1;

/**
 * Created by 28013 on 2016/9/22.
 */
public class sum {
    public static void main(String[] args) {
        double s = 0;
        for (int i = 1; i <= 100; i++)
            s += (i % 2 == 1 ? 1 : -1) * 1 / new Double(i);
        System.out.print(s);
    }
}