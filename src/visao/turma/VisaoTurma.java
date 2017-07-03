package visao.turma;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.executora.Executora;
import dados.disciplina.Disciplina;
import dados.disciplina.Estagio;
import dados.excecao.DisciplinaNaoAtribuidaException;
import dados.excecao.InformacaoFaltanteException;
import dados.excecao.OrientadorNaoAtribuidoException;
import dados.excecao.ProfessorNaoAtribuidoException;
import dados.professor.Professor;
import dados.turma.Turma;

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
		setSize(450, 230);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lMensagem = new JLabel("\t\t\t\t\t\t\t Cadastro Turma");
		lCodigo = new JLabel("\t\t\t\t\t\t\t Código:");
		lHorario = new JLabel("\t\t\t\t\t\t\t Horário:");
		lDisciplina = new JLabel("\t\t\t\t\t\t\t Disciplina:");
		lProfessor = new JLabel("\t\t\t\t\t\t\t Matrícula Siape do Professor:");
		lVazio1 = new JLabel();
		lVazio2 = new JLabel();
		tfCodigo = new JTextField("Ex.: 123456789", 15);
		tfHorario = new JTextField("Ex.: 14h", 15);
		tfDisciplina = new JTextField("Ex.: Fulano de Tal", 15);
		tfProfessor = new JTextField("Ex.: 123456789", 15);
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
		bLimpar.addActionListener(this);
		add(bCadastrar);
		bCadastrar.addActionListener(this);
		add(lVazio2);
		add(bVoltar);
		bVoltar.addActionListener(this);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bLimpar) {
			tfCodigo.setText(null);
			tfHorario.setText(null);
			tfDisciplina.setText(null);
			tfProfessor.setText(null);
		} else if (e.getSource() == bCadastrar) {
			try{
				if (!tfCodigo.getText().trim().isEmpty()) {
					if (!tfHorario.getText().trim().isEmpty()) {
						if (!tfDisciplina.getText().trim().isEmpty()) {
							Disciplina disciplina = Executora.disciplina.confirmaDisciplina(tfDisciplina.getText());
							if (disciplina != null) {
								if (!tfProfessor.getText().trim().isEmpty()) {
									Professor professor = Executora.professor.confirmaProfessor(Integer.parseInt(tfProfessor.getText()));
									if (professor != null) {
										Executora.turma.cadastraTurma(new Turma(Integer.parseInt(tfCodigo.getText()), tfHorario.getText(), disciplina, professor));
										JOptionPane.showMessageDialog(null, "Turma cadastrada com sucesso!");
									} else {
										throw new ProfessorNaoAtribuidoException("Matrícula Siape do Professor não cadastrado!");
									}
								} else {
									throw new ProfessorNaoAtribuidoException("Matrícula Siape do Professor não informada!");	
								}
							} else {
								throw new DisciplinaNaoAtribuidaException("Disciplina não cadastrada!");
							}
						} else {
							throw new InformacaoFaltanteException("Disciplina não informada!");
						}
					} else {
						throw new InformacaoFaltanteException("Horário não informado!");
					}
				} else {
					throw new InformacaoFaltanteException("Código não informado!");
				}
			} catch (InformacaoFaltanteException e1) {
				e1.printStackTrace();
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(null, "Coloque somente números no código!");
			} catch (IllegalArgumentException e3) {
				JOptionPane.showMessageDialog(null, e3.getMessage());
			} catch (ProfessorNaoAtribuidoException e4) {
				JOptionPane.showMessageDialog(null, e4.getMessage());
			} catch (DisciplinaNaoAtribuidaException e5) {
				JOptionPane.showMessageDialog(null, e5.getMessage());
			}
		} else if (e.getSource() == bVoltar) {
			dispose();
		}
	}

}
