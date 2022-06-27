package view;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JLabel lblData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				Date data = new Date();
				DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
				lblData.setText(formatador.format(data));
			}
		});
		setResizable(false);
		setTitle("animes-Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/img/PC.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Users users = new Users ();
				users.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon(Principal.class.getResource("/img/user.png")));
		btnNewButton.setToolTipText("users");
		btnNewButton.setBounds(10, 11, 95, 85);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fornecedores fornecedores = new Fornecedores ();
				fornecedores.setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Principal.class.getResource("/img/fornecedores.png")));
		btnNewButton_1.setToolTipText("fornecedores");
		btnNewButton_1.setBounds(115, 11, 95, 85);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produtos produtos = new Produtos ();
				produtos.setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Principal.class.getResource("/img/produtos.png")));
		btnNewButton_2.setToolTipText("produtos");
		btnNewButton_2.setBounds(220, 11, 95, 85);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes clientes = new Clientes ();
				clientes.setVisible(true);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(Principal.class.getResource("/img/users.png")));
		btnNewButton_3.setToolTipText("clientes");
		btnNewButton_3.setBounds(329, 11, 95, 85);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Moeda moeda = new Moeda ();
				moeda.setVisible(true);
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(Principal.class.getResource("/img/moeda.png")));
		btnNewButton_4.setToolTipText("moeda");
		btnNewButton_4.setBounds(10, 107, 95, 85);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Repoter repoter = new Repoter ();
				repoter.setVisible(true);
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(Principal.class.getResource("/img/reporte.png")));
		btnNewButton_5.setToolTipText("repoter");
		btnNewButton_5.setBounds(115, 107, 95, 85);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Feramentas feramentas = new Feramentas ();
				feramentas.setVisible(true);
			}
		});
		btnNewButton_6.setIcon(new ImageIcon(Principal.class.getResource("/img/sentings.png")));
		btnNewButton_6.setToolTipText("feramentas");
		btnNewButton_6.setBounds(220, 107, 95, 85);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Help help = new Help ();
				help.setVisible(true);
			}
		});
		btnNewButton_7.setIcon(new ImageIcon(Principal.class.getResource("/img/help.png")));
		btnNewButton_7.setToolTipText("help");
		btnNewButton_7.setBounds(329, 107, 95, 85);
		contentPane.add(btnNewButton_7);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 299, 501, 44);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblData = new JLabel("anime");
		lblData.setBounds(74, 11, 285, 22);
		panel.add(lblData);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/img/logo (2).png")));
		lblNewLabel.setBounds(0, 0, 64, 44);
		panel.add(lblNewLabel);
	}
}
