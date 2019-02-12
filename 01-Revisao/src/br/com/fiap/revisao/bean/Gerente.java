package br.com.fiap.revisao.bean;

public class Gerente extends Funcionario{
	
	private double salarioGerente;
		
	//sobrescrita do m�todo
	@Override 
	public double calcularBonificacao() {
		return salario*2;
	}
	
	//invocado quando o objeto � passato no sysout
	@Override
	public String toString() {
		return "Salario :"+ salario;
	}	
	
	//sobrecarga do m�todo
	public double calcularBonificacao(double salarioGerente) {
		return salario+salarioGerente;
	}

}
