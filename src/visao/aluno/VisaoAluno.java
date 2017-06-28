package visao.aluno;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VisaoAluno extends JFrame {

	public JLabel lMensagem;
	public JButton	bCadastrarGraduacao, 
					bCadastrarPosGraduacao, 
					bCadastrarEspecial;
	
	public VisaoAluno() {
		setTitle("Cadastrar Aluno");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lMensagem = new JLabel("\t\t\t\t\t\t\t Escolha uma opção de aluno:");
		bCadastrarGraduacao = new JButton("bCadastrarGraduacao");
		bCadastrarPosGraduacao = new JButton("bCadastrarPosGraduacao");
		bCadastrarEspecial = new JButton("bCadastrarEspecial");

		setLayout(new GridLayout(4, 1));
		add(lMensagem);
		add(bCadastrarGraduacao);
		add(bCadastrarPosGraduacao);
		add(bCadastrarEspecial);

		setVisible(true);
	}

}
