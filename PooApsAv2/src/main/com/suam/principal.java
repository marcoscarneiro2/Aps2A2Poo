package main.com.suam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Toolkit;

public class principal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_13;
	private JTextField textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
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
	public principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("\\poli.png"));
		setForeground(new Color(0, 0, 0));
		setBackground(Color.BLACK);
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Registro B.O");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 395);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 356);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		tabbedPane.addTab("Latroc\u00EDnio", null, panel, null);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 67, 128, 20);
		textField.setText("");
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(184, 67, 235, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 122, 110, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(21, 163, 40, -21);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(184, 122, 235, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 178, 409, 95);
		panel.add(textPane);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Latroc\u00EDnio");
		lblNewLabel.setFont(new Font("Caviar Dreams", Font.BOLD, 14));
		lblNewLabel.setBounds(128, 11, 166, 18);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero da ocorrencia");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(10, 49, 139, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valor roubado");
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(10, 101, 96, 30);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nome da V\u00EDtima");
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(184, 49, 110, 23);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Endere\u00E7o do Assassinato");
		lblNewLabel_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(184, 101, 161, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Observa\u00E7\u00E3o");
		lblNewLabel_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(10, 153, 96, 30);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnNewButton.setBounds(105, 294, 110, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.setBackground(new Color(128, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnNewButton_1.setBounds(225, 294, 110, 23);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(112, 128, 144));
		tabbedPane.addTab("Furto", null, panel_1, null);
		
		textField_4 = new JTextField();
		textField_4.setText("");
		textField_4.setColumns(10);
		textField_4.setBounds(10, 67, 128, 20);
		panel_1.add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(184, 67, 235, 20);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(10, 122, 409, 20);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(21, 163, 40, -21);
		panel_1.add(textField_8);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(10, 178, 409, 95);
		panel_1.add(textPane_1);
		
		JLabel lblCadastroDeFurto = new JLabel("Cadastro de Furto");
		lblCadastroDeFurto.setFont(new Font("Caviar Dreams", Font.BOLD, 14));
		lblCadastroDeFurto.setBounds(128, 11, 166, 18);
		panel_1.add(lblCadastroDeFurto);
		
		JLabel lblNewLabel_1_1 = new JLabel("N\u00FAmero da ocorrencia");
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_1_1.setBounds(10, 49, 139, 23);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Valor roubado");
		lblNewLabel_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_2_1.setBounds(184, 45, 96, 30);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Nome da V\u00EDtima");
		lblNewLabel_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_3_1.setBounds(10, 106, 110, 23);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Observa\u00E7\u00E3o");
		lblNewLabel_5_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_5_1.setBounds(10, 153, 96, 30);
		panel_1.add(lblNewLabel_5_1);
		
		JButton btnNewButton_2 = new JButton("Salvar");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnNewButton_2.setBackground(new Color(0, 128, 0));
		btnNewButton_2.setBounds(105, 294, 110, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("Cadastrar");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnNewButton_1_1.setBackground(new Color(128, 0, 0));
		btnNewButton_1_1.setBounds(225, 294, 110, 23);
		panel_1.add(btnNewButton_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(112, 128, 144));
		tabbedPane.addTab("Homic\u00EDdio", null, panel_2, null);
		
		textField_10 = new JTextField();
		textField_10.setText("");
		textField_10.setColumns(10);
		textField_10.setBounds(10, 67, 128, 20);
		panel_2.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(184, 67, 235, 20);
		panel_2.add(textField_11);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(21, 163, 40, -21);
		panel_2.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(10, 122, 409, 20);
		panel_2.add(textField_14);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(10, 178, 409, 95);
		panel_2.add(textPane_2);
		
		JLabel lblCadastroDeHomicdio = new JLabel("Cadastro de Homic\u00EDdio");
		lblCadastroDeHomicdio.setFont(new Font("Caviar Dreams", Font.BOLD, 14));
		lblCadastroDeHomicdio.setBounds(128, 11, 166, 18);
		panel_2.add(lblCadastroDeHomicdio);
		
		JLabel lblNewLabel_1_2 = new JLabel("N\u00FAmero da ocorrencia");
		lblNewLabel_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_1_2.setBounds(10, 49, 139, 23);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Nome da V\u00EDtima");
		lblNewLabel_3_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_3_2.setBounds(184, 49, 110, 23);
		panel_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("Endere\u00E7o do Assassinato");
		lblNewLabel_4_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_4_2.setBounds(10, 98, 161, 30);
		panel_2.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("Observa\u00E7\u00E3o");
		lblNewLabel_5_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_5_2.setBounds(10, 153, 96, 30);
		panel_2.add(lblNewLabel_5_2);
		
		JButton btnNewButton_3 = new JButton("Salvar");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnNewButton_3.setBackground(new Color(0, 128, 0));
		btnNewButton_3.setBounds(105, 294, 110, 23);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("Cadastrar");
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnNewButton_1_2.setBackground(new Color(128, 0, 0));
		btnNewButton_1_2.setBounds(225, 294, 110, 23);
		panel_2.add(btnNewButton_1_2);
	}
}
