package faculdade;

import java.util.Scanner;

public class ex_metodo4 {

	public static void calculadora() {
		Scanner leitor=new Scanner(System.in);
		 int x,y,opcao;
		 
		 System.out.println("digite o primeiro n�mero");
		 x=leitor.nextInt();
		 System.out.println("digite o segundo n�mero");
		 y=leitor.nextInt();
		 System.out.println();
		 System.out.printf("Escolha uma op��o: \n 1-soma \n 2-subtra��o \n 3-multiplica��o \n 4-divis�o \n");
		 opcao=leitor.nextInt();
		 
		 if(opcao==1) {
			 System.out.println(x+y);
		 }
	else if(opcao==2){
			System.out.println(x-y);
	}
	else if( opcao==3) {
		System.out.println(x*y);
	}
	else if(opcao==4) {
		System.out.println(x/y);
	}
	else {
		System.out.println("opera��o inv�lida");
	}
		
	}
	public static void main(String[] args) {
		
		calculadora();

	}

}
