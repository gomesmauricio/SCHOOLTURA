package MODEL;

import EXCEPTIONS.RegistroCadastradoComSucessoException;
import EXCEPTIONS.RegistroExcluidoException;
import EXCEPTIONS.ElementoNaoEncontradoException;
import EXCEPTIONS.BancoVazioException;
import EXCEPTIONS.RegistroAlteradoException;
import MODEL.Aluno;


import java.util.List;

/**
 * Classe que cria a padronização das assinaturas dos métodos.
 * @author José Mauricio
 *
 */


public interface InterfaceAluno {
	
	/**
	 * Metodo cujo objetivo é inserir o registro de um Aluno no banco de dados.
	 * @parm pessoa Parametro de entrada um objeto pessoa.
	 * @throws RegitroCadastradoComSucessoException excessao levantada
	 * caso consiga inserir no banco dedados.
	 * 
	 */	
	public void inserir(Aluno aluno) throws RegistroCadastradoComSucessoException;
	
	/**
	 * Metodo cujo objetivo é Alterar o registro de um Aluno no banco de dados.
	 * @parm pessoa Parametro de entrada um objeto pessoa.
	 * @throws RegitroCadastradoComSucessoException excessao levantada
	 * caso consiga alterar no banco dedados.
	 * 
	 */
	public void alterar(Aluno aluno) throws RegistroAlteradoException;
	
	/**
	 * Metodo cujo objetivo é Excluir o registro de um Aluno no banco de dados.
	 * @parm pessoa Parametro de entrada um objeto pessoa.
	 * @throws RegitroCadastradoComSucessoException excessao levantada
	 * caso consiga Excluir do banco dedados.
	 * 
	 */	
	public void excluir(Aluno aluno) throws RegistroExcluidoException;
	
	/**
	 * Metodo cujo objetivo é Listar todos registros de um Alunos do banco de dados.
	 * @parm pessoa Parametro de entrada um objeto pessoa.
	 * @throws RegitroCadastradoComSucessoException excessao levantada
	 * caso consiga listar no banco dedados.
	 * 
	 */
	
	public List<Aluno> listar() throws BancoVazioException;
	
	
	/**
	 * Metodo cujo objetivo é Consultar o registro de um Aluno no banco de dados.
	 * @parm pessoa Parametro de entrada um objeto pessoa.
	 * @throws RegitroCadastradoComSucessoException excessao levantada
	 * caso consiga consultar no banco dedados.
	 * 
	 */
	public Aluno consultar(int id) throws ElementoNaoEncontradoException;

}

