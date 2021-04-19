import java.lang.String;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}

class Contrato {
  private int numero, qtdMeses, prestPagas, prestAtraso, mesesDespejo;
  private float valor, juros;
  private boolean ativo;
  private Fiador fiador;

  public Contrato(int numero, float valor, int qtdMeses, int prestPagas, int prestAtraso, float juros, int mesesDespejo, Fiador fiador){
    this.numero = numero;
    this.valor = valor;
    this.qtdMeses = qtdMeses;
    this.prestPagas = prestPagas;
    this.prestAtraso = prestAtraso;
    this.juros = juros;
    this.mesesDespejo = mesesDespejo;    
    this.fiador = fiador;
    this.ativo = isFiador();
  }

  public float consultarPrestacaoSemJuros(){
    return this.valor;
  }
  
  public float consultarPrestacaoAtrasada(){
    return this.valor * (1 + this.juros);
  }

  public void pagarPrestacao(){
    this.prestPagas++;
  }

  public boolean dispararDespejo(){
    if(prestAtraso >= mesesDespejo){
      return true;
    }else{
      return false;
    }
  }

  public void alterarRendaFiador(float novaRenda){
    this.fiador.setRenda(novaRenda);
    this.ativo = isFiador();
  }

  public void modificarFiador(Fiador novoFiador){
    this.fiador = novoFiador;
    this.ativo = isFiador();
  }

  public boolean isFiador(){    
    if (this.fiador.getRenda() >= 3*this.valor)
    return true;
    else return false;
  }
}

class Fiador {
	private String nome;
	private String cpf;
	private float renda;
	
	public Fiador (String name, String id, float money){
		this.nome = name;
		this.cpf = id;
		this.renda = money;
	}

	public float getRenda(){
		return this.renda;
	}

	public void setRenda(float novaRenda){
		this.renda = novaRenda;
	}
}