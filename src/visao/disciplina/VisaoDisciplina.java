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
import dados.aluno.PosGraduacao;
import dados.disciplina.Disciplina;
import dados.excecao.InformacaoFaltanteException;
import dados.excecao.OrientadorNaoAtribuidoException;
import dados.professor.Professor;

public class VisaoDisciplina extends JFrame implements ActionListener {

	public JLabel 	lMensagem, 
					lNome, 
					lCargaHoraria, 
					lVazio1, 
					lVazio2;
	public JTextField	tfNome, 
						tfCargaHoraria;
	public JButton	bLimpar, 
					bCadastrar, 
					bVoltar;

	public VisaoDisciplina() {
		setTitle("Cadastro Disciplina");
		setSize(350, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lMensagem = new JLabel("\t\t\t\t\t\t\t Cadastro Disciplina");
		lNome = new JLabel("\t\t\t\t\t\t\t Nome:");
		lCargaHoraria = new JLabel("\t\t\t\t\t\t\t Carga Horária:");
		lVazio1 = new JLabel();
		lVazio2 = new JLabel();
		tfNome = new JTextField("Ex.: Fulano de Tal", 15);
		tfCargaHoraria = new JTextField("Ex.: 200", 15);
		bLimpar = new JButton("Limpar");
		bCadastrar = new JButton("Cadastrar");
		bVoltar = new JButton("Voltar");
		
		setLayout(new GridLayout(5, 2));
		add(lMensagem);
		add(lVazio1);
		add(lNome);
		add(tfNome);
		add(lCargaHoraria);
		add(tfCargaHoraria);
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
		} else if(e.getSource() == bCadastrar) {
			try {
				if (!tfNome.getText().trim().isEmpty()) {
					if (!tfCargaHoraria.getText().isEmpty()) {
						Executora.disciplina.cadastraDisciplina(new Disciplina(tfNome.getName(), Integer.parseInt(tfCargaHoraria.getText())));
						JOptionPane.showMessageDialog(null, "Disciplina cadastrado com sucesso!");
					} else {
						throw new InformacaoFaltanteException("Carga horária não informada!");
					}
				} else {
					throw new InformacaoFaltanteException("Nome não informado!");
				}
			} catch (InformacaoFaltanteException e1) {
				e1.printStackTrace();
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(null, "Coloque somente números na carga horária!");
			} catch (Exception e3) {
				
			}
		} else if (e.getSource() == bVoltar) {
			dispose();
		}
	}

}
