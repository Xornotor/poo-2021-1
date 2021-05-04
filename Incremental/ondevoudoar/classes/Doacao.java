package ondevoudoar.classes;

import java.lang.String;

public class Doacao{
	static private int contador_protocolo = 12345;
	private Doador doador;
    private String tipo_doacao, descricao_doacao, estado_doacao;
	private int quantidade, protocolo;
	private boolean pode_ser_entregue;

	public Doacao(Doador doador, String tipo_doacao, String descricao_doacao, String estado_doacao, int quantidade, boolean pode_ser_entregue){
		this.doador = doador;
        this.tipo_doacao = tipo_doacao;
        this.descricao_doacao = descricao_doacao;
        this.estado_doacao = estado_doacao;
        this.quantidade = quantidade;
        this.pode_ser_entregue = pode_ser_entregue;
		this.protocolo = contador_protocolo;
		contador_protocolo += 127;
	}

	//GETS

	public Doador getDoador(){
		return this.doador;
	}

	public String getTipo(){
		return this.tipo_doacao;
	}

	public String getDescricao(){
		return this.descricao_doacao;
	}

	public String getEstado(){
		return this.estado_doacao;
	}

	public int getQuantidade(){
		return this.quantidade;
	}

	public boolean getEntrega(){
		return this.pode_ser_entregue;
	}

	public int getProtocolo(){
		return this.protocolo;
	}

	//SETS

	public void setDoador(Doador novo_doador){
		this.doador = novo_doador;
	}

	public void setTipo(String novo_tipo){
		this.tipo_doacao = novo_tipo;
	}

	public void setDescricao(String nova_descricao){
		this.descricao_doacao = nova_descricao;
	}

	public void setEstado(String novo_estado){
		this.estado_doacao = novo_estado;
	}

	public void setQuantidade(int nova_quantidade){
		this.quantidade = nova_quantidade;
	}

	public void setEntrega(boolean nova_entrega){
		this.pode_ser_entregue = nova_entrega;
	}

    //TAMANHO DA DOAÇÃO

    public void tamanhoDoacao(){
        if(this.quantidade < 20){
            System.out.println("Doação pequena");
        }else if(this.quantidade >= 20 && this.quantidade <= 50){
            System.out.println("Doação média");
        }else{
            System.out.println("Doação grande");
        }
    }
}