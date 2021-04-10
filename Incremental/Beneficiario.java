import java.util.Date;
import java.util.Calendar;
import java.lang.String;

public class Beneficiario{
	private String nome, tipo, cpf_cnpj, email, telefone, rua, complemento, bairro;
	private int numero;
	private Date data_nascimento;

	public Beneficiario(String name, String type, String id, Date birth, String mail, String tel, String street, int num, String comp, String district){
		this.nome = name;
		this.tipo = type;
		this.cpf_cnpj = id;
		this.data_nascimento = birth;
		this.email = mail;
		this.telefone = tel;
		this.rua = street;
		this.numero = num;
		this.complemento = comp;
		this.bairro = district;
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

	public String getEmail(){
		return this.email;
	}

	public String getTelefone(){
		return this.telefone;
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

	public void setEmail(String mail){
		this.email = mail;
	}

	public void setTelefone(String tel){
		this.telefone = tel;
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

	//LER BENEFICIARIO

	public void lerBeneficiario(){
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
				System.out.println("Beneficiário maior de idade");
			}else{
				System.out.println("Beneficiário menor de idade");
			}
		}
	}
}