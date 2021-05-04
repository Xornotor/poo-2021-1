package empresa.classes;

import java.lang.String;

public class Funcionario{
	private String nome, funcao;
	private double salario;

	public Funcionario(String nome, String funcao, double salario){
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
	}

	public double getSalario(){
		return this.salario;
	}

	public String getNome(){
		return this.nome;	
	}

	public String getFuncao(){
		return this.funcao;
	}

	public boolean promove(String nova_funcao, double novo_salario){
		this.funcao = nova_funcao;
		this.salario = novo_salario;
		return true;
	}

	public double valorEmprestimo(){
		return this.salario * 0.3;
	}
}