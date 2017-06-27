package visao.principal;
import dados.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal extends JFrame implements ActionListener {
	
	public JLabel lMensagem;
	public JButton 	bCadastrarDisciplina, 
					bCadastrarTurma, 
					bCadastrarProfessor, 
					bCadastrarAluno;
	
	public Principal() {
		setTitle("Sistema de Cadastro da Universide de Brasília");
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lMensagem = new JLabel("\t\t\t\t\t\t\t Escolha uma opção:");
		bCadastrarDisciplina = new JButton("Cadastrar Disciplina");
		bCadastrarTurma = new JButton("Cadastrar Turma");
		bCadastrarProfessor = new JButton("Cadastrar Professor");
		bCadastrarAluno = new JButton("Cadastrar Aluno");
		
		setLayout(new GridLayout(5, 1));
		add(lMensagem);
		add(bCadastrarDisciplina);
		bCadastrarDisciplina.addActionListener(this);
		add(bCadastrarTurma);
		bCadastrarTurma.addActionListener(this);
		add(bCadastrarProfessor);
		bCadastrarProfessor.addActionListener(this);
		add(bCadastrarAluno);
		bCadastrarAluno.addActionListener(this);
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == bCadastrarDisciplina) {
				
				
				
			} else if (e.getSource() == bCadastrarTurma) {
				
				
				
			} else if (e.getSource() == bCadastrarProfessor) {
				
				
				
			} else if (e.getSource() == bCadastrarAluno) {
				
				
				
			}
			
		} catch(Exception e2) {
			
		}
		
	}
	
	
}
