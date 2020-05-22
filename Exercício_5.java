import java.util.Scanner;

public class Exercício_5 {

	public static void main(String[] args) {
		
		try (Scanner leitor = new Scanner ( System.in)) {
			float x, y, z, c, m;
			int mat;
			
			System.out.println ( " Digite a sua matrícula: " );
			mat = leitor.nextInt ();
			
			System.out.println ( " Digite a sua primeira nota: " );
			x = leitor.nextFloat ();
			
			System.out.println ( " Digite a sua segunda nota: " );
			y = leitor.nextFloat ();
			
			System.out.println ( " Digite a sua terceira nota: " );
			z = leitor.nextFloat ();
			
			System.out.println ( " Digite a sua quarta nota: " );
			c = leitor.nextFloat ();
			m = ((x + y + z + c) / 4 );
			
			System.out.println ( " Sua média é " + m);
			
			if(m >= 7 );
			   
			System.out.println ( " Aluno referente à matrícula " + mat + " foi aprovado " );
			if (m >=  3.5 &&  m <= 7.0 );
				
				System.out.println ( " Aluno referente à matrícula " + mat + " está de recuperação. " );
			if (m <= 3.5 );
				
			
			System.out.println ( " Aluno referente à matrícula " + mat + " foi reprovado "  );
	
		}
		
		
	}


}