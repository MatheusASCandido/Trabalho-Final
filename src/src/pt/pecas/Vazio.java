package pt.pecas;

import pt.principal.*;
//Projeto Defenda-se da Invas�o
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva C�ndido - RA 241640
* Disciplina MC 322 - Programa��o Orientada a Objetos
* Professor Andr� Santanche
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
