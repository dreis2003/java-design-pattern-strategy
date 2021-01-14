package refatoracao.strategy;

import java.math.BigDecimal;

public class TesteImpostos {
	
	private static BigDecimal salarioTeste = BigDecimal.valueOf(1000);
	
	public static void main(String[] args) {
		
		ImpostoCpf pessoaFisica = new ImpostoCpf(salarioTeste);
		ImpostoCnpj pessoaJuridica = new ImpostoCnpj(salarioTeste);
		
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println("CPF: " + 
					calculadora.calcular(pessoaFisica));
		
		System.out.println("CNPJ: " + 
				calculadora.calcular(pessoaJuridica));

	}

}
