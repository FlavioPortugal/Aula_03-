package br.com.fiap.revisao.dao;

import java.io.Serializable;

import br.com.fiap.revisao.bean.Funcionario;

//Interface pode herdar de uma ou mais interfaces
public  interface FuncionarioDAO {
	
	public void cadastrar(Funcionario f);
	public void atualizar(Funcionario f);
	public void remover(int id);

}
