package teste;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] arr = new int[10];
		int aux;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Digite um número: ");
			arr[i] = ler.nextInt();
		}
		
		for(int j=0; j<arr.length; j++) {
			for(int i=0; i<arr.length-1; i++) {
				if(i<arr.length-1) {								
					aux = arr[i+1];
					if(arr[i] > arr[i+1]) {
						arr[i+1] = arr[i];
						arr[i] = aux;
					}
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.printf(arr[i] +", ");
		}
	}

}
