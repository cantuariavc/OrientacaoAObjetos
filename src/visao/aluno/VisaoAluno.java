package visao.aluno;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VisaoAluno extends JFrame {

	public JLabel lMensagem;
	public JButton	bCadastrarGraduacao, 
					bCadastrarPosGraduacao, 
					bCadastrarEspecial, 
					bSair;
	
	public VisaoAluno() {
		setTitle("Cadastrar Aluno");
		setSize(250, 160);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lMensagem = new JLabel("\t\t\t\t\t\t\t Escolha uma opção de aluno:");
		bCadastrarGraduacao = new JButton("Cadastrar Graduação");
		bCadastrarPosGraduacao = new JButton("Cadastrar Pós-Graduação");
		bCadastrarEspecial = new JButton("Cadastrar Especial");
		bSair = new JButton("Sair");

		setLayout(new GridLayout(5, 1));
		add(lMensagem);
		add(bCadastrarGraduacao);
		add(bCadastrarPosGraduacao);
		add(bCadastrarEspecial);
		add(bSair);

		setVisible(true);
	}

}
