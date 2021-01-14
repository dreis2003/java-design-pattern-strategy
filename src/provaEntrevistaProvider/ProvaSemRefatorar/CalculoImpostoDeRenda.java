package provaEntrevistaProvider.ProvaSemRefatorar;

import java.nio.ReadOnlyBufferException;

public class CalculoImpostoDeRenda {
	
	private final double aliquotaImpostoCnpj = 27.5d;
	private final double aliquotaImpostoCpf = 22.5d;
	
	public double Calcular(String documento, double salario) {
		if (documento == "CNPJ") {
			return (salario * this.aliquotaImpostoCnpj) / 100;
		} else if (documento == "CPF") {
			return (salario * this.aliquotaImpostoCpf) / 100;
		}
		return 0;
	}

}
