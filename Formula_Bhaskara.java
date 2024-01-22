import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	       
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Digite três valores: ");
			double a = sc.nextDouble();
	        double b = sc.nextDouble();
	        double c = sc.nextDouble();
	        double soma = b*b-4.0*a*c;
	        
	        if(a==0 || soma<0.0) {
	        	System.out.printf("Impossível calcular");
	        } else {
	        	double r1 = (-b + Math.sqrt(soma))/(2.0 * a);
	        	double r2 = (-b - Math.sqrt(soma))/(2.0 * a);
	        	
	        	System.out.printf("O valor do R1 é %.5f%n ",r1);
	        	System.out.printf("O valor do R2 é %.5f ",r2);
	        }
	        	
	        	
	        
	       
	        
	       
	        
	      
	        sc.close();
	    }
}
