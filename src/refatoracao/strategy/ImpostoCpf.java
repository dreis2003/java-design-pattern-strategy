package refatoracao.strategy;

import java.math.BigDecimal;

public class ImpostoCpf implements Imposto {
	
	private final BigDecimal aliquotaImpostoCpf = BigDecimal.valueOf(22.5);
	
	private BigDecimal salario;
	
	ImpostoCpf(BigDecimal salario) {
		super();
		this.salario = salario;
	}
	
	public BigDecimal calcular() {
		return (this.salario.multiply(this.aliquotaImpostoCpf))
				.divide(BigDecimal.valueOf(100));
	}

}
