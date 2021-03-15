import java.util.Scanner;

public class Calculadora {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int operacao;
		float num1, num2;
		System.out.println("Favor escolher operacao: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtracao");
		System.out.println("3 - Multiplicacao");
		System.out.println("4 - Divisao");
		operacao = sc.nextInt();
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextFloat();
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextFloat();
		switch(operacao) {
			case 1:
				System.out.println(String.format("Resultado: %f", soma(num1, num2)));
				break;
			case 2:
				System.out.println(String.format("Resultado: %f", sub(num1, num2)));
				break;
			case 3:
				System.out.println(String.format("Resultado: %f", mul(num1, num2)));
				break;
			case 4:
				System.out.println(String.format("Resultado: %f", div(num1, num2)));
				break;
			default:
				System.out.println("Operacao invalida");
				break;
		}
		sc.close();
	}
	
	public static float soma(float num1, float num2) {
		return num1 + num2;
	}
	
	public static float sub(float num1, float num2) {
		return num1 - num2;
	}
	
	public static float mul(float num1, float num2) {
		return num1 * num2;
	}
	
	public static float div(float num1, float num2) {
		return num1 / num2;
	}
}
