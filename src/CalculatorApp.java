import java.util.Scanner;

public class CalculatorApp {

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Calculator :");
		CalculatorApp obj = new CalculatorApp();
		obj.calculate();
	}

	public void calculate() {
		System.out.println("Enter number 1");
		int num1 = scan.nextInt();

		System.out.println("Enter number 2");
		int num2 = scan.nextInt();

		System.out.println("Enter operand");
		String o = scan.next();

		int ans = 0;
		if (o.equals("+"))
			ans = num1 + num2;

		if (o.equals("-")) {
			ans = (num1 > num2) ? num1 - num2 : num2 - num1;
		}

		if (o.equals("*"))
			ans = num1 * num2;

		if (o.equals("/"))
			ans = num1 / num2;

		if (o.equals("%"))
			ans = num1 % num2;

		System.out.println("Answer is " + ans);

		CalculatorApp obj = new CalculatorApp();
		boolean result = obj.movingForward();
		if (result)
			obj.calculate();
		else {
			System.out.println("ENDS.");
			System.out.println("--------------------------------");
		}
	}

	public boolean movingForward() {
		System.out.println("Do you want to continue? y/n :");
		CalculatorApp obj = new CalculatorApp();
		String moveForward = obj.scan.next();
		boolean result = false;

		if (moveForward.equals("y") || moveForward.equals("Y")) {
			result = true;
			System.out.println("--------------------------------");
		} else if (moveForward.equals("n") || moveForward.equals("N"))
			result = false;
		else {
			System.out.println("Invalid entry, re-enter!!");
			obj.movingForward();
		}

		return result;
	}

}
