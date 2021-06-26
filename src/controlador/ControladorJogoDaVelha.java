package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import modelo.ModeloJogoDaVelha;
import visao.VisaoJogoDaVelha;
import visao.VisaoTelaInicial;

/*
 * Author: Sara
 */

// Classe para controlar botões do jogo.
public class ControladorJogoDaVelha implements ActionListener {

	private VisaoJogoDaVelha telaJogoDaVelha;
	private VisaoTelaInicial telaInicial = new VisaoTelaInicial();
	private ModeloJogoDaVelha modeloJogoDaVelha;
	private JButton[][] botao = new JButton[3][3];
	ControladorTelaInicial controladorTelaInicial;
	ControladorJogoDaVelha controladorJogoDaVelha;

	/*
	 * Construtor. Recebe uma instância da tela de jogo, adiciona evento aos botões
	 * e gera uma matriz a partir dos botões criados.
	 */
	public ControladorJogoDaVelha(VisaoJogoDaVelha telaJogoDaVelha) {
		// Abre tela do jogo.
		this.telaJogoDaVelha = telaJogoDaVelha;
		this.modeloJogoDaVelha = new ModeloJogoDaVelha();
		// Adiciona o eventos aos botôes.
		addEventos();
		botoes();

	}

	// Adiciona eventos aos botões.
	public void addEventos() {
		telaJogoDaVelha.getBotao1().addActionListener(this);
		telaJogoDaVelha.getBotao2().addActionListener(this);
		telaJogoDaVelha.getBotao3().addActionListener(this);
		telaJogoDaVelha.getBotao4().addActionListener(this);
		telaJogoDaVelha.getBotao5().addActionListener(this);
		telaJogoDaVelha.getBotao6().addActionListener(this);
		telaJogoDaVelha.getBotao7().addActionListener(this);
		telaJogoDaVelha.getBotao8().addActionListener(this);
		telaJogoDaVelha.getBotao9().addActionListener(this);
		ControladorFrame.framePrincipal.getReiniciarPartida().addActionListener(this);
	}

	// Coloca os botões em uma matriz.
	public void botoes() {
		botao[0][0] = telaJogoDaVelha.getBotao1();
		botao[0][1] = telaJogoDaVelha.getBotao2();
		botao[0][2] = telaJogoDaVelha.getBotao3();
		botao[1][0] = telaJogoDaVelha.getBotao4();
		botao[1][1] = telaJogoDaVelha.getBotao5();
		botao[1][2] = telaJogoDaVelha.getBotao6();
		botao[2][0] = telaJogoDaVelha.getBotao7();
		botao[2][1] = telaJogoDaVelha.getBotao8();
		botao[2][2] = telaJogoDaVelha.getBotao9();
	}

	// Inicializa botões (limpa texto e ativa botões).
	public void inicializarBotoes() {
		telaJogoDaVelha.getBotao1().setText("");
		telaJogoDaVelha.getBotao2().setText("");
		telaJogoDaVelha.getBotao3().setText("");
		telaJogoDaVelha.getBotao4().setText("");
		telaJogoDaVelha.getBotao5().setText("");
		telaJogoDaVelha.getBotao6().setText("");
		telaJogoDaVelha.getBotao7().setText("");
		telaJogoDaVelha.getBotao8().setText("");
		telaJogoDaVelha.getBotao9().setText("");
	}

