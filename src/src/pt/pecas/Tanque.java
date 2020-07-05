package pt.pecas;
import pt.principal.*;
//Projeto Defenda-se da Invas�o
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva C�ndido - RA 241640
* Disciplina MC 322 - Programa��o Orientada a Objetos
* Professor Andr� Santanche
*/
public class Tanque extends Aliadas{
	
	private static final long serialVersionUID = 1L;

	public Tanque(Tabuleiro tab,int z) {
		super("src\\src\\assets\\tanque.png",z);
		custo = 200;
		vida = 3;
		nome = 't';
		tipo = "Aliadas";
		this.tabu = tab;
	}

	public void atirar(int posicaoX, int posicaoY, int dano) {
		super.atirar(posicaoX, posicaoY, dano);
	}
	public void interagir(int posicaoX, int posicaoY) {
		if(posicaoX == 0 && posicaoY == 0) {
			if (tabu.tab[posicaoY][posicaoX+1].nome == 'g' || tabu.tab[posicaoY+1][posicaoX].nome == 'g' ) {
				atirar(posicaoX, posicaoY, 3);
			}
		}
		else if (posicaoY == 0 && posicaoX == 9) {
			if (tabu.tab[posicaoY+1][posicaoX].nome == 'g' || tabu.tab[posicaoY][posicaoX-1].nome == 'g' ) {
				atirar(posicaoX, posicaoY, 3);
			}
		}
		else if (posicaoY == 5 && posicaoX == 0) {
			if (tabu.tab[posicaoY-1][posicaoX].nome == 'g' || tabu.tab[posicaoY][posicaoX+1].nome == 'g' ) {
				atirar(posicaoX, posicaoY, 3);
			}
		}
		else if (posicaoY == 5 && posicaoX == 9) {
			if (tabu.tab[posicaoY-1][posicaoX].nome == 'g' || tabu.tab[posicaoY][posicaoX-1].nome == 'g' ) {
				atirar(posicaoX, posicaoY, 3);
			}
		}
		else if (posicaoY == 0) {
			if (tabu.tab[posicaoY][posicaoX-1].nome == 'g' || tabu.tab[posicaoY][posicaoX+1].nome == 'g' || tabu.tab[posicaoY+1][posicaoX].nome == 'g') {
				atirar(posicaoX, posicaoY, 3);
			}
		}
		else if (posicaoY == 5) {
			if (tabu.tab[posicaoY][posicaoX-1].nome == 'g' || tabu.tab[posicaoY][posicaoX+1].nome == 'g' || tabu.tab[posicaoY-1][posicaoX].nome == 'g') {
				atirar(posicaoX, posicaoY, 3);
			}
		}
		else if (posicaoX == 0) {
			if (tabu.tab[posicaoY-1][posicaoX].nome == 'g' || tabu.tab[posicaoY][posicaoX+1].nome == 'g' || tabu.tab[posicaoY+1][posicaoX].nome == 'g') {
				atirar(posicaoX, posicaoY, 3);
			}
		}
		else if (posicaoX == 9) {
			if (tabu.tab[posicaoY][posicaoX-1].nome == 'g' || tabu.tab[posicaoY+1][posicaoX].nome == 'g' || tabu.tab[posicaoY-1][posicaoX].nome == 'g') {
				atirar(posicaoX, posicaoY, 3);
			}
		}
		else if (tabu.tab[posicaoY][posicaoX+1].nome == 'g' || tabu.tab[posicaoY+1][posicaoX].nome == 'g' || tabu.tab[posicaoY-1][posicaoX].nome == 'g' || tabu.tab[posicaoY][posicaoX-1].nome == 'g') {
			atirar(posicaoX, posicaoY, 3);
		}
	}
	

	
}
