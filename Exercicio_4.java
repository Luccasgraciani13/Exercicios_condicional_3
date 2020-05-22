import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {

		
		try (Scanner leitor = new Scanner ( System.in)) {
			int v, h, p;
			
			System.out.println( " Escreva o valor dos lados do seu triângulo:" );
			v = leitor.nextInt ();
			h = leitor.nextInt ();
			p = leitor.nextInt ();
			
			if (v == h && h == p)
				System.out.println ( " Seu triângulo é equilátero. " );
			
			if (v == h && h != p)
				System.out.println ( " Seu triângulo é isósceles. " );
			
			if (v != h && h != p && v != p)
				System.out.println ( " Seu triângulo é escaleno. " );
		}
		
		

		
		
	
		
		

	}

}
