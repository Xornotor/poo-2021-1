class AutomovelLuxo extends AutomovelBasico {

    private boolean cameraRe;
    private boolean airbag;
    private static final byte numeroMaximoDePrestacoesLuxo = 36;

    public AutomovelLuxo(String m, String c, byte comb) {
      super(m, c, comb);
      this.airbag = true;
      this.cameraRe = true;
    }
  
    public AutomovelLuxo(String m, String c, byte comb, boolean quintaMarcha, boolean limpaVidroTraseiro, boolean multimidia, boolean cameraRe, boolean airbag) {
      super(m, c, comb, quintaMarcha, limpaVidroTraseiro, multimidia);
      this.airbag = airbag;
      this.cameraRe = cameraRe;
    }

    @Override
    public byte getPrestacoes(){
        return numeroMaximoDePrestacoesLuxo;
    }
  
    public boolean getAirbag() {
      return this.airbag;
    }
  
    public boolean getCameraRe() {
      return this.cameraRe;
    }
  
    public String toString() {
      String resultado = super.toString();

      if (getAirbag()){
        resultado += "Com airbag \n"; 
      }

      if (getCameraRe()){
        resultado += "Com câmera de ré \n"; 
      }
  
      return resultado;
    }
  
    public float getPreco(){
      
      float preco = super.getPreco();

      if(getAirbag()){
        preco += 3000;
      }

      if(getCameraRe()){
        preco += 3000;
      }
  
      return preco;
    }
  }