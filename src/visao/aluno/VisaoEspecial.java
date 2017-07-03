package visao.aluno;

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
import dados.aluno.Especial;
import dados.excecao.InformacaoFaltanteException;
import dados.excecao.OrientadorNaoAtribuidoException;
import dados.professor.Professor;

public class VisaoEspecial extends JFrame implements ActionListener {

	public JLabel 	lMensagem, 
					lMatricula, 
					lNome, 
					lSemestreIngresso, 
					lSemestreQualificacao, 
					lDataDefesa, 
					lProfessor, 
					lTaxaPaga, 
					lSemestreCursando, 
					lVazio1, 
					lVazio2;
	public JTextField	tfMatricula, 
						tfNome, 
						tfSemestreIngresso, 
						tfSemestreQualificacao, 
						tfDataDefesa, 
						tfProfessor, 
						tfTaxaPaga, 
						tfSemestreCursando;
	public JButton	bLimpar, 
					bCadastrar, 
					bVoltar;

	public VisaoEspecial() {
		setTitle("Cadastro Aluno");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lMensagem = new JLabel("\t\t\t\t\t\t\t Cadastro Especial");
		lMatricula = new JLabel("\t\t\t\t\t\t\t Matrícula:");
		lNome = new JLabel("\t\t\t\t\t\t\t Nome:");
		lSemestreIngresso = new JLabel("\t\t\t\t\t\t\t Semestre de Ingresso:");
		lSemestreQualificacao = new JLabel("\t\t\t\t\t\t\t Semestre de Qualificação:");
		lDataDefesa = new JLabel("\t\t\t\t\t\t\t Data de Defesa:");
		lProfessor = new JLabel("\t\t\t\t\t\t\t Matrícula Siape do Professor:");
		lTaxaPaga = new JLabel("\t\t\t\t\t\t\t Taxa Paga:");
		lSemestreCursando = new JLabel("\t\t\t\t\t\t\t Semestre Cursando:");
		lVazio1 = new JLabel();
		lVazio2 = new JLabel();
		tfMatricula = new JTextField("Ex.: 123456789", 15);
		tfNome = new JTextField("Ex.: Fulano de Tal", 15);
		tfSemestreIngresso = new JTextField("Ex.: 1/2010", 15);
		tfSemestreQualificacao = new JTextField("Ex.: 1/2010", 15);
		tfDataDefesa = new JTextField("Ex.: 1/1/2010", 15);
		tfProfessor = new JTextField("Ex.: 123456789", 15);
		tfTaxaPaga = new JTextField("Ex.: True", 15);
		tfSemestreCursando = new JTextField("Ex.: 1/2010", 15);
		bLimpar = new JButton("Limpar");
		bCadastrar = new JButton("Cadastrar");
		bVoltar = new JButton("Voltar");
		
		setLayout(new GridLayout(11, 2));
		add(lMensagem);
		add(lVazio1);
		add(lMatricula);
		add(tfMatricula);
		add(lNome);
		add(tfNome);
		add(lSemestreIngresso);
		add(tfSemestreIngresso);
		add(lSemestreQualificacao);
		add(tfSemestreQualificacao);
		add(lDataDefesa);
		add(tfDataDefesa);
		add(lProfessor);
		add(tfProfessor);
		add(lTaxaPaga);
		add(tfTaxaPaga);
		add(lSemestreCursando);
		add(tfSemestreCursando);
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
			tfMatricula.setText(null);
			tfNome.setText(null);
			tfSemestreIngresso.setText(null);
			tfSemestreQualificacao.setText(null);
			tfDataDefesa.setText(null);
			tfProfessor.setText(null);
			tfTaxaPaga.setText(null);
			tfSemestreCursando.setText(null);
		} else if(e.getSource() == bCadastrar) {
			try{
				if (!tfMatricula.getText().isEmpty()) {
					if (!tfNome.getText().trim().isEmpty()) {
						if (!tfSemestreIngresso.getText().trim().isEmpty()) {
							if (!tfSemestreQualificacao.getText().trim().isEmpty()) {
								if (!tfDataDefesa.getText().trim().isEmpty()) {
									if (!tfProfessor.getText().trim().isEmpty()) {
										Professor professor = Executora.professor.confirmaProfessor(Integer.parseInt(tfProfessor.getText()));
										if (professor != null) {
											if (!tfTaxaPaga.getText().trim().isEmpty()) {
												if (!tfSemestreCursando.getText().trim().isEmpty()) {
													try {
														DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
														Date date = (Date)formatter.parse(tfDataDefesa.getText());
														Executora.aluno.cadastraEspecial(new Especial(Integer.parseInt(tfMatricula.getText()), tfNome.getText(), tfSemestreIngresso.getText(), tfSemestreQualificacao.getText(), date, professor, Boolean.parseBoolean(tfTaxaPaga.getText()), tfSemestreCursando.getText()));
														JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
													} catch (ParseException e1) {
														e1.printStackTrace();
													}
												} else {
													throw new InformacaoFaltanteException("Semestre Cursando não informado!");
												}
											} else {
												throw new InformacaoFaltanteException("Taxa Paga não informada!");												
											}
										} else {
											throw new OrientadorNaoAtribuidoException("Matrícula Siape do Professor não cadastrado!");
										}
									} else {
										throw new OrientadorNaoAtribuidoException("Matrícula Siape do Professor não informada!");	
									}
								} else {
									throw new InformacaoFaltanteException("Data de Defesa não informada!");
								}
							} else {
								throw new InformacaoFaltanteException("Semestre de Qualificação não informado!");
							}
						} else {
							throw new InformacaoFaltanteException("Semestre de Ingresso não informado!");
						}
					} else {
						throw new InformacaoFaltanteException("Nome não informado!");
					}
				} else {
					throw new InformacaoFaltanteException("Matrícula não informada!");
				}
			} catch (InformacaoFaltanteException e1) {
				e1.printStackTrace();
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(null, "Coloque somente números na matrícula!");
			} catch (IllegalArgumentException e3) {
				JOptionPane.showMessageDialog(null, "Coloque a provável formatura no modelo dia/mês/ano!");
			} catch (OrientadorNaoAtribuidoException e4) {
				JOptionPane.showMessageDialog(null, e4.getMessage());
			} catch (NullPointerException e5) {
				JOptionPane.showMessageDialog(null, "Matrícula Siape do Professor não cadastrada!");
			}
		} else if (e.getSource() == bVoltar) {
			dispose();
		}
	}

}
