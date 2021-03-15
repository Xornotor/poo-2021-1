import java.lang.String;

public class Pessoa {
	private String nome;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	private float altura;

	public Pessoa(String nomePessoa, int diaPessoa, int mesPessoa, int anoPessoa, float alturaPessoa){
			this.nome = nomePessoa;
			this.diaNascimento = diaPessoa;
			this.mesNascimento = mesPessoa;
			this.anoNascimento = anoPessoa;
			this.altura = alturaPessoa;
	}
	
	public String lerNome(){
		return this.nome;
	}
	
	public String lerDataNascimento(){
		return String.format("%d/%d/%d", this.diaNascimento, this.mesNascimento, this.anoNascimento);
	}
	
	public float lerAltura() {
		return this.altura;
	}
	
	public void mudarNome(String nomeNovo){
		this.nome = nomeNovo;
	}
	
	public void mudarDataNascimento(int diaNovo, int mesNovo, int anoNovo){
		this.diaNascimento = diaNovo;
		this.mesNascimento = mesNovo;
		this.anoNascimento = anoNovo;
	}
	
	public void mudarAltura(float alturaNova){
		this.altura = alturaNova;
	}
	
	public void imprimeDados() {
		String nomePrint = String.format("Nome: %s", this.nome);
		String dataPrint = String.format("Data de Nascimento: %s", lerDataNascimento());
		String alturaPrint = String.format("Altura: %f", this.altura);
		System.out.println(nomePrint);
		System.out.println(dataPrint);
		System.out.println(alturaPrint);
	}
	
	public int calcularIdade(int diaAtual, int mesAtual, int anoAtual) {
		int idade = anoAtual - this.anoNascimento;
		if(mesAtual < this.mesNascimento || (mesAtual == this.mesNascimento && diaAtual < this.diaNascimento)) {
			idade--;
		}
		return idade;
	}

}