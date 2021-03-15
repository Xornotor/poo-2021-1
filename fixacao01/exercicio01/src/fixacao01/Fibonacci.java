public class Fibonacci {
	public static void main(String args[]) {
		int num1 = 0;
		int num2 = 1;
		int tmp = 0;
		System.out.print(String.format("%d %d ", num1, num2));
		while(tmp <= 100) {
			tmp = num1 + num2;
			num1 = num2;
			num2 = tmp;
			System.out.print(String.format("%d ", tmp));
		}
	}
}
