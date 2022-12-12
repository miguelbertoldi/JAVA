package velha;

import java.util.Scanner;

public class jvelha {
	static Scanner ler = new Scanner(System.in);
	static char[][] jogo = new char[3][3];
	static int vez=1;
	
	public static void main(String[] args) {
		boolean teste;
		int vencedor=3;
		for(int i=0; i<9; i++) {
			 teste = jogadas();
			 if(!teste) {
				 i--;
			 }
			 mostrarTabela();
			 vencedor = verificacaoVencedor();
			 if(vencedor!=3) {
				i=9;
				if(vencedor==1) {
					 System.out.println("\n\nJogador 1 venceu!");
				 }else{
					 System.out.println("\n\nJogador 2 venceu!");
				 }
			 }
		}
		if(vencedor==3) {
			System.out.println("\n\nEmpate!");
		}
		
		
	}
	static boolean jogadas() {
		boolean teste = false;
		int jogadaC, jogadaL;
		
		System.out.println("\n\nDigite a linha - Jogador " +vez);
		jogadaL = ler.nextInt();
		System.out.println("\nDigite a coluna - Jogador " +vez);
		jogadaC = ler.nextInt();
		
		if(jogadaC<3 & jogadaC>=0 & jogadaL<3 & jogadaL>=0) {
			if(jogo[jogadaL][jogadaC]!='X' & jogo[jogadaL][jogadaC]!='O') {
				
			if(vez==1) {					
				jogo[jogadaL][jogadaC] = 'X';
				vez=2;
			}else {
				jogo[jogadaL][jogadaC] = 'O';
				vez=1;
			}
			teste=true;
			}else {
				System.out.println("Jogada inválida! Jogue novamente!");
				teste=false;
				
			}
		}else {
			System.out.println("Jogada inválida! Jogue novamente!");
			teste=false;
		}
		return teste;
	}

	static void gerarTabela() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				jogo[i][j] = '-';
			}
		}
	}
	static void mostrarTabela() {
		
		for(int i=0; i<3; i++) {
			if(i>0) {			
				System.out.printf("\n--------- \n");
				}
			for(int j=0; j<3; j++) {
				if(j<2) {					
				System.out.printf(jogo[i][j] +" | ");
				}else {
					System.out.printf(jogo[i][j] + " ");
				}
			}
		}
	}
	static int verificacaoVencedor() {
		int vencedor=3;
		if(jogo[0][0]=='X' & jogo[0][1]=='X' & jogo[0][2]=='X' | jogo[1][0]=='X' & jogo[1][1]=='X' & jogo[1][2]=='X' | jogo[2][0]=='X' & jogo[2][1]=='X' & jogo[2][2]=='X') {
			vencedor=1;
		}else if(jogo[0][0]=='O' & jogo[0][1]=='O' & jogo[0][2]=='O' | jogo[1][0]=='O' & jogo[1][1]=='O' & jogo[1][2]=='O' | jogo[2][0]=='O' & jogo[2][1]=='O' & jogo[2][2]=='O') {
			vencedor=2;
		}else if(jogo[0][0]=='X' & jogo[1][0]=='X' & jogo[2][0]=='X' | jogo[0][1]=='X' & jogo[1][1]=='X' & jogo[2][1]=='X' | jogo[0][2]=='X' & jogo[1][2]=='X' & jogo[2][2]=='X') {
			vencedor=1;
		}else if(jogo[0][0]=='O' & jogo[1][0]=='O' & jogo[2][0]=='O' | jogo[0][1]=='O' & jogo[1][1]=='O' & jogo[2][1]=='O' | jogo[0][2]=='O' & jogo[1][2]=='O' & jogo[2][2]=='O') {
			vencedor=2;
		}else if(jogo[0][0]==jogo[1][1] & jogo[0][0]==jogo[2][2] | jogo[2][0]==jogo[1][1] & jogo[2][0]==jogo[0][2]) {
			if(jogo[1][1]=='X') {
				vencedor=1;
			}else if(jogo[1][1]=='O'){
				vencedor=2;
			}
		}
		
		else {	
		vencedor=3;
		}
		return vencedor;
	}
}
