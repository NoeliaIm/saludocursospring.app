package com.saludocursospring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Applications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SaludoServiceImpl saludo = context.getBean("mSetter", SaludoServiceImpl.class);
		saludo.saluda("Espero que lo hayas conseguido");
		System.out.println(saludo.getSelloEmpresa().toString());
		/*
		 * ContratoServiceImpl contrato= context.getBean("mContrato",
		 * ContratoServiceImpl.class);
		 * System.out.println("Número de contrato: "+contrato.numContrato() +" "+
		 * contrato.getSelloEmpesa().toString());
		 */
		context.close();
	}
}
