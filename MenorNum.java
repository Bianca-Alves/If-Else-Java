import java.util.Scanner;

public class MenorNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n1, n2;

		System.out.print("Digite o primeiro n�mero: ");
		n1 = in.nextInt();

		System.out.print("Digite o segundo n�mero: ");
		n2 = in.nextInt();
		System.out.println("------------------------------");

		if (n1 < n2) {
			System.out.print("O menor n�mero digitado �: " + n1);

		} else {
			System.out.print("O menor n�mero digitado �: " + n2);
		}
		in.close();
	}
}