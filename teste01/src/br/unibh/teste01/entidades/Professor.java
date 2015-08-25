package br.unibh.teste01.entidades;

import java.math.BigDecimal;

/**
 * 
 * @author 11527495
 *@
 */

public class Professor extends Pessoa {

	// varievel de inst�ncia 
	
	private BigDecimal salario;
	public static Double BONUS = 0.1d;
	
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