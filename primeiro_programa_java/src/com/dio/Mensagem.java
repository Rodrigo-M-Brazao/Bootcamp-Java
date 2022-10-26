package com.dio;

public class Mensagem {

	public static void obterMensagem(int hora) {
		if(hora > 4 && hora < 13) {
			System.out.println("Bom dia!");
		}
		else if(hora > 12 && hora < 18) {
			System.out.println("Boa tarde!");
		}
		else if(hora > 17 && hora < 24 || hora >= 0 && hora < 5) {
			System.out.println("Boa noite!");
		}
		else {
			System.out.println("Insira uma hora válida");
		}
	}
}
