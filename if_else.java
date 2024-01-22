import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos minutos você consumiu a  mais?  ");
		int minutos = sc.nextInt();
		double conta = 50.0;
		
		
		if(minutos>100) {
			conta=conta+(minutos - 100) * 2.0;
			System.out.printf("Valor a pagar = R$ %.2f", conta);
		}
		else {
			System.out.printf("Valor a pagar é de R$ %.2f", conta);
		}

		
		sc.close();
	}
}