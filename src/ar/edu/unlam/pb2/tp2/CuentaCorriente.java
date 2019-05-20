package ar.edu.unlam.pb2.tp2;

public class CuentaCorriente extends CuentaSueldo {

	public CuentaCorriente(Double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}
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
	
	
}
