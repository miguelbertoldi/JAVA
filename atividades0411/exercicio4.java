package nvc;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tamanho, id, escreverNome=0;
		String nome;
		
		System.out.println("Defina o tamanho do vetor: ");
		tamanho = ler.nextInt();
		
		String[] nomes = new String[tamanho];
		
		for(int opcao=4; opcao!=0; opcao=opcao) {
		System.out.println("-----MENU-----");
		System.out.println("1. Cadastrar nome");
		System.out.println("2. Pesquisar nome");
		System.out.println("3. Listar todos os nomes");
		System.out.println("0. Sair");
		System.out.println("--------------");
		opcao = ler.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				nome = ler.next();
				nomes[escreverNome] = nome;	
				escreverNome++;
				break;
			case 2:
				System.out.println("Digite o ID do nome: ");
				id = ler.nextInt();
				if(id>tamanho) {
					System.out.println("Tamanho inválido!");
				}else {
				System.out.println(nomes[id]);
				}
				break;
			case 3:
				for(int contador=0; contador<tamanho; contador++) {
				System.out.println(nomes[contador]);
				}
				break;	
		}
		}
	}
}
