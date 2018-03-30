import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class Visao extends JFrame implements ActionListener {
	public JLabel	lNumeroX, 
					lNumeroY, 
					lResultado, 
					lResultado1, 
					lLimpar; 
	public JTextField	tfNumeroX, 
						tfNumeroY;
	public JButton	bLimpar, 
					bAdicao, 
					bSubtracao, 
					bMultiplicacao, 
					bDivisao, 
					bExponenciacao, 
					bLogaritimo, 
					bLogaritimoBaseD;
	
	public Visao() {
		setTitle("Calculadora");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		lNumeroX = new JLabel("Número x");
		lNumeroY = new JLabel("Número y");
		lResultado = new JLabel("Resultado");
		lResultado1 = new JLabel("0,00");
		lLimpar = new JLabel();
		tfNumeroX = new JTextField(10);
		tfNumeroY = new JTextField(10);
		bLimpar = new JButton("Limpar");
		bAdicao = new JButton("x + y");
		bSubtracao = new JButton("x - y");
		bMultiplicacao = new JButton("x * y");
		bDivisao = new JButton("x / y");
		bExponenciacao = new JButton("x ˆ y");
		bLogaritimo = new JButton("log x");
		bLogaritimoBaseD = new JButton("log y X");
		
		setLayout(new GridLayout(8, 2));
		
		add(lNumeroX);
		add(tfNumeroX);
		add(lNumeroY);
		add(tfNumeroY);
		add(lResultado);
		add(lResultado1);
		add(bLimpar);
		bLimpar.addActionListener(this);
		add(lLimpar);
		add(bAdicao);
		bAdicao.addActionListener(this);
		add(bSubtracao);
		bSubtracao.addActionListener(this);
		add(bMultiplicacao);
		bMultiplicacao.addActionListener(this);
		add(bDivisao);
		bDivisao.addActionListener(this);
		add(bExponenciacao);
		bExponenciacao.addActionListener(this);
		add(bLogaritimo);
		bLogaritimo.addActionListener(this);
		add(bLogaritimoBaseD);
		bLogaritimoBaseD.addActionListener(this);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Calculadora calculadora = new Calculadora();
			
			if (e.getSource() == bLimpar) {
				tfNumeroX.setText("");
				tfNumeroY.setText("");
				lResultado1.setText("0,00");
			} else if (e.getSource() == bAdicao) {
				calculadora.adicao(tfNumeroX.getText(), tfNumeroY.getText());
				lResultado1.setText(calculadora.getResultado());
			} else if (e.getSource() == bSubtracao) {
				calculadora.subtracao(tfNumeroX.getText(), tfNumeroY.getText());
				lResultado1.setText(calculadora.getResultado());
			} else if (e.getSource() == bMultiplicacao) {
				calculadora.multiplicacao(tfNumeroX.getText(), tfNumeroY.getText());
				lResultado1.setText(calculadora.getResultado());
			} else if (e.getSource() == bDivisao) {
				if (Double.parseDouble(tfNumeroY.getText()) == 0) {
					tfNumeroY.setText("");
					JOptionPane.showMessageDialog(null, "Insira um número no y diferente de 0.");
				} else {
					calculadora.divisao(tfNumeroX.getText(), tfNumeroY.getText());
					lResultado1.setText(calculadora.getResultado());
				}
			} else if (e.getSource() == bExponenciacao) {
				calculadora.exponenciacao(tfNumeroX.getText(), tfNumeroY.getText());
				lResultado1.setText(calculadora.getResultado());
			} else if (e.getSource() == bLogaritimo) {
				if (Double.parseDouble(tfNumeroX.getText()) == 0 || Double.parseDouble(tfNumeroX.getText()) < 0) {
					tfNumeroX.setText("");
					JOptionPane.showMessageDialog(null, "Insira um número no x maior que 0.");
				} else {
					tfNumeroY.setText("e");
					calculadora.logaritimo(tfNumeroX.getText());
					lResultado1.setText(calculadora.getResultado());
				}
			} else if (e.getSource() == bLogaritimoBaseD) {
				if (Double.parseDouble(tfNumeroX.getText()) == 0 || Double.parseDouble(tfNumeroX.getText()) < 0) {
					tfNumeroX.setText("");
					JOptionPane.showMessageDialog(null, "Insira um número no x maior que 0.");
				} else if (Double.parseDouble(tfNumeroY.getText()) == 1 || Double.parseDouble(tfNumeroY.getText()) < 0) {
					JOptionPane.showMessageDialog(null, "Insira um número no y maior que 0 e diferente de 1.");
				} else {
					calculadora.logaritimoBaseD(tfNumeroX.getText(), tfNumeroY.getText());
					lResultado1.setText(calculadora.getResultado());
				}
			}
		} catch(NumberFormatException e2) {
			JOptionPane.showMessageDialog(null, "Insira números. Se for decimal, use ponto.");
		} catch(Exception e3) {
			
		}		
	}
}
