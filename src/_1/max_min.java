package _1; /** * Created by 28013 on 2016/9/5 0005. */import java.math.*;import java.util.Scanner;import java.util.Vector;public class max_min {    static public void main(String[] args) {        int n;        Scanner scanner = new Scanner(System.in);        Vector<Integer> v = new Vector<>();        while (scanner.hasNextInt())            v.add(scanner.nextInt());        int max, min;        max = min = v.get(1);        for (int i : v                ) {            max = Math.max(i, max);            min = Math.min(i, min);        }        System.out.println(String.format("Max in this array is %d, min in this array is %d.", max, min));    }}