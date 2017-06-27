package visao.disciplina;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VisaoDisciplina extends JFrame {
	
	public JLabel lMensagem;
	public JButton	bCadastrarDisciplina, 
					bCadastrarEstagio;
	
	public VisaoDisciplina() {
		setTitle("Cadastrar Disciplina");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lMensagem = new JLabel("\t\t\t\t\t\t\t Escolha uma opção:");
		bCadastrarDisciplina = new JButton("Cadastrar Disciplina");
		bCadastrarEstagio = new JButton("Cadastrar Estagio");		
		
		setLayout(new GridLayout(3, 1));
		add(lMensagem);
		add(bCadastrarDisciplina);
		add(bCadastrarEstagio);
		
		setVisible(true);
	}
	
}
