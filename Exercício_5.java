import java.util.Scanner;

public class Exerc�cio_5 {

	public static void main(String[] args) {
		
		try (Scanner leitor = new Scanner ( System.in)) {
			float x, y, z, c, m;
			int mat;
			
			System.out.println ( " Digite a sua matr�cula: " );
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
			
			System.out.println ( " Sua m�dia � " + m);
			
			if(m >= 7 );
			   
			System.out.println ( " Aluno referente � matr�cula " + mat + " foi aprovado " );
			if (m >=  3.5 &&  m <= 7.0 );
				
				System.out.println ( " Aluno referente � matr�cula " + mat + " est� de recupera��o. " );
			if (m <= 3.5 );
				
			
			System.out.println ( " Aluno referente � matr�cula " + mat + " foi reprovado "  );
	
		}
		
		
	}


}