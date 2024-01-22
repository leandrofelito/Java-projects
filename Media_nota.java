import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	       
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Digite a nota do primeiro e logo após do segundo semestre: ");
	        Scanner scanner;
			double nota1 = sc.nextDouble();
	        double nota2 = sc.nextDouble();
	        double soma = nota1+nota2;
	        
	        if(soma<60.0) {
	        	System.out.printf("Sua nota final foi: %.1f \n Você foi reprovado ",soma);
	        } else System.out.printf("Sua nota final foi: %.1f \n Você foi aprovado! ",soma);
	        
	       
	        
	      
	        sc.close();
	    }
}
