package visao.aluno;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VisaoGraduacao extends JFrame implements ActionListener {

	public JLabel 	lMensagem, 
					lMatricula, 
					lNome, 
					lSemestreIngresso, 
					lFormaIngresso, 
					lCurso, 
					lProvavelFormatura, 
					lVazio1, 
					lVazio2;
	public JTextField	tfMatricula, 
						tfNome, 
						tfSemestreIngresso, 
						tfFormaIngresso, 
						tfCurso, 
						tfProvavelFormatura;
	public JButton	bLimpar, 
					bCadastrar, 
					bVoltar;

	public VisaoGraduacao() {
		setTitle("Cadastro Aluno");
		setSize(350, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lMensagem = new JLabel("\t\t\t\t\t\t\t Cadastro Aluno");
		lMatricula = new JLabel("\t\t\t\t\t\t\t Matrícula:");
		lNome = new JLabel("\t\t\t\t\t\t\t Nome:");
		lSemestreIngresso = new JLabel("\t\t\t\t\t\t\t Semestre de Ingresso:");
		lFormaIngresso = new JLabel("\t\t\t\t\t\t\t Professor:");
		lCurso = new JLabel("\t\t\t\t\t\t\t Curso:");
		lProvavelFormatura = new JLabel("\t\t\t\t\t\t\t Provável Formatura:");
		lVazio1 = new JLabel();
		lVazio2 = new JLabel();
		tfMatricula = new JTextField(15);
		tfNome = new JTextField(15);
		tfSemestreIngresso = new JTextField(15);
		tfFormaIngresso = new JTextField(15);
		tfCurso = new JTextField(15);
		tfProvavelFormatura = new JTextField(15);
		bLimpar = new JButton("Limpar");
		bCadastrar = new JButton("Cadastrar");
		bVoltar = new JButton("Voltar");
		
		setLayout(new GridLayout(9, 2));
		add(lMensagem);
		add(lVazio1);
		add(lMatricula);
		add(tfMatricula);
		add(lNome);
		add(tfNome);
		add(lSemestreIngresso);
		add(tfSemestreIngresso);
		add(lFormaIngresso);
		add(tfFormaIngresso);
		add(lCurso);
		add(tfCurso);
		add(lProvavelFormatura);
		add(tfProvavelFormatura);
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
			tfFormaIngresso.setText(null);
			tfCurso.setText(null);
			tfProvavelFormatura.setText(null);
		} else if (e.getSource() == bVoltar) {
			dispose();
		}
	}

}