	@Override
	// Ações de cada botão;.
	public void actionPerformed(ActionEvent evento) {

		// Adiciona X ou O ao texto do botão se ele estiver vazio e verfica se existe
		// ganhador.
		if (!modeloJogoDaVelha.isTemGanhador()) {

			// Condições para descobrir qual botão foi selecionado.
			if (evento.getSource() == telaJogoDaVelha.getBotao1() && telaJogoDaVelha.getBotao1().getText() == "") {
				telaJogoDaVelha.getBotao1().setText(modeloJogoDaVelha.getSimboloJogadorAtual()); // Adiciona símbolo no
																									// botão.
				jogada();
			}

			else if (evento.getSource() == telaJogoDaVelha.getBotao2() && telaJogoDaVelha.getBotao2().getText() == "") {
				telaJogoDaVelha.getBotao2().setText(modeloJogoDaVelha.getSimboloJogadorAtual()); // Adiciona símbolo no
																									// botão.
				jogada();
			}

			else if (evento.getSource() == telaJogoDaVelha.getBotao3() && telaJogoDaVelha.getBotao3().getText() == "") {
				telaJogoDaVelha.getBotao3().setText(modeloJogoDaVelha.getSimboloJogadorAtual()); // Adiciona símbolo no
																									// botão.
				jogada();
			}

			else if (evento.getSource() == telaJogoDaVelha.getBotao4() && telaJogoDaVelha.getBotao4().getText() == "") {
				telaJogoDaVelha.getBotao4().setText(modeloJogoDaVelha.getSimboloJogadorAtual()); // Adiciona símbolo no
																									// botão.
				jogada();
			}

			else if (evento.getSource() == telaJogoDaVelha.getBotao5() && telaJogoDaVelha.getBotao5().getText() == "") {
				telaJogoDaVelha.getBotao5().setText(modeloJogoDaVelha.getSimboloJogadorAtual()); // Adiciona símbolo no
																									// botão.
				jogada();
			}

			else if (evento.getSource() == telaJogoDaVelha.getBotao6() && telaJogoDaVelha.getBotao6().getText() == "") {
				telaJogoDaVelha.getBotao6().setText(modeloJogoDaVelha.getSimboloJogadorAtual()); // Adiciona símbolo no
																									// botão.
				jogada();
			}

			else if (evento.getSource() == telaJogoDaVelha.getBotao7() && telaJogoDaVelha.getBotao7().getText() == "") {
				telaJogoDaVelha.getBotao7().setText(modeloJogoDaVelha.getSimboloJogadorAtual()); // Adiciona símbolo no
																									// botão.
				jogada();
			}

			else if (evento.getSource() == telaJogoDaVelha.getBotao8() && telaJogoDaVelha.getBotao8().getText() == "") {
				telaJogoDaVelha.getBotao8().setText(modeloJogoDaVelha.getSimboloJogadorAtual()); // Adiciona símbolo no
																									// botão.
				jogada();
			}

			else if (evento.getSource() == telaJogoDaVelha.getBotao9() && telaJogoDaVelha.getBotao9().getText() == "") {
				telaJogoDaVelha.getBotao9().setText(modeloJogoDaVelha.getSimboloJogadorAtual()); // Adiciona símbolo no
																									// botão.
				jogada();
			}
		}

		// Inicializa os botões sem alterar as informações do jogo.
		if (evento.getSource() == ControladorFrame.framePrincipal.getReiniciarPartida()) {
			inicializarBotoes();
		}
	}

	public void jogada() {
		// Quantidade de jogadas realizadas em uma partida.
		modeloJogoDaVelha.setTotalDeJogadas(modeloJogoDaVelha.getTotalDeJogadas() + 1);

		// Verifica se alguém já ganhou (só é possível verificar se existe ganhador se
		// houver mais de 5 jogadas).
		if (modeloJogoDaVelha.getTotalDeJogadas() >= 5) {
			verificarSeTemGanhador();
		}

		// Alterna entre X e O. Se não houve jogada começa com X.
		alterarJogador();
	}

	// Alterna entre jogador X e O.
	public void alterarJogador() {
		// Alterna jogadores.
		if (modeloJogoDaVelha.getSimboloJogadorAtual().equals("X")) {
			modeloJogoDaVelha.setSimboloJogadorAtual("O");
		}

		else if (modeloJogoDaVelha.getSimboloJogadorAtual().equals("O")) {
			modeloJogoDaVelha.setSimboloJogadorAtual("X");
		}
	}

	// Verifica se tem ganhador ou deu empate.
	public void verificarSeTemGanhador() {

		for (int i = 0; i < 3; i++) {
			// Verifica coluna.
			if (botao[0][i].getText().equals(botao[1][i].getText())
					&& botao[0][i].getText().equals(botao[2][i].getText()) && !"".equals(botao[0][i].getText())) {
				modeloJogoDaVelha.setTemGanhador(true);
				fimDaPartida();
			}
			// Verifica linhas.
			else if (botao[i][0].getText().equals(botao[i][1].getText())
					&& botao[i][0].getText().equals(botao[i][2].getText()) && !"".equals(botao[i][0].getText())) {
				modeloJogoDaVelha.setTemGanhador(true);
				fimDaPartida();
			}
		}

		// Verifica diagonais.
		if (botao[0][0].getText().equals(botao[1][1].getText()) && botao[0][0].getText().equals(botao[2][2].getText())
				&& !"".equals(botao[0][0].getText())) {
			modeloJogoDaVelha.setTemGanhador(true);
			fimDaPartida();
		}

		else if (botao[0][2].getText().equals(botao[1][1].getText())
				&& botao[0][2].getText().equals(botao[2][0].getText()) && !"".equals(botao[0][2].getText())) {
			modeloJogoDaVelha.setTemGanhador(true);
			fimDaPartida();
		}

		// Verifica empate.
		if (modeloJogoDaVelha.getTotalDeJogadas() == 9 && !modeloJogoDaVelha.isTemGanhador()) {
			modeloJogoDaVelha.setTemEmpate(true);
			fimDaPartida();

		}
	}

	public void fimDaPartida() {
		// Calcula o total de jogos.
		modeloJogoDaVelha.setNumeroPartidas(modeloJogoDaVelha.getNumeroPartidas() + 1);

		// Verifica e informa que foi o jogador que ganhou ou se deu empate.
		if (modeloJogoDaVelha.isTemGanhador() && modeloJogoDaVelha.getSimboloJogadorAtual().equals("X")) {
			JOptionPane.showMessageDialog(null, "Jogador X ganhou!!!");
			modeloJogoDaVelha.setNumeroVitorias1(modeloJogoDaVelha.getNumeroVitorias1() + 1);
		}

		else if (modeloJogoDaVelha.isTemGanhador() && modeloJogoDaVelha.getSimboloJogadorAtual().equals("O")) {
			modeloJogoDaVelha.setNumeroVitorias2(modeloJogoDaVelha.getNumeroVitorias2() + 1);
			JOptionPane.showMessageDialog(null, "Jogador O ganhou!!!");
		}

		else if (modeloJogoDaVelha.isTemEmpate()) {
			modeloJogoDaVelha.setNumeroEmpates(modeloJogoDaVelha.getNumeroEmpates() + 1);
			JOptionPane.showMessageDialog(null, "Empatou!");
		}
		inicializarBotoes();

		// Verifica se jogador ainda deseja jogar.
		String[] options = { "Sim", "Não" };
		int resposta = JOptionPane.showOptionDialog(null, "Continuar Jogando?", null, JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

		// Inicializa informações.
		if (resposta == 0) {
			modeloJogoDaVelha.setTotalDeJogadas(0);
			modeloJogoDaVelha.setTemGanhador(false);
			modeloJogoDaVelha.setTemEmpate(false);
			telaJogoDaVelha.getTextFieldNumeroDeEmpates().setText("" + modeloJogoDaVelha.getNumeroEmpates());
			telaJogoDaVelha.getTextFieldNumeroDePartidas().setText("" + modeloJogoDaVelha.getNumeroPartidas());
			telaJogoDaVelha.getTextFieldNumerosDeVitorias1().setText("" + modeloJogoDaVelha.getNumeroVitorias1());
			telaJogoDaVelha.getTextFieldNumerosDeVitorias2().setText("" + modeloJogoDaVelha.getNumeroVitorias2());
		}
		// Volta para tela inicial.
		if (resposta == 1) {
			controladorTelaInicial = new ControladorTelaInicial(telaInicial); // Ativa funcionalidades dos botões.
			ControladorFrame.framePrincipal.setContentPane(telaInicial); // Visibilidade.
			ControladorFrame.framePrincipal.repaint();
			ControladorFrame.framePrincipal.validate();
		}
	}
}
