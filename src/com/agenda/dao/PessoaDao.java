package com.agenda.dao;

import java.sql.Connection;
import java.sql.SQLException;
import com.agenda.modelos.Pessoas;

public class PessoaDao {

	private Connection connection;

	public void cadastraDAO(Pessoas pessoa) {
	
//		System.out.println(pessoa.getNome());
//		System.out.println(pessoa.getSenha());
//		System.out.println(pessoa.getEmail());		
//		System.out.println(pessoa.getTelefone());
//		System.out.println(pessoa.getEndereco());
		
		String SQL = "insert into pessoas (nome, senha, email, telefone, endereco) values(?, ?, ?, ?, ?)";
		
	}catch(

	SQLException e)
	{
		throw new RuntimeException(e);
	}

}
