package pt.pecas;
//Projeto Defenda-se da Invasão
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva Cândido - RA 241640
* Disciplina MC 322 - Programação Orientada a Objetos
* Professor André Santanche
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
