package atividades0911;

import java.util.ArrayList;
import java.util.Scanner;

public class ex1c {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	ArrayList<Double> salarios = new ArrayList<Double>();
	ArrayList<Double> salariosR = new ArrayList<Double>();
	double reajuste, reajustez;
	
	for(double salario=0.0; salario!=-1; salario=salario) {
		System.out.println("Digite o salário: ");
		salario = ler.nextDouble();
		if(salario>-1) {
		salarios.add(salario);
		}
	}
	System.out.println("Digite o valor do reajuste em %: ");
	reajuste = ler.nextDouble();

	
	for(int j=0; j<salarios.size(); j++) {
		reajustez = salarios.get(j)*((reajuste/100)+1);
		salariosR.add(reajustez);
	}
	System.out.println(salariosR.toString());
	}
	}
