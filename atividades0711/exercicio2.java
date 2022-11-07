package atividades0711;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
			Scanner ler= new Scanner(System.in);
			long telefone;
			int x, contadorErro=0;
			String nome;
			
			System.out.println("Quantas pessoas devem ser cadastradas? ");
			x = ler.nextInt();
			
			long[] numeros = new long[x];
			String[] nomes = new String[x];
			
			for(int i=0; i<(x); i++) {
				System.out.println("Digite o nome ");
				nomes[i] = ler.next();
				
				System.out.println("Digite o número de telefone: ");
				numeros[i] = ler.nextInt();
			}
			
			for(int resposta=0; resposta!=2; resposta=resposta) {
			System.out.println("-----MENU-----");
			System.out.println("1. Consultar telefone");
			System.out.println("2. Sair");
			System.out.println("--------------");
			resposta = ler.nextInt();
			
			switch(resposta) {
			
			case 1:
				System.out.println("Digite o nome que deseja consultar: ");
				nome = ler.next();
				
				for(int j=0; j<(x); j++) {
					if (nomes[j].equals(nome)){
						System.out.println("Nome: " +nome +"\nN° de Telefone: " +numeros[j]);
					}else if(!nomes[j].equals(nome)){
						contadorErro++;
					}
				}
				if(contadorErro==x) {
					System.out.println("Número inválido!");
				}
				break;
			}
			}
	}

}
