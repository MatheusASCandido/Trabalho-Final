package pt.principal;

import pt.pecas.*;
//Projeto Defenda-se da Invas�o
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva C�ndido - RA 241640
* Disciplina MC 322 - Programa��o Orientada a Objetos
* Professor Andr� Santanche
*/
public class TabuleiroTres extends TabuleiroDois implements ITabuleiroTres {
	private static final long serialVersionUID = -7219738107775451885L;
	public TabuleiroTres(String s) {
		super(s);
		
	}

	
	

	
	public void entrarTres(int l, int posicaoY) {
		removerPeca(l);
		if(rodada%5==0) {
			tab[posicaoY][9] = new MonstroChefao(this,l);
			adicionaPeca(tab[posicaoY][9],l);
		}
		else if(rodada%5==1) {
			
			tab[posicaoY][9] = new Monstro(this,l);
			adicionaPeca(tab[posicaoY][9],l);
		}
		else if(rodada%5==2) {
			
			tab[posicaoY][9] = new MonstroRapido(this,l);
			adicionaPeca(tab[posicaoY][9],l);
		}
		else if(rodada%5==3) {
			
			tab[posicaoY][9] = new MonstroForte(this,l);
			adicionaPeca(tab[posicaoY][9],l);
		}
		else if(rodada%5==4) {
			tab[posicaoY][9] = new MonstroLadrao(this,l);
			adicionaPeca(tab[posicaoY][9],l);
			
			
		}
		
	}

}
