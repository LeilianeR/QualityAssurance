package exerciciosFaccat;

import java.util.*;

public class Exercicio24Faccat {

	public static void main(String[] args) {
		try {
			Scanner lr = new Scanner(System.in);
			System.out.println("Informe o salario fixo do funcionário:");
			double salariofixo = lr.nextInt();
			System.out.println("Informe o valor das vendas:");
			double valorvendas = lr.nextInt();

			if (valorvendas <= 1500.0) {
				double comissao = valorvendas * 0.03;
				double resultado = comissao = salariofixo;
				System.out.println("Valor final é de R$" + resultado + " reais.");
				
			} else if (valorvendas > 1500.0) {
				double valorpass = valorvendas - 1500.0;
				double comissao = 45;
				double comissao2 = valorpass * 0.05;
				double resultado = comissao + comissao2 + salariofixo;
				System.out.println("Valor final é de R$" + resultado + " reais.");

			}

		} catch (Exception e) {
			System.out.println("Digite uma opção valida!");
		}
	}

}
