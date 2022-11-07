package nvc;

import java.util.Random;	

public class exercicio3 {
	public static void main(String[] args) {
		Random rn = new Random();
		int temperatura=16, menorTemperatura=999, maiorTemperatura=0, temperaturaTotal=0, media;
		
		for(int i=0; i<=119; i++) {
			
			temperatura = rn.nextInt((40 - 15) + 1) + 15;
			  temperaturaTotal+=temperatura;
				
				if(temperatura>maiorTemperatura) {
					maiorTemperatura=temperatura;
				}
				if(temperatura<menorTemperatura) {
					menorTemperatura=temperatura;
			}
		}
		media=temperaturaTotal/121;
		System.out.println("Média de temperatura: " +media +"°C \nMaior Temperatura: " +maiorTemperatura +"°C\nMenor temperatura: " +menorTemperatura +"°C");
	}

}
