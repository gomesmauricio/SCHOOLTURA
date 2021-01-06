package CONTROLLER;

import java.util.List;

import EXCEPTIONS.BancoVazioException;
import EXCEPTIONS.ElementoNaoEncontradoException;
import EXCEPTIONS.RegistroAlteradoException;
import EXCEPTIONS.RegistroCadastradoComSucessoException;
import EXCEPTIONS.RegistroExcluidoException;
import MODEL.Aluno;
import MODEL.AlunoDAO;
import MODEL.InterfaceAluno;

public class AlunoController implements InterfaceAluno{
	

	private AlunoDAO alunoDAO;
	
	public AlunoController() {
		this.alunoDAO = new AlunoDAO();
	}
	
	public void inserir(Aluno aluno) throws RegistroCadastradoComSucessoException{
		alunoDAO.inserir(aluno);
		
	}
	
	public void excluir(Aluno aluno) throws RegistroExcluidoException{
		alunoDAO.excluir(aluno);
	}
	
	public void alterar(Aluno aluno) throws RegistroAlteradoException{
		alunoDAO.alterar(aluno);
	}
	
	public List<Aluno> listar() throws BancoVazioException{
		return alunoDAO.listar();
	}
	
	public List<Aluno> relatorioAlunoAprovado() throws BancoVazioException{
		return null;
//		return alunoDAO.relatorioAlunoAprovado();
	}

	@Override
	public Aluno consultar(int id) throws ElementoNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}
	



}
