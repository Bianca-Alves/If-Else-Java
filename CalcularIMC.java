import java.util.Scanner;

public class CalcularIMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double p, a, i;

		System.out.print("Digite o seu peso: ");
		p = sc.nextDouble();

		System.out.print("Digite a sua altura: ");
		a = sc.nextDouble();

		i = (a * a) / p;

		System.out.println("------------------------------------");
		System.out.println("O seu IMC é: " + i);

		if (i <= 18.5) {
			System.out.println("Abaixo do peso");
		} else if (18.6 <= i & i <= 24.9) {
			System.out.println("Peso ideal");
		} else if (25.0 <= i & i <= 29.9) {
			System.out.println("Levemente acima do peso");
		} else if (30.0 <= i & i <= 34.9) {
			System.out.println("Obesidade grau I");
		} else if (35.0 <= i & i <= 39.9) {
			System.out.println("Obesidade grau II (severa)");
		} else if (i > 40.0) {
			System.out.println("Obesidade grau III (mórbida)");
		}
		sc.close();
	}
}