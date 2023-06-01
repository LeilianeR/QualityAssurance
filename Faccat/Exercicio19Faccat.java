package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio19Faccat {
	public static void main(String[] args) {

		try {
			Scanner lr = new Scanner(System.in);
			System.out.println("Informe o primeiro valor:");
			int v1 = lr.nextInt();
			System.out.println("Informe o segundo valor:");
			int v2 = lr.nextInt();
			if(v1==v2) {
				System.out.println("Opção invalida!");
			}else if (v1>v2) {
				System.out.println("O primeiro valor é o maior.");
			}else if (v2>v1) {
				System.out.println("O segundo valor é maior.");
				
			}
			
		} catch (Exception e) {
			System.out.println("Essa opção esta invalida.");
			
		}
	}

}
