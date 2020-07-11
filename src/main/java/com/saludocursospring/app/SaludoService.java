package com.saludocursospring.app;

public interface SaludoService {
	
	public void saluda(String message);
	
	// indicamos que todas las clases que incluyan el saludo tienen que incluir el sello de la empresa
	public String getSelloEmpresa();
}
