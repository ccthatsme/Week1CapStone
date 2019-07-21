package co.grandcircus;

import java.util.Scanner;

public class WeekOneCapstone {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Pig Latin Translator!");
		boolean check = true;
		while (check) {
			System.out.println("Enter a line to be translated: ");
			String input = scan.nextLine();
			input = input.toLowerCase();
			String Total = "";
			String[] split = input.split(" ");
			String Str1 = " ";
		for (int i = 0; i < split.length; i++) {
			Str1 = split[i];
			if (vowelCheck(Str1)) {
				Str1 = Str1.concat("way");
				Total = Total + Str1 + " ";
			}
			else {
				Total = Total + constAdd(Str1) + " ";

			}
		}
			System.out.println(Total);
			boolean check2 = true;
			System.out.println("Translate another Line? (y/n)");
			String ask = scan.nextLine();
			while (check2) {
			if (ask.equalsIgnoreCase("y")) {
					check2 = false;
				check = true;
			} else if (ask.equalsIgnoreCase("n")) {
					check2 = false;
				check = false;
			} else {
				System.out.println("Invalid, enter again y/n again: ");
				ask = scan.nextLine();
			}
			}
		}
		System.out.println("Thanks for playing!");
		scan.close();
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
		String y = null;
		String novo;
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

}
