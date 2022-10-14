package pratica05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JScrollPane;

public class Janela extends JFrame {

	private JPanel contentPane;
	JComboBox<String> comboBox;
	JTextArea textArea;
	String textoTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 60, 330, 154);
		contentPane.add(scrollPane);
		
		
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane.setViewportView(textArea_1);
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 14));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("País:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(38, 12, 55, 14);
		contentPane.add(lblNewLabel);
		
		
		JComboBox <String>comboBox = new JComboBox<>();
		comboBox.setBackground(SystemColor.activeCaption);
		comboBox.setBounds(114, 10, 120, 22);
		comboBox.addItem("Alemanha");
		comboBox.addItem("Luxemburgo");
		comboBox.addItem("França");
		comboBox.addItem("Belgica");
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(244, 10, 138, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorSelecionado = (String) comboBox.getSelectedItem();
				
				if(textoTotal == null) {
					textoTotal = valorSelecionado;
				}else{
					textoTotal = textoTotal + "," + valorSelecionado;
				}
				textArea_1.setText(textoTotal);
			}
		});
		contentPane.add(btnNewButton);
		
		
	}
}
