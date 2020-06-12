package faculdade;

import java.util.Scanner;

public class ex_metodo2 {
	
	public static int soma() {
		 Scanner leitor=new Scanner(System.in);
		 
		 int x,y,somaT = 0;
		 
		 System.out.println("digite o menor número");
		 x=leitor.nextInt();
		 System.out.println("digite o maior número");
		 y=leitor.nextInt();
		 
		 while(x<=y) {
			 System.out.println(x);
			 
			somaT +=x;
			x++;
			
		 }
		 System.out.println("a soma é: " +somaT);
		 
		 return somaT;
	}
	

	public static void main(String[] args) {
		
		soma();

	}

}
