package ar.edu.unlam.pb2.tp2;

public class CuentaCorriente extends CuentaSueldo {

	public CuentaCorriente(Double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}
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
	
	
}
