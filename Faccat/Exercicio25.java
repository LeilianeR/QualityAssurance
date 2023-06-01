package exerciciosFaccat;


import java.util.Scanner;
public class Exercicio25 {

	public static void main(String[] args) {
		 try {
			 double conta, saldo=0, saldoAtual, debito=0, credito=0;
				
				Scanner read= new Scanner(System.in);
				System.out.println("Digite o número da conta: ");
				conta=read.nextDouble();
				System.out.println("Saldo: ");
				saldo= read.nextDouble();
				System.out.println("Débito: ");
				debito=read.nextDouble();
				System.out.println("Credito: ");
				credito=read.nextDouble();
				
				saldoAtual= saldo-debito+credito;
				if (saldoAtual>=0) {
					System.out.println("Saldo positivo! :)");
				} else {
					System.out.println("Saldo negativo! :(");

				}
			
		} catch (Exception e) {
			System.out.println("Opção inválida! ");
		}
			
		}
		
		
		
	}


