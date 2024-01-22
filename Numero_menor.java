import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 3 números ");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();

		if (numero1 <= numero2 && numero1 <= numero3) {
			System.out.println("O número menor é " + numero1);
		} else {
			if (numero2 <= numero3) {
				System.out.println("O número menor é " + numero2);
			}

			else {
				System.out.println("O número menor é " + numero3);
			}
		}
		sc.close();
	}
}
