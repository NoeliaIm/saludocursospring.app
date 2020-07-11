package com.saludocursospring.app;

public class SaludoServiceImpl implements SaludoService {

	// Creamos el campo de clase con el modificador private

	private SelloEmpresaImpl creaccionSelloEmpresa;

	/*
	 * // creación del constructor para la inyección de dependencia public
	 * SaludoServiceImpl(SelloEmpresaImpl creaccionSelloEmpresa) {
	 * this.creaccionSelloEmpresa = creaccionSelloEmpresa; }
	 */

	//crear el setter para la inyección de dependencia
	public void setCreaccionSelloEmpresa(SelloEmpresaImpl creaccionSelloEmpresa) {
		this.creaccionSelloEmpresa = creaccionSelloEmpresa;
	}

	public void saluda(String message) {
		// TODO Auto-generated method stub
		System.out.println("Hola, tienes un mensaje: " + message);
	}

	// personalizar el sello del saludo
	public String getSelloEmpresa() {
		// TODO Auto-generated method stub
		return "Sello creado para el saludo: " + creaccionSelloEmpresa.getSelloEmpresa();
	}

}
