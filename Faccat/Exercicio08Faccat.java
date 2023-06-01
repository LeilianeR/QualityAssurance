package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio08Faccat {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		System.out.println("Olá! Por gentileza, digite o valor total de votos do município:");
		int totalvotos = read.nextInt();
		System.out.println("Dos "+totalvotos+", quantos foram em branco?");
		int votoemB=read.nextInt();
		System.out.println("Dos "+totalvotos+", quantos foram nulos?");
		int votoN=read.nextInt();
		int votoV=totalvotos-votoemB-votoN;
		double porcvotosb = (votoemB*100)/totalvotos;
		double porcvotosn = (votoN*100)/totalvotos;
		double porcvotosv = (votoV*100)/totalvotos;
				System.out.println("O total de votos foi de "+totalvotos+".\nForam digitados "+votoemB+" votos em branco, representando um percentual de "+porcvotosb+"%.");
				System.out.println("Foram digitados "+votoN+" votos nulos, representando um percentual de");
				System.out.println("O percentual de votos brancos é de "+porcvotosn+"%.");
				System.out.println("Foram digitados "+votoV+" votos válidos, representando um percentual de "+porcvotosv+"%.");
		
	
	
	}

}
