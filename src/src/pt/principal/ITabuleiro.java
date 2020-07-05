package pt.principal;

import javax.swing.JButton;
//Projeto Defenda-se da Invas�o
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva C�ndido - RA 241640
* Disciplina MC 322 - Programa��o Orientada a Objetos
* Professor Andr� Santanche
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
