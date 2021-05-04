package empresa.classes;

import java.util.ArrayList;

public class Empresa {
    private static int CNPJ;
    private static String razaoSocial;
    private static ArrayList<Funcionario> funcionarios;

    public Empresa(int CNPJ, String razaoSocial) {
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
        this.funcionarios = new ArrayList<>();
    }

    public int getCNPJ() {
        return CNPJ;
    }
    
    public String getRazaoSocial() {
        return razaoSocial;
    }
    
    public ArrayList<Funcionario> getFuncionarios(){
    	return funcionarios;
    }

    public void addFuncionario(String nome, String funcao, double salario, double bonus) {
        this.funcionarios.add(new Chefe(nome, funcao, salario, bonus));
    }

    public void addFuncionario(String nome, String funcao, double salario) {
        this.funcionarios.add(new Funcionario(nome, funcao, salario));
    }

    public void addFuncionario(Funcionario func) {
        this.funcionarios.add(func);
    }

    public String imprimirFolha() {
        String lista = "";
        for(Funcionario f : funcionarios) {
            lista += f.getNome() + " - " + f.getSalario() + "\n";
        }
        return lista;
    }
    
    public String imprimirEmprestimo() {
        String lista = "";
        for(Funcionario f : funcionarios) {
            lista += f.getNome() + " - " + f.valorEmprestimo() + "\n";
        }
        return lista;
    }


}