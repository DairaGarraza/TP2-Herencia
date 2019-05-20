package ar.edu.unlam.pb2.tp2;

/*- Permite establecer una cantidad de dinero a girar en descubierto. 
 * 
 *- Cada vez que se desee extraer dinero, no sólo se considera el que se posee, 
 *sino el límite adicional que el banco estará brindando. 
 *
 *- El banco nos cobrará un 5% como comisión
 *sobre todo el monto en descubierto consumido en la operación.
 *
 *- Por ejemplo, si tuviéramos $ 100 en la cuenta, 
 *y quisiéramos retirar $ 200 (con un descubierto de $ 150), podremos hacerlo. 
 *Pasaremos a deberle al banco $ 105 en total: los $ 100 que nos cubrió,
 * más el 5% adicional sobre el descubierto otorgado.
 * */

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
			this.porcentajeDeRecargo = this.aplicarRecargoAMonto*0.5;
			this.saldo = this.saldo + this.porcentajeDeRecargo;
		}
		else if(extraccion > this.saldo && this.saldo < 0) {
			this.saldoAnterior = this.saldo;
			this.saldo = saldo - extraccion;
			this.aplicarRecargoAMonto = this.saldo - this.saldoAnterior;
			this.porcentajeDeRecargo = this.aplicarRecargoAMonto*0.5;
			this.saldo = this.saldo + this.porcentajeDeRecargo;
		}
	}

	
	
}
