package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/*
 * @Author: Sara
 */

// Classe para criar JPanel do jogo (Interface gráfica).
public class VisaoJogoDaVelha extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton botao1;
	private JButton botao2;
	private JButton botao3;
	private JButton botao4;
	private JButton botao5;
	private JButton botao6;
	private JButton botao7;
	private JButton botao8;
	private JButton botao9;
	private JMenuItem voltarTelaInicial;
	private JLabel labelNomeJogador1;
	private JLabel labelNomeJogador2;
	private JLabel labelNumerodeVitorias1;
	private JLabel labelEmpate;
	private JLabel labelTotalDePartidas;
	private JLabel labelInformacoesDoJogo;
	private JSeparator separatorJogadores;
	private JLabel labelNumerodeVitorias2;
	private JSeparator separatorPartida;
	private JLabel labelSimbolo1;
	private JLabel labelSimbolo2;
	private JTextField textFieldNumerosDeVitorias1;
	private JTextField textFieldNumerosDeVitorias2;
	private JTextField textFieldNumeroDeEmpates;
	private JTextField textFieldNumeroDePartidas;

	// Construtor padrão.
	public VisaoJogoDaVelha() {
		setBackground(new Color(255, 153, 255)); // Define cor do panel.
		setLayout(null);

		// Adiciona botões no panel.
		add(getBotao1());
		add(getBotao2());
		add(getBotao3());
		add(getBotao4());
		add(getBotao5());
		add(getBotao6());
		add(getBotao7());
		add(getBotao8());
		add(getBotao9());


		// Informações do Jogo.
		add(getLabelInformacoesDoJogo());
		add(getLabelNomeJogador1());
		add(getLabelSimbolo1());
		add(getLabelNumerodeVitorias1());
		add(getSeparatorJogadores());
		add(getLabelNomeJogador2());
		add(getLabelSimbolo2());
		add(getLabelNumerodeVitorias2());
		add(getSeparatorPartida());
		add(getLabelEmpate());
		add(getLabelTotalDePartidas());
		add(getTextFieldNumerosDeVitorias1());
		add(getTextFieldNumerosDeVitorias2());
		add(getTextFieldNumeroDeEmpates());
		add(getTextFieldNumeroDePartidas());

	}

	// Configurações de botões do jogo.
	public JButton getBotao1() {
		if (botao1 == null) {
			botao1 = new JButton("");
			botao1.setBackground(new Color(102, 0, 153));
			botao1.setForeground(new Color(255, 255, 51));
			botao1.setBorder(new LineBorder(new Color(51, 0, 102), 2));
			botao1.setBounds(37, 26, 120, 120);
			botao1.setFont(new Font("Waree", Font.BOLD, 75));
		}
		return botao1;
	}

	public JButton getBotao2() {
		if (botao2 == null) {
			botao2 = new JButton("");
			botao2.setBackground(new Color(102, 0, 153));
			botao2.setForeground(new Color(255, 255, 51));
			botao2.setBorder(new LineBorder(new Color(51, 0, 102), 2));
			botao2.setBounds(158, 26, 120, 120);
			botao2.setFont(new Font("Waree", Font.BOLD, 75));
		}
		return botao2;
	}

	public JButton getBotao3() {
		if (botao3 == null) {
			botao3 = new JButton("");
			botao3.setBackground(new Color(102, 0, 153));
			botao3.setForeground(new Color(255, 255, 51));
			botao3.setBorder(new LineBorder(new Color(51, 0, 102), 2));
			botao3.setBounds(279, 26, 120, 120);
			botao3.setFont(new Font("Waree", Font.BOLD, 75));
		}
		return botao3;
	}

	public JButton getBotao4() {
		if (botao4 == null) {
			botao4 = new JButton("");
			botao4.setBackground(new Color(102, 0, 153));
			botao4.setForeground(new Color(255, 255, 51));
			botao4.setBorder(new LineBorder(new Color(51, 0, 102), 2));
			botao4.setBounds(37, 147, 120, 120);
			botao4.setIcon(null);
			botao4.setFont(new Font("Waree", Font.BOLD, 75));
		}
		return botao4;
	}

	public JButton getBotao5() {
		if (botao5 == null) {
			botao5 = new JButton("");
			botao5.setBackground(new Color(102, 0, 153));
			botao5.setForeground(new Color(255, 255, 51));
			botao5.setBorder(new LineBorder(new Color(51, 0, 102), 2));
			botao5.setBounds(158, 147, 120, 120);
			botao5.setFont(new Font("Waree", Font.BOLD, 75));
		}
		return botao5;
	}

	public JButton getBotao6() {
		if (botao6 == null) {
			botao6 = new JButton("");
			botao6.setBackground(new Color(102, 0, 153));
			botao6.setForeground(new Color(255, 255, 51));
			botao6.setBorder(new LineBorder(new Color(51, 0, 102), 2));
			botao6.setBounds(279, 147, 120, 120);
			botao6.setFont(new Font("Waree", Font.BOLD, 75));
		}
		return botao6;
	}

	public JButton getBotao7() {
		if (botao7 == null) {
			botao7 = new JButton("");
			botao7.setBackground(new Color(102, 0, 153));
			botao7.setForeground(new Color(255, 255, 51));
			botao7.setBorder(new LineBorder(new Color(51, 0, 102), 2));
			botao7.setBounds(37, 268, 120, 120);
			botao7.setFont(new Font("Waree", Font.BOLD, 75));
		}
		return botao7;
	}

	public JButton getBotao8() {
		if (botao8 == null) {
			botao8 = new JButton("");
			botao8.setBackground(new Color(102, 0, 153));
			botao8.setForeground(new Color(255, 255, 51));
			botao8.setBorder(new LineBorder(new Color(51, 0, 102), 2));
			botao8.setBounds(158, 268, 120, 120);
			botao8.setFont(new Font("Waree", Font.BOLD, 75));
		}
		return botao8;
	}

	public JButton getBotao9() {
		if (botao9 == null) {
			botao9 = new JButton("");
			botao9.setBackground(new Color(102, 0, 153));
			botao9.setForeground(new Color(255, 255, 51));
			botao9.setBorder(new LineBorder(new Color(51, 0, 102), 2));
			botao9.setBounds(279, 268, 120, 120);
			botao9.setFont(new Font("Waree", Font.BOLD, 75));
		}
		return botao9;
	}

	// Configurações da barra de tarefas e itens da barra.

	public JMenuItem getVoltarTelaInicial() {
		if (voltarTelaInicial == null) {
			voltarTelaInicial = new JMenuItem("Voltar");
		}
		return voltarTelaInicial;
	}

	// Informações de jogo (texto).
	public JLabel getLabelNomeJogador1() {
		if (labelNomeJogador1 == null) {
			labelNomeJogador1 = new JLabel("Jogador 1");
			labelNomeJogador1.setFont(new Font("URW Gothic L", Font.BOLD, 14));
			labelNomeJogador1.setForeground(new Color(51, 0, 102));
			labelNomeJogador1.setBounds(454, 77, 104, 29);
		}
		return labelNomeJogador1;
	}

	public JLabel getLabelNomeJogador2() {
		if (labelNomeJogador2 == null) {
			labelNomeJogador2 = new JLabel("Jogador 2");
			labelNomeJogador2.setFont(new Font("URW Gothic L", Font.BOLD, 14));
			labelNomeJogador2.setForeground(new Color(51, 0, 102));
			labelNomeJogador2.setBounds(454, 146, 106, 29);
		}
		return labelNomeJogador2;
	}

	public JLabel getLabelNumerodeVitorias1() {
		if (labelNumerodeVitorias1 == null) {
			labelNumerodeVitorias1 = new JLabel("Números de vitórias:");
			labelNumerodeVitorias1.setFont(new Font("URW Gothic L", Font.BOLD, 14));
			labelNumerodeVitorias1.setHorizontalAlignment(SwingConstants.CENTER);
			labelNumerodeVitorias1.setForeground(new Color(51, 0, 102));
			labelNumerodeVitorias1.setBounds(454, 106, 137, 29);
		}
		return labelNumerodeVitorias1;
	}

	public JLabel getLabelEmpate() {
		if (labelEmpate == null) {
			labelEmpate = new JLabel("Empates:");
			labelEmpate.setFont(new Font("URW Gothic L", Font.BOLD, 14));
			labelEmpate.setForeground(new Color(51, 0, 102));
			labelEmpate.setHorizontalAlignment(SwingConstants.CENTER);
			labelEmpate.setBounds(454, 214, 66, 29);
		}
		return labelEmpate;
	}

	public JLabel getLabelTotalDePartidas() {
		if (labelTotalDePartidas == null) {
			labelTotalDePartidas = new JLabel("Total de Partidas:");
			labelTotalDePartidas.setFont(new Font("URW Gothic L", Font.BOLD, 14));
			labelTotalDePartidas.setHorizontalAlignment(SwingConstants.CENTER);
			labelTotalDePartidas.setForeground(new Color(51, 0, 102));
			labelTotalDePartidas.setBounds(454, 241, 117, 26);
		}
		return labelTotalDePartidas;
	}
	public JLabel getLabelInformacoesDoJogo() {
		if (labelInformacoesDoJogo == null) {
			labelInformacoesDoJogo = new JLabel("Informações do Jogo");
			labelInformacoesDoJogo.setFont(new Font("URW Gothic L", Font.BOLD, 18));
			labelInformacoesDoJogo.setForeground(new Color(51, 0, 102));
			labelInformacoesDoJogo.setBounds(482, 31, 201, 26);
		}
		return labelInformacoesDoJogo;
	}
	public JSeparator getSeparatorJogadores() {
		if (separatorJogadores == null) {
			separatorJogadores = new JSeparator();
			separatorJogadores.setForeground(new Color(102, 102, 153));
			separatorJogadores.setBackground(new Color(102, 102, 153));
			separatorJogadores.setBounds(454, 137, 314, 13);
		}
		return separatorJogadores;
	}
	public JLabel getLabelNumerodeVitorias2() {
		if (labelNumerodeVitorias2 == null) {
			labelNumerodeVitorias2 = new JLabel("Números de vitórias:");
			labelNumerodeVitorias2.setFont(new Font("URW Gothic L", Font.BOLD, 14));
			labelNumerodeVitorias2.setHorizontalAlignment(SwingConstants.CENTER);
			labelNumerodeVitorias2.setForeground(new Color(51, 0, 102));
			labelNumerodeVitorias2.setBounds(454, 176, 137, 26);
		}
		return labelNumerodeVitorias2;
	}
	public JSeparator getSeparatorPartida() {
		if (separatorPartida == null) {
			separatorPartida = new JSeparator();
			separatorPartida.setForeground(new Color(102, 102, 153));
			separatorPartida.setBackground(new Color(102, 102, 153));
			separatorPartida.setBounds(454, 205, 314, 13);
		}
		return separatorPartida;
	}
	public JLabel getLabelSimbolo1() {
		if (labelSimbolo1 == null) {
			labelSimbolo1 = new JLabel("Símbolo X");
			labelSimbolo1.setFont(new Font("URW Gothic L", Font.BOLD, 14));
			labelSimbolo1.setForeground(new Color(51, 0, 102));
			labelSimbolo1.setBounds(609, 77, 104, 29);
		}
		return labelSimbolo1;
	}
	public JLabel getLabelSimbolo2() {
		if (labelSimbolo2 == null) {
			labelSimbolo2 = new JLabel("Símbolo O");
			labelSimbolo2.setFont(new Font("URW Gothic L", Font.BOLD, 14));
			labelSimbolo2.setForeground(new Color(51, 0, 102));
			labelSimbolo2.setBounds(609, 146, 104, 29);
		}
		return labelSimbolo2;
	}
	public JTextField getTextFieldNumerosDeVitorias1() {
		if (textFieldNumerosDeVitorias1 == null) {
			textFieldNumerosDeVitorias1 = new JTextField();
			textFieldNumerosDeVitorias1.setText("0");
			textFieldNumerosDeVitorias1.setForeground(new Color(51, 0, 102));
			textFieldNumerosDeVitorias1.setFont(new Font("URW Gothic L", Font.BOLD, 14));
			textFieldNumerosDeVitorias1.setEditable(false);
			textFieldNumerosDeVitorias1.setBorder(null);
			textFieldNumerosDeVitorias1.setBackground(new Color(255, 153, 255));
			textFieldNumerosDeVitorias1.setBounds(609, 108, 83, 23);
		}
		return textFieldNumerosDeVitorias1;
	}
	public JTextField getTextFieldNumerosDeVitorias2() {
		if (textFieldNumerosDeVitorias2 == null) {
			textFieldNumerosDeVitorias2 = new JTextField();
			textFieldNumerosDeVitorias2.setText("0");
			textFieldNumerosDeVitorias2.setForeground(new Color(51, 0, 102));
			textFieldNumerosDeVitorias2.setFont(new Font("URW Gothic L", Font.BOLD, 14));
			textFieldNumerosDeVitorias2.setEditable(false);
			textFieldNumerosDeVitorias2.setBorder(null);
			textFieldNumerosDeVitorias2.setBackground(new Color(255, 153, 255));
			textFieldNumerosDeVitorias2.setBounds(609, 177, 83, 25);
		}
		return textFieldNumerosDeVitorias2;
	}
	public JTextField getTextFieldNumeroDeEmpates() {
		if (textFieldNumeroDeEmpates == null) {
			textFieldNumeroDeEmpates = new JTextField();
			textFieldNumeroDeEmpates.setText("0");
			textFieldNumeroDeEmpates.setForeground(new Color(51, 0, 102));
			textFieldNumeroDeEmpates.setFont(new Font("URW Gothic L", Font.BOLD, 14));
			textFieldNumeroDeEmpates.setBorder(null);
			textFieldNumeroDeEmpates.setBackground(new Color(255, 153, 255));
			textFieldNumeroDeEmpates.setBounds(609, 216, 83, 25);
		}
		return textFieldNumeroDeEmpates;
	}
	public JTextField getTextFieldNumeroDePartidas() {
		if (textFieldNumeroDePartidas == null) {
			textFieldNumeroDePartidas = new JTextField();
			textFieldNumeroDePartidas.setText("0");
			textFieldNumeroDePartidas.setForeground(new Color(51, 0, 102));
			textFieldNumeroDePartidas.setFont(new Font("URW Gothic L", Font.BOLD, 14));
			textFieldNumeroDePartidas.setBorder(null);
			textFieldNumeroDePartidas.setBackground(new Color(255, 153, 255));
			textFieldNumeroDePartidas.setBounds(609, 242, 83, 25);
		}
		return textFieldNumeroDePartidas;
	}
}
