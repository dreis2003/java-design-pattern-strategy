package refatoracao.strategy;

import java.math.BigDecimal;

public class ImpostoCnpj implements Imposto {
	
	private final BigDecimal aliquotaImpostoCnpj = BigDecimal.valueOf(27.5);
	
	private BigDecimal salario;
	
	ImpostoCnpj(BigDecimal salario) {
		super();
		this.salario = salario;
	}
	
	public BigDecimal calcular() {
		return (this.salario.multiply(this.aliquotaImpostoCnpj))
				.divide(BigDecimal.valueOf(100));
	}

}
