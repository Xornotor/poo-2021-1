import java.lang.String;

class Main {
    public static void main(String[] args) {
      
    }
}

class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda(){
        this.contatos = new ArrayList();
    }

    public void adicionarContato(String nome, String tel){
        Contato novo_contato = new Contato(nome, tel);
        this.contatos.add(novo_contato);
    }

    public void removeContato(String nome_contato){
        for (int i = 0; i < this.contatos.size(); i++){
            if(this.contatos.get(i).getNome.equals(nome_contato)){
                this.contatos.remove(i);
                break;
            }
        }
    }

    public void removeContato(int telefone){
        for (int i = 0; i < this.contatos.size(); i++){
            if(this.contatos.get(i).getTelefone == telefone){
                this.contatos.remove(i);
                break;
            }
        }
    }

    public void alteraNomeContato(int telefone, String nome_contato){
        for (int i = 0; i < this.contatos.size(); i++){
            if(this.contatos.get(i).getTelefone == telefone){
                this.contatos.get(i).setNome(nome_contato);
                break;
            }
        }
    }

    public void listarContatos(){
        String nome_contato;
        int telefone;
        for (int i = 0; i < this.contatos.size(); i++){
            nome_contato = this.contatos.get(i).getNome();
            telefone = this.contatos.get(i).getTelefone();
            System.out.println("Nome: " + nome_contato + " Telefone: " + telefone);
        }
    }

    public int quantidadeContatos(){
        return this.contatos.size();
    }
}

class Contato {
    private String nome;
    private int tel;

    public Contato(String nome, int tel){
        this.nome = nome;
        this.tel = tel;
    }

    public String getNome(){
        return this.nome;
    }

    public int getTelefone(){
        return this.tel;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone(int tel){
        this.tel = tel;
    }
}