package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio23Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pesoIdeal = 0;
		
		System.out.println("Digite seu nome: ");
		String nome=sc.next();
		
		System.out.println("Digite o seu sexo: ");
		char sexo=  sc.next().charAt(0);
		
		System.out.println("Digite sua altura: ");
		float altura=sc.nextFloat();
		
		if ((sexo=='m')||(sexo=='M')) {
			 pesoIdeal=72.2*altura-58;
			 System.out.println("O peso ideal do(a)"+nome+ " é " + pesoIdeal+" kg. ");
		} else if ((sexo=='f')||(sexo=='F')) {
			 pesoIdeal=62.1*altura-44.7;
			 System.out.println("O peso ideal do(a)"+nome+ " é " + pesoIdeal+" kg. ");
		}
		else {
			System.out.println("Opção inválida!");
		}
		

	}
	

}
