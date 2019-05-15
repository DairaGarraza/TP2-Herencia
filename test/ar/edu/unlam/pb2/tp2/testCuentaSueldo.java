package ar.edu.unlam.pb2.tp2;

import org.junit.Test;

public class testCuentaSueldo {

	@Test
public void testParaVerSiFuncionaLaCuenta() {

	CuentaSueldo cuenta = new CuentaSueldo(0.0);
	cuenta.depositar(4000.0);
	
	Double saldo = cuenta.getSaldo();
	// saldo debe valer 4000.0
	
	cuenta.extraer(500.0);
	saldo = cuenta.getSaldo();
	// saldo debe valer 3500.0
	
	cuenta.extraer(4000.0);
	// la operación no debe poder realizarse
}
}
