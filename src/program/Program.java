package program;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.FuncionarioTerceirizado;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários deseja cadastrar? ");
		int qtd = sc.nextInt();
		
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		
		
		for(int i = 0; i < qtd ; i++) {
			
			System.out.println();
			System.out.print("Deseja cadastrar Funcionário interno ou externo? i ou e: ");
			char op = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Digite o nome do funcionário: ");
			String nome = sc.nextLine();
			
			System.out.print("Digite a quantidade de horas trabalhadas: ");
			Integer horas = sc.nextInt();
			
			System.out.print("Digite o valor por hora desses funcionário: ");
			Double valorHora = sc.nextDouble();
			
			if(op == 'e') {
				
				System.out.print("Digite o valor do custo adicional desse funcionário:");
				Double custoAdicional = sc.nextDouble();
				System.out.println();
				funcionarios.add(new FuncionarioTerceirizado(nome,horas,valorHora,custoAdicional));
			} else {
				
				funcionarios.add(new Funcionario(nome, horas, valorHora));
			}

		}
		
		System.out.println();
		System.out.println("Pagamentos:");
		for (Funcionario func : funcionarios) {
			
			System.out.println(func.getNome() + " - R$ " + String.format("%.2f", func.pagamento()));
			
		}
		
		sc.close();
	}

}
