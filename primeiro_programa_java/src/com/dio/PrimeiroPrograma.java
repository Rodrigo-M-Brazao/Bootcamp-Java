package com.dio;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		System.out.println("Execicio Calculadora: ");
		Calculadora.soma(1,2);
		Calculadora.subtracao(3,2);
		Calculadora.multiplicacao(4,2);
		Calculadora.divisao(10,2);
		
		System.out.println("Execicio Mensagem: ");
		Mensagem.obterMensagem(5);
		Mensagem.obterMensagem(13);
		Mensagem.obterMensagem(23);
		
		System.out.println("Execicio Empréstimo: ");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
		
		
	}

}
