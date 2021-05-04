class AutomovelBasico extends Automovel {
  private boolean quintaMarcha;
  private boolean limpaVidroTraseiro;
  private boolean multimidia;

  public AutomovelBasico(String m, String c, byte comb) {
    super(m, c, comb);
    this.quintaMarcha = true;
    this.limpaVidroTraseiro = true;
    this.multimidia = true;
  }

  public AutomovelBasico(String m, String c, byte comb, boolean quintaMarcha, boolean limpaVidroTraseiro, boolean multimidia) {
    super(m, c, comb);
    this.quintaMarcha = quintaMarcha;
    this.limpaVidroTraseiro = limpaVidroTraseiro;
    this.multimidia = multimidia;
  }

  public boolean getQuintaMarcha() {
    return this.quintaMarcha;
  }

  public boolean getLimpaVidroTraseiro() {
    return this.limpaVidroTraseiro;
  }

  public boolean getMultimidia() {
    return this.multimidia;
  }

  public String toString() {
    String resultado = super.toString();
    if (getQuintaMarcha()) {
      resultado += "Com 5 marchas \n";
    }

    if (getLimpaVidroTraseiro()) {
      resultado += "Com limpador traseiro \n";
    }

    if (getMultimidia()) {
      resultado += "Com sistema multimídia \n";
    }

    return resultado;
  }

  public float getPreco(){
    
    float preco = super.getPreco();
    
    if(getQuintaMarcha()){
      preco += 280;
    }
    
    if(getLimpaVidroTraseiro()){
      preco += 650;
    }

    if(getMultimidia()){
      preco += 2800;
    }

    return preco;
  }
}