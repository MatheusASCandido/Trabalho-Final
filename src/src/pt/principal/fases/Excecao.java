package pt.principal.fases;


import pt.principal.*;
//Projeto Defenda-se da Invas�o
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva C�ndido - RA 241640
* Disciplina MC 322 - Programa��o Orientada a Objetos
* Professor Andr� Santanche
*/
public class Excecao extends Exception {

	private static final long serialVersionUID = -1536643558414006369L;
	boolean xCorreto = false;
	boolean yCorreto = false;
	Tabuleiro f;
	public String stringX,stringY;
	public Excecao(Tabuleiro f){
		this.f=f;
	  
	}
	public void verificarPosicao(String x,String y) {
		
		ExcecaoX t = new ExcecaoX(f);
		t.verificarPosicao(x);
		
				
		ExcecaoY v = new ExcecaoY(f);
		v.verificarPosicao(y);
		
	}
}
