import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaFatorial {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFatorial window = new TelaFatorial();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaFatorial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 171);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSpinner txtNum = new JSpinner();
		txtNum.setBounds(22, 11, 29, 20);
		frame.getContentPane().add(txtNum);
		
		
		
		JLabel lblFormula = new JLabel("Formula");
		lblFormula.setBounds(10, 75, 110, 14);
		frame.getContentPane().add(lblFormula);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(130, 75, 60, 14);
		frame.getContentPane().add(lblResultado);
		JButton btnNewButton = new JButton("!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			int num=Integer.parseInt(txtNum.getValue().toString());
			Fatorial fatorial =new Fatorial();
			fatorial.setValor(num);
			lblFormula.setText(fatorial.getFormula());
			lblResultado.setText(Integer.toString(fatorial.getFatorial()));
			}
		});
		btnNewButton.setBounds(110, 10, 53, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
