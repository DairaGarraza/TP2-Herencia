package ar.edu.unlam.pb2.tp2;

<<<<<<< HEAD
=======
/*- Permite establecer una cantidad de dinero a girar en descubierto. 
 * 
 *- Cada vez que se desee extraer dinero, no s�lo se considera el que se posee, 
 *sino el l�mite adicional que el banco estar� brindando. 
 *
 *- El banco nos cobrar� un 5% como comisi�n
 *sobre todo el monto en descubierto consumido en la operaci�n.
 *
 *- Por ejemplo, si tuvi�ramos $ 100 en la cuenta, 
 *y quisi�ramos retirar $ 200 (con un descubierto de $ 150), podremos hacerlo. 
 *Pasaremos a deberle al banco $ 105 en total: los $ 100 que nos cubri�,
 * m�s el 5% adicional sobre el descubierto otorgado.
 * */

>>>>>>> 3b8293ecee62128781504b9523af84f231ff406c
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
<<<<<<< HEAD
			this.porcentajeDeRecargo = this.aplicarRecargoAMonto*0.05;
=======
			this.porcentajeDeRecargo = this.aplicarRecargoAMonto*0.5;
>>>>>>> 3b8293ecee62128781504b9523af84f231ff406c
			this.saldo = this.saldo + this.porcentajeDeRecargo;
		}
		else if(extraccion > this.saldo && this.saldo < 0) {
			this.saldoAnterior = this.saldo;
			this.saldo = saldo - extraccion;
			this.aplicarRecargoAMonto = this.saldo - this.saldoAnterior;
<<<<<<< HEAD
			this.porcentajeDeRecargo = this.aplicarRecargoAMonto*0.05;
=======
			this.porcentajeDeRecargo = this.aplicarRecargoAMonto*0.5;
>>>>>>> 3b8293ecee62128781504b9523af84f231ff406c
			this.saldo = this.saldo + this.porcentajeDeRecargo;
		}
	}

	
	
}
