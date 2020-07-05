package pt.principal;

import javax.swing.JButton;
//Projeto Defenda-se da Invasão
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva Cândido - RA 241640
* Disciplina MC 322 - Programação Orientada a Objetos
* Professor André Santanche
*/
public interface ITabuleiro{
	
	public void criarTab();
	public void fazerTab(int arvores, int pedras, int lagos, int r, int tempo);
	public void addFundo();
	public void entrar(int l, int posicaoY,char t);
	public void executar();
	public boolean procurarMonstro();
	public void adicionaPeca(Pecas img, int posicao);
	public void removerPeca(int posicao);
	public void adicionaComando (JButton comando);
}
