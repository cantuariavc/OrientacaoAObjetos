package visao.disciplina;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
		setSize(350, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lMensagem = new JLabel("\t\t\t\t\t\t\t Cadastro Estágio");
		lNome = new JLabel("\t\t\t\t\t\t\t Nome:");
		lCargaHoraria = new JLabel("\t\t\t\t\t\t\t Carga Horária:");
		lLocalDeEstagio = new JLabel("\t\t\t\t\t\t\t Local de Estágio:");
		lResponsavel = new JLabel("\t\t\t\t\t\t\t Responsável:");
		lProfessor = new JLabel("\t\t\t\t\t\t\t Professor:");
		lVazio1 = new JLabel();
		lVazio2 = new JLabel();
		tfNome = new JTextField(15);
		tfCargaHoraria = new JTextField(15);
		tfLocalDeEstagio = new JTextField(15);
		tfResponsavel = new JTextField(15);
		tfProfessor = new JTextField(15);
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
			
		} else if (e.getSource() == bVoltar) {
			dispose();
		}
	}

}
