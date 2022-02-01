import java.util.Scanner;

public class FaixaEtaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c;

		System.out.print("Digite o seu ano de nascimento: ");
		a = sc.nextInt();

		System.out.print("Digite o ano atual: ");
		b = sc.nextInt();

		c = b - a;

		System.out.println("-------------------------------------------");

		if (c < 10) {
			System.out.println("Voc� � crian�a, sua idade � de " + c + " anos.");
		}
		if (c >= 10 & c < 18) {
			System.out.println("Voc� � adolescente, sua idade � de " + c + " anos.");
		}
		if (c >= 18 & c < 60) {
			System.out.println("Voc� � adulto, sua idade � de " + c + " anos.");
		}
		if (c >= 60) {
			System.out.println("Voc� � idoso, sua idade � de " + c + " anos.");
		}
		sc.close();
	}
}