package refatoracao.strategy;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
	
	public BigDecimal calcular(Imposto imposto){
		return imposto.calcular();
	}

}
