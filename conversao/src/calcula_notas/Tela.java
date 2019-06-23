package calcula_notas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField tfAP1;
	private JTextField tfAP2;
	private JTextField tfAP3;
	private JTextField tfAET1;
	private JTextField tfIntroducao2;
	private JTextField tfAEP2;
	private JTextField tfAEP3;
	private JTextField tfIntroducao1;
	private JTextField tfLogica1;
	private JTextField tfEngenharia1;
	private JTextField tfLogica2;
	private JTextField tfIntroducao3;
	private JTextField tfEngenharia3;
	private JTextField tfLogica3;
	private JTextField tfEngenharia2;
	private JTextField tfMediaAlgoritmo;
	private JTextField tfRecupAlgoritmo;
	private JTextField tfMediaAnalise;
	private JTextField tfMediaIntroducao;
	private JTextField tfMediaLogica;
	private JTextField tfMediaEngenharia;
	private JTextField tfRecupAnalise;
	private JTextField tfRecupIntroducao;
	private JTextField tfRecupLogica;
	private JTextField tfRecupEngenharia;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tela() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAlgortmosEProgramao = new JLabel("ALGORÍTMOS E PROGRAMAÇÃO I");
		lblAlgortmosEProgramao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAlgortmosEProgramao.setBounds(66, 59, 214, 14);
		contentPane.add(lblAlgortmosEProgramao);

		JLabel lblAnaliseEExpressao = new JLabel("\tANALISE E EXPRESSAO TEXTUAL");
		lblAnaliseEExpressao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAnaliseEExpressao.setBounds(52, 84, 227, 14);
		contentPane.add(lblAnaliseEExpressao);

		JLabel lblIntroducaoAComputacao = new JLabel("\tINTRODUCAO A COMPUTACAO E SISTEMAS DE INFO");
		lblIntroducaoAComputacao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIntroducaoAComputacao.setBounds(10, 109, 270, 14);
		contentPane.add(lblIntroducaoAComputacao);

		JLabel lblLogicaEMatematica = new JLabel("LOGICA E MATEMATICA DISCRETA");
		lblLogicaEMatematica.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLogicaEMatematica.setBounds(52, 134, 228, 14);
		contentPane.add(lblLogicaEMatematica);

		JLabel lblPrincipiosDeEngenharia = new JLabel("PRINCIPIOS DE ENGENHARIA DE SOFTWARE");
		lblPrincipiosDeEngenharia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrincipiosDeEngenharia.setBounds(35, 159, 245, 14);
		contentPane.add(lblPrincipiosDeEngenharia);

		tfAP1 = new JTextField();
		tfAP1.setBounds(290, 56, 40, 20);
		contentPane.add(tfAP1);
		tfAP1.setColumns(10);

		tfAP2 = new JTextField();
		tfAP2.setColumns(10);
		tfAP2.setBounds(340, 56, 40, 20);
		contentPane.add(tfAP2);

		tfAP3 = new JTextField();
		tfAP3.setColumns(10);
		tfAP3.setBounds(390, 56, 40, 20);
		contentPane.add(tfAP3);

		tfAET1 = new JTextField();
		tfAET1.setColumns(10);
		tfAET1.setBounds(289, 81, 40, 20);
		contentPane.add(tfAET1);

		tfIntroducao2 = new JTextField();
		tfIntroducao2.setColumns(10);
		tfIntroducao2.setBounds(340, 106, 40, 20);
		contentPane.add(tfIntroducao2);

		tfAEP2 = new JTextField();
		tfAEP2.setColumns(10);
		tfAEP2.setBounds(340, 81, 40, 20);
		contentPane.add(tfAEP2);

		tfAEP3 = new JTextField();
		tfAEP3.setColumns(10);
		tfAEP3.setBounds(390, 81, 40, 20);
		contentPane.add(tfAEP3);

		tfIntroducao1 = new JTextField();
		tfIntroducao1.setColumns(10);
		tfIntroducao1.setBounds(290, 106, 40, 20);
		contentPane.add(tfIntroducao1);

		tfLogica1 = new JTextField();
		tfLogica1.setColumns(10);
		tfLogica1.setBounds(290, 131, 40, 20);
		contentPane.add(tfLogica1);

		tfEngenharia1 = new JTextField();
		tfEngenharia1.setColumns(10);
		tfEngenharia1.setBounds(290, 156, 40, 20);
		contentPane.add(tfEngenharia1);

		tfLogica2 = new JTextField();
		tfLogica2.setColumns(10);
		tfLogica2.setBounds(340, 131, 40, 20);
		contentPane.add(tfLogica2);

		tfIntroducao3 = new JTextField();
		tfIntroducao3.setColumns(10);
		tfIntroducao3.setBounds(390, 106, 40, 20);
		contentPane.add(tfIntroducao3);

		tfEngenharia3 = new JTextField();
		tfEngenharia3.setColumns(10);
		tfEngenharia3.setBounds(390, 156, 40, 20);
		contentPane.add(tfEngenharia3);

		tfLogica3 = new JTextField();
		tfLogica3.setColumns(10);
		tfLogica3.setBounds(390, 131, 40, 20);
		contentPane.add(tfLogica3);

		tfEngenharia2 = new JTextField();
		tfEngenharia2.setColumns(10);
		tfEngenharia2.setBounds(340, 156, 40, 20);
		contentPane.add(tfEngenharia2);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(251, 197, 89, 23);
		contentPane.add(btnCalcular);

		JLabel lblMedia = new JLabel("MÉDIA");
		lblMedia.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedia.setBounds(455, 33, 46, 14);
		contentPane.add(lblMedia);

		JLabel lblRecuperao = new JLabel("RECUPERAÇÃO");
		lblRecuperao.setBounds(515, 33, 89, 14);
		contentPane.add(lblRecuperao);

		tfMediaAlgoritmo = new JTextField();
		tfMediaAlgoritmo.setEditable(false);
		tfMediaAlgoritmo.setColumns(10);
		tfMediaAlgoritmo.setBounds(461, 56, 40, 20);
		contentPane.add(tfMediaAlgoritmo);

		tfRecupAlgoritmo = new JTextField();
		tfRecupAlgoritmo.setEditable(false);
		tfRecupAlgoritmo.setColumns(10);
		tfRecupAlgoritmo.setBounds(525, 56, 40, 20);
		contentPane.add(tfRecupAlgoritmo);

		tfMediaAnalise = new JTextField();
		tfMediaAnalise.setEditable(false);
		tfMediaAnalise.setColumns(10);
		tfMediaAnalise.setBounds(461, 81, 40, 20);
		contentPane.add(tfMediaAnalise);

		tfMediaIntroducao = new JTextField();
		tfMediaIntroducao.setEditable(false);
		tfMediaIntroducao.setColumns(10);
		tfMediaIntroducao.setBounds(461, 106, 40, 20);
		contentPane.add(tfMediaIntroducao);

		tfMediaLogica = new JTextField();
		tfMediaLogica.setEditable(false);
		tfMediaLogica.setColumns(10);
		tfMediaLogica.setBounds(461, 131, 40, 20);
		contentPane.add(tfMediaLogica);

		tfMediaEngenharia = new JTextField();
		tfMediaEngenharia.setEditable(false);
		tfMediaEngenharia.setColumns(10);
		tfMediaEngenharia.setBounds(461, 156, 40, 20);
		contentPane.add(tfMediaEngenharia);

		tfRecupAnalise = new JTextField();
		tfRecupAnalise.setEditable(false);
		tfRecupAnalise.setColumns(10);
		tfRecupAnalise.setBounds(525, 81, 40, 20);
		contentPane.add(tfRecupAnalise);

		tfRecupIntroducao = new JTextField();
		tfRecupIntroducao.setEditable(false);
		tfRecupIntroducao.setColumns(10);
		tfRecupIntroducao.setBounds(525, 106, 40, 20);
		contentPane.add(tfRecupIntroducao);

		tfRecupLogica = new JTextField();
		tfRecupLogica.setEditable(false);
		tfRecupLogica.setColumns(10);
		tfRecupLogica.setBounds(525, 131, 40, 20);
		contentPane.add(tfRecupLogica);

		tfRecupEngenharia = new JTextField();
		tfRecupEngenharia.setEditable(false);
		tfRecupEngenharia.setColumns(10);
		tfRecupEngenharia.setBounds(525, 156, 40, 20);
		contentPane.add(tfRecupEngenharia);

		lblNewLabel = new JLabel("UNIDADES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(319, 11, 70, 14);
		contentPane.add(lblNewLabel);

		label = new JLabel("1ª");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(290, 33, 40, 14);
		contentPane.add(label);

		label_1 = new JLabel("2ª");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(340, 33, 40, 14);
		contentPane.add(label_1);

		label_2 = new JLabel("3ª");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(390, 33, 40, 14);
		contentPane.add(label_2);

		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// --------VERIFICA SE OS CAMPOS DA PRIMEIRA UNIDADE ESTAO TODOS PREENCHIDOS
				if (tfAET1.getText().equals("") || tfAP1.getText().equals("") || tfEngenharia1.getText().equals("")
						|| tfIntroducao1.getText().equals("") || tfLogica1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos da primeira unidade. "
							+ "Caso ainda nao tenha nota, complete o(s) campo(s) com 0 (Zero)");
				} else {

					// ---------------------AP1--------------
					if (tfAP1.getText().equals("") && tfAP2.getText().equals("") && tfAP3.getText().equals("")) {
						tfAP1.setText("7");
						tfAP2.setText("7");
						tfAP3.setText("7");
					} else if (tfAP2.getText().equals("") && tfAP3.getText().equals("")) {
						String f = calcula(tfAP1);
						tfAP2.setText(f);
						tfAP3.setText(f);
					} else if (tfAP3.getText().equals("")) {
						tfAP3.setText(calcula(tfAP1, tfAP2));
					}
					// ----------------ANALISE E PRODUCAO TEXTUAL--------------
					if (tfAET1.getText().equals("") && tfAEP2.getText().equals("") && tfAEP3.getText().equals("")) {
						tfAET1.setText("7");
						tfAEP2.setText("7");
						tfAEP3.setText("7");
					} else if (tfAEP2.getText().equals("") && tfAEP3.getText().equals("")) {
						String g = calcula(tfAET1);
						tfAEP2.setText(g);
						tfAEP3.setText(g);
					} else if (tfAEP3.getText().equals("")) {
						tfAEP3.setText(calcula(tfAET1, tfAEP2));
					}
					// ----------------INTRODUCAO A SISTEMAS DE INFORMACAO--------------
					if (tfIntroducao1.getText().equals("") && tfIntroducao2.getText().equals("")
							&& tfIntroducao3.getText().equals("")) {
						tfIntroducao1.setText("7");
						tfIntroducao2.setText("7");
						tfIntroducao3.setText("7");
					} else if (tfIntroducao2.getText().equals("") && tfIntroducao3.getText().equals("")) {
						String m = calcula(tfIntroducao1);
						tfIntroducao2.setText(m);
						tfIntroducao3.setText(m);
					} else if (tfIntroducao3.getText().equals("")) {
						tfIntroducao3.setText(calcula(tfIntroducao1, tfIntroducao2));
					}
					// ----------------LOGICA E MATEMATICA DISCRETA--------------
					if (tfLogica1.getText().equals("") && tfLogica2.getText().equals("")
							&& tfLogica3.getText().equals("")) {
						tfLogica1.setText("7");
						tfLogica2.setText("7");
						tfLogica3.setText("7");
					} else if (tfLogica2.getText().equals("") && tfLogica3.getText().equals("")) {
						String n = calcula(tfLogica1);
						tfLogica2.setText(n);
						tfLogica3.setText(n);
					} else if (tfLogica3.getText().equals("")) {
						tfLogica3.setText(calcula(tfLogica1, tfLogica2));
					}
					// ----------------ENGENHARIA DE SOFTWARE--------------
					if (tfEngenharia1.getText().equals("") && tfEngenharia2.getText().equals("")
							&& tfEngenharia3.getText().equals("")) {
						tfEngenharia1.setText("7");
						tfEngenharia2.setText("7");
						tfEngenharia3.setText("7");
					} else if (tfEngenharia2.getText().equals("") && tfEngenharia3.getText().equals("")) {
						String n = calcula(tfEngenharia1);
						tfEngenharia2.setText(n);
						tfEngenharia3.setText(n);
					} else if (tfEngenharia3.getText().equals("")) {
						tfEngenharia3.setText(calcula(tfEngenharia1, tfEngenharia2));
					}

					// ------- calcula a media das materias-------------------
					tfMediaAlgoritmo.setText(calculaMedia(tfAP1, tfAP2, tfAP3));
					tfMediaAnalise.setText(calculaMedia(tfAET1, tfAEP2, tfAEP3));
					tfMediaEngenharia.setText(calculaMedia(tfEngenharia1, tfEngenharia2, tfEngenharia3));
					tfMediaIntroducao.setText(calculaMedia(tfIntroducao1, tfIntroducao2, tfIntroducao3));
					tfMediaLogica.setText(calculaMedia(tfLogica1, tfLogica2, tfLogica3));

					// -------VERIFICA SE FICOU EM RECUPERACAO E CALCULA QUANTO
					// PRECISA-------------------
					double numero = Double.parseDouble(tfMediaAlgoritmo.getText().replace(',', '.'));
					if (numero < 7) {
						tfRecupAlgoritmo.setText(calculaRecuperacao(numero));
					}
					numero = Double.parseDouble(tfMediaAnalise.getText().replace(',', '.'));
					if (numero < 7) {
						tfRecupAnalise.setText(calculaRecuperacao(numero));
					}
					numero = Double.parseDouble(tfMediaEngenharia.getText().replace(',', '.'));
					if (numero < 7) {
						tfRecupEngenharia.setText(calculaRecuperacao(numero));
					}
					numero = Double.parseDouble(tfMediaIntroducao.getText().replace(',', '.'));
					if (numero < 7) {
						tfRecupIntroducao.setText(calculaRecuperacao(numero));
					}
					numero = Double.parseDouble(tfMediaLogica.getText().replace(',', '.'));
					if (numero < 7) {
						tfRecupLogica.setText(calculaRecuperacao(numero));
					}
				}
			}
		});
	}

	private String calculaRecuperacao(double numero) {
		double rec = (50 - (numero * 6)) / 4;
		return String.format("%.1f", rec);
	}

	private String calculaMedia(JTextField n1, JTextField n2, JTextField n3) {
		double nota1 = Double.parseDouble(n1.getText());
		double nota2 = Double.parseDouble(n2.getText());
		double nota3 = Double.parseDouble(n3.getText());
		String resultado = String.format("%.1f", (nota1 + nota2 + nota3) / 3);
		return resultado;
	}

	public String calcula(JTextField nota1, JTextField nota2) {
		double notaUm = Double.parseDouble(nota1.getText());
		double notaDois = Double.parseDouble(nota2.getText());
		double quantoFalta = 21 - (notaUm + notaDois);
		return quantoFalta + "";
	}

	public String calcula(JTextField nota1) {
		double notaUm = Double.parseDouble(nota1.getText());
		double quantoFalta = (21 - notaUm) / 2;
		return quantoFalta + "";
	}
}
