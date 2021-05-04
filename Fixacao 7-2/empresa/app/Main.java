package empresa.app;

import empresa.classes.Chefe;
import empresa.classes.Empresa;
import empresa.classes.Funcionario;

class Main {
	
	  public static void main(String[] args) {
		  	String nome_tmp, funcao_tmp;
		  	double salario_tmp, bonus_tmp;
		    Empresa minhaEmpresa = new Empresa(51234598, "Minha empresa");
		    
		    while(true){
	            System.out.println("1 - Adicionar Funcionário");
	            System.out.println("2 - Adicionar Chefe");
	            System.out.println("3 - Listar funcionários");
	            System.out.println("4 - Listar valores de empréstimo");
	            System.out.println("5 - Promover");
	            System.out.println("Selecione a ação desejada: ");
	            option = sc.nextInt();
	            switch(option){
	                case 1:
	                    System.out.println("Digite o nome do funcionário: ");
	                    nome_tmp = sc.nextLine();
	                    System.out.println("Digite a função: ");
	                    funcao_tmp = sc.nextLine();
	                    System.out.println("Digite o salário: ");
	                    salario_tmp = sc.nextDouble();
	                    minhaEmpresa.addFuncionario(nome_tmp, funcao_tmp, salario_tmp);
	                    break;
	                case 2:
	                	System.out.println("Digite o nome do funcionário: ");
		                nome_tmp = sc.nextLine();
		                System.out.println("Digite a função: ");
		                funcao_tmp = sc.nextLine();
		                System.out.println("Digite o salário: ");
		                salario_tmp = sc.nextDouble();
		                System.out.println("Digite o bônus: ");
		                bonus_tmp = sc.nextDouble();
		                minhaEmpresa.addFuncionario(nome_tmp, funcao_tmp, salario_tmp, bonus_tmp);
		                break;
	                case 3:
	                    minhaEmpresa.imprimirFolha();
	                    break;
	                case 4:
	                   	minhaEmpresa.imprimirEmprestimo();
	                    break;
	                case 5:
	                	boolean promocao = false;
	                	System.out.println("Digite o nome do funcionário que deseja promover: ");
	                	nome_tmp = sc.nextLine();
	                	System.out.println("Digite a nova função: ");
	                	funcao_tmp = sc.nextLine();
	                	System.out.println("Digite o novo salário: ");
	                	salario_tmp = sc.nextDouble();
	                	for(Funcionario f: minhaEmpresa.getFuncionarios()) {
	                		if(nome_tmp.equals(f.getNome())) {
	                			promocao = true;
	                			promove(funcao_tmp, salario_tmp);
	                			break;
	                		}
	                	}
	                	if(promocao) {
	                		System.out.println("Funcionario promovido!");
	                	} else {
	                		System.out.println("Funcionario nao encontrado.");
	                	}
	                	break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	            if(finish){
	                break;
	            }
		    }
	        sc.close();
	        } 
	  }
}