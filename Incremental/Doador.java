import java.util.Date;
import java.util.Calendar;
import java.lang.String;
import java.util.ArrayList;

public class Doador{
	private String nome, tipo, cpf_cnpj, rua, complemento, bairro;
	private int numero;
	private Date data_nascimento;
	private ArrayList<Doacao> doacoes;

	public Doador(String name, String type, String id, Date birth, String street, int num, String comp, String district){
		this.nome = name;
		this.tipo = type;
		this.cpf_cnpj = id;
		this.data_nascimento = birth;
		this.rua = street;
		this.numero = num;
		this.complemento = comp;
		this.bairro = district;
		this.doacoes = new ArrayList();
	}

	//GETS

	public String getNome(){
		return this.nome;
	}

	public String getTipo(){
		return this.tipo;
	}

	public String getId(){
		return this.cpf_cnpj;
	}

	public String getRua(){
		return this.rua;
	}

	public String getComplemento(){
		return this.complemento;
	}

	public String getBairro(){
		return this.bairro;
	}

	public int getNumero(){
		return this.numero;
	}

	public Date getDataNascimento(){
		return this.data_nascimento;
	}

	//SETS

	public void setNome(String name){
		this.nome = name;
	}

	public void setTipo(String type){
		this.tipo = type;
	}

	public void setId(String id){
		this.cpf_cnpj = id;
	}

	public void setRua(String street){
		this.rua = street;
	}

	public void setComplemento(String comp){
		this.complemento = comp;
	}

	public void setBairro(String district){
		this.bairro = district;
	}

	public void setNumero(int num){
		this.numero = num;
	}

	public void setDataNascimento(Date birth){
		this.data_nascimento = birth;
	}

	//LER DOADOR

	public void lerDoador(){
		if(this.tipo == "JURIDICA"){
			System.out.println("Método Inválido. O doador é uma pessoa jurídica.");
		}else{
			Calendar cal = Calendar.getInstance();
			cal.setTime(this.data_nascimento);
			Calendar now = Calendar.getInstance();
			now.setTime(new Date());
            int anoNascimento = cal.get(Calendar.YEAR);
			int mesNascimento = cal.get(Calendar.MONTH);
			int diaNascimento = cal.get(Calendar.DAY_OF_MONTH);
			int anoAtual = now.get(Calendar.YEAR);
			int mesAtual = now.get(Calendar.MONTH);
			int diaAtual = now.get(Calendar.DAY_OF_MONTH);

            int idade = anoAtual - anoNascimento;
            if (mesNascimento < mesAtual){
                idade--;
            } else {
        		if(mesNascimento == mesAtual && diaNascimento < diaAtual){
                	idade--;
                }
            }
			if(idade >= 18){
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
			System.out.println("Descrição da doação: " + descricao_doacao);
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