package ar.edu.unlam.pb2.tp2;

public class CuentaSueldo {

	protected Double saldo;

	public CuentaSueldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(Double deposito) {
		if(deposito > 0.0) {
			this.saldo = saldo + deposito;
		}
	}
	
	public void extraer(Double extraccion) {
		if(extraccion <= saldo) {
			this.saldo = saldo - extraccion;
		}
	}
}
