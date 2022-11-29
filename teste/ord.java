package teste;

import java.util.Random;
public class ord {

	static Random rn = new Random();
	static int[] arr = new int[10];
	static int aux;

	public static void main(String[] args) {
		ordenar();
	}
	
	static void ordenar() {
		for(int i=0; i<arr.length; i++) {
			arr[i] = rn.nextInt(100);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.printf(arr[i] +", ");
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
		System.out.println("\n\n");
		for(int i=0; i<arr.length; i++) {
			System.out.printf(arr[i] +", ");
		}
	}

}
