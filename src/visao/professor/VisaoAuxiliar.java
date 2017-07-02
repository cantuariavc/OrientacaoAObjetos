package visao.professor;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
		tfMatriculaSiape = new JTextField(15);
		tfMatriculaFUP = new JTextField(15);
		tfFormacao = new JTextField(15);
		tfSalario = new JTextField(15);
		tfGraduacao = new JTextField(15);
		tfAnoGraduacao = new JTextField(15);	
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
			
		} else if (e.getSource() == bVoltar) {
			dispose();
		}
	}

}
