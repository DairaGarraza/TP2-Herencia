package ar.edu.unlam.pb2.tp2;

import org.junit.Assert;
import org.junit.Test;

public class CuentaCorrienteTest {
	
	@Test
	public void testParaProbarLaCuentaCorriente() {
		
		CuentaSueldo cuentaCorriente = new CuentaCorriente(200.0);
		
		cuentaCorriente.extraer(50.0);
		Double valorObtenido = cuentaCorriente.getSaldo();
		Double valorEsperado = 150.0;
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		// Cuando el monto de extracción es menor al saldo actual, es decir que todavía no tiene saldo negativo.
		
		
		cuentaCorriente.extraer(200.0);
		valorObtenido = cuentaCorriente.getSaldo();
		valorEsperado = -52.5;
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		// Cuando el monto de extracción es mayor a lo que se tiene de saldo actual y a su vez el saldo es mayor a 0.
		
		
		cuentaCorriente.extraer(100.0);
		valorObtenido = cuentaCorriente.getSaldo();
		valorEsperado = -157.5;
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		/* Cuando el monto de extracción es mayor a lo que se tiene de saldo actual y a su vez el saldo es menor a 0.
		Es decir que cuando el método detecta que el saldo ya es negativo ejecuta directamente esta operación.
		Era necesario establecer cada caso en particular con sus pasos a seguir porque por cuestión de signos
		no iban a resultar correctos los cálculos. */
	}

}