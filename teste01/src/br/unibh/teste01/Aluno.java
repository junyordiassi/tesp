package br.unibh.teste01;

import java.util.Date;

public class Aluno extends Pessoa {

	public String matricula;
	
	private Date aniversario;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}

	public Aluno(String matricula, Date aniversario) {
		super();
		this.matricula = matricula;
		this.aniversario = aniversario;
	}

	public Aluno(Long id, String nome, String cpf, String matricula, Date aniversario) {
		super(id, nome, cpf);
		this.matricula = matricula;
		this.aniversario = aniversario;
	}

	

}
