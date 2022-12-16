package atividade1612;

import java.util.Scanner;

public class ex2 {	
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] arr = new int[5][5];
		int valor;
		
		System.out.println("Digite um valor: ");
		valor = ler.nextInt();
		saida(arr, valor);
		
	}
	
	static void saida(int[][] arr, int valor) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==0 & j==0 | i==0 & j==4 | i==4 & j==0 | i==4 & j==4 | i==2 & j==2) {
					arr[i][j]=valor;
				}
			}
		}
		for(int i=0; i<5; i++) {
			System.out.printf("\n", null);
			for(int j=0; j<5; j++) {
				System.out.printf(arr[i][j] +" ", null);
			}
		}
				
			
	}
}