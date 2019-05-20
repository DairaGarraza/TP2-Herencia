package ar.edu.unlam.pb2.tp2;

public class CajaDeAhorros extends CuentaSueldo {
	
	private Integer contador;

	public CajaDeAhorros(Double saldo, Integer contador) {
		super(saldo);
		this.contador = contador;
	}
	
	@Override
	public void extraer(Double extraccion) {
		if(extraccion <= saldo) {
			this.saldo = saldo - extraccion;
			this.contador++;
		}
		if(this.contador > 5) {
			this.saldo -= 6.0;
		}
	}

	
	
}
