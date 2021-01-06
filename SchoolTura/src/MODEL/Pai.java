package MODEL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pai")
public class Pai {
	
	@Id
	@Column(name = "CPF", nullable = false)
	private String cpf;
	
	@Id
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Id
	@Column(name = "GENERO", nullable = false)
	private String genero;
	
	@Id
	@Column(name = "IDADE", nullable = false)
	private int idade;
	
	@Id
	@Column(name = "PAGAMENTO", nullable = false)
	private int pagamento;
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getPagamento() {
		return pagamento;
	}
	public void setPagamento(int pagamento) {
		this.pagamento = pagamento;
	}
	
	public Pai() {
		super();
	}
	
	
	

}
