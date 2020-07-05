package pt.principal.fases;

import javax.swing.JOptionPane;

import pt.principal.Tabuleiro;
//Projeto Defenda-se da Invasão
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva Cândido - RA 241640
* Disciplina MC 322 - Programação Orientada a Objetos
* Professor André Santanche
*/
public class ExcecaoX extends Excecao{

	private static final long serialVersionUID = 1539779194333517578L;

	public ExcecaoX(Tabuleiro f) {
		super(f);
		 
	}

	public void verificarPosicao(String x) {
		
		while(!xCorreto) {
			  
			  
			 try {
				 
				 f.x = Integer.parseInt(x);
				 
				 
				 xCorreto = true;
				
			 }catch(NumberFormatException erro) {
				
				 x  = JOptionPane.showInputDialog("Digite um valor valido para a coordenda x");
			 }
			
		  }
	}
	

}
