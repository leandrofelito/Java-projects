import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	       
	        Scanner sc = new Scanner(System.in);
	        System.out.printf("Por favor, digite o nome da pessoa 1 e a idade \n");
	  	    String nome1 = sc.next();
	        int idade1 = sc.nextInt();
	        
	        System.out.printf("Agora, digite o nome da pessoa 2 e a idade \n");
	        String nome2 = sc.next();
	        int idade2 = sc.nextInt();
	        
	        double media = (idade1 + idade2)/ 2.0;
	        System.out.printf("A idade média entre %s e %s é de %.1f anos",nome1,nome2,media);
	      
	        sc.close();
	    }
}
