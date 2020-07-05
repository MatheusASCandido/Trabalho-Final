package pt.pecas;
//Projeto Defenda-se da Invasão
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva Cândido - RA 241640
* Disciplina MC 322 - Programação Orientada a Objetos
* Professor André Santanche
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
