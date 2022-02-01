import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;

		System.out.print("Digite um número de 1 a 7 para o dia da semana: ");
		num = sc.nextInt();
		System.out.println("-------------------------------------------------");

		if (num == 1) {
			System.out.println("Hoje é domingo.");
		}
		if (num == 2) {
			System.out.println("Hoje é segunda-feira.");
		}
		if (num == 3) {
			System.out.println("Hoje é terça-feira.");
		}
		if (num == 4) {
			System.out.println("Hoje é quarta-feira.");
		}
		if (num == 5) {
			System.out.println("Hoje é quinta-feira.");
		}
		if (num == 6) {
			System.out.println("Hoje é sexta-feira.");
		}
		if (num == 7) {
			System.out.println("Hoje é sábado.");
		}
		if (num < 1 & num > 7) {
			System.out.println("Número incorreto.");
		}
		sc.close();
	}
}