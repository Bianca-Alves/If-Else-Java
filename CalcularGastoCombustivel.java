import java.util.Scanner;

public class CalcularGastoCombustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double d, c, g;

		System.out.print("Digite a distância percorrida: ");
		d = sc.nextDouble();

		System.out.print("Digite a capacidade do tanque de combustível: ");
		c = sc.nextDouble();

		g = d / c;

		System.out.println("-------------------------------------------------");
		System.out.println("O gasto médio de combustível é: " + g + " litros.");

		if (g >= 10) {
			System.out.println("Seu veículo é econômico.");
		} else {
			System.out.println("Seu veículo não é econômico.");
		}
		sc.close();
	}
}