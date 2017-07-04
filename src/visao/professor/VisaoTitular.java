package visao.professor;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.executora.Executora;
import dados.excecao.InformacaoFaltanteException;
import dados.professor.Associado;
import dados.professor.Titular;

public class VisaoTitular extends JFrame implements ActionListener {

	public JLabel 	lMensagem, 
					lMatriculaSiape, 
					lMatriculaFUP, 
					lFormacao, 
					lSalario, 
					lGraduacao, 
					lAnoGraduacao, 
					lMestrado, 
					lAnoMestrado, 
					lTituloDissertacao,
					lDoutorado, 
					lAnoDoutorado, 
					lTituloTese, 
					lAreaDePesquisa, 
					lConcurso, 
					lDataDeAdmissao, 
					lVazio1, 
					lVazio2;
	public JTextField	tfMatriculaSiape, 
						tfMatriculaFUP, 
						tfFormacao, 
						tfSalario, 
						tfGraduacao, 
						tfAnoGraduacao, 
						tfMestrado, 
						tfAnoMestrado, 
						tfTituloDissertacao, 
						tfDoutorado, 
						tfAnoDoutorado, 
						tfTituloTese, 
						tfAreaDePesquisa, 
						tfConcurso, 
						tfDataDeAdmissao;
	public JButton	bLimpar, 
					bCadastrar, 
					bVoltar;

