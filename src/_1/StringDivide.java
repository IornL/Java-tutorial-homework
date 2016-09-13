package _1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 28013 on 2016/9/6 0006.
 */
public class StringDivide {

	public static void main(String[] args){
		int a = 5;
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		Matcher matcher = Pattern.compile("\\w+").matcher(str);
		while (matcher.find())
			System.out.printf("%s ",matcher.group());

	}
}
