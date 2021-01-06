package MODEL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NOTAS")
public class Notas {
	
	@Id
	@Column(name = "ID_ALUNO", nullable = false)
	private int idAluno;
	
	@Id
	@Column(name = "UNIDADE1", nullable = false)
	private int unidade1;
	
	@Id
	@Column(name = "UNIDADE2", nullable = false)
	private int unidade2;
	
	@Id
	@Column(name = "UNIDADE3", nullable = false)
	private int unidade3;
	
	@Id
	@Column(name = "UNIDADE4", nullable = false)
	private int unidade4;
	
	@Id
	@Column(name = "STATUS", nullable = false)
	private String status;

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public int getUnidade1() {
		return unidade1;
	}

	public void setUnidade1(int unidade1) {
		this.unidade1 = unidade1;
	}

	public int getUnidade2() {
		return unidade2;
	}

	public void setUnidade2(int unidade2) {
		this.unidade2 = unidade2;
	}

	public int getUnidade3() {
		return unidade3;
	}

	public void setUnidade3(int unidade3) {
		this.unidade3 = unidade3;
	}

	public int getUnidade4() {
		return unidade4;
	}

	public void setUnidade4(int unidade4) {
		this.unidade4 = unidade4;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Notas() {
		super();
	}
	
	

}
