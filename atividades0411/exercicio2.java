package nvc;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] numerosPares = new int[6];
		int[] numerosImpares = new int[6];
		int numero, contadorPares=0, contadorImpares=0;
		
		for(int contador=0; contador<=5; contador++) {
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			
			if(numero%2==0) {
				contadorPares++;
				numerosPares[contador] = numero;
			}
			else {
				contadorImpares++;
				numerosImpares[contador] = numero;
			}
		}
		
		System.out.println("\nQuantidade de números pares: " +contadorPares +"\nNúmeros: " );
		for(int escrever1=0; escrever1<=5; escrever1++) {
			if(numerosPares[escrever1]!=0) {
			System.out.println(numerosPares[escrever1]);
			}
		}
		System.out.println("\nQuantidade de números ímpares: " +contadorImpares +"\nNúmeros ímpares: ");
		for(int escrever2=0; escrever2<=5; escrever2++) {
			if(numerosImpares[escrever2]!=0) {
			System.out.println(numerosImpares[escrever2]);
			}
		}
	}

}
