package _1;

import java.util.Scanner;

/**
 * Created by 28013 on 2016/9/6 0006.
 */
public class StringDivide {

    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] result = str.split("\\W");
        for (String item : result
                ) {
            System.out.println(item);
        }
    }
}
