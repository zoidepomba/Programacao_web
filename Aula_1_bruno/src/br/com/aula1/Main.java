package br.com.aula1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner mensagem = new Scanner(System.in);

		int valor1, valor2;

		System.out.println("Digite sua primeira numero: ");
		valor1 = mensagem.nextInt();

		System.out.println("Digite sua primeira numero: ");
		valor2 = mensagem.nextInt();


		if (valor1 > valor2) {
			System.out.print(valor1);
		} else {
			System.out.print(valor2);
		}
	}

}
