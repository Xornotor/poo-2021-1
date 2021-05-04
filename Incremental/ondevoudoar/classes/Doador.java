package ondevoudoar.classes;

import java.util.Date;
import java.lang.String;
import java.util.ArrayList;

public class Doador extends Pessoa{
	private ArrayList<Doacao> doacoes;

	public Doador(String name, String type, String id, Date birth, String address, int phone){
		super(name, type, id, birth, address, phone);
		this.doacoes = new ArrayList<Doacao>();
	}


	//LER DOADOR

	@Override
	public void verificaPessoaEIdade(){
		if(super.getTipo().equals("JURIDICA")){
			System.out.println("Método Inválido. Doador é pessoa jurídica.");
		}else{
			if(maiorDeIdade()){
				System.out.println("Doador maior de idade");
			}else{
				System.out.println("Doador menor de idade");
			}
		}
	}

	//ADICIONAR DOACAO
	public void adicionarDoacao(String tipo_doacao, String descricao_doacao, String estado_doacao, int quantidade, boolean pode_ser_entregue){
		Doacao nova_doacao = new Doacao(this, tipo_doacao, descricao_doacao, estado_doacao, quantidade, pode_ser_entregue);
		this.doacoes.add(nova_doacao);
	}

	//REMOVER DOACAO
	public boolean removerDoacao(int num_protocolo){
		for(int i = 0; i < this.doacoes.size(); i++){
			if(this.doacoes.get(i).getProtocolo() == num_protocolo){
				this.doacoes.remove(i);
				return true;
			}
		}
		return false;
	}

	//ALTERAR DOACAO
	public boolean alterarTipoDoacao(int ref, String tipo){
		Doacao doador_temp;
		if(ref >= 0 && ref < this.doacoes.size()){
			doador_temp = this.doacoes.get(ref);
			doador_temp.setTipo(tipo);
			this.doacoes.set(ref, doador_temp);
			return true;
		}else{
			return false;
		}
	}

	public boolean alterarDescricaoDoacao(int ref, String descricao){
		Doacao doador_temp;
		if(ref >= 0 && ref < this.doacoes.size()){
			doador_temp = this.doacoes.get(ref);
			doador_temp.setDescricao(descricao);
			this.doacoes.set(ref, doador_temp);
			return true;
		}else{
			return false;
		}
	}

	public boolean alterarEstadoDoacao(int ref, String estado){
		Doacao doador_temp;
		if(ref >= 0 && ref < this.doacoes.size()){
			doador_temp = this.doacoes.get(ref);
			doador_temp.setEstado(estado);
			this.doacoes.set(ref, doador_temp);
			return true;
		}else{
			return false;
		}
	}

	public boolean alterarQuantidadeDoacao(int ref, int quantidade){
		Doacao doador_temp;
		if(ref >= 0 && ref < this.doacoes.size()){
			doador_temp = this.doacoes.get(ref);
			doador_temp.setQuantidade(quantidade);
			this.doacoes.set(ref, doador_temp);
			return true;
		}else{
			return false;
		}
	}

	public boolean alterarEntregaDoacao(int ref, boolean entrega){
		Doacao doador_temp;
		if(ref >= 0 && ref < this.doacoes.size()){
			doador_temp = this.doacoes.get(ref);
			doador_temp.setEntrega(entrega);
			this.doacoes.set(ref, doador_temp);
			return true;
		}else{
			return false;
		}
	}

	//LISTAR DOACOES
	public void listarDoacoes(){
		String tipo_doacao, descricao_doacao, estado_doacao;
		int quantidade;
		boolean pode_ser_entregue;
		for(int i = 0; i < this.doacoes.size(); i++){
			tipo_doacao = this.doacoes.get(i).getTipo();
			descricao_doacao = this.doacoes.get(i).getDescricao();
			estado_doacao = this.doacoes.get(i).getEstado();
			quantidade = this.doacoes.get(i).getQuantidade();
			pode_ser_entregue = this.doacoes.get(i).getEntrega();
			System.out.println("Tipo de doação: " + tipo_doacao);
			System.out.println("Descrição da doaÃ§Ã£o: " + descricao_doacao);
			System.out.println("Estado da doação: " + estado_doacao);
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Pode ser entregue? " + pode_ser_entregue);
			System.out.println();
			System.out.println();
		}
	}

	//QUANTIDADE DE DOACOES
	public int qtdDoacoes(){
		return this.doacoes.size();
	}

}