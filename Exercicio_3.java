import java.util.Scanner;
public class Exercicio_3 {

	public static void main(String[] args) {
		
		try (Scanner leitor = new Scanner ( System.in )) {
			float salario;
			
			System.out.println ( " Digite o seu salário: " );
			salario = leitor.nextFloat ();
			
			if (salario >  0  && salario <= 1000 )
			System.out.println ( " Seu salário terá o aumento de 15% , " + (salario + (salario / 100 * 15 )));	
			
			if (salario >  1000.01  && salario <= 2500 )
				System.out.println ( " Seu salário terá o aumento de 7% , " + (salario + (salario / 100 * 7 )));
			
			else {
		    System.out.println ( " Seu salário não teve aumento. " );	
		
		
		
		}


		}
		
		
		
	
	}		
		
		

	}

