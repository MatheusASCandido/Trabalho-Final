package pt.principal;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//Projeto Defenda-se da Invasão
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva Cândido - RA 241640
* Disciplina MC 322 - Programação Orientada a Objetos
* Professor André Santanche
*/
public abstract class Pecas extends JLabel implements IPecas{

	private static final long serialVersionUID = 1L;
	
	public String tipo;
	public char nome; 
	public int posicaoX;
	public int posicaoY;
	public int vida;
	public Tabuleiro tabu;
	public Recursos dinheiro;
	public int pos;//posicao no grid
	
	public Pecas(String s,int z) {
		super(new ImageIcon(s));
		this.pos = z; 
	}
	
	
	
	

	public abstract void interagir(int posicaoX, int posicaoY);

	public abstract void mover(int posicaoX, int posicaoY);
	
}
