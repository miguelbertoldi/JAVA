package atividades0711;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor, xMaior=0, xMenor=0, xIgual=0;
		int[] numeros = new int[9];
		int[] nMaior = new int[9];
		
		System.out.println("Digite o valor de referência: ");
		valor = ler.nextInt();
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Digite um valor: ");
			numeros[i] = ler.nextInt();
			
			if(numeros[i]>valor) {
				xMaior++;
				nMaior[i] = numeros[i];
			}else if(numeros[i]<valor) {
				xMenor++;
			}else if(numeros[i]==valor) {
				xIgual++;
			}
		}
		
		System.out.println("Maiores que o valor de ref.: ");
		for(int g=0; g<numeros.length; g++) {
			if(nMaior[g]!=0) {
		 System.out.printf(+nMaior[g] +", ");
		}}
		System.out.println("\nQuantidade de n°s menores que o valor de ref.: " +xMenor);
		System.out.println("Quantidade de vezes que o valor de ref. apareceu: " +xIgual);
	}

}
