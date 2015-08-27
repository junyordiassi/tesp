package br.unibh.teste01.entidades;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.Date;
import java.util.List;

import br.unibh.persistencia.AlunoDAO;
import br.unibh.persistencia.JDBCUtil;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setId(11L);
		p1.setNome("Maria da Silva");
		p1.setCpf("123213123");

		Pessoa p2 = new Pessoa(12L, "João da Silva", "1297361827");

		Pessoa p3 = new Pessoa(13L, "Tiago da Silva");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		Aluno a1 = new Aluno(14L, "Adriana Silvia", "12312312312", "321321321", new Date());

		System.out.println(a1);

		Professor prof1 = new Professor(15L, "Jose Humberto", "12312312312", new BigDecimal(10000));

		System.out.println(prof1);

		try {
			Connection c = JDBCUtil.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AlunoDAO dao = new AlunoDAO();
		List<Aluno> lista = dao.findAll();
		for (Aluno a : lista) {
			System.out.println(a);

		}
	}

}
