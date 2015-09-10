package br.unibh.teste01.entidades;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.unibh.persistencia.AlunoDAO;
import br.unibh.persistencia.ProfessorDAO;

public class testes {

	@Test
	public void testeAlunoFindAll() {

		AlunoDAO dao = new AlunoDAO();
		List<Aluno> lista = dao.findAll();
		Assert.assertEquals(lista.size(), 103);
	}
	
	@Test
	public void testeProfessorFindAll() {

		ProfessorDAO dao = new ProfessorDAO();
		List<Professor> lista = dao.findAll();
		Assert.assertEquals(lista.size(), 103);
	}

	@Test
	public void testeAlunoFind() {
		AlunoDAO dao = new AlunoDAO();
		Aluno a = dao.find(3L);
		Assert.assertEquals(a.getNome(), "Carla Sena");
	}
	
	@Test
	public void testeProfessorFind() {
		ProfessorDAO dao = new ProfessorDAO();
		Professor a = dao.find(3L);
		Assert.assertEquals(a.getNome(), "Euder Campos");
	}
	
	public void testeAlunoInsertEdelete() {
		AlunoDAO dao = new AlunoDAO();
		Aluno a = new Aluno(null, "Beltrano da Silva","85456325458","7896541", new Date());
		dao.insert(a);
		Aluno b = dao.find("Beltrano");
		b.setNome("Ciclano da Silva");
		dao.update(b);
		Assert.assertNotNull(b);
		dao.delete(b);
		Aluno c = dao.find("Ciclano");
		Assert.assertNull(c);
	}
	
	public void testeProfessorInsertEdelete() {
		ProfessorDAO dao = new ProfessorDAO();
		Professor a = new Professor(null, "Beltrano da Silva","85456325458", new BigDecimal(1400.00));
		dao.insert(a);
		Professor b = dao.find("Beltrano");
		b.setNome("Ciclano da Silva");
		dao.update(b);
		Assert.assertNotNull(b);
		dao.delete(b);
		Professor c = dao.find("Ciclano");
		Assert.assertNull(c);
	}

}
