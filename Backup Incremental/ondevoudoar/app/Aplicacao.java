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
        System.out.println("Você é pessoa física ou jurídica? ");
        tipo = sc.nextLine();
        System.out.println("Digite seu CPF ou CNPJ: ");
        cpf_cnpj = sc.nextLine();
        System.out.println("Digite a data de nascimento: ");
        data_string = sc.nextLine();
        DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        data_nascimento = dateformat.parse(data_string);
        System.out.println("Digite o seu endereço: ");
        endereco = sc.nextLine();
        System.out.println("Digite seu telefone: ");
        telefone = sc.nextInt();
        Doador doador = new Doador(nome, tipo, cpf_cnpj, data_nascimento, endereco, telefone);

        String tipo_tmp, descricao_tmp, estado_tmp, entrega_tmp;
        int qtd_tmp;
        boolean bool_entrega_tmp;

        while(true){
            System.out.println("1 - Adicionar doação");
            System.out.println("2 - Remover doação");
            System.out.println("3 - Listar doações");
            System.out.println("4 - Encerrar aplicação");
            System.out.println("Selecione a ação desejada: ");
            option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Digite o tipo da doação: ");
                    tipo_tmp = sc.nextLine();
                    System.out.println("Digite a descrição da doação: ");
                    descricao_tmp = sc.nextLine();
                    System.out.println("Digite o estado da doação: ");
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
                    System.out.println("Digite o número do protocolo da doação que deseja remover: ");
                    int prot = sc.nextInt();
                    if(doador.removerDoacao(prot)){
                        System.out.println("Remoção efetuada com sucesso.");
                    }else{
                        System.out.println("Número de protocolo não encontrado.");
                    }
                case 3:
                    doador.listarDoacoes();
                    break;
                case 4:
                    finish = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            if(finish){
                break;
            }
            sc.close();
        }
    }
}
