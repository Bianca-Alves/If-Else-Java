import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;

		System.out.print("Digite um n�mero de 1 a 7 para o dia da semana: ");
		num = sc.nextInt();
		System.out.println("-------------------------------------------------");

		if (num == 1) {
			System.out.println("Hoje � domingo.");
		}
		if (num == 2) {
			System.out.println("Hoje � segunda-feira.");
		}
		if (num == 3) {
			System.out.println("Hoje � ter�a-feira.");
		}
		if (num == 4) {
			System.out.println("Hoje � quarta-feira.");
		}
		if (num == 5) {
			System.out.println("Hoje � quinta-feira.");
		}
		if (num == 6) {
			System.out.println("Hoje � sexta-feira.");
		}
		if (num == 7) {
			System.out.println("Hoje � s�bado.");
		}
		if (num < 1 & num > 7) {
			System.out.println("N�mero incorreto.");
		}
		sc.close();
	}
}