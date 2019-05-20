package ar.edu.unlam.pb2.tp2;

public class CuentaCorriente extends CuentaSueldo {
	
	private Double descubierto;
	private Double aplicarRecargoAMonto;
	private Double saldoAnterior;
	private Double porcentajeDeRecargo;

	public CuentaCorriente(Double saldo) {
		super(saldo);
		this.saldoAnterior = 0.0;
		this.aplicarRecargoAMonto = 0.0;
		this.porcentajeDeRecargo = 0.0;
	}
	
	@Override
	public void extraer(Double extraccion) {
		
		if(extraccion <= saldo) {
			this.saldo = saldo - extraccion;
		}
		else if(extraccion > this.saldo && this.saldo > 0) {
			this.saldo = saldo - extraccion;
			this.aplicarRecargoAMonto = this.saldo;
			this.porcentajeDeRecargo = this.aplicarRecargoAMonto*0.05;
			this.saldo = this.saldo + this.porcentajeDeRecargo;
		}
		else if(extraccion > this.saldo && this.saldo < 0) {
			this.saldoAnterior = this.saldo;
			this.saldo = saldo - extraccion;
			this.aplicarRecargoAMonto = this.saldo - this.saldoAnterior;
			this.porcentajeDeRecargo = this.aplicarRecargoAMonto*0.05;
			this.saldo = this.saldo + this.porcentajeDeRecargo;
		}
	}

	
	
}
