package fixacao01;

import java.lang.String;

public class ContaCorrente {
	int numeroConta;
	String nomeTitular;
	float saldoConta;
	
	public ContaCorrente(int numConta, String nome, float saldo){
		this.numeroConta = numConta;
		this.nomeTitular = nome;
		this.saldoConta = saldo;
	}
	
	public int lerNumeroConta() {
		return this.numeroConta;
	}
	
	public String lerNomeTitular() {
		return this.nomeTitular;
	}
	
	public float lerSaldo() {
		return this.saldoConta;
	}
	
	public void mudarNumeroConta(int num) {
		this.numeroConta = num;
	}
	
	public void mudarTitular(String nome) {
		this.nomeTitular = nome;
	}
	
	public void deposito(float valor) {
		this.saldoConta += valor;
	}
	
	public void saque(float valor) {
		if (this.saldoConta <= valor) {
			this.saldoConta -= valor;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
}
