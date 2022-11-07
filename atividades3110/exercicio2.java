package atividades3;

import java.util.Random;
import java.util.Scanner;

public class exercicio2 {

public static void main(String[] args) {
    Random numero = new Random(); 
    Scanner ler = new Scanner(System.in);
    
    int jogador1=0, computador=0, contadorJogador=0, contadorPC=0;
    String jogador11="", computador2="";
    
    for(int contador=1; contador<=3; contador++) {
    System.out.println("Escolha: \n0 - Pedra \n1 - Papel \n2 - Tesoura");
    jogador1 = ler.nextInt();
    
    if(jogador1<=2) {
    computador = numero.nextInt(3);
    
    
    if(jogador1==0) {
    	jogador11="Jogador - Pedra";
    }else if(jogador1==1) {
    	jogador11="Jogador - Papel";
    }else if(jogador1==2){
    	jogador11="Jogador - Tesoura";
    }
    
    if(computador==0) {
    	computador2="Pedra - Computador";
    }else if(computador==1) {
    	computador2="Papel - Computador";
    }else if(computador==2){
    	computador2="Tesoura - Computador";
    }
    
    if(computador==0 & jogador1==1) {
    	System.out.println(jogador11 +" x " +computador2 +" | Jogador venceu! ");
    	contadorJogador++;
    }
    else if(computador==0 & jogador1==2) {
    	System.out.println(jogador11 +" x " +computador2 +" | Computador venceu! ");
    	contadorPC++;
    }
    else if(computador==0 & jogador1==0) {
    	System.out.println(jogador11 +" x " +computador2 +" | Empate ");
    	contador--;
    }
    else if(computador==1 & jogador1==0) {
    	System.out.println(jogador11 +" x " +computador2 +" | Computador venceu! ");
    	contadorPC++;
    	
    }
    else if(computador==1 & jogador1==1) {
    	System.out.println(jogador11 +" x " +computador2 +" | Empate ");
    	contador--;
    }
    else if(computador==1 & jogador1==2) {
    	System.out.println(jogador11 +" x " +computador2 +" | Jogador venceu! ");
    	contadorJogador++;
    }
    else if(computador==2 & jogador1==0) {
    	System.out.println(jogador11 +" x " +computador2 +" | Jogador venceu! ");
    	contadorJogador++;
    }
    else if(computador==2 & jogador1==1) {
    	System.out.println(jogador11 +" x " +computador2 +" | Computador venceu! ");
    	contadorPC++;
    	
    }
    else if(computador==2 & jogador1==2) {
    	System.out.println(jogador11 +" x " +computador2 +" | Empate ");
    	contador--;
    }
    else if(jogador1==0 & computador==1) {
    	System.out.println(jogador11 +" x " +computador2 +" | Computador venceu! ");
    	contadorPC++;
    }
    else if(jogador1==0 & computador==2) {
    	System.out.println(jogador11 +" x " +computador2 +" | Jogador venceu! ");
    	contadorJogador++;
    }
    else if(jogador1==0 & computador==0) {
    	System.out.println(jogador11 +" x " +computador2 +" | Empate ");
    	contador--;
    }
    else if(jogador1==1 & computador==0) {
    	System.out.println(jogador11 +" x " +computador2 +" | Jogador venceu! ");
    	contadorJogador++;
    }
    else if(jogador1==1 & computador==1) {
    	System.out.println(jogador11 +" x " +computador2 +" | Empate ");
    	contador--;
    }
    else if(jogador1==1 & computador==2) {
    	System.out.println(jogador11 +" x " +computador2 +" | Computador venceu! ");
    	contadorPC++;
    }
    else if(jogador1==2 & computador==0) {
    	System.out.println(jogador11 +" x " +computador2 +" | Computador venceu! ");
    	contadorPC++;
    }
    else if(jogador1==2 & computador==1) {
    	System.out.println(jogador11 +" x " +computador2 +" | Jogador venceu! ");
    	contadorJogador++;
    }
    else if(jogador1==2 & computador==2) {
    	System.out.println(jogador11 +" x " +computador2 +" | Empate ");
    	contador--;
    	
    }
    }else {
    	System.out.println("Código inválido!");
    	contador--;
    }
	}
    System.out.println("Placar final: \nJogador: " +contadorJogador +" x " +contadorPC +" Computador");
	}
}
