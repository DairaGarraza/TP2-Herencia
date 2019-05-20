package ar.edu.unlam.pb2.tp2;

/*Similar a CuentaSueldo, 
 * pero se pide que luego de la quinta extracción de dinero 
 * se cobre un costo adicional por extracción de $6 */

public class CajaDeAhorros extends CuentaSueldo {
	
	private Integer contador;

	public CajaDeAhorros(Double saldo, Integer contador) {
		super(saldo);
		this.contador = contador;
<<<<<<< HEAD
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
=======
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
>>>>>>> 3b8293ecee62128781504b9523af84f231ff406c

	
	
}
