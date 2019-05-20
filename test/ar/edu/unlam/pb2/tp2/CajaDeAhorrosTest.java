package ar.edu.unlam.pb2.tp2;

import org.junit.Assert;
import org.junit.Test;

public class CajaDeAhorrosTest {
	
	@Test
	public void testParaVerSiFuncionaLaCuenta() {
		
		CuentaSueldo cajaDeAhorros = new CajaDeAhorros(566.0, 6);
		
		cajaDeAhorros.extraer(60.0);
		Double valorObtenido = cajaDeAhorros.getSaldo();
		Double valorEsperado = 500.0;
		
		Assert.assertEquals("El valor obtenido no coincide con el esperado", valorObtenido, valorEsperado);
		
		/* Seteo el contador en 6 para comprobar que despu�s de 5 extracciones resta los $6 adicionales,
		 * seteo el saldo en $566 y le deber�a restar $66 porque el valor de extracci�n es $60, ser�an
		 * $566 - $60 - $6 = $500, que es el valor esperado. Con el assertEquals se comprueba que funciona
		 * cuando coinciden y tira verde.
		 */
	}

}
