package br.com.fiap.revisao.bean;

public class Gerente extends Funcionario{
	
	private double salarioGerente;
		
	//sobrescrita do método
	@Override 
	public double calcularBonificacao() {
		return salario*2;
	}
	
	//invocado quando o objeto é passato no sysout
	@Override
	public String toString() {
		return "Salario :"+ salario;
	}	
	
	//sobrecarga do método
	public double calcularBonificacao(double salarioGerente) {
		return salario+salarioGerente;
	}

}
