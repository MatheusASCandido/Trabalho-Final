package pt.principal;


import pt.pecas.*;
//Projeto Defenda-se da Invas�o
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva C�ndido - RA 241640
* Disciplina MC 322 - Programa��o Orientada a Objetos
* Professor Andr� Santanche
*/
public class TabuleiroDois extends Tabuleiro implements ITabuleiroDois{

	public TabuleiroDois(String s) {
		super(s);
		
	}


	private static final long serialVersionUID = 806533332266749533L;

	
	public void entrarDois(int l, int posicaoY) {
		removerPeca(l);
		if(rodada%3==0) {
			tab[posicaoY][9] = new Monstro(this,l);
			adicionaPeca(tab[posicaoY][9],l);
		}
		else if(rodada%3==1) {
			tab[posicaoY][9] = new MonstroRapido(this,l);
			adicionaPeca(tab[posicaoY][9],l);
		}
		else if(rodada%3==2) {
			tab[posicaoY][9] = new MonstroForte(this,l);
			adicionaPeca(tab[posicaoY][9],l);
		}
		
	}

}
