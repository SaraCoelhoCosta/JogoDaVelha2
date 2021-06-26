package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.VisaoFrameDoJogo;
import visao.VisaoJogoDaVelha;
import visao.VisaoTelaInicial;

/*
 * @Author: Sara
 */

// Classe para chamar tela  inicial (panel).
public class ControladorFrame implements ActionListener {

	static VisaoFrameDoJogo framePrincipal = new VisaoFrameDoJogo();
	private VisaoTelaInicial telaInicial;
	private VisaoJogoDaVelha telaJogoDaVelha;
	@SuppressWarnings("unused")
	private ControladorJogoDaVelha controladorJogoDaVelha;
	@SuppressWarnings("unused")
	private ControladorTelaInicial controladorTelaInicial;

	public ControladorFrame() {
		addEvento();

		telaInicial = new VisaoTelaInicial();
		// Ativa funções dos botões da tela inicial.
		controladorTelaInicial = new ControladorTelaInicial(telaInicial);
		framePrincipal.setContentPane(telaInicial); // Chama tela inicial.
		framePrincipal.repaint(); // Recarrega JFrame.
		framePrincipal.validate();
	}

	public void addEvento(){
		framePrincipal.getNovoJogo().addActionListener(this);
		framePrincipal.getVoltar().addActionListener(this);
		framePrincipal.getSair().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evento) {
				
		if (evento.getSource() == framePrincipal.getNovoJogo()) {
			telaJogoDaVelha = new VisaoJogoDaVelha();

			telaJogoDaVelha.getTextFieldNumeroDeEmpates().setText("");
			telaJogoDaVelha.getTextFieldNumeroDePartidas().setText("");
			telaJogoDaVelha.getTextFieldNumerosDeVitorias1().setText("");
			telaJogoDaVelha.getTextFieldNumerosDeVitorias2().setText("");

			controladorJogoDaVelha = new ControladorJogoDaVelha(telaJogoDaVelha);
			framePrincipal.setContentPane(telaJogoDaVelha); // Chama tela do jogo.
			framePrincipal.repaint();
			framePrincipal.validate();
		}
		
		else if (evento.getSource() == framePrincipal.getVoltar()) {
			framePrincipal.setContentPane(telaInicial); // Chama tela inicial.
			framePrincipal.repaint();
			framePrincipal.validate();
		}
		
		else if (evento.getSource() == framePrincipal.getSair()) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new ControladorFrame();
	}
}
