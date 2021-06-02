package main.com.suam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GeradorOcorrenciaView extends JFrame {

	private JPanel contentPane;
	private JTextField L_NO;
	private JTextField L_NV;
	private JTextField L_VR;
	private JTextField textField_3;
	private JTextField L_EA;
	private JTextField F_NO;
	private JTextField F_VR;
	private JTextField F_NV;
	private JTextField textField_8;
	private JTextField H_NO;
	private JTextField H_NV;
	private JTextField textField_13;
	private JTextField H_EA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeradorOcorrenciaView frame = new GeradorOcorrenciaView();
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
	public GeradorOcorrenciaView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\poli.png"));
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
		panel.setBackground(Color.BLACK);
		tabbedPane.addTab("Latroc\u00EDnio", null, panel, null);
		panel.setLayout(null);

		L_NO = new JTextField();
		L_NO.setBounds(10, 67, 128, 20);
		L_NO.setText("");
		panel.add(L_NO);
		L_NO.setColumns(10);

		L_NV = new JTextField();
		L_NV.setBounds(184, 67, 235, 20);
		panel.add(L_NV);
		L_NV.setColumns(10);

		L_VR = new JTextField();
		L_VR.setBounds(10, 122, 110, 20);
		panel.add(L_VR);
		L_VR.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(21, 163, 40, -21);
		panel.add(textField_3);
		textField_3.setColumns(10);

		L_EA = new JTextField();
		L_EA.setBounds(184, 122, 235, 20);
		panel.add(L_EA);
		L_EA.setColumns(10);

		JTextPane L_OBS = new JTextPane();
		L_OBS.setBounds(10, 178, 409, 95);
		panel.add(L_OBS);

		JLabel lblNewLabel = new JLabel("Cadastro de Latroc\u00EDnio");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Caviar Dreams", Font.BOLD, 14));
		lblNewLabel.setBounds(128, 11, 166, 18);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero da ocorrencia");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(10, 49, 139, 23);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Valor roubado");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(10, 101, 96, 30);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Nome da V\u00EDtima");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(184, 49, 110, 23);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Endere\u00E7o do Assassinato");
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(184, 101, 161, 30);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Observa\u00E7\u00E3o");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(10, 153, 96, 30);
		panel.add(lblNewLabel_5);

		JButton L_btSalvar = new JButton("Salvar");
		L_btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OcorrenciaLatrocinio op = new OcorrenciaLatrocinio();
				String numero = L_NO.getText();
				op.setNumero(Integer.parseInt(numero));
				String nome = L_NV.getText();
				op.setNomeVitima(nome);
				String vRbd = L_VR.getText();
				op.setValorRoubado(Integer.parseInt(vRbd));
				String endAss = L_EA.getText();
				op.setLocalAssassinato(endAss);
				String obs = L_OBS.getText();
				op.setDescricaoOcorrencia(obs);

				// JOptionPane.showMessageDialog(null,op.getNumero(),"Registro B.O", -1, null);
				String texto = "";
				texto += " ==============================\n";
				texto += "Número do B.O : " + op.getNumero() + "\n";
				texto += "Nome da vítima : " + op.getNomeVitima() + "\n";
				texto += "O valor roubado: R$ " + op.getValorRoubado() + "\n";
				texto += "Local do Assassinato: " + op.getLocalAssassinato() + "\n";
				texto += "Descrição da ocorrencia: " + op.getDescricaoOcorrencia() + "\n";
				texto += "\n ============================";

				JOptionPane.showMessageDialog(null, texto, "Registro B.O", -1, null);
				
				L_VR.setText("");
				L_NV.setText("");
				L_NO.setText("");
				L_EA.setText("");
				L_OBS.setText("");
			}
		});
		L_btSalvar.setForeground(new Color(255, 255, 255));
		L_btSalvar.setBackground(new Color(0, 128, 0));
		L_btSalvar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		L_btSalvar.setBounds(105, 294, 110, 23);
		panel.add(L_btSalvar);

		JButton L_btCancelar = new JButton("Limpar");
		L_btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L_VR.setText("");
				L_NV.setText("");
				L_NO.setText("");
				L_EA.setText("");
				L_OBS.setText("");
			}
		});
		L_btCancelar.setBackground(new Color(128, 0, 0));
		L_btCancelar.setForeground(new Color(255, 255, 255));
		L_btCancelar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		L_btCancelar.setBounds(225, 294, 110, 23);
		panel.add(L_btCancelar);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("img\\fundo.png"));
		lblNewLabel_6.setBounds(0, 0, 429, 328);
		panel.add(lblNewLabel_6);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLACK);
		tabbedPane.addTab("Furto", null, panel_1, null);

		F_NO = new JTextField();
		F_NO.setText("");
		F_NO.setColumns(10);
		F_NO.setBounds(10, 67, 128, 20);
		panel_1.add(F_NO);

		F_VR = new JTextField();
		F_VR.setColumns(10);
		F_VR.setBounds(184, 67, 235, 20);
		panel_1.add(F_VR);

		F_NV = new JTextField();
		F_NV.setColumns(10);
		F_NV.setBounds(10, 122, 409, 20);
		panel_1.add(F_NV);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(21, 163, 40, -21);
		panel_1.add(textField_8);

		JTextPane F_OBS = new JTextPane();
		F_OBS.setBounds(10, 178, 409, 95);
		panel_1.add(F_OBS);

		JLabel lblCadastroDeFurto = new JLabel("Cadastro de Furto");
		lblCadastroDeFurto.setForeground(Color.WHITE);
		lblCadastroDeFurto.setFont(new Font("Caviar Dreams", Font.BOLD, 14));
		lblCadastroDeFurto.setBounds(128, 11, 166, 18);
		panel_1.add(lblCadastroDeFurto);

		JLabel lblNewLabel_1_1 = new JLabel("N\u00FAmero da ocorrencia");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_1_1.setBounds(10, 49, 139, 23);
		panel_1.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("Valor roubado");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_2_1.setBounds(184, 45, 96, 30);
		panel_1.add(lblNewLabel_2_1);

		JLabel lblNewLabel_3_1 = new JLabel("Nome da V\u00EDtima");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_3_1.setBounds(10, 106, 110, 23);
		panel_1.add(lblNewLabel_3_1);

		JLabel lblNewLabel_5_1 = new JLabel("Observa\u00E7\u00E3o");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_5_1.setBounds(10, 153, 96, 30);
		panel_1.add(lblNewLabel_5_1);

		JButton F_Salvar = new JButton("Salvar");
		F_Salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OcorrenciaFurto of = new OcorrenciaFurto();
				String numero = F_NO.getText();
				of.setNumero(Integer.parseInt(numero));
				String nome = F_NV.getText();
				of.setNomeVitima(nome);
				String vRbd = F_VR.getText();
				of.setValorRoubado(Integer.parseInt(vRbd));
				String obs = F_OBS.getText();
				of.setDescricaoOcorrencia(obs);

				// JOptionPane.showMessageDialog(null,op.getNumero(),"Registro B.O", -1, null);
				String texto = "";
				texto += " ==============================\n";
				texto += "Número do B.O : " + of.getNumero() + "\n";
				texto += "Nome da vítima : " + of.getNomeVitima() + "\n";
				texto += "O valor roubado: R$ " + of.getValorRoubado() + "\n";
				texto += "Descrição da ocorrencia: " + of.getDescricaoOcorrencia() + "\n";
				texto += "\n ============================";

				JOptionPane.showMessageDialog(null, texto, "Registro B.O", -1, null);
				
				F_VR.setText("");
				F_NV.setText("");
				F_NO.setText("");
				F_OBS.setText("");
			}
		});
		F_Salvar.setForeground(Color.WHITE);
		F_Salvar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		F_Salvar.setBackground(new Color(0, 128, 0));
		F_Salvar.setBounds(105, 294, 110, 23);
		panel_1.add(F_Salvar);

		JButton btnNewButton_1_1 = new JButton("Limpar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F_VR.setText("");
				F_NV.setText("");
				F_NO.setText("");
				F_OBS.setText("");
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnNewButton_1_1.setBackground(new Color(128, 0, 0));
		btnNewButton_1_1.setBounds(225, 294, 110, 23);
		panel_1.add(btnNewButton_1_1);

		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("img\\fundo.png"));
		lblNewLabel_7.setBounds(0, 0, 429, 328);
		panel_1.add(lblNewLabel_7);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.BLACK);
		tabbedPane.addTab("Homic\u00EDdio", null, panel_2, null);

		H_NO = new JTextField();
		H_NO.setText("");
		H_NO.setColumns(10);
		H_NO.setBounds(10, 67, 128, 20);
		panel_2.add(H_NO);

		H_NV = new JTextField();
		H_NV.setColumns(10);
		H_NV.setBounds(184, 67, 235, 20);
		panel_2.add(H_NV);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(21, 163, 40, -21);
		panel_2.add(textField_13);

		H_EA = new JTextField();
		H_EA.setColumns(10);
		H_EA.setBounds(10, 122, 409, 20);
		panel_2.add(H_EA);

		JTextPane H_OBS = new JTextPane();
		H_OBS.setBounds(10, 178, 409, 95);
		panel_2.add(H_OBS);

		JLabel lblCadastroDeHomicdio = new JLabel("Cadastro de Homic\u00EDdio");
		lblCadastroDeHomicdio.setForeground(Color.WHITE);
		lblCadastroDeHomicdio.setFont(new Font("Caviar Dreams", Font.BOLD, 14));
		lblCadastroDeHomicdio.setBounds(128, 11, 166, 18);
		panel_2.add(lblCadastroDeHomicdio);

		JLabel lblNewLabel_1_2 = new JLabel("N\u00FAmero da ocorrencia");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_1_2.setBounds(10, 49, 139, 23);
		panel_2.add(lblNewLabel_1_2);

		JLabel lblNewLabel_3_2 = new JLabel("Nome da V\u00EDtima");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_3_2.setBounds(184, 49, 110, 23);
		panel_2.add(lblNewLabel_3_2);

		JLabel lblNewLabel_4_2 = new JLabel("Endere\u00E7o do Assassinato");
		lblNewLabel_4_2.setForeground(Color.WHITE);
		lblNewLabel_4_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_4_2.setBounds(10, 98, 161, 30);
		panel_2.add(lblNewLabel_4_2);

		JLabel lblNewLabel_5_2 = new JLabel("Observa\u00E7\u00E3o");
		lblNewLabel_5_2.setForeground(Color.WHITE);
		lblNewLabel_5_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_5_2.setBounds(10, 153, 96, 30);
		panel_2.add(lblNewLabel_5_2);

		JButton H_Salvar = new JButton("Salvar");
		H_Salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OcorrenciaHomicidio oh= new OcorrenciaHomicidio();
				String numero = H_NO.getText();
				oh.setNumero(Integer.parseInt(numero));
				String nome = H_NV.getText();
				oh.setNomeVitima(nome);
				String lA = H_EA.getText();
				oh.setLocalAssassinato(lA);
				String obs = H_OBS.getText();
				oh.setDescricaoOcorrencia(obs);

				// JOptionPane.showMessageDialog(null,op.getNumero(),"Registro B.O", -1, null);
				String texto = "";
				texto += " ==============================\n";
				texto += "Número do B.O : " + oh.getNumero() + "\n";
				texto += "Nome da vítima : " + oh.getNomeVitima() + "\n";
				texto += "Endereço do Assassinato : " + oh.getLocalAssassinato() + "\n";
				texto += "Descrição da ocorrencia : " + oh.getDescricaoOcorrencia() + "\n";
				texto += "\n ============================";

				JOptionPane.showMessageDialog(null, texto, "Registro B.O", -1, null);
				
				H_EA.setText("");
				H_NV.setText("");
				H_NO.setText("");
				H_OBS.setText("");
			}
		});
		H_Salvar.setForeground(Color.WHITE);
		H_Salvar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		H_Salvar.setBackground(new Color(0, 128, 0));
		H_Salvar.setBounds(105, 294, 110, 23);
		panel_2.add(H_Salvar);

		JButton btnNewButton_1_2 = new JButton("Limpar");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H_EA.setText("");
				H_NV.setText("");
				H_NO.setText("");
				H_OBS.setText("");
			}
		});
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnNewButton_1_2.setBackground(new Color(128, 0, 0));
		btnNewButton_1_2.setBounds(225, 294, 110, 23);
		panel_2.add(btnNewButton_1_2);

		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("img\\fundo.png"));
		lblNewLabel_8.setBounds(0, 0, 429, 328);
		panel_2.add(lblNewLabel_8);
	}
}
