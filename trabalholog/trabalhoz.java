package trabalho;

import java.util.Scanner;

public class trabalhoz {
   static String nome;
   static String opcao1Cod1="Bicicleta nova (Cor Azul) | Aro: 26 - Marchas: 18 -> R$999,99", opcao1Cod2="Bicicleta usada (Cor Amarela) | Aro: 26 - Marchas: 18 -> R$400,00", opcao1Cod3="Capacete de proteção -> R$59,99", opcao1Cod4="Freio a disco -> R$89,99";
   static String opcao2Cod1="Troca de pneu -> R$55,99", opcao2Cod2="Lavagem completa -> R$12,99", opcao2Cod3="Lavagem completa -> R$10,99";
   static String nome1;  
   static int contadorMenu=0, respostaMenu, respostaOpcao1, respostaOpcao2, respostaOpcao3, respostaMenuFuncionario;
   static int contadorCompra1=0, contadorCompra2=0, contadorVetOpcao1=0, contadorVetOpcao2=0, voltarOpcao3;
   static int formaDePagamento, contadorItens=0, contadorSaida=0, contadorNome=0, voltarMenuFunc;
   static double valorTotalCarrinho;
   
   static String[] vetOpcao1 = new String[3];
   static String[] vetOpcao2 = new String[2];
   static String[] vetNome = new String[4]; 
   
   static Scanner ler = new Scanner(System.in);
 
   public static void linha(){
       System.out.println("--------------------------------------------\n");
   }
   
   public static void mensagem(){
       linha();
       System.out.println("Bem-Vindo ao autoatendimento da XPTO Bikes \n\t\tDigite seu nome \n");
       linha();
       nome = ler.next();
   }
   
   public static void menu(){
       linha();
       System.out.println("1 - Ver promoções \n2 - Solicitar serviço de manutenção \n3 - Listar carrinho de compras \n4 - Finalizar compra \n5 - Sair \n");
       linha();
       respostaMenu = ler.nextInt();
       
       if(nome!="xptorestrito") {
    	   vetNome[contadorNome]=nome;
       }
   }
   
   public static void menuFuncionario() {
	   
	   linha();
	   System.out.println("1 - Ver clientes do dia \n"
	   		+ "2 - Voltar");
	   respostaMenuFuncionario = ler.nextInt();
	   linha();
	   switch(respostaMenuFuncionario) {
	      
	       case 1:
	    	   for(int contadorVetNome=0; contadorVetNome<5; contadorVetNome++) {
	    		   System.out.println(vetNome[contadorVetNome] +"\n");
	    	   }
	    	   linha();
	    	   voltarMenuFunc = ler.nextInt();
	    	   
	    	   switch(voltarMenuFunc) {
	    	   
	    	   case 1: 
	    		   main(null);
	    		   break;
	    	   }
	    	   break;
	    	   
	       case 2:
	    	   contadorMenu=0;
	    	   main(null);
	    	   break;
	   }
   }
   
   public static void opcao1() {
	   linha();
	   System.out.println("1 - " +opcao1Cod1 +"\n"
	   		+ "2 - " +opcao1Cod2 +"\n"
	   		+ "3 - " +opcao1Cod3 +"\n"
	   		+ "4 - " +opcao1Cod4 +"\n"
	   		+ "5 - Finalizar \n"
	   		+ "6 - Sair");
	   linha();
	   
	   respostaOpcao1 = ler.nextInt();
	   
	   if(contadorItens<3) {
	   switch(respostaOpcao1) {
	   
	   case 1:
		   vetOpcao1[contadorVetOpcao1]=opcao1Cod1;
		   valorTotalCarrinho+=999.99;
		   System.out.println(opcao1Cod1 +" adicionado(a) ao carrinho!");
		   contadorVetOpcao1++;
		   contadorItens++;
		   opcao1();
		   break;
		  
	   case 2:
		   vetOpcao1[contadorVetOpcao1]=opcao1Cod2;
		   valorTotalCarrinho+=400;
		   System.out.println(opcao1Cod2 +" adicionado(a) ao carrinho!");
		   contadorVetOpcao1++;
		   contadorItens++;
		   opcao1();
		   break;
	   
	   case 3:
		   vetOpcao1[contadorVetOpcao1]=opcao1Cod3;
		   valorTotalCarrinho+=59.99;
		   System.out.println(opcao1Cod3 +" adicionado(a) ao carrinho!");
		   contadorVetOpcao1++;
		   contadorItens++;
		   opcao1();
		   break;
		   
	   case 4:
		   vetOpcao1[contadorVetOpcao1]=opcao1Cod4;
		   valorTotalCarrinho+=89.99;
		   System.out.println(opcao1Cod4 +" adicionado(a) ao carrinho!");
		   contadorVetOpcao1++;
		   contadorItens++;
		   opcao1();
		   break;
		   
	   case 5:
		   linha();
		   System.out.println("Serviço finalizado! \nValor total atual: " +valorTotalCarrinho +"\n");
		   linha();
		   main(null);
		   
	   case 6:
		   valorTotalCarrinho=0;
           main(null);
		   }
	   }else {
	   linha();
	   System.out.println("Quantidade limite de itens atingida - Serviço finalizado! \nValor total atual: " +valorTotalCarrinho +"\n");
	   linha();
	   main(null);
	   }}
   
