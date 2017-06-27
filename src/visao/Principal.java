package visao;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal extends JFrame {
	
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
		add(bCadastrarTurma);
		add(bCadastrarProfessor);
		add(bCadastrarAluno);
		
		setVisible(true);
	}
	
	
}
