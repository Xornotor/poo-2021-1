package ondevoudoar.classes;

import java.util.Calendar;
import java.util.Date;

public class Pessoa {
	
	private String nome, tipo, cpf_cnpj, endereco;
	private int telefone;
	private Date data_nascimento;

	public Pessoa(String name, String type, String id, Date birth, String address, int phone){
		this.nome = name;
		this.tipo = type;
		this.cpf_cnpj = id;
		this.data_nascimento = birth;
		this.endereco = address;
		this.telefone = phone;
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

		public String getEndereco(){
			return this.endereco;
		}

		public int getTelefone() {
			return this.telefone;
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
		
		public void setEndereco(String address) {
			this.endereco = address;
		}

		public void setId(String id){
			this.cpf_cnpj = id;
		}

		public void setTelefone(int num){
			this.telefone = num;
		}

		public void setDataNascimento(Date birth){
			this.data_nascimento = birth;
		}
	
	public void verificaPessoaEIdade(){
		if(this.tipo == "JURIDICA"){
			System.out.println("Método Inválido. Pessoa jurídica.");
		}else{
			if(maiorDeIdade()){
				System.out.println("Pessoa maior de idade");
			}else{
				System.out.println("Pessoa menor de idade");
			}
		}
	}
	
	public boolean maiorDeIdade() {
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
			return true;
		}else{
			return false;
		}
	}
	
}
