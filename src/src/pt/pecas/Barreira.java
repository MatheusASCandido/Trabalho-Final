package pt.pecas;
import pt.principal.*;
//Projeto Defenda-se da Invasão
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva Cândido - RA 241640
* Disciplina MC 322 - Programação Orientada a Objetos
* Professor André Santanche
*/
public class Barreira extends Aliadas{

	private static final long serialVersionUID = 1L;
	public Barreira (Tabuleiro tab,int z) {
		super("src\\assets\\barreira.png",z);
		custo = 70;
		vida = 5;
		nome = 'b';
		tipo = "Aliadas";
		this.tabu = tab;
	}
	
	public void interagir(int posicaoX, int posicaoY) {}

	
}
