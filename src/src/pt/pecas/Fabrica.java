package pt.pecas;
import pt.principal.*;
//Projeto Defenda-se da Invas�o
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva C�ndido - RA 241640
* Disciplina MC 322 - Programa��o Orientada a Objetos
* Professor Andr� Santanche
*/
public class Fabrica extends Aliadas {

	private static final long serialVersionUID = 1L;

	public Fabrica(Tabuleiro tab,int z) {
		super("src\\assets\\fabrica.png",z);
		custo = 50;
		vida = 3;
		nome = 'f';
		tipo = "Aliadas";
		this.tabu = tab;
	}
	
	

	public void interagir(int posicaoX, int posicaoY) {
		tabu.rec.alterarRecursos(1, 10);
	}

	
}
