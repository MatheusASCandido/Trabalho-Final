package pt.pecas;
//Projeto Defenda-se da Invas�o
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva C�ndido - RA 241640
* Disciplina MC 322 - Programa��o Orientada a Objetos
* Professor Andr� Santanche
*/
public class Lago extends Neutras{
	
	private static final long serialVersionUID = 1L;

	public Lago(int z) {
		super("src\\assets\\lago.png",z);
		vida = 100;
		nome = 'l';
		tipo = "Neutras";
	}
}
