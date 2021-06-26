package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/*
 * @Author: Sara
 */

// Classe para criar JPanel da tela inicial (Interface gráfica).
public class VisaoTelaInicial extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton botaoNovoJogo = null;
	private JButton botaoSair = null;
	private JLabel tituloDoJogo;

	// Construtor padrão.
	public VisaoTelaInicial() {
		setBackground(new Color(255, 153, 255));
		setLayout(null);

		// Label para título do jogo.
		add(getTituloDoJogo());
		// Adiciona botões no panel.
		add(getBotaoNovoJogo());
		// Adiciona botão de sair (fecha programa).
		add(getBotaoSair());
	}

	// Configurações do label.
	public JLabel getTituloDoJogo() {
		if (tituloDoJogo == null) {
			tituloDoJogo = new JLabel("Tic Tac Toe");
			tituloDoJogo.setHorizontalAlignment(SwingConstants.CENTER);
			tituloDoJogo.setForeground(new Color(51, 0, 102));
			tituloDoJogo.setFont(new Font("Purisa", Font.BOLD, 60));
			tituloDoJogo.setBounds(115, 36, 541, 89);
		}
		return tituloDoJogo;
	}

	// Configurações de botão que abre tela de novo jogo.
	public JButton getBotaoNovoJogo() {
		if (botaoNovoJogo == null) {
			botaoNovoJogo = new JButton("Novo jogo");
			botaoNovoJogo.setBackground(new Color(102, 0, 153));
			botaoNovoJogo.setForeground(new Color(255, 255, 51));
			botaoNovoJogo.setBorder(new LineBorder(new Color(51, 0, 102), 2, true));
			botaoNovoJogo.setFont(new Font("Purisa", Font.BOLD, 35));
			botaoNovoJogo.setBounds(248, 163, 297, 67);
		}
		return botaoNovoJogo;
	}

	
	// Configurações de botão que fecha programa.
	public JButton getBotaoSair() {
		if (botaoSair == null) {
			botaoSair = new JButton("Sair");
			botaoSair.setBackground(new Color(102, 0, 153));
			botaoSair.setForeground(new Color(255, 255, 51));
			botaoSair.setBorder(new LineBorder(new Color(51, 0, 102), 2, true));
			botaoSair.setFont(new Font("Purisa", Font.BOLD, 35));
			botaoSair.setBounds(248, 259, 297, 67);
		}
		return botaoSair;
	}
}