   public static void opcao2() {
	   
	   linha();
	   System.out.println("1 - " +opcao2Cod1
	   		+ "\n2 - " +opcao2Cod2
	   		+ "\n3 - " +opcao2Cod3
	   		+ "\n4 - Finalizar"
	   		+ "\n5 - Sair\n");
	   linha();
	   respostaOpcao2 = ler.nextInt();
	   
	   if(contadorItens<3) {
	   switch(respostaOpcao2) {
	   
	   case 1:
		   vetOpcao2[contadorVetOpcao2]=opcao1Cod1;
		   valorTotalCarrinho+=55.99;
		   System.out.println(opcao2Cod1 +" adicionado(a) ao carrinho!");
		   contadorVetOpcao2++;
		   contadorItens++;
		   opcao2();
		   break;
	   
	   case 2:
		   vetOpcao2[contadorVetOpcao2]=opcao1Cod2;
		   valorTotalCarrinho+=12.99;
		   System.out.println(opcao2Cod2 +" adicionado(a) ao carrinho!");
		   contadorVetOpcao2++;
		   contadorItens++;
		   opcao2();
		   break;
		
	   case 3:
		   vetOpcao2[contadorVetOpcao2]=opcao1Cod3;
		   valorTotalCarrinho+=10.99;
		   System.out.println(opcao2Cod3 +" adicionado(a) ao carrinho!");
		   contadorVetOpcao2++;
		   contadorItens++;
		   opcao2();
		   break;
		   
	   case 4:
		   linha();
		   System.out.println("Serviço finalizado! \nValor total atual: " +valorTotalCarrinho +"\n");
		   linha();
		   main(null);
		   break;
	
	   case 5:
		   valorTotalCarrinho=0;
		   main(null);
	   }
	   }else {
		   linha();
		   System.out.println("Limite de itens atingido - Serviço finalizado! \nValor total atual: " +valorTotalCarrinho +"\n");
		   linha();
		   main(null);
	   }
	   
   }
   
   public static void opcao3() {
	   
	   linha();
	   for(int carrinhoVet1=0; carrinhoVet1<=2; carrinhoVet1++) {
		   if(vetOpcao1[carrinhoVet1]!=null) {
		   System.out.println(vetOpcao1[carrinhoVet1] +"\n");
		   }
	   }
	   for(int carrinhoVet2=0; carrinhoVet2<=1; carrinhoVet2++) {
		   if(vetOpcao2[carrinhoVet2]!=null) {
		   System.out.println(vetOpcao2[carrinhoVet2] +"\n");
		   }
	   }
	   System.out.println("\nValor total: " +valorTotalCarrinho +"\n");
	   linha();
	   voltarOpcao3 = ler.nextInt();
	   
	   switch(voltarOpcao3) {
	   
	   case 1:
		   main(null);
		   break;
	   }
	   
	   
   }
   
   public static void opcao4() {
	   if(valorTotalCarrinho>0) {
		   contadorMenu=0;
		   linha();
		   System.out.println("Digite a forma de pagamento: \n"
		   		+ "1 - Dinheiro \n"
		   		+ "2 - Cartão\n");
		   linha();
		   formaDePagamento = ler.nextInt();
		   
		   contadorSaida=1;
		   
		   if(valorTotalCarrinho>0) {
		
		   if(formaDePagamento==1) {
			   linha();
			   System.out.println("Forma de pagamento selecionada: Dinheiro \n"
			   		+ "Valor total: " +valorTotalCarrinho +"\n"
			   		+ "Valor total com desconto: " +valorTotalCarrinho*0.9);
			   linha();
		   }else if(formaDePagamento==2) {
			   linha();
			   System.out.println("Forma de pagamento selecionada: Cartão \n"
			   		+ "Valor total: " +valorTotalCarrinho +"\n");
			   linha();
		   }
		   else {
			   linha();
			   System.out.println("Nenhum item no carrinho! \n"
			   	+ "Atendimento finalizado!");
			   linha();
		   }}}
}
		 
   public static void opcao5() {
	   
	   contadorSaida=1;
	   contadorMenu=0;
	   linha();
	   System.out.println("Serviço finalizado! \nNenhuma compra efetuada!\n");
	   linha();
	   
   }
   
   public static void main(String[] args){
	   
	   if(contadorMenu==0) {
           mensagem();
           contadorMenu++;
           contadorSaida=0;
       }
	   
	   if(nome=="xptorestrito") {
    	   menuFuncionario();
       }
       else {
       if(contadorSaida==0) {
       menu();
       
       
       switch(respostaMenu) {
       case 1:
    	   opcao1();
    	   break;
    	   
       case 2:
    	   opcao2();
    	   break;
    	   
       case 3:
    	   opcao3();
    	   break;
    	   
       case 4:
    	   opcao4();
    	   break;
       
       case 5:
    	   opcao5();
    	   break;
       }}
       }
   }
   }