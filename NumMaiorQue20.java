import java.util.Scanner;

public class NumMaiorQue20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n;

		System.out.print("Digite um n�mero: ");
		n = in.nextInt();
		System.out.println("-------------------------------------");

		if (n > 20) {
			System.out.print("O n�mero digitado �: " + n);

		} else {
			System.out.print("O n�mero digitado n�o � maior que 20.");
		}
		in.close();
	}
}