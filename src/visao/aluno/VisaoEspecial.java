package visao.aluno;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
		lProfessor = new JLabel("\t\t\t\t\t\t\t Professor:");
		lTaxaPaga = new JLabel("\t\t\t\t\t\t\t Taxa Paga:");
		lSemestreCursando = new JLabel("\t\t\t\t\t\t\t Semestre Cursando:");
		lVazio1 = new JLabel();
		lVazio2 = new JLabel();
		tfMatricula = new JTextField(15);
		tfNome = new JTextField(15);
		tfSemestreIngresso = new JTextField(15);
		tfSemestreQualificacao = new JTextField(15);
		tfDataDefesa = new JTextField(15);
		tfProfessor = new JTextField(15);
		tfTaxaPaga = new JTextField(15);
		tfSemestreCursando = new JTextField(15);
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
		} else if (e.getSource() == bVoltar) {
			dispose();
		}
	}

}
