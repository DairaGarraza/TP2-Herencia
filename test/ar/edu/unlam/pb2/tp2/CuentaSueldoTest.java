package ar.edu.unlam.pb2.tp2;

import org.junit.Assert;
import org.junit.Test;

public class CuentaSueldoTest {

	@Test
	public void testParaVerSiFuncionaLaCuenta() {
		
		Double valor = 4000.0;
		Double extraccion1 = 500.0;
		Double extraccion2 = 4000.0;
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
		
		// Para extraer (un valor válido, 500)
		cuenta.extraer(extraccion1);
		
		if(extraccion1 <= saldo) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue("El valor a extraer supera el saldo actual.", false);
		}	//Si a extraccion1 le das un valor superior a 4000, que es el valor actual del saldo vas a ver que salta rojo.
		
		saldo = cuenta.getSaldo();  // Acá se actualiza el valor del saldo a 3500.
		
		// Para extraer (un valor inválido, 4000)
		cuenta.extraer(4000.0);
		
		if(extraccion2 <= saldo) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue("El valor a extraer supera el saldo actual.", false);
		}
		/* En la consigna del TP dice que debe lanzar una excepción (RuntimeException) pero eso no lo vimos en clase todavía
		 * así que por eso lo hice así como me pareció, como hice lo de depositar, y tira rojo cuando es un valor inválido,
		 * pero en realidad en este caso a la extracción la hace igual, y el getSaldo() daría -500 (el saldo era 3500 y le
		 * sacamos 4000). Así que por ejemplo si a extraccion2 le estableces el valor 3500 o un número menor vas a ver que
		 * te tira verde.
		 */
}
}
