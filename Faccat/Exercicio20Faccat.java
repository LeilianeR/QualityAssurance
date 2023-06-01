package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio20Faccat {

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
				System.out.println(v2+" , "+v1);
			}else if (v1<v2) {
				System.out.println(v1+" , "+v2);
				
			}
			
		} catch (Exception e) {
			
		}

	}

}
