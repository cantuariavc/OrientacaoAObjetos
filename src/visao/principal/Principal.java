package visao.principal;

import visao.aluno.VisaoEspecial;
import visao.aluno.VisaoGraduacao;
import visao.aluno.VisaoPosGraduacao;
import visao.disciplina.VisaoDisciplina;
import visao.disciplina.VisaoEstagio;
import visao.professor.VisaoAdjunto;
import visao.professor.VisaoAssistente;
import visao.professor.VisaoAssociado;
import visao.professor.VisaoAuxiliar;
import visao.professor.VisaoTitular;
import visao.turma.VisaoTurma;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal extends JFrame implements ActionListener {
	
	public JLabel 	lMensagem, 
					lDisciplina, 
					lTurma, 
					lProfessor, 
					lAluno, 
					lVazio1, lVazio2, lVazio3, lVazio4, lVazio5, lVazio6, lVazio7, lVazio8;
	public JButton 	bCadastrarDisciplina, 
					bCadastrarEstagio,
					bCadastrarTurma, 
					bCadastrarAuxiliar, 
					bCadastrarAssistente, 
					bCadastrarAdjunto, 
					bCadastrarAssociado, 
					bCadastrarTitular, 
					bCadastrarGraduacao, 
					bCadastrarPosGraduacao, 
					bCadastrarEspecial, 
					bSair;
	
	public Principal() {
		setTitle("Sistema de Cadastro da Universide de Brasília");
		setSize(750, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lMensagem = new JLabel("Escolha uma cadastro:");
		lDisciplina = new JLabel("Disciplina:");
		lTurma = new JLabel("Turma:");
		lProfessor = new JLabel("Professor:");
		lAluno = new JLabel("Aluno:");
		lVazio1 = new JLabel();
		lVazio2 = new JLabel();
		lVazio3 = new JLabel();
		lVazio4 = new JLabel();
		lVazio5 = new JLabel();
		lVazio6 = new JLabel();
		lVazio7 = new JLabel();
		lVazio8 = new JLabel();
		bCadastrarDisciplina = new JButton("Cadastrar");
		bCadastrarEstagio = new JButton("Cadastrar Estágio");
		bCadastrarTurma = new JButton("Cadastrar");
		bCadastrarAuxiliar = new JButton("Cadastrar Auxiliar");
		bCadastrarAssistente = new JButton("Cadastrar Assistente");
		bCadastrarAdjunto = new JButton("Cadastrar Adjunto");
		bCadastrarAssociado = new JButton("Cadastrar Associado");
		bCadastrarTitular = new JButton("Cadastrar Titular");
		bCadastrarGraduacao = new JButton("Cadastrar Graduação");
		bCadastrarPosGraduacao = new JButton("Cadastrar Pós-Graduação");
		bCadastrarEspecial = new JButton("Cadastrar Especial");
		bSair = new JButton("Sair");
		
		setLayout(new GridLayout(6, 4));
		add(lMensagem);
		add(lVazio1);
		add(lVazio2);
		add(lVazio3);
		add(lDisciplina);
		add(bCadastrarDisciplina);
		bCadastrarDisciplina.addActionListener(this);
		add(bCadastrarEstagio);
		bCadastrarEstagio.addActionListener(this);
		add(lVazio4);
		add(lTurma);
		add(bCadastrarTurma);
		bCadastrarTurma.addActionListener(this);
		add(lVazio5);
		add(lVazio6);
		add(lProfessor);
		add(bCadastrarAuxiliar);
		bCadastrarAuxiliar.addActionListener(this);
		add(bCadastrarAssistente);
		bCadastrarAssistente.addActionListener(this);
		add(bCadastrarAdjunto);
		bCadastrarAdjunto.addActionListener(this);
		add(lVazio7);
		add(bCadastrarAssociado);
		bCadastrarAssociado.addActionListener(this);
		add(bCadastrarTitular);
		bCadastrarTitular.addActionListener(this);
		add(lVazio8);
		add(lAluno);
		add(bCadastrarGraduacao);
		bCadastrarGraduacao.addActionListener(this);
		add(bCadastrarPosGraduacao);
		bCadastrarPosGraduacao.addActionListener(this);
		add(bCadastrarEspecial);
		bCadastrarEspecial.addActionListener(this);

		setVisible(true);
		
	}

	
   
  @Override
	public void actionPerformed(ActionEvent e) {
		try {
 			if (e.getSource() == bCadastrarDisciplina) {
 				VisaoDisciplina vDisciplina = new VisaoDisciplina();
			} else if (e.getSource() == bCadastrarEstagio) {
 				VisaoEstagio vEstagio = new VisaoEstagio();
 	 		} else if (e.getSource() == bCadastrarTurma) {
 				VisaoTurma vTurma = new VisaoTurma();
 	 		} else if (e.getSource() == bCadastrarAuxiliar) {
 				VisaoAuxiliar vAuxiliar = new VisaoAuxiliar();
 	 		} else if (e.getSource() == bCadastrarAssistente) {
 				VisaoAssistente vAssistente = new VisaoAssistente();
 	 		} else if (e.getSource() == bCadastrarAdjunto) {
 				VisaoAdjunto vAdjunto = new VisaoAdjunto();
 	 		} else if (e.getSource() == bCadastrarAssociado) {
 				VisaoAssociado vAssociado = new VisaoAssociado();
 	 		} else if (e.getSource() == bCadastrarTitular) {
 				VisaoTitular vTitular = new VisaoTitular();
 	 		} else if (e.getSource() == bCadastrarGraduacao) {
 				VisaoGraduacao vGraduacao = new VisaoGraduacao();
 	 		} else if (e.getSource() == bCadastrarPosGraduacao) {
 				VisaoPosGraduacao vPosGraduacao = new VisaoPosGraduacao();
 	 		} else if (e.getSource() == bCadastrarEspecial) {
 				VisaoEspecial vEspecial = new VisaoEspecial();
 	 		}
 			
 		} catch(Exception e2) {
			
 		}
		
 	}
	
}
