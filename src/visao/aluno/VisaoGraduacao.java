package visao.aluno;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.excecao.DisciplinaNaoAtribuidaException;
import controle.excecao.InformacaoFaltanteException;
import controle.excecao.ProfessorNaoAtribuidoException;
import controle.executora.Executora;
import dados.aluno.Graduacao;

public class VisaoGraduacao extends JFrame implements ActionListener {

	public JLabel 	lMensagem, 
					lMatricula, 
					lNome, 
					lSemestreIngresso, 
					lFormaIngresso, 
					lCurso, 
					lProvavelFormatura, 
					lVazio1, 
					lVazio2;
	public JTextField	tfMatricula, 
						tfNome, 
						tfSemestreIngresso, 
						tfFormaIngresso, 
						tfCurso, 
						tfProvavelFormatura;
	public JButton	bLimpar, 
					bCadastrar, 
					bVoltar;

	public VisaoGraduacao() {
		setTitle("Cadastro Aluno");
		setSize(350, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lMensagem = new JLabel("\t\t\t\t\t\t\t Cadastro Graduação");
		lMatricula = new JLabel("\t\t\t\t\t\t\t Matrícula:");
		lNome = new JLabel("\t\t\t\t\t\t\t Nome:");
		lSemestreIngresso = new JLabel("\t\t\t\t\t\t\t Semestre de Ingresso:");
		lFormaIngresso = new JLabel("\t\t\t\t\t\t\t Forma de Ingresso:");
		lCurso = new JLabel("\t\t\t\t\t\t\t Curso:");
		lProvavelFormatura = new JLabel("\t\t\t\t\t\t\t Provável Formatura:");
		lVazio1 = new JLabel();
		lVazio2 = new JLabel();
		tfMatricula = new JTextField(15);
		tfNome = new JTextField(15);
		tfSemestreIngresso = new JTextField(15);
		tfFormaIngresso = new JTextField(15);
		tfCurso = new JTextField(15);
		tfProvavelFormatura = new JTextField(15);
		bLimpar = new JButton("Limpar");
		bCadastrar = new JButton("Cadastrar");
		bVoltar = new JButton("Voltar");
		
		setLayout(new GridLayout(9, 2));
		add(lMensagem);
		add(lVazio1);
		add(lMatricula);
		add(tfMatricula);
		add(lNome);
		add(tfNome);
		add(lSemestreIngresso);
		add(tfSemestreIngresso);
		add(lFormaIngresso);
		add(tfFormaIngresso);
		add(lCurso);
		add(tfCurso);
		add(lProvavelFormatura);
		add(tfProvavelFormatura);
		add(bLimpar);
		bLimpar.addActionListener(this);
		add(bCadastrar);
		bCadastrar.addActionListener(this);
		add(lVazio2);
		add(bVoltar);
		bVoltar.addActionListener(this);

		setVisible(true);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bLimpar) {
			tfMatricula.setText(null);
			tfNome.setText(null);
			tfSemestreIngresso.setText(null);
			tfFormaIngresso.setText(null);
			tfCurso.setText(null);
			tfProvavelFormatura.setText(null);
		} else if(e.getSource() == bCadastrar) {
			try{
				if (!tfMatricula.getText().isEmpty()) {
					if (!tfNome.getText().trim().isEmpty()) {
						if (!tfSemestreIngresso.getText().trim().isEmpty()) {
							if (!tfFormaIngresso.getText().trim().isEmpty()) {
								if (!tfCurso.getText().trim().isEmpty()) {
									if (!tfProvavelFormatura.getText().trim().isEmpty()) {
										Executora.aluno.cadastraGraduacao(new Graduacao(Integer.parseInt(tfMatricula.getText()), tfNome.getText(), tfSemestreIngresso.getText(), tfFormaIngresso.getText(), tfCurso.getText(), new Date(tfProvavelFormatura.getText())));
									} else {
										throw new InformacaoFaltanteException("Provavel Formatura não informada!");	
									}
								} else {
									throw new InformacaoFaltanteException("Curso não informado!");
								}
							} else {
								throw new InformacaoFaltanteException("Forma Ingresso não informado!");
							}
						} else {
							throw new InformacaoFaltanteException("Semestre de Ingresso não informado!");
						}
					} else {
						throw new InformacaoFaltanteException("Nome não informado!");
					}
				} else {
					throw new InformacaoFaltanteException("Matrícula não informada!");
				}
			} catch (InformacaoFaltanteException e1) {
				e1.printStackTrace();
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(null, "Coloque somente números na matrícula!");
			} catch (IllegalArgumentException e3) {
				JOptionPane.showMessageDialog(null, "Coloque a provável formatura no modelo dia/mês/ano!");
			}
			
						
		} else if (e.getSource() == bVoltar) {
			dispose();
		}
	}

}
