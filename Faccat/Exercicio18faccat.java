package exerciciosFaccat;


import java.util.Scanner;

public class Exercicio18faccat {
	
         public static void main(String[] args) {
        	 
         try {
        	 int anoatual, anonasc, conta;
        	 Scanner read = new Scanner (System.in);
        	 System.out.println("Digite o ano atual:");
        	 anoatual=read.nextInt();
        	 System.out.println("Digite o ano de nascimento:");
        	 anonasc=read.nextInt();
        	 conta=anoatual-anonasc;
        	 if (conta>=18) {
        		 System.out.println("Agora volte!");
        		 
        	 }
        	 else {
        		 System.out.println("Voce não pode votar ainda! Quem sabe a proxima!");
        	 }
		} catch (Exception e) {
			System.out.println("Digite um valor valido!");
		}
         }
}
