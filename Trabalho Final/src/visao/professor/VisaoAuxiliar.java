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
import dados.aluno.Graduacao;
import dados.excecao.InformacaoFaltanteException;
import dados.professor.Auxiliar;

public class VisaoAuxiliar extends JFrame implements ActionListener {

	public JLabel 	lMensagem, 
					lMatriculaSiape, 
					lMatriculaFUP, 
					lFormacao, 
					lSalario, 
					lGraduacao, 
					lAnoGraduacao, 
					lVazio1, 
					lVazio2;
	public JTextField	tfMatriculaSiape, 
						tfMatriculaFUP, 
						tfFormacao, 
						tfSalario, 
						tfGraduacao, 
						tfAnoGraduacao;
	public JButton	bLimpar, 
					bCadastrar, 
					bVoltar;

	public VisaoAuxiliar() {
		setTitle("Cadastro Professor");
		setSize(320, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lMensagem = new JLabel("\t\t\t\t\t\t\t Cadastro Auxiliar");
		lMatriculaSiape = new JLabel("\t\t\t\t\t\t\t Matrícula Siape:");
		lMatriculaFUP = new JLabel("\t\t\t\t\t\t\t Matrícula FUP:");
		lFormacao = new JLabel("\t\t\t\t\t\t\t Formação:");
		lSalario = new JLabel("\t\t\t\t\t\t\t Salário:");
		lGraduacao = new JLabel("\t\t\t\t\t\t\t Graduação:");
		lAnoGraduacao = new JLabel("\t\t\t\t\t\t\t Ano da Graduação:");
		lVazio1 = new JLabel();
		lVazio2 = new JLabel();
		tfMatriculaSiape = new JTextField("Ex.: 123456789", 15);
		tfMatriculaFUP = new JTextField("Ex.: 123456789", 15);
		tfFormacao = new JTextField("Ex.: Doutorado", 15);
		tfSalario = new JTextField("Ex.: 10000,00", 15);
		tfGraduacao = new JTextField("Ex.: Eng. de Tal", 15);
		tfAnoGraduacao = new JTextField("Ex.: 2005", 15);	
		bLimpar = new JButton("Limpar");
		bCadastrar = new JButton("Cadastrar");
		bVoltar = new JButton("Voltar");
		
		setLayout(new GridLayout(9, 2));
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
										Executora.professor.cadastraAuxiliar(new Auxiliar(Integer.parseInt(tfMatriculaSiape.getText()), Integer.parseInt(tfMatriculaFUP.getText()), tfFormacao.getText(), Float.parseFloat(salario), tfGraduacao.getText(), Integer.parseInt(tfAnoGraduacao.getText())));
										JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
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
				JOptionPane.showMessageDialog(null, "Coloque somente números nas matrículas, salário e ano da graduação!");
			} catch (Exception e3) {
				
			}
		} else if (e.getSource() == bVoltar) {
			dispose();
		}
	}

}
