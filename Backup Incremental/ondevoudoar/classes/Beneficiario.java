package ondevoudoar.classes;

import java.util.Date;
import java.lang.String;

public class Beneficiario extends Pessoa{
	

	public Beneficiario(String name, String type, String id, Date birth, String address, int phone){
		super(name, type, id, birth, address, phone);
	}

	//LER BENEFICIARIO

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
}