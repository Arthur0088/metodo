package faculdade;

import java.util.Scanner;

public class ex_metodo3 {
	
	public static boolean media() {
		
	Scanner leitor=new Scanner(System.in);
	 
	float a,b,c,d,media;
	
	
	System.out.println("digite a primeira nota");
	a=leitor.nextFloat();
	System.out.println("digite a segunda nota");
	b=leitor.nextFloat();
	System.out.println("digite a terceira nota");
	c=leitor.nextFloat();
	System.out.println("digite a quarta nota");
	d=leitor.nextFloat();
	System.out.println();
	
	media=(a+b+c+d)/4;
	
	System.out.printf("a media é:%.1f\n", media);
	
	if(media>=7.0) {
		System.out.println("aprovado");
		return true;
	}
	else if(media<7.0) {
		System.out.println("reprovado");
		
	}
	return false;
	}
	public static void main(String[] args) {
	
		media();
		

	}

}
