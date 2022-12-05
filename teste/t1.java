package a;

import java.util.Random;

public class t1 {
	public static void main(String[] args) {
		Random rn = new Random();
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = rn.nextInt(100);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.printf(arr[i] +", ");
		}
		
		int aux;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				aux = arr[j+1];
				if(arr[j]>arr[j+1]) {
					arr[j+1]=arr[j];
					arr[j]=aux;
				}
			}
		}
		System.out.println("\n\n\n");
		for(int i=0; i<arr.length; i++) {
			System.out.printf(arr[i] +", ");
		}
	}

}
