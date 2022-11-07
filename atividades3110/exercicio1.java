package atividades3;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double salarioAtual, salarioNovo, ferias, decimo;
	int mesesTrabalhados;
	
	for(int opcao=0; opcao!=4; opcao=opcao) {
	
	System.out.println("MENU \n1 - Novo salário \n2 - Férias \n3 - Décimo terceiro \n4 - Sair");
	opcao = ler.nextInt();
	if(opcao<4 & opcao>0) {
		
	System.out.println("Digite seu salário: ");
	salarioAtual = ler.nextDouble();
		
	switch(opcao) {
	
	case 1:
		if(salarioAtual<=350) {
			salarioNovo=salarioAtual*1.15;
		}else if(salarioAtual<=600) {
			salarioNovo=salarioAtual*1.1;
		}else {
			salarioNovo=salarioAtual*1.1;
		}
		System.out.println("Novo salário: R$" +salarioNovo);
		break;
		
	case 2:
		ferias=(salarioAtual)+(salarioAtual/3);
		System.out.println("Férias: R$" +ferias);
		break;
		
	case 3:
		System.out.println("Digite a quantidade de meses trabalhados: ");
		mesesTrabalhados = ler.nextInt();
		decimo=(salarioAtual*mesesTrabalhados)/12;
		System.out.println("Décimo terceiro: R$" +decimo);
		break;
	}
	}
	else if(opcao>4 | opcao<0 & opcao!=4){
		System.out.println("Comando inválido!");
	}
	}
	}
}
