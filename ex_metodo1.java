package faculdade;

import java.util.Scanner;

public class ex_metodo1 {

	public static void soma() {
		Scanner leitor=new Scanner(System.in);
		
		int x,y,conta;
	
		System.out.println("digite o primeiro n�mero");
		x=leitor.nextInt();
		System.out.println("digite o segundo n�mero");
		y=leitor.nextInt();
		
		conta=x*y;
		
		System.out.println();
		System.out.println("o resultado �: " +conta);
		
		
	}
	
	public static void main(String[] args) {
		
		soma();

	}

}
