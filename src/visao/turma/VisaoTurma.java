package visao.turma;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import dados.disciplina.Disciplina;
import dados.professor.Professor;

public class VisaoTurma extends JFrame implements ActionListener {

	public JLabel 	lMensagem, 
					lCodigo, 
					lHorario, 
					lDisciplina, 
					lProfessor, 
					lVazio1, 
					lVazio2;
	public JTextField	tfCodigo, 
						tfHorario, 
						tfDisciplina, 
						tfProfessor;
	public JButton	bLimpar, 
					bCadastrar, 
					bVoltar;

	public VisaoTurma() {
		setTitle("Cadastro Turma");
		setSize(320, 230);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lMensagem = new JLabel("\t\t\t\t\t\t\t Cadastro Turma");
		lCodigo = new JLabel("\t\t\t\t\t\t\t Código:");
		lHorario = new JLabel("\t\t\t\t\t\t\t Horário:");
		lDisciplina = new JLabel("\t\t\t\t\t\t\t Disciplina:");
		lProfessor = new JLabel("\t\t\t\t\t\t\t Professor:");
		lVazio1 = new JLabel();
		lVazio2 = new JLabel();
		tfCodigo = new JTextField(15);
		tfHorario = new JTextField(15);
		tfDisciplina = new JTextField(15);
		tfProfessor = new JTextField(15);
		bLimpar = new JButton("Limpar");
		bCadastrar = new JButton("Cadastrar");
		bVoltar = new JButton("Voltar");
		
		setLayout(new GridLayout(7, 2));
		add(lMensagem);
		add(lVazio1);
		add(lCodigo);
		add(tfCodigo);
		add(lHorario);
		add(tfHorario);
		add(lDisciplina);
		add(tfDisciplina);
		add(lProfessor);
		add(tfProfessor);
		add(bLimpar);
		add(bCadastrar);
		add(lVazio2);
		add(bVoltar);
		bVoltar.addActionListener(this);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bVoltar) {
			dispose();
		}
	}

}
