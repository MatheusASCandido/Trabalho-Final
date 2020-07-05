package pt.pecas;
//Projeto Defenda-se da Invasão
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva Cândido - RA 241640
* Disciplina MC 322 - Programação Orientada a Objetos
* Professor André Santanche
*/
public class Arvore extends Neutras {


	private static final long serialVersionUID = 1L;
	public Arvore(int z) {
		super("src\\src\\assets\\arvore.png",z);
		vida = 2;
		nome = 'a';
		tipo = "Neutras";
	}
}
