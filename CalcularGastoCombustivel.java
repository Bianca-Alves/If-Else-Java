import java.util.Scanner;

public class CalcularGastoCombustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double d, c, g;

		System.out.print("Digite a dist�ncia percorrida: ");
		d = sc.nextDouble();

		System.out.print("Digite a capacidade do tanque de combust�vel: ");
		c = sc.nextDouble();

		g = d / c;

		System.out.println("-------------------------------------------------");
		System.out.println("O gasto m�dio de combust�vel �: " + g + " litros.");

		if (g >= 10) {
			System.out.println("Seu ve�culo � econ�mico.");
		} else {
			System.out.println("Seu ve�culo n�o � econ�mico.");
		}
		sc.close();
	}
}