package br.com.rcc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class menu extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public menu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 481);
		getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 666, 50);
		getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setIcon(new ImageIcon(menu.class.getResource("/icones/dbtool-green.ico")));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setIcon(new ImageIcon(menu.class.getResource("/icones/status-offline.ico")));
		mnNewMenu.add(mntmSair);
		
		JMenu mnNewMenu_1 = new JMenu("Usuario");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mnNewMenu_1.add(mntmCadastrar);
		
		JMenuItem mntmAlterar = new JMenuItem("Alterar");
		mnNewMenu_1.add(mntmAlterar);
		
		JMenuItem mntmExcluirUsurio = new JMenuItem("Excluir usu\u00E1rio");
		mnNewMenu_1.add(mntmExcluirUsurio);
		
		JMenuItem mntmPesquisarUsurio = new JMenuItem("Pesquisar usu\u00E1rio");
		mnNewMenu_1.add(mntmPesquisarUsurio);
		
		JMenu mnNewMenu_2 = new JMenu("Cliente");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmCadastrar_1 = new JMenuItem("Cadastrar");
		mnNewMenu_2.add(mntmCadastrar_1);
		
		JMenuItem mntmEditar = new JMenuItem("Editar");
		mnNewMenu_2.add(mntmEditar);
		
		JMenuItem mntmAlterar_1 = new JMenuItem("Alterar");
		mnNewMenu_2.add(mntmAlterar_1);
		
		JMenuItem mntmExcluir = new JMenuItem("Excluir");
		mnNewMenu_2.add(mntmExcluir);
		
		JMenuItem mntmPesquisar = new JMenuItem("Pesquisar");
		mnNewMenu_2.add(mntmPesquisar);
		
		JMenu mnNewMenu_3 = new JMenu("Sobre");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmInformao = new JMenuItem("Informa\u00E7\u00E3o");
		mnNewMenu_3.add(mntmInformao);
	}
}
