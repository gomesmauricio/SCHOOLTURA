package VIEW;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class CadastroResponsavel extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;


	/**
	 * Create the dialog.
	 */
	public CadastroResponsavel() {
		setTitle("SchoolTura - Cdastro Responsalvel de Aluno");
		setResizable(false);
		setBounds(100, 100, 518, 325);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("***Cadastro de Responsavel***");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel.setBounds(122, 11, 228, 17);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Nome:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1.setBounds(32, 67, 46, 14);
			contentPanel.add(lblNewLabel_1);
		}
		
		textField = new JTextField();
		textField.setBounds(32, 92, 318, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Idade:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(381, 67, 46, 14);
		contentPanel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(381, 92, 86, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPF:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(32, 133, 46, 14);
		contentPanel.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(32, 158, 201, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Genero:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(342, 136, 68, 14);
		contentPanel.add(lblNewLabel_1_1_1);
		
		JRadioButton rbtnMax = new JRadioButton("Maxculino");
		rbtnMax.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbtnMax.setBounds(273, 157, 95, 23);
		contentPanel.add(rbtnMax);
		
		JRadioButton rbtnFem = new JRadioButton("Feminio");
		rbtnFem.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbtnFem.setBounds(373, 157, 109, 23);
		contentPanel.add(rbtnFem);
		
		ButtonGroup bgGenero = new ButtonGroup();
		bgGenero.add(rbtnMax);
		bgGenero.add(rbtnFem);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Mensalidade:");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(83, 200, 95, 14);
		contentPanel.add(lblNewLabel_1_1_2);
		
		JRadioButton rbtnQuit = new JRadioButton("Quitado");
		rbtnQuit.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbtnQuit.setBounds(32, 221, 86, 23);
		contentPanel.add(rbtnQuit);
		
		JRadioButton rbtnPendent = new JRadioButton("Pendente");
		rbtnPendent.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbtnPendent.setBounds(122, 221, 109, 23);
		contentPanel.add(rbtnPendent);
		
		ButtonGroup bgFinanceiro = new ButtonGroup();
		bgFinanceiro.add(rbtnQuit);
		bgFinanceiro.add(rbtnPendent);
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
