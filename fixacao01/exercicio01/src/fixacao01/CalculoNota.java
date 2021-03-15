package fixacao01;

import java.lang.String;
import java.util.Scanner;

public class CalculoNota {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String nomeAluno;
		float nota1, nota2, nota3, media;
		System.out.println("Digite seu nome: ");
		nomeAluno = sc.nextLine();
		System.out.println("Digite sua primeira nota: ");
		nota1 = sc.nextFloat();
		System.out.println("Digite sua segunda nota: ");
		nota2 = sc.nextFloat();
		System.out.println("Digite sua terceira nota: ");
		nota3 = sc.nextFloat();
		media = calculaMedia(nota1, nota2, nota3);
		System.out.println(String.format("Nome do aluno: %s", nomeAluno));
		System.out.println(String.format("Media do aluno: %f", media));
		if(media >= 5) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		sc.close();
	}
	
	public static float calculaMedia(float n1, float n2, float n3) {
		return (n1+n2+n3/3);
	}
}
