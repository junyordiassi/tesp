package br.unibh.teste01;

import java.math.BigDecimal;

/**
 * 
 * @author 11527495
 *@
 */

public class Professor extends Pessoa {

	// varievel de instância 
	
	private BigDecimal salario;
	
	//construtures 
	
	public Professor(){}
	

	public Professor(BigDecimal salario) {
		super();
		this.salario = salario;
	}
	
	
	public Professor(Long id, String nome, String cpf, BigDecimal salario) {
		super(id, nome, cpf);
		this.salario = salario;
	}


	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	

}
