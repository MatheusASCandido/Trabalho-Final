package pt.principal.fases;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import pt.principal.*;
//Projeto Defenda-se da Invas�o
/* Autorores:
* Pedro Hori Bueno - RA 223402
* Matheus Augusto da Silva C�ndido - RA 241640
* Disciplina MC 322 - Programa��o Orientada a Objetos
* Professor Andr� Santanche
*/
public class VoceVenceu extends JFrame implements IJanela{

	private static final long serialVersionUID = -1198451553242123550L;
	
	private JPanel centro;
	public JButton acabou;
	public VoceVenceu() {
		
		super("Defenda-se da Invas�o");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		janelaVisual();
	}
	
	public void janelaVisual() {
		setSize(1010,740);
		setResizable(false);
		Container painelPrincipal = getContentPane();
		painelPrincipal.setLayout(new BorderLayout());
		
	
		centro = new Fundo("venceu");
		centro.setLayout(null);
		
		
		
		painelPrincipal.add(centro,BorderLayout.CENTER);
		
		Icon bot = new ImageIcon("src//assets//menub.png");
		acabou = new JButton(bot);
		acabou.setBounds(425, 500, 150, 75);
		adicionaComando(acabou);
		
		
		
		setVisible(true);
			
	}
	
	public void finalizar() {
		acabou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	dispose();
        		Menu menu = new Menu();
        		menu.iniciarMenu();
            		
            }
        });
	}
	
	public void adicionaComando (JButton comando) {
		centro.add(comando);
		SwingUtilities.updateComponentTreeUI(this);
		
	}
	
}
