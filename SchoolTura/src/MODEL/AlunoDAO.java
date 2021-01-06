package MODEL;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import EXCEPTIONS.RegistroCadastradoComSucessoException;
import EXCEPTIONS.RegistroExcluidoException;
import EXCEPTIONS.BancoVazioException;
import EXCEPTIONS.ElementoNaoEncontradoException;
import EXCEPTIONS.RegistroAlteradoException;
import CONEXAO.Conexao;
import MODEL.Aluno;




public class AlunoDAO {
	
	private Connection connection = null;
	private PreparedStatement stm = null;
	
	public void inserir(Aluno aluno) throws RegistroCadastradoComSucessoException {

		String sql = "INSERT INTO ALUNO (NOME, IDADE, GENERO, CPF_REPONSAVEL) VALUES (?,?,?,?);";

		try {
			new Conexao();
			this.connection = Conexao.getConnection();
			this.stm = this.connection.prepareStatement(sql);
			this.stm.setString(1, aluno.getNome());
			this.stm.setInt   (2, aluno.getIdade());
			this.stm.setString(3, aluno.getGenero());
			this.stm.setString(4, aluno.getCpf_responsavel());
			
			this.stm.execute();
			this.stm.close();

			throw new RegistroCadastradoComSucessoException();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				this.connection.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

	}
	
	public void alterar(Aluno aluno) throws RegistroAlteradoException {

		String sql = "UPDATE ALUNO SET nome=?, idade=?, genero=?, cpf_responsavel=? WHERE id=?";

		try {
			this.connection = new Conexao().getConnection();
			this.stm = this.connection.prepareStatement(sql);
	
			this.stm.setString(1, aluno.getNome());
			this.stm.setInt   (2, aluno.getIdade());
			this.stm.setString(3, aluno.getGenero());
			this.stm.setString(4, aluno.getCpf_responsavel());
			this.stm.execute();
			this.stm.close();

			throw new RegistroAlteradoException();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				this.connection.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

	}
	
	public void excluir(Aluno aluno) throws RegistroExcluidoException {

		String sql = "DELETE FROM ALUNO WHERE id=?";

		try {
			this.connection = new Conexao().getConnection();
			this.stm = this.connection.prepareStatement(sql);
			this.stm.setInt(1, aluno.getId());
			this.stm.execute();
			this.stm.close();

			throw new RegistroExcluidoException();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			try {
				this.connection.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

	}
	
	public Aluno consultar(int id) throws ElementoNaoEncontradoException {
		Aluno aluno = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM ALUNO WHERE id=?";

		try {

			this.connection = new Conexao().getConnection();
			stm = this.connection.prepareStatement(sql);
			this.stm.setInt(1, id);

			rs = this.stm.executeQuery();

			while (rs.next()) {
				aluno = new Aluno();
				aluno.setId(rs.getInt("id"));
				aluno.setNome(rs.getString("nome"));
				aluno.setIdade(rs.getInt("idade"));
				aluno.setGenero(rs.getString("genero"));
				aluno.setCpf_responsavel(rs.getString("cpf_responsavel"));
				
			}

			this.stm.close();
			rs.close();

			if (aluno == null) {
				throw new ElementoNaoEncontradoException();
			} else {
				return aluno;
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {

			try {
				this.connection.close();
			} catch (SQLException e) {

				throw new RuntimeException(e);
			}

		}
	}

	public List<Aluno> listar() throws BancoVazioException {
		List<Aluno> listAluno = new ArrayList<Aluno>();
		Aluno aluno = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM ALUNO";

		try {
			this.connection = new Conexao().getConnection();
			stm = this.connection.prepareStatement(sql);
			rs = this.stm.executeQuery();

			while (rs.next()) {
				aluno = new Aluno();
				aluno.setId(rs.getInt("id"));
				aluno.setNome(rs.getString("nome"));
				aluno.setIdade(rs.getInt("idade"));
				aluno.setGenero(rs.getString("genero"));
				aluno.setCpf_responsavel(rs.getString("cpf_responsavel"));
				
				listAluno.add(aluno);
			}

			this.stm.close();
			rs.close();

			if (listAluno.isEmpty()) {
				throw new BancoVazioException();
			} else {
				return listAluno;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				this.connection.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

	}
	
}
