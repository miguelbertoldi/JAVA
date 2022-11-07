package nvc;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		double vendasTotal=0, maiorValor=0, menorValor=9999;
		int maiorValorNome=0, menorValorNome=0;
		double[] receber = new double[2];
		Scanner ler = new Scanner(System.in);
		double[] vendas = new double[2];
		double[] comissao = new double[2];
		String[] nomes = new String[2];
		
		for(int vendedor=0; vendedor<=1; vendedor++) {
		System.out.println("Digite o nome do vendedor " +(vendedor+1) +":");
		nomes[vendedor] = ler.next();
		System.out.println("Digite o total de vendas do vendedor " +(vendedor+1) +":");
		vendas[vendedor] = ler.nextDouble();
		System.out.println("Digite a comissão do vendedor " +(vendedor+1) +":");
		comissao[vendedor] = ler.nextDouble();
		
		receber[vendedor]=(vendas[vendedor])*(comissao[vendedor]/100);
		vendasTotal+=vendas[vendedor];
		
		if(receber[vendedor]>maiorValor) {
			maiorValor=receber[vendedor];
			maiorValorNome=vendedor;
		}
		if(receber[vendedor]<menorValor) {
			menorValor=receber[vendedor];
			menorValorNome=vendedor;
		}
		}
		
		for(int escrever=0; escrever<=1; escrever++) {
			System.out.println("\nVendedor: " +nomes[escrever] +"\nTotal de vendas: R$" +vendas[escrever] +"\nValor a receber: R$" +receber[escrever]);
		}
		System.out.println("\nTotal de vendas geral: R$" +vendasTotal
				+ "\nMaior valor a receber: " +maiorValor +"\nVendedor: " +nomes[maiorValorNome]
				+ "\n\nMenor valor a receber: " +menorValor +"\nVendedor: " +nomes[menorValorNome]);
		
		
	}

}
