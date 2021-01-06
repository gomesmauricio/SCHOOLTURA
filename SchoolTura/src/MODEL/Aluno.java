package MODEL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ALUNO")
public class Aluno {
	
	
	@Id
	@Column(name = "ID", nullable = false)
	private int id;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "IDADE", nullable = false)
	private int idade;
	
	@Column(name = "GENERO", nullable = false)
	private String genero;
	
	@OneToMany
	@JoinColumn(name = "CPF_RESPONSAVEL", referencedColumnName =  "CPF_RESPONSAVEL", nullable = false)
	private String cpf_responsavel;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf_responsavel() {
		return cpf_responsavel;
	}
	public void setCpf_responsavel(String cpf_responsavel) {
		this.cpf_responsavel = cpf_responsavel;
	}
	
	public Aluno() {
		super();
	}
	


}
