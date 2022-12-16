package atividade1612;

import javax.swing.JOptionPane;

public class ex1 {	
	
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int valor;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
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
				JOptionPane.showMessageDialog(null, arr[0][0] +" | " +arr[0][1] +" | " +arr[0][2] +" | " +arr[0][3] +" | " +arr[0][4] +"\n----------------\n"
						 +arr[1][0] +" | " +arr[1][1] +" | " +arr[1][2] +" | " +arr[1][3] +" | " +arr[1][4] +"\n----------------\n"
						 +arr[2][0] +" | " +arr[2][1] +" | " +arr[2][2] +" | " +arr[2][3] +" | " +arr[2][4] +"\n----------------\n"
						 +arr[3][0] +" | " +arr[3][1] +" | " +arr[3][2] +" | " +arr[3][3] +" | " +arr[3][4] +"\n----------------\n"
						 +arr[4][0] +" | " +arr[4][1] +" | " +arr[4][2] +" | " +arr[4][3] +" | " +arr[4][4]);
				
			
	}
}
