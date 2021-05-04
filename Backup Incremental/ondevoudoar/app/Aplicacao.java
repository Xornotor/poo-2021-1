package ondevoudoar.app;

import java.util.Scanner;

import ondevoudoar.classes.Doador;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aplicacao {
    public static void main(String args[]) throws ParseException{
        int option;
        boolean finish = false;
        String nome, tipo, cpf_cnpj, data_string, endereco;
	    int telefone;
	    Date data_nascimento;
        Scanner sc = new Scanner(System.in);
        System.out.println("Doador, digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Voc� � pessoa f�sica ou jur�dica? ");
        tipo = sc.nextLine();
        System.out.println("Digite seu CPF ou CNPJ: ");
        cpf_cnpj = sc.nextLine();
        System.out.println("Digite a data de nascimento: ");
        data_string = sc.nextLine();
        DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        data_nascimento = dateformat.parse(data_string);
        System.out.println("Digite o seu endere�o: ");
        endereco = sc.nextLine();
        System.out.println("Digite seu telefone: ");
        telefone = sc.nextInt();
        Doador doador = new Doador(nome, tipo, cpf_cnpj, data_nascimento, endereco, telefone);

        String tipo_tmp, descricao_tmp, estado_tmp, entrega_tmp;
        int qtd_tmp;
        boolean bool_entrega_tmp;

        while(true){
            System.out.println("1 - Adicionar doa��o");
            System.out.println("2 - Remover doa��o");
            System.out.println("3 - Listar doa��es");
            System.out.println("4 - Encerrar aplica��o");
            System.out.println("Selecione a a��o desejada: ");
            option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Digite o tipo da doa��o: ");
                    tipo_tmp = sc.nextLine();
                    System.out.println("Digite a descri��o da doa��o: ");
                    descricao_tmp = sc.nextLine();
                    System.out.println("Digite o estado da doa��o: ");
                    estado_tmp = sc.nextLine();
                    System.out.println("Digite a quantidade de itens: ");
                    qtd_tmp = sc.nextInt();
                    System.out.println("Pode ser entregue no local? (S/N): ");
                    entrega_tmp = sc.next();
                    if(entrega_tmp.equals("s") || entrega_tmp.equals("S")){
                        bool_entrega_tmp = true;
                    }else{
                        bool_entrega_tmp = false;
                    }
                    doador.adicionarDoacao(tipo_tmp, descricao_tmp, estado_tmp, qtd_tmp, bool_entrega_tmp);
                    break;
                case 2:
                    System.out.println("Digite o n�mero do protocolo da doa��o que deseja remover: ");
                    int prot = sc.nextInt();
                    if(doador.removerDoacao(prot)){
                        System.out.println("Remo��o efetuada com sucesso.");
                    }else{
                        System.out.println("N�mero de protocolo n�o encontrado.");
                    }
                case 3:
                    doador.listarDoacoes();
                    break;
                case 4:
                    finish = true;
                    break;
                default:
                    System.out.println("Op��o inv�lida. Tente novamente.");
            }
            if(finish){
                break;
            }
            sc.close();
        }
    }
}
