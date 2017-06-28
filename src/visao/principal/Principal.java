package visao.principal;
import dados.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal extends JFrame {
	
	public JLabel 	lMensagem, 
					lDisciplina, 
					lTurma, 
					lVazio1, lVazio2, lVazio3, lVazio4, lVazio5, lVazio6, lVazio7, lVazio8, 
					lVazio9, lVazio10, lVazio11, lVazio12;
	public JButton 	bCadastrarDisciplina, 
					bCadastrarEstagio,
					bCadastrarTurma,
					bSair;
	
	public Principal() {
		setTitle("Sistema de Cadastro da Universide de Brasília");
		setSize(1000, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lMensagem = new JLabel("Escolha uma cadastro:");
		lDisciplina = new JLabel("Disciplina:");
		lTurma = new JLabel("Turma:");
		lVazio1 = new JLabel();
		lVazio2 = new JLabel();
		lVazio3 = new JLabel();
		lVazio4 = new JLabel();
		lVazio5 = new JLabel();
		lVazio6 = new JLabel();
		lVazio7 = new JLabel();
		lVazio8 = new JLabel();
		lVazio9 = new JLabel();
		lVazio10 = new JLabel();
		lVazio11 = new JLabel();
		lVazio12 = new JLabel();
		bCadastrarDisciplina = new JButton("Cadastrar Disciplina");
		bCadastrarEstagio = new JButton("Cadastrar Estágio");
		bCadastrarTurma = new JButton("Cadastrar Turma");
		bSair = new JButton("Sair");
		
		setLayout(new GridLayout(3, 6));
		add(lMensagem);
		add(lVazio1);
		add(lVazio2);
		add(lVazio3);
		add(lVazio4);
		add(lVazio5);
		add(lDisciplina);
		add(bCadastrarDisciplina);
		add(bCadastrarEstagio);
		add(lVazio6);
		add(lVazio7);
		add(lVazio8);
		add(lTurma);
		add(bCadastrarTurma);
		add(lVazio9);
		add(lVazio10);
		add(lVazio11);
		add(lVazio12);

		//add(bSair);

		setVisible(true);
		
	}

/*	
 * implements ActionListener 
 * @Override
 *	public void actionPerformed(ActionEvent e) {
 *		try {
 *			if (e.getSource() == bCadastrarDisciplina) {
 *				
 *				
 *	 		} else if (e.getSource() == bCadastrarAluno) {
 *				
 *		}
 *			
 *		} catch(Exception e2) {
 *			
 *		}
 *		
 *	}
 */
	
}
