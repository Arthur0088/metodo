package faculdade;

import java.util.Scanner;

public class ex_metodo1 {

	public static void soma() {
		Scanner leitor=new Scanner(System.in);
		
		int x,y,conta;
	
		System.out.println("digite o primeiro número");
		x=leitor.nextInt();
		System.out.println("digite o segundo número");
		y=leitor.nextInt();
		
		conta=x*y;
		
		System.out.println();
		System.out.println("o resultado é: " +conta);
		
		
	}
	
	public static void main(String[] args) {
		
		soma();

	}

}
