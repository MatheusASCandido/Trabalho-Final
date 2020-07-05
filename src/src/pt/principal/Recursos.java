package pt.principal;
//Projeto Defenda-se da Invasão
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva Cândido - RA 241640
* Disciplina MC 322 - Programação Orientada a Objetos
* Professor André Santanche
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
