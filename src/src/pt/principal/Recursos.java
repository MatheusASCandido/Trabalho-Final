package pt.principal;
//Projeto Defenda-se da Invas�o
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva C�ndido - RA 241640
* Disciplina MC 322 - Programa��o Orientada a Objetos
* Professor Andr� Santanche
*/
public class Recursos implements IRecursos{
	public int dinheiro;
	Tabuleiro tab;
	public Recursos(int x,Tabuleiro tab) {
		this.dinheiro = x;
		this.tab=tab;
		
	}
	
	public void alterarRecursos(int operacao, int valor) {
		if(operacao == 1) {
			dinheiro = dinheiro + valor;
		}
		
		if (operacao == 0) {
			dinheiro = dinheiro - valor;
		}
		mostrarRecursos();
	}

	public void mostrarRecursos() {
	     
		String s =Integer.toString(dinheiro);
		tab.label1.setText("Recursos disponivel: " + s);
		tab.label1.updateUI();
	}
}
