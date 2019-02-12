package br.com.fiap.revisao.teste;

import br.com.fiap.revisao.bean.Funcionario;
import br.com.fiap.revisao.bean.Gerente;

public class FuncionarioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f = new Gerente();
		Funcionario f2 = new Funcionario();
		f.setSalario(900);
		f2.setSalario(900);
		
		Gerente g = (Gerente) f; //cast
		
		System.out.println(f.calcularBonificacao());
		System.out.println(f2.calcularBonificacao());
		
		String salario = (f.getSalario()>1000) ? "Maior" : "Menor";
		
		System.out.println(salario);
		
	}

}
