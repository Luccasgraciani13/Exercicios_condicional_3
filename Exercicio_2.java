import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
	    int Numero = 0;

	    System.out.println("Digite um numero:");
	    int Numero1 = leitor.nextInt();
	    
	    if(Numero1 >= 5 && Numero1 <= 10)
	    	System.out.println("Infantil");
		
	    if(Numero1 >= 11 && Numero1 <= 17)
	    	System.out.println("Juvenil");
	    
	    if(Numero1 >= 18)
	    	System.out.println("Adulto");
		

		
		
		
		

	}

}
