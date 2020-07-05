package pt.principal.fases;

import javax.swing.JOptionPane;

import pt.principal.Tabuleiro;
//Projeto Defenda-se da Invas�o
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva C�ndido - RA 241640
* Disciplina MC 322 - Programa��o Orientada a Objetos
* Professor Andr� Santanche
*/
public class ExcecaoY extends Excecao {
	private static final long serialVersionUID = 367341906488757876L;
	public ExcecaoY(Tabuleiro f) {
		super(f);
		
	}

	public void verificarPosicao(String y) {
		
		while(!yCorreto) {
			 
			try {
				
				f.y = Integer.parseInt(y);
				 yCorreto = true;
				}catch(NumberFormatException erro) {
					y = JOptionPane.showInputDialog("Digite um valor valido para a coordenda y"); 
				}
		}
			
	}

}
