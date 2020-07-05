package pt.pecas;

import pt.principal.Tabuleiro;
//Projeto Defenda-se da Invas�o
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva C�ndido - RA 241640
* Disciplina MC 322 - Programa��o Orientada a Objetos
* Professor Andr� Santanche
*/
public class MonstroForte extends Inimigas {

	public MonstroForte(Tabuleiro tab, int z) {
		super("src\\src\\assets\\mforte.png", z);
		vida = 5;
		dano = 2;
		nome = 'M';
		tipo = "Inimigas";
		this.tabu = tab;
	}

	private static final long serialVersionUID = 4836415948529238799L;

	
	public void andar(int posicaoX, int posicaoY, int x, int y, int l) {
		tabu.tab[posicaoY+y][posicaoX+x] = new MonstroForte(tabu,tabu.tab[posicaoY+y][posicaoX+x].pos);
		tabu.tab[posicaoY+y][posicaoX+x].vida = tabu.tab[posicaoY][posicaoX].vida;
		tabu.tab[posicaoY][posicaoX] = new Vazio(l);
		
		tabu.removerPeca(l);
		tabu.adicionaPeca(tabu.tab[posicaoY][posicaoX],l);
		
		tabu.removerPeca(tabu.tab[posicaoY+y][posicaoX+x].pos);
		tabu.adicionaPeca(tabu.tab[posicaoY+y][posicaoX+x],tabu.tab[posicaoY+y][posicaoX+x].pos);
	}

	
	public void mover(int posicaoX, int posicaoY) {
		if (posicaoX == 0) {
			tabu.vitoria = false;
		}
		else if (tabu.tab[posicaoY][posicaoX-1].nome == '-') {
			andar(posicaoX, posicaoY, -1, 0,tabu.tab[posicaoY][posicaoX].pos);
		}
		else{
			interagir(posicaoX, posicaoY);
		}
		
	}
	public void interagir(int posicaoX, int posicaoY) {
		super.interagir(posicaoX, posicaoY);
	}

}
