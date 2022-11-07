package trabalho;

import java.util.Scanner;

public class variaveis {
	static Scanner ler = new Scanner(System.in);
	static String nomeMunicipio="", m301="", m302="", m303="", m304="", m305="";
	static double temperatura, media, temperaturaTotal=0;
	static int contadorMenor10=0, contadorB, contadorT=0;
	public static void main(String[] args) {
		
		for(int municipio=1; municipio<=5; municipio++) {
        
        if(contadorT==0) {
		System.out.println("Digite o nome do munic�pio: ");
		nomeMunicipio = ler.next();
		contadorT=1;
        }else if(contadorT==1) {
		
		System.out.println("Digite a temperatura m�dia do munic�pio: ");
		temperatura = ler.nextDouble();
		
		temperaturaTotal+=temperatura;
        }
		}
        
		if(temperatura>30 & m301=="") {
			m301=nomeMunicipio;
		}else if(temperatura>30 & m302=="") {
			m302=nomeMunicipio;
		}else if(temperatura>30 & m303=="") {
			m303=nomeMunicipio;
		}else if(temperatura>30 & m304=="") {
			m304=nomeMunicipio;
		}else if(temperatura>30 & m305=="") {
			m305=nomeMunicipio;
		}
		if(temperatura<10) {
			contadorMenor10++;
		}

		media=temperaturaTotal/5;
		
		System.out.println("M�dia de temperatura da regi�o: " +media +"\nCidades com m�dia de temperatura maior que 30�C: " +m301 +
		", " +m302 +", " +m303 +", " +m304 +", " +m305 +"\nQuantidade de cidades com m�dia de temperatura menor que 10�C: " +contadorMenor10);
		
	}
}
