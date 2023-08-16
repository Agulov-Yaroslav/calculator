package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static String fail = "Введите один из прелдоженных символов: \n '+', '-', '*', '/'";

	public static void main(String[] arr) {
		System.out.println("Введите первое число: ");
		double a = valid();
		System.out.println("Введите второе число: ");
		double b = valid();
		System.out.println(fail);
		System.out.println(result(a, b));
		scanner.close();

	}

	public static double valid() {
		double num = 0;
		boolean loop = true;
		while (loop) {
			try {
				num = scanner.nextDouble();
				loop = false;
			} catch (InputMismatchException e) {
				System.out.println("Введите число! ");
				scanner.next();
			}
		}

		return num;

	}

	public static String result(double a, double b) {
		boolean loop = true;
		String result = null;
		double c = 0;
		while (loop) {
			String user = scanner.next();
			if (user.length() == 1) {
				switch (user) {
				case "+":
					c = a + b;
					result = a + " + " + b + " = " + c;
					loop = false;
					break;
				case "-":
					c = a - b;
					result = a + " - " + b + " = " + c;
					loop = false;
					break;
				case "*":
					c = a * b;
					result = a + " * " + b + " = " + c;
					loop = false;
					break;
				case "/":
					if (b == 0) {
						result = "Ошибка деления на 0";
						return result;
					}
					c = a / b;
					result = a + " / " + b + " = " + c;
					loop = false;
					break;
				default:
					System.out.println(fail);
					
				}

			} else {
				System.out.println(fail);
			}
		}

		return result;
	}

}
