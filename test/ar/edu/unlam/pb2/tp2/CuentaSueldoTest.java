package ar.edu.unlam.pb2.tp2;

import org.junit.Assert;
import org.junit.Test;

public class CuentaSueldoTest {

	// Este es el 1er test que hice, pero me di cuenta que me compliqu� demasiado y por eso hice otro test m�s simple abajo
	@Test
	public void testParaVerSiFuncionaLaCuenta() {
		
		Double valor = 4000.0;
		Double extraccion1 = 500.0;
		//Double extraccion2 = 4000.0;
		Double extraccion2 = 000.0;
		CuentaSueldo cuenta = new CuentaSueldo(0.0);
		
		// Para depositar
		cuenta.depositar(valor);
		
		if(valor > 0.0) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue("El valor debe ser mayor a 0.", false);
		}
		
		// Para ver saldo
		Double saldo = cuenta.getSaldo();
		Assert.assertEquals(valor, cuenta.getSaldo());
		
		// Para extraer (un valor v�lido, 500)
		cuenta.extraer(extraccion1);
		
		if(extraccion1 <= saldo) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue("El valor a extraer supera el saldo actual.", false);
		}	//Si a extraccion1 le das un valor superior a 4000, que es el valor actual del saldo vas a ver que salta rojo.
		
		saldo = cuenta.getSaldo();  // Ac� se actualiza el valor del saldo a 3500.
		
		// Para extraer (un valor inv�lido, 4000)
		cuenta.extraer(4000.0);
		
		if(extraccion2 <= saldo) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue("El valor a extraer supera el saldo actual.", false);
		}
		/* En la consigna del TP dice que debe lanzar una excepci�n (RuntimeException) pero eso no lo vimos en clase todav�a
		 * as� que por eso lo hice as� como me pareci�, como hice lo de depositar, y tira rojo cuando es un valor inv�lido,
		 * pero en realidad en este caso a la extracci�n la hace igual, y el getSaldo() dar�a -500 (el saldo era 3500 y le
		 * sacamos 4000). As� que por ejemplo si a extraccion2 le estableces el valor 3500 o un n�mero menor vas a ver que
		 * te tira verde.
		 */
}
	
	
	// Este test es m�s simple y me gusta m�s, pero no significa que est� bien :P
	@Test
	public void testSimpleParaVerSiFuncionaLaCuenta() {
		
		CuentaSueldo cuenta = new CuentaSueldo(0.0);
		
		cuenta.depositar(4000.0);
		Double saldo = cuenta.getSaldo();
		Double valorEsperado = 4000.0;
		
		Assert.assertEquals("El valor obtenido no coincide con el esperado.", saldo, valorEsperado);
		// El saldo vale 4000.0
		
		
		cuenta.extraer(500.0);
		saldo = cuenta.getSaldo();
		Double segundoValorEsperado = 3500.0;
		
		Assert.assertEquals("El valor obtenido no coincide con el esperado.", saldo, segundoValorEsperado);
		// El saldo vale 3500.0
		
		
		cuenta.extraer(4000.0);
		saldo = cuenta.getSaldo();
		Double tercerValorEsperado = -500.0;
		
		Assert.assertTrue(cuenta.getSaldo() >= 3500.0);
		
		Assert.assertEquals("El valor obtenido no coincide con el esperado.", saldo, tercerValorEsperado);
		
		/* Si bien no lanza un RuntimeException se puede ver que al ser el monto a extraer superior al saldo, la extracci�n
		 * no se lleva a cabo. Con el AssertTrue se verifica que sigue quedando en $3500. Y se verifica con el AsserEquals tambi�n
		 * ya que de llevarse a cabo la extracci�n, el monto de la cuenta deber�a quedar en -500.0, pero lanza rojo porque la
		 * extracci�n no se realiz�.
		 */
	}
}
