package faculdade;

import java.util.Scanner;

public class ex_metodo4 {

	public static void calculadora() {
		Scanner leitor=new Scanner(System.in);
		 int x,y,opcao;
		 
		 System.out.println("digite o primeiro número");
		 x=leitor.nextInt();
		 System.out.println("digite o segundo número");
		 y=leitor.nextInt();
		 System.out.println();
		 System.out.printf("Escolha uma opção: \n 1-soma \n 2-subtração \n 3-multiplicação \n 4-divisão \n");
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
		System.out.println("operação inválida");
	}
		
	}
	public static void main(String[] args) {
		
		calculadora();

	}

}
