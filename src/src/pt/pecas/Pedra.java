package pt.pecas;
//Projeto Defenda-se da Invas�o
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva C�ndido - RA 241640
* Disciplina MC 322 - Programa��o Orientada a Objetos
* Professor Andr� Santanche
*/
public class Pedra extends Neutras {

	private static final long serialVersionUID = 1L;

	public Pedra(int z) {
		super("src\\src\\assets\\pedra.png",z);
		vida = 3;
		nome = 'p';
		tipo = "Neutras";
	}
	
}
