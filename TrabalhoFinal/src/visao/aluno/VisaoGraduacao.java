package visao.aluno;

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
import dados.excecao.DisciplinaNaoAtribuidaException;
import dados.excecao.InformacaoFaltanteException;
import dados.excecao.ProfessorNaoAtribuidoException;

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
		tfMatricula = new JTextField("Ex.: 123456789", 15);
		tfNome = new JTextField("Ex.: Fulando de Tal", 15);
		tfSemestreIngresso = new JTextField("Ex.: 2/2000", 15);
		tfFormaIngresso = new JTextField("Ex.: Vestivular", 15);
		tfCurso = new JTextField("Ex.: Eng. de Software", 15);
		tfProvavelFormatura = new JTextField("Ex.: 1/1/2020", 15);
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
										try {
											DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
											Date date = (Date)formatter.parse(tfProvavelFormatura.getText());
											Executora.aluno.cadastraGraduacao(new Graduacao(Integer.parseInt(tfMatricula.getText()), tfNome.getText(), tfSemestreIngresso.getText(), tfFormaIngresso.getText(), tfCurso.getText(), date));
											JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
										} catch (ParseException e1) {
											e1.printStackTrace();
										}
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
			} catch (Exception e4) {
				
			}			
		} else if (e.getSource() == bVoltar) {
			dispose();
		}
	}

}
