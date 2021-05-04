class Automovel
{
  public static final byte movidoAGasolina = 1;
  public static final byte movidoAAlcool = 2;
  public static final byte movidoADiesel = 3;
  private static final byte numeroMaximoDePrestacoes = 24;
  private String modelo, cor;
  private byte comb;
  private float preco = 0;

  public Automovel(String modelo, String cor, byte comb)
  {
    this.modelo = modelo;
    this.cor = cor;
    this.comb = comb;    

  }

  public float getPreco()
  {
    if (this.comb == movidoAGasolina)
    {
      this.preco = 20000f;
    } else if (this.comb == movidoAAlcool)
    {
      this.preco = 15000f;
    } else if (this.comb == movidoADiesel)
    {
      this.preco = 30000f;
    }
    return this.preco;            
  }

  public String getModelo() {
    return this.modelo;
  }

  public String getCor() {
    return this.cor;
  }

  public byte getCombustivel() {
    return this.comb;
  }
  
  public byte getPrestacoes(){
    return numeroMaximoDePrestacoes;
  }

  public String toString() {
    String resultado;

    resultado = getModelo()+""+getCor()+"\n";
    
    switch (getCombustivel()) {
      case movidoAGasolina: resultado+="Gasolina \n";
        break;
      case movidoAAlcool: resultado+="Alcool\n";
        break;
      case movidoADiesel: resultado+="Diesel\n";
        break;
    }
    
    return resultado;
  }
}