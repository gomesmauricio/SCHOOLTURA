package VIEW;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CONTROLLER.AlunoController;
import EXCEPTIONS.RegistroCadastradoComSucessoException;
import MODEL.Aluno;
import UTIL.Clear;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MatriculaAluno extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtCpfResponsavel;

	/**
	 * Create the dialog.
	 */
	public MatriculaAluno() {
		setTitle("SchoolTura - Matricula de Aluno");
		setResizable(false);
		setBounds(100, 100, 563, 322);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Matricula:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 37, 68, 14);
		contentPanel.add(lblNewLabel);

		JLabel lbMat = new JLabel("Num.");
		lbMat.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbMat.setBounds(10, 62, 68, 14);
		contentPanel.add(lbMat);

		JLabel lblmatriculaDeAluno = new JLabel("***Matricula de Aluno***");
		lblmatriculaDeAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblmatriculaDeAluno.setBounds(169, 11, 163, 14);
		contentPanel.add(lblmatriculaDeAluno);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBounds(102, 38, 68, 14);
		contentPanel.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(102, 60, 267, 20);
		contentPanel.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdade.setBounds(393, 38, 68, 14);
		contentPanel.add(lblIdade);

		txtIdade = new JTextField();
		txtIdade.setBounds(393, 60, 86, 20);
		contentPanel.add(txtIdade);
		txtIdade.setColumns(10);

		JLabel lblCpfResponsavel = new JLabel("CPF Responsavel:");
		lblCpfResponsavel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCpfResponsavel.setBounds(102, 107, 119, 14);
		contentPanel.add(lblCpfResponsavel);

		txtCpfResponsavel = new JTextField();
		txtCpfResponsavel.setBounds(102, 132, 134, 20);
		contentPanel.add(txtCpfResponsavel);
		txtCpfResponsavel.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Genero:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(365, 108, 62, 14);
		contentPanel.add(lblNewLabel_1);

		JRadioButton rbtnM = new JRadioButton("Maxculino");
		rbtnM.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbtnM.setBounds(306, 131, 96, 23);
		contentPanel.add(rbtnM);

		JRadioButton rbtnF = new JRadioButton("Feminino");
		rbtnF.setFont(new Font("Tahoma", Font.BOLD, 12));
		rbtnF.setBounds(404, 131, 109, 23);
		contentPanel.add(rbtnF);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rbtnM);
		bg.add(rbtnF);

		
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
				JButton btnNewButton_1 = new JButton("Buscar");
				buttonPane.add(btnNewButton_1);
			
			
				JButton btnNewButton = new JButton("Alterar");
				buttonPane.add(btnNewButton);
			
			
				JButton okButton = new JButton("Salvar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if ((!txtNome.getText().equals("") ) && (!txtIdade.getText().equals(""))
							&&(!txtCpfResponsavel.equals("")) && (rbtnF.isSelected() || rbtnM.isSelected()) ) {
							
							Aluno aluno = new Aluno();
							AlunoController controller = new AlunoController();
							
							String mat = Integer.toString(aluno.getId());
							
							aluno.setNome(txtNome.getText());
							aluno.setIdade(Integer.parseInt(txtIdade.getText()));
							String sexo;
							if(rbtnM.isSelected()) {
								sexo = "M";
							}
							else {
								sexo = "F";
							}
						
							aluno.setGenero(sexo);
							
							aluno.setCpf_responsavel(txtCpfResponsavel.getText());
							
							try	{
								controller.inserir(aluno);
							}catch(RegistroCadastradoComSucessoException e1) {
								JOptionPane.showMessageDialog(null, e1.getMessage(),"Cadastro",
										JOptionPane.INFORMATION_MESSAGE);
								
								Clear.limpar(contentPanel);
							}
						}else {
							JOptionPane.showMessageDialog(null, "Necessário preencher todos os campos!","ATENÇÃO",
									JOptionPane.INFORMATION_MESSAGE);
						}
							
							
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			

			
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			
		
	}

}
