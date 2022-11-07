package atividades0711;

import java.util.Scanner;
import java.util.Random;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] A = new int[6];
		int ant=0;
		int sup=0;
		
		for(int j=0; j<A.length; j++) {
		System.out.println("Digite um número: ");
		A[j] = ler.nextInt();
		}
		
		for(int i=0; i<A.length; i++) {
			if(i<A.length-1) {
				if(A[i]>A[i+1]) {
					ant = A[i];
					sup = A[i+1];
					A[i] = sup;
					A[i+1] = ant;
			}else if(A[i]==A[i+1]) {
				ant = A[i];
				sup = A[i+1];
				A[i] = ant;
				A[i+1] = sup;
			}
		}
		}
		
		for(int escrever=0; escrever<A.length; escrever++) {
			System.out.printf(A[escrever] +", ");
		}
}
}