	public VisaoTitular() {
		setTitle("Cadastro Professor");
		setSize(320, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lMensagem = new JLabel("\t\t\t\t\t\t\t Cadastro Titular");
		lMatriculaSiape = new JLabel("\t\t\t\t\t\t\t Matrícula Siape:");
		lMatriculaFUP = new JLabel("\t\t\t\t\t\t\t Matrícula FUP:");
		lFormacao = new JLabel("\t\t\t\t\t\t\t Formação:");
		lSalario = new JLabel("\t\t\t\t\t\t\t Salário:");
		lGraduacao = new JLabel("\t\t\t\t\t\t\t Graduação:");
		lAnoGraduacao = new JLabel("\t\t\t\t\t\t\t Ano da Graduação:");
		lMestrado = new JLabel("\t\t\t\t\t\t\t Mestrado:");
		lAnoMestrado = new JLabel("\t\t\t\t\t\t\t Ano do Mestrado:");
		lTituloDissertacao = new JLabel("\t\t\t\t\t\t\t Título Dissertação:");
		lDoutorado = new JLabel("\t\t\t\t\t\t\t Doutorado:");
		lAnoDoutorado = new JLabel("\t\t\t\t\t\t\t Ano do Doutorado:");
		lTituloTese = new JLabel("\t\t\t\t\t\t\t Título Tese:");
		lAreaDePesquisa = new JLabel("\t\t\t\t\t\t\t Área de Pesquisa:");
		lConcurso = new JLabel("\t\t\t\t\t\t\t Concurso:");
		lDataDeAdmissao = new JLabel("\t\t\t\t\t\t\t Data de Admissão:");
		lVazio1 = new JLabel();
		lVazio2 = new JLabel();
		tfMatriculaSiape = new JTextField("Ex.: 123456789", 15);
		tfMatriculaFUP = new JTextField("Ex.: 123456789", 15);
		tfFormacao = new JTextField("Ex.: Doutorado", 15);
		tfSalario = new JTextField("Ex.: 10000,00", 15);
		tfGraduacao = new JTextField("Ex.: Eng. de Tal", 15);
		tfAnoGraduacao = new JTextField("Ex.: 2005", 15);
		tfMestrado = new JTextField("Ex.: Eng. de Tal", 15);
		tfAnoMestrado = new JTextField("Ex.: 2007", 15);
		tfTituloDissertacao = new JTextField("Ex.: Beltrano", 15);
		tfDoutorado = new JTextField("Ex.: Eng. de Tal", 15);
		tfAnoDoutorado = new JTextField("Ex.: 2011", 15);
		tfTituloTese = new JTextField("Ex.: Ciclano", 15);
		tfAreaDePesquisa = new JTextField("Ex.: Tal", 15);
		tfConcurso = new JTextField("Ex.: 1/1/2012", 15);
		tfDataDeAdmissao = new JTextField("Ex.: 1/1/2013", 15);
		bLimpar = new JButton("Limpar");
		bCadastrar = new JButton("Cadastrar");
		bVoltar = new JButton("Voltar");
		
		setLayout(new GridLayout(18, 2));
		add(lMensagem);
		add(lVazio1);
		add(lMatriculaSiape);
		add(tfMatriculaSiape);
		add(lMatriculaFUP);
		add(tfMatriculaFUP);
		add(lFormacao);
		add(tfFormacao);
		add(lSalario);
		add(tfSalario);
		add(lGraduacao);
		add(tfGraduacao);
		add(lAnoGraduacao);
		add(tfAnoGraduacao);
		add(lMestrado);
		add(tfMestrado);
		add(lAnoMestrado);
		add(tfAnoMestrado);
		add(lTituloDissertacao);
		add(tfTituloDissertacao);
		add(lDoutorado);
		add(tfDoutorado);
		add(lAnoDoutorado);
		add(tfAnoDoutorado);
		add(lTituloTese);
		add(tfTituloTese);
		add(lAreaDePesquisa);
		add(tfAreaDePesquisa);
		add(lConcurso);
		add(tfConcurso);
		add(lDataDeAdmissao);
		add(tfDataDeAdmissao);
		add(bLimpar);
		bLimpar.addActionListener(this);
		add(bCadastrar);
		bCadastrar.addActionListener(this);
		add(lVazio2);
		add(bVoltar);
		bVoltar.addActionListener(this);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bLimpar) {
			tfMatriculaSiape.setText(null);
			tfMatriculaFUP.setText(null);
			tfFormacao.setText(null);
			tfSalario.setText(null);
			tfGraduacao.setText(null);
			tfAnoGraduacao.setText(null);
			tfMestrado.setText(null);
			tfAnoMestrado.setText(null);
			tfTituloDissertacao.setText(null);
			tfDoutorado.setText(null);
			tfAnoDoutorado.setText(null);
			tfTituloTese.setText(null);
			tfAreaDePesquisa.setText(null);
			tfConcurso.setText(null);
			tfDataDeAdmissao.setText(null);
		} else if(e.getSource() == bCadastrar) {
			try{
				if (!tfMatriculaSiape.getText().isEmpty()) {
					if (!tfMatriculaFUP.getText().trim().isEmpty()) {
						if (!tfFormacao.getText().trim().isEmpty()) {
							if (!tfSalario.getText().trim().isEmpty()) {
								String salario = tfSalario.getText();
								for (int i = 0; i < salario.length(); i++) {
									if (salario.charAt(i) == ',') {
										salario = salario.replaceAll(",", ".");
								    }
								}
								if (!tfGraduacao.getText().trim().isEmpty()) {
									if (!tfAnoGraduacao.getText().trim().isEmpty()) {
										if (!tfMestrado.getText().trim().isEmpty()) {
											if (!tfAnoMestrado.getText().trim().isEmpty()) {
												if (!tfTituloDissertacao.getText().trim().isEmpty()) {
													if (!tfDoutorado.getText().trim().isEmpty()) {
														if (!tfAnoDoutorado.getText().trim().isEmpty()) {
															if (!tfTituloTese.getText().trim().isEmpty()) {
																if (!tfAreaDePesquisa.getText().trim().isEmpty()) {
																	if (!tfConcurso.getText().trim().isEmpty()) {
																		if (!tfDataDeAdmissao.getText().trim().isEmpty()) {
																			try {
																				DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
																				Date date = (Date)formatter.parse(tfConcurso.getText());
																				Date date2 = (Date)formatter.parse(tfDataDeAdmissao.getText());
																				Executora.professor.cadastraTitular(new Titular(Integer.parseInt(tfMatriculaSiape.getText()), Integer.parseInt(tfMatriculaFUP.getText()), tfFormacao.getText(), Float.parseFloat(salario), tfGraduacao.getText(), Integer.parseInt(tfAnoGraduacao.getText()), tfMestrado.getText(), Integer.parseInt(tfAnoMestrado.getText()), tfTituloDissertacao.getText(), tfDoutorado.getText(), Integer.parseInt(tfAnoDoutorado.getText()), tfTituloTese.getText(), tfAreaDePesquisa.getText(), date, date2));
																				JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
																			} catch (ParseException e1) {
																				e1.printStackTrace();
																			}
																		} else {
																			throw new InformacaoFaltanteException("Data de Admissão não informada!");
																		}
																	} else {
																		throw new InformacaoFaltanteException("Concurso não informada!");
																	}
																} else {
																	throw new InformacaoFaltanteException("Área de Pesquisa não informada!");
																}
															} else {
																throw new InformacaoFaltanteException("Título da Tese não informado!");
															}
														} else {
															throw new InformacaoFaltanteException("Ano do Doutorado não informado!");
														}
													} else {
														throw new InformacaoFaltanteException("Doutorado não informado!");
													}
												} else {
													throw new InformacaoFaltanteException("Título da Dissertação não informado!");
												}
											} else {
												throw new InformacaoFaltanteException("Ano do Mestrado não informado!");
											}
										} else {
											throw new InformacaoFaltanteException("Mestrado não informado!");
										}
									} else {
										throw new InformacaoFaltanteException("Ano da Graduação não informada!");	
									}
								} else {
									throw new InformacaoFaltanteException("Graduação não informada!");
								}
							} else {
								throw new InformacaoFaltanteException("Salário não informado!");
							}
						} else {
							throw new InformacaoFaltanteException("Formação não informada!");
						}
					} else {
						throw new InformacaoFaltanteException("Matrícula FUP não informada!");
					}
				} else {
					throw new InformacaoFaltanteException("Matrícula Siape não informada!");
				}
			} catch (InformacaoFaltanteException e1) {
				e1.printStackTrace();
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(null, "Coloque somente números nas matrículas, salário, ano da graduação, ano do mestrado e ano do doutorado!");
			}
		} else if (e.getSource() == bVoltar) {
			dispose();
		}
	}

}
