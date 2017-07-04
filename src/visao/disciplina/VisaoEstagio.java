package visao.disciplina;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.executora.Executora;
import dados.aluno.Graduacao;
import dados.aluno.PosGraduacao;
import dados.disciplina.Estagio;
import dados.excecao.InformacaoFaltanteException;
import dados.excecao.OrientadorNaoAtribuidoException;
import dados.professor.Professor;

public class VisaoEstagio extends JFrame implements ActionListener {

	public JLabel 	lMensagem, 
					lNome, 
					lCargaHoraria, 
					lLocalDeEstagio, 
					lResponsavel, 
					lProfessor,
					lVazio1, 
					lVazio2;
	public JTextField	tfNome, 
						tfCargaHoraria, 
						tfLocalDeEstagio, 
						tfResponsavel, 
						tfProfessor;
	public JButton	bLimpar, 
					bCadastrar, 
					bVoltar;

	public VisaoEstagio() {
		setTitle("Cadastro Disciplina");
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lMensagem = new JLabel("\t\t\t\t\t\t\t Cadastro Estágio");
		lNome = new JLabel("\t\t\t\t\t\t\t Nome:");
		lCargaHoraria = new JLabel("\t\t\t\t\t\t\t Carga Horária:");
		lLocalDeEstagio = new JLabel("\t\t\t\t\t\t\t Local de Estágio:");
		lResponsavel = new JLabel("\t\t\t\t\t\t\t Responsável:");
		lProfessor = new JLabel("\t\t\t\t\t\t\t Matrícula Siape do Professor:");
		lVazio1 = new JLabel();
		lVazio2 = new JLabel();
		tfNome = new JTextField("Ex.: Fulano", 15);
		tfCargaHoraria = new JTextField("Ex.: 20", 15);
		tfLocalDeEstagio = new JTextField("Ex.: Landia", 15);
		tfResponsavel = new JTextField("Ex.: Beutrano de Tal", 15);
		tfProfessor = new JTextField("Ex.: 123456789", 15);
		bLimpar = new JButton("Limpar");
		bCadastrar = new JButton("Cadastrar");
		bVoltar = new JButton("Voltar");
		
		setLayout(new GridLayout(7, 2));
		add(lMensagem);
		add(lVazio1);
		add(lNome);
		add(tfNome);
		add(lCargaHoraria);
		add(tfCargaHoraria);
		add(lCargaHoraria);
		add(tfCargaHoraria);
		add(lLocalDeEstagio);
		add(tfLocalDeEstagio);
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
			tfNome.setText(null);
			tfCargaHoraria.setText(null);
			tfLocalDeEstagio.setText(null);
			tfResponsavel.setText(null);
			tfProfessor.setText(null);
		} else if(e.getSource() == bCadastrar) {
			try{
				if (!tfNome.getText().trim().isEmpty()) {
					if (!tfCargaHoraria.getText().trim().isEmpty()) {
						if (!tfLocalDeEstagio.getText().trim().isEmpty()) {
							if (!tfResponsavel.getText().trim().isEmpty()) {
								if (!tfProfessor.getText().trim().isEmpty()) {
									Professor professor = Executora.professor.confirmaProfessor(Integer.parseInt(tfProfessor.getText()));
									if (professor != null) {
										Executora.disciplina.cadastraEstagio(new Estagio(tfNome.getText(), Integer.parseInt(tfCargaHoraria.getText()), tfLocalDeEstagio.getText(), tfResponsavel.getText(), professor));
										JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso!");
									} else {
										throw new OrientadorNaoAtribuidoException("Matrícula Siape do Professor não cadastrado!");
									}
								} else {
									throw new OrientadorNaoAtribuidoException("Matrícula Siape do Professor não informada!");	
								}
							} else {
								throw new InformacaoFaltanteException("Responsável não informado!");
							}
						} else {
							throw new InformacaoFaltanteException("Local do estágio não informado!");
						}
					} else {
						throw new InformacaoFaltanteException("Carga horária não informada!");
					}
				} else {
					throw new InformacaoFaltanteException("Nome não informado!");
				}
			} catch (InformacaoFaltanteException e1) {
				e1.printStackTrace();
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(null, "Coloque somente números na matrícula!");
			} catch (OrientadorNaoAtribuidoException e3) {
				JOptionPane.showMessageDialog(null, e3.getMessage());
			} catch (Exception e4) {
				
			}
		} else if (e.getSource() == bVoltar) {
			dispose();
		}
	}

}
