package _1;/** * Created by 28013 on 2016/9/5 0005. */public class prime_number {    public static void main(String[] args) {        boolean[] is_prime = new boolean[101];        for (int i = 0; i < is_prime.length; i++)            is_prime[i] = true;        is_prime[1] = is_prime[0] = false;        for (int i = 2; i < is_prime.length; i++)            if (is_prime[i])                for (int j = 2, k = i * j; k < is_prime.length; j++, k = i * j)                    is_prime[k] = false;        for (int i = 0, j = 0; i < is_prime.length; i++) {            if (is_prime[i]) {                System.out.print(String.format("%d ", i));                ++j;            }            if (j == 5) {                System.out.println();                j = 0;            }        }    }}