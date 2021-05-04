package ondevoudoar.classes;

import java.lang.String;

public class Necessidade{
	private Beneficiario beneficiario;
    private String tipo_necessidade, descricao_necessidade;
	private int quantidade;

	public Necessidade(Beneficiario beneficiario, String tipo_necessidade, String descricao_necessidade, int quantidade){
		this.beneficiario = beneficiario;
        this.tipo_necessidade = tipo_necessidade;
        this.descricao_necessidade = descricao_necessidade;
        this.quantidade = quantidade;
	}

	//GETS

	public Beneficiario getBeneficiario(){
		return this.beneficiario;
	}

	public String getTipo(){
		return this.tipo_necessidade;
	}

	public String getDescricao(){
		return this.descricao_necessidade;
	}

	public int getQuantidade(){
		return this.quantidade;
	}

	//SETS

	public void setBeneficiario(Beneficiario novo_beneficiario){
		this.beneficiario = novo_beneficiario;
	}

	public void setTipo(String novo_tipo){
		this.tipo_necessidade = novo_tipo;
	}

	public void setDescricao(String nova_descricao){
		this.descricao_necessidade = nova_descricao;
	}

	public void setQuantidade(int nova_quantidade){
		this.quantidade = nova_quantidade;
	}
}