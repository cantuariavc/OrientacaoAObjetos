package visao.disciplina;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
		tfNome = new JTextField(15);
		tfCargaHoraria = new JTextField(15);
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
			
		} else if (e.getSource() == bVoltar) {
			dispose();
		}
	}

}
