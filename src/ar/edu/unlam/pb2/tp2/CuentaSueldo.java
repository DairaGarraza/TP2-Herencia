package ar.edu.unlam.pb2.tp2;

public class CuentaSueldo {

	protected double saldo;

	public CuentaSueldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(Double deposito) {
		this.saldo = (saldo + deposito);
	}
	public void extraer(Double extraccion) {//no se si hacer este metodo boolean.
		//this.saldo = (saldo - extraccion);
		if(extraccion >= saldo) {
			//no se puede extraer;
		}else {
			if(saldo>=extraccion) {
				//se puede extraer;
			}
		}
	}
}
