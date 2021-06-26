package visao;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Color;

/*
 * @Author: Sara
 */

// Classe para criar JFrame (Interface gráfica).
public class VisaoFrameDoJogo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JMenuBar barraMenu;
	private JMenu opcaoJogo;
	private JMenuItem novoJogo;
	private JMenuItem reiniciarPartida;
	private JMenuItem voltar;
	private JMenuItem sair;
	
	// Construtor padrão.
	public VisaoFrameDoJogo() {
		setTitle("Tic Tac Toe"); // Define o título do frame.
		setSize(780, 460); // Define tamanho do frame.
		setJMenuBar(getBarraMenu());
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Função padrão para fechar programa.
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true); // Define se frame está visível ou não.
	}
	
	public JMenuBar getBarraMenu() {
		if (barraMenu == null) {
			barraMenu = new JMenuBar();
			barraMenu.setBackground(new Color(102, 0, 153));
			barraMenu.setForeground(new Color(255, 255, 51));
			barraMenu.setBorderPainted(false);
			barraMenu.setBounds(0, 0, 786, 21);
			barraMenu.setFont(new Font("URW Gothic L", Font.BOLD, 15));
			barraMenu.add(getOpcaoJogo());
		}
		return barraMenu;
	}

	public JMenu getOpcaoJogo() {
		if (opcaoJogo == null) {
			opcaoJogo = new JMenu("Opções de Jogo");
			opcaoJogo.setBackground(new Color(102, 0, 153));
			opcaoJogo.setForeground(new Color(255, 255, 51));
			opcaoJogo.setHorizontalAlignment(SwingConstants.CENTER);
			opcaoJogo.add(getNovoJogo());
			opcaoJogo.add(getReiniciarPartida());
			opcaoJogo.add(getVoltar());
			opcaoJogo.add(getSair());
		}
		return opcaoJogo;
	}

	public JMenuItem getNovoJogo() {
		if (novoJogo == null) {
			novoJogo = new JMenuItem("Novo jogo");
			novoJogo.setBackground(new Color(102, 0, 153));
			novoJogo.setForeground(new Color(255, 255, 51));
		}
		return novoJogo;
	}

	public JMenuItem getReiniciarPartida() {
		if (reiniciarPartida == null) {
			reiniciarPartida = new JMenuItem("Reiniciar Partida");
			reiniciarPartida.setBackground(new Color(102, 0, 153));
			reiniciarPartida.setForeground(new Color(255, 255, 51));
		}
		return reiniciarPartida;
	}
	
	public JMenuItem getVoltar() {
		if (voltar == null) {
			voltar = new JMenuItem("Voltar");
			voltar.setBackground(new Color(102, 0, 153));
			voltar.setForeground(new Color(255, 255, 51));
		}
		return voltar;
	}

	public JMenuItem getSair() {
		if (sair == null) {
			sair = new JMenuItem("Sair");
			sair.setBackground(new Color(102, 0, 153));
			sair.setForeground(new Color(255, 255, 51));
		}
		return sair;
	}

}
