package co.grandcircus;

import java.util.Arrays;
import java.util.Scanner;

public class Week1Capstone {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a line to be translated");
		String Str = scan.nextLine();
		Str = Str.toLowerCase();
		String[] split = Str.split(" ");
		System.out.println(Arrays.toString(split));
		String Str1 = split[0];
		System.out.println(Str1);
		boolean overCheck = true;
		System.out.println(newString(split[0]));
		int y = 0;
		String totalString;
		String newSplit;

		while (overCheck) {
			for (int i = 0; i < split.length; i++) {
				Str1 = split[i];

				if (vowelCheck(Str1)) {
				System.out.println(Str.concat("way"));
				

			}
			else {
					System.out.println(constAdd(Str1));

			}
			}
		}
		System.out.println();
//		String Str = "Hey There you guys";
//		String[] Str1 = Str.split(" ");
//		System.out.println(Arrays.toString(Str1));
//		System.out.println(Str1[0].startsWith("a"));
//		System.out.println(Str1[0].indexOf("e"));
//		if (Str1[0].startsWith("H")) {}
	}

	public static boolean vowelCheck(String x) {
		boolean check = true;
		if (x.startsWith("a") || x.startsWith("e") || x.startsWith("i") || x.startsWith("o") || x.startsWith("u")) {
			check = true;
		} else {
			check = false;
		}
		return check;
	}

	public static String constAdd(String x) {
		String b = x;
		String y = null;
		String novo;
		char a;
		int index;
		String sub = "yes";
		char[] c = x.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				sub = x.substring(0, i);
				y = x.substring(i);
				break;
			}
		}
		novo = y.concat(sub).concat("ay");

		return novo;
	}

	public static String newString(String x) {


		return "yes";
	}
}
