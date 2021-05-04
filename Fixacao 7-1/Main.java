class Main {
  public static void main(String[] args) {
    System.out.println("Hello POO class!");
    Automovel aux1 = new Automovel("classic", "preta", (byte) 1);
    Automovel aux2 = new AutomovelBasico("gol", "prata", (byte) 2, true, false, false);
    Automovel aux3 = new AutomovelLuxo("Ferrari", "Preto", (byte) 1);
    System.out.println(aux1);
    System.out.println(aux1.getPreco());
    System.out.println(aux1.getPrestacoes());
    System.out.println(aux2);
    System.out.println(aux2.getPreco());
    System.out.println(aux2.getPrestacoes());
    System.out.println(aux3);
    System.out.println(aux3.getPreco());
    System.out.println(aux3.getPrestacoes());
  }


}