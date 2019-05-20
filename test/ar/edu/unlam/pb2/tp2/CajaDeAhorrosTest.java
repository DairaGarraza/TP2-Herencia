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
		
		/* Seteo el contador en 6 para comprobar que después de 5 extracciones resta los $6 adicionales,
		 * seteo el saldo en $566 y le debería restar $66 porque el valor de extracción es $60, serían
		 * $566 - $60 - $6 = $500, que es el valor esperado. Con el assertEquals se comprueba que funciona
		 * cuando coinciden y tira verde.
		 */
	}

}
