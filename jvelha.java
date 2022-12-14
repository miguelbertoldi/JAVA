import javax.swing.JOptionPane;
public class jvelhaa {
	static char[][] jogo = new char[3][3];
	static int vez=1;
	
	public static void main(String[] args) {
		boolean teste;
		int vencedor=3;
		
		for(int i=0; i<9; i++) {
			 mostrarTabela();
			 teste = jogadas();
			 if(!teste) {
				 i--;
			 }
			 vencedor = verificacaoVencedor();
			 if(vencedor!=3) {
				mostrarTabela();
				i=9;
				if(vencedor==1) {
					 JOptionPane.showMessageDialog(null, "Jogador 1 venceu!");
				 }else{
					 JOptionPane.showMessageDialog(null, "Jogador 2 venceu!");
				 }
			 }
		}
		if(vencedor==3) {
			JOptionPane.showMessageDialog(null, "\n\nEmpate!");
		}
	}
	static boolean jogadas() {
		boolean teste = false;
		int jogadaC, jogadaL;
		
		jogadaL = Integer.parseInt(JOptionPane.showInputDialog("Digite a linha - Jogador " +vez));
		jogadaC = Integer.parseInt(JOptionPane.showInputDialog("Digite a coluna - Jogador " +vez));
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
				JOptionPane.showMessageDialog(null, "Jogada inválida! Tente novamente!");
				teste=false;
			}
		}else {
			JOptionPane.showMessageDialog(null, "Jogada inválida! Tente novamente!");
			teste=false;
		}
		return teste;
	}
	static void mostrarTabela() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(jogo[i][j]=='\0') {
					jogo[i][j] = '-';
				}
			}
		}
		JOptionPane.showMessageDialog(null, jogo[0][0] +"  |  " +jogo[0][1] +"  |  " +jogo[0][2] +"\n------------\n" +jogo[1][0] +"  |  " +jogo[1][1] +"  |  " +jogo[1][2] +"\n------------\n" +jogo[2][0] +"  |  " +jogo[2][1] +"  |  " +jogo[2][2]);
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
