package atividades0711;

import java.util.Scanner;
import java.util.Random;

public class exercicio1 {
	public static void main(String[] args) {
	Random nm = new Random(); 
	Scanner ler = new Scanner(System.in);
	int[] A = new int[9];
	int[] B = new int[9];
	int[] C = new int[9];
	
	for(int n=0; n<9; n++) {
		A[n] = nm.nextInt(60); //Números de 0-60
		B[n] = nm.nextInt(60); //Números de 0-60
	}
	
	for(int i=0; i<9; i++) {
		C[i] = A[i] - B[i];
	}
	for(int j=0; j<9; j++) {
		System.out.println("Valor de C" +j +": " +C[j]);
	}
	}
}
