package gui;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import funcoes.Operacoes;

import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValorInformado;
	private ButtonGroup grupo1;
	private ButtonGroup grupo2;
	private JTextField txtResultado;

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

	public Principal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnBinario = new JRadioButton("Binario");
		rdbtnBinario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnBinario.setBounds(41, 54, 109, 23);
		contentPane.add(rdbtnBinario);
		
		JRadioButton rdbtnOctal = new JRadioButton("Octal");
		rdbtnOctal.setBounds(152, 54, 109, 23);
		rdbtnOctal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(rdbtnOctal);
		
		JRadioButton rdbtnDecimal = new JRadioButton("Decimal");
		rdbtnDecimal.setBounds(267, 54, 109, 23);
		rdbtnDecimal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(rdbtnDecimal);
		
		JRadioButton rdbtnHexadecimal = new JRadioButton("Hexadecimal");
		rdbtnHexadecimal.setBounds(383, 54, 109, 23);
		rdbtnHexadecimal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(rdbtnHexadecimal);
		
		grupo1 = new ButtonGroup();
		grupo1.add(rdbtnBinario);
		grupo1.add(rdbtnOctal);
		grupo1.add(rdbtnDecimal);
		grupo1.add(rdbtnHexadecimal);
		
		txtValorInformado = new JTextField();
		txtValorInformado.setBounds(192, 106, 162, 20);
		contentPane.add(txtValorInformado);
		txtValorInformado.setColumns(10);
		
		JLabel lblConverterDe = new JLabel("Converter de:");
		lblConverterDe.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblConverterDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblConverterDe.setBounds(192, 11, 162, 36);
		contentPane.add(lblConverterDe);
		
		JLabel lblPara = new JLabel("Para:");
		lblPara.setHorizontalAlignment(SwingConstants.CENTER);
		lblPara.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPara.setBounds(192, 147, 162, 36);
		contentPane.add(lblPara);
		
		JRadioButton rdbtnBinarioDepois = new JRadioButton("Binario");
		rdbtnBinarioDepois.setBounds(41, 193, 109, 23);
		contentPane.add(rdbtnBinarioDepois);
		
		JRadioButton rdbtnOctalDepois = new JRadioButton("Octal");
		rdbtnOctalDepois.setBounds(152, 193, 109, 23);
		contentPane.add(rdbtnOctalDepois);
		
		JRadioButton rdbtnDecimalDepois = new JRadioButton("Decimal");
		rdbtnDecimalDepois.setBounds(263, 193, 109, 23);
		contentPane.add(rdbtnDecimalDepois);
		
		JRadioButton rdbtnHexadecimalDepois = new JRadioButton("Hexadecimal");
		rdbtnHexadecimalDepois.setBounds(383, 193, 109, 23);
		contentPane.add(rdbtnHexadecimalDepois);
		
		grupo2 = new ButtonGroup();
		grupo2.add(rdbtnBinarioDepois);
		grupo2.add(rdbtnOctalDepois);
		grupo2.add(rdbtnDecimalDepois);
		grupo2.add(rdbtnHexadecimalDepois);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblResultado.setBounds(192, 223, 162, 36);
		contentPane.add(lblResultado);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(192, 270, 162, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.setBounds(41, 269, 102, 23);
		contentPane.add(btnConverter);
		
		btnConverter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if ((rdbtnBinario.isSelected()&&rdbtnBinarioDepois.isSelected())||
						(rdbtnDecimal.isSelected()&&rdbtnDecimalDepois.isSelected())||
						(rdbtnHexadecimal.isSelected()&&rdbtnHexadecimalDepois.isSelected())||
						(rdbtnOctal.isSelected()&&rdbtnOctalDepois.isSelected())) {
					JOptionPane.showMessageDialog(null, "Você selecionou os mesmo tipos");
				}// de binario para decimal------------------------------------------------------------------------------------------------
				else if(rdbtnBinario.isSelected()&&rdbtnDecimalDepois.isSelected()) {
					txtResultado.setText(Operacoes.converteBinarioParaDecimal(txtValorInformado.getText())+"");
				}// de binario para octal------------------------------------------------------------------------------------------------
				else if(rdbtnBinario.isSelected()&&rdbtnOctalDepois.isSelected()) {
					txtResultado.setText(Operacoes.converteBinarioParaOctal(txtValorInformado.getText()));
				}// de binario para hexadecimal------------------------------------------------------------------------------------------------
				else if(rdbtnBinario.isSelected()&&rdbtnHexadecimalDepois.isSelected()) {
					txtResultado.setText(Operacoes.converteBinarioParaHexadecimal(txtValorInformado.getText()));
				}// de octal para binario------------------------------------------------------------------------------------------------
				else if(rdbtnOctal.isSelected()&&rdbtnBinarioDepois.isSelected()) {
					txtResultado.setText(Operacoes.converteOctalParaBinario(txtValorInformado.getText()));
				}// de octal para decimal------------------------------------------------------------------------------------------------
				else if(rdbtnOctal.isSelected()&&rdbtnDecimalDepois.isSelected()) {
					txtResultado.setText(Operacoes.converteOctalParaDecimal(txtValorInformado.getText()));
				}// de octal para hexadecimal------------------------------------------------------------------------------------------------
				else if(rdbtnOctal.isSelected()&&rdbtnHexadecimalDepois.isSelected()) {
					txtResultado.setText(Operacoes.converteOctalParaHexadecimal(txtValorInformado.getText()));
				}// de decimal para binario------------------------------------------------------------------------------------------------
				else if(rdbtnDecimal.isSelected()&&rdbtnBinarioDepois.isSelected()) {
					int numero = Integer.parseInt(txtValorInformado.getText());
					txtResultado.setText(Integer.toBinaryString(numero));
				}// de decimal para octal------------------------------------------------------------------------------------------------
				else if(rdbtnDecimal.isSelected()&&rdbtnOctalDepois.isSelected()) {
					int numero = Integer.parseInt(txtValorInformado.getText());
					txtResultado.setText(Integer.toOctalString(numero));
				}// de decimal para hexadecimal------------------------------------------------------------------------------------------------
				else if(rdbtnDecimal.isSelected()&&rdbtnHexadecimalDepois.isSelected()) {
					int numero = Integer.parseInt(txtValorInformado.getText());
					txtResultado.setText(Integer.toHexString(numero));
				}// de hexadecimal para binario------------------------------------------------------------------------------------------------
				else if(rdbtnHexadecimal.isSelected()&&rdbtnBinarioDepois.isSelected()) {
					txtResultado.setText(Operacoes.converteHexadecimalParaBinario(txtValorInformado.getText()));
				}// de hexadecimal para octal------------------------------------------------------------------------------------------------
				else if(rdbtnHexadecimal.isSelected()&&rdbtnOctalDepois.isSelected()) {
					txtResultado.setText(Operacoes.converteHexadecimalParaOctal(txtValorInformado.getText()));
				}// de hexadecimal para decimal------------------------------------------------------------------------------------------------
				else if(rdbtnHexadecimal.isSelected()&&rdbtnDecimalDepois.isSelected()) {
					int decimal = Integer.parseInt(txtValorInformado.getText(), 16);
					txtResultado.setText(decimal+"");
				}//-------------------------------------------------------------------------------------------------------------------------
			}
		});
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(403, 269, 102, 23);
		contentPane.add(btnSair);
		
		btnSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setBounds(136, 109, 46, 14);
		contentPane.add(lblValor);
	}
}
