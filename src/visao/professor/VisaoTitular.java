package visao.professor;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
		tfMatriculaSiape = new JTextField(15);
		tfMatriculaFUP = new JTextField(15);
		tfFormacao = new JTextField(15);
		tfSalario = new JTextField(15);
		tfGraduacao = new JTextField(15);
		tfAnoGraduacao = new JTextField(15);
		tfMestrado = new JTextField(15);
		tfAnoMestrado = new JTextField(15);
		tfTituloDissertacao = new JTextField(15);
		tfDoutorado = new JTextField(15);
		tfAnoDoutorado = new JTextField(15);
		tfTituloTese = new JTextField(15);
		tfAreaDePesquisa = new JTextField(15);
		tfConcurso = new JTextField(15);
		tfDataDeAdmissao = new JTextField(15);
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
		} else if (e.getSource() == bVoltar) {
			dispose();
		}
	}

}
