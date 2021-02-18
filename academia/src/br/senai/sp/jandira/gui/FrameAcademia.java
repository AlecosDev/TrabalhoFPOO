package br.senai.sp.jandira.gui;

import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.time.LocalDate;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
	import javax.swing.JComboBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Aluno;

	public class FrameAcademia {
		
		public void criarTela(){
			
			
			JFrame tela = new JFrame();
			tela.setTitle("Registro Academia");
			tela.setSize(700, 400);
			tela.setDefaultCloseOperation(3);
			tela.setLayout(null);
			
			JLabel labelNome = new JLabel();
			labelNome.setText("Nome: ");
			labelNome.setBounds(30, 40, 50, 30);
			
			JTextField textNome = new JTextField();
			textNome.setBounds(75, 40, 230, 30);
			
			
				JLabel labelSexo = new JLabel();
				labelSexo.setText("Sexo: ");
				labelSexo.setBounds(30, 90, 50, 30);
				
				JTextField textSexo = new JTextField();
				textSexo.setBounds(75, 90, 130, 30);
				
				
				
				ButtonGroup groupSexo = new ButtonGroup();
				
				JRadioButton radioFeminino = new JRadioButton();
				groupSexo.add(radioFeminino);
				JRadioButton radioMasculino = new JRadioButton();
				groupSexo.add(radioMasculino);
				
				radioFeminino.setBounds(75, 90, 80, 30);
				radioFeminino.setText("Feminino");
				radioMasculino.setBounds(160, 90, 90, 30);
				radioMasculino.setText("Masculino");
				
				
				JLabel labelData = new JLabel();
				labelData.setText("Data De Nascimento: ");
				labelData.setBounds(350, 40, 130, 30);
							
				JTextField textData = new JTextField();
				textData.setBounds(480, 40, 100, 30);
				
				JLabel labelPeso = new JLabel();
				labelPeso.setText("Peso: ");
				labelPeso.setBounds(30, 160, 130, 30);
										
				JTextField textPeso = new JTextField();
				textPeso.setBounds(75, 160, 100, 30);
				
				JLabel labelAltura = new JLabel();
				labelAltura.setText("altura: ");
				labelAltura.setBounds(30, 200, 130, 30);
										
				JTextField textAltura = new JTextField();
				textAltura.setBounds(75, 200, 100, 30);
				
				
				
				JLabel labelAtividade = new JLabel();
				labelAtividade.setText("Nivel De Atividade: ");
				labelAtividade.setBounds(350, 90, 110, 30);
				
				String niveisDeAtividade[] = {
						"Nunhema", 
						"Leve", 
						"Moderada", 
						"Intensa"};
				
				JComboBox<String> combo = new JComboBox<String>(niveisDeAtividade);
				combo.setBounds(480, 90, 130, 30);
				
				JLabel labelImc = new JLabel();
				labelImc.setText("IMC: ");
				labelImc.setBounds(350, 160, 530, 30);
				
				JLabel labelNcd = new JLabel();
				labelNcd.setText("NCD: ");
				labelNcd.setBounds(350, 200, 130, 90);
				
				JButton btnCalcular = new JButton();
				btnCalcular.setText("Calcular");
				btnCalcular.setBounds(30, 260, 110, 50);
				
				JButton btnLimpar = new JButton();
				btnLimpar.setText("Limpar");
				btnLimpar.setBounds(150, 260, 110, 50);
				
				
				
			tela.getContentPane().add(textNome);
			tela.getContentPane().add(labelNome);
			tela.getContentPane().add(labelSexo);
			tela.getContentPane().add(textData);
			tela.getContentPane().add(labelData);
			tela.getContentPane().add(textPeso);
			tela.getContentPane().add(labelPeso);
			tela.getContentPane().add(textAltura);
			tela.getContentPane().add(labelAltura);
			tela.getContentPane().add(labelAtividade);
			tela.getContentPane().add(combo);
			tela.getContentPane().add(labelImc);
			tela.getContentPane().add(labelNcd);
			tela.getContentPane().add(btnCalcular);
			tela.getContentPane().add(btnLimpar);
			tela.getContentPane().add(radioFeminino);
			tela.getContentPane().add(radioMasculino);
			
			
			tela.setVisible(true);
			
			btnCalcular.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Aluno a1 = new Aluno();
					DecimalFormat formato = new DecimalFormat("00.0");
					
					a1.setNome(textNome.getText());
					a1.setDataDeNascimento(LocalDate.of(2000, 07, 03));
					a1.setNivelDeAtividade(combo.getSelectedIndex());
					a1.setSexo(radioFeminino.isSelected()?'m':'f');
					a1.setAltura(Double.parseDouble(textAltura.getText()));
					a1.setPeso(Double.parseDouble(textPeso.getText()));
					
					labelImc.setText("IMC:  " + String.valueOf(formato.format(a1.getImc()) + "   " + a1.getStatusImc()));
					labelNcd.setText("NCD:  " + a1.getIdade() + String.valueOf(formato.format(a1.getNcd())));
				}
			});
			
			btnLimpar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					labelImc.setText("IMC:  ");
					labelNcd.setText("NCD:  ");
					textAltura.setText("");
					textData.setText("");
					textNome.setText("");
					textPeso.setText("");
				}
			});
			
		}
		
	}

