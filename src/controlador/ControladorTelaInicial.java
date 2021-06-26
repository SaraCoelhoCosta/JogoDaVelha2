package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.VisaoJogoDaVelha;
import visao.VisaoTelaInicial;

/*
 * @Author: Sara
 */

// Classe para controlar botões da tela inicial.
public class ControladorTelaInicial implements ActionListener {

	private VisaoTelaInicial telaInicial;
	private VisaoJogoDaVelha telaJogoDaVelha;
	ControladorJogoDaVelha controladorJogoDaVelha;

	// Construtor. Recebe instância da tela inicial e adiciona evento aos botões.
	public ControladorTelaInicial(VisaoTelaInicial telaInicial) {
		this.telaInicial = telaInicial;
		addEventos();
	}

	// Adiciona evento nos botões.
	public void addEventos() {
		telaInicial.getBotaoNovoJogo().addActionListener(this);
		telaInicial.getBotaoSair().addActionListener(this);
	}

	// Ações de cada botão.
	public void actionPerformed(ActionEvent evento) {

		// Abre tela do jogo.
		if (evento.getSource() == telaInicial.getBotaoNovoJogo()) {
			// Solicita nome dos jogadores e substitui texto de label.
			telaJogoDaVelha = new VisaoJogoDaVelha();
	
			// Ativa funcionalidades dos botões.
			controladorJogoDaVelha = new ControladorJogoDaVelha(telaJogoDaVelha);
			ControladorFrame.framePrincipal.setContentPane(telaJogoDaVelha); // Chama tela do jogo.
			ControladorFrame.framePrincipal.repaint(); // Recarrega JFrame.
			ControladorFrame.framePrincipal.validate();
		}

		// Fecha programa.
		else if (evento.getSource() == telaInicial.getBotaoSair()) {
			System.exit(0);
		}
	}
}
