package pt.pecas;

import pt.principal.*;
//Projeto Defenda-se da Invasão
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva Cândido - RA 241640
* Disciplina MC 322 - Programação Orientada a Objetos
* Professor André Santanche
*/
public class Vazio extends Pecas {

	private static final long serialVersionUID = 1L;
	public Vazio(int z) {
		super("src\\src\\assets\\vaziov.png", z);
		nome = '-';
		tipo = "vazio";
	}


	

	public void interagir(int posicaoX, int posicaoY) {}

	public void mover(int posicaoX, int posicaoY) {}


	
}
