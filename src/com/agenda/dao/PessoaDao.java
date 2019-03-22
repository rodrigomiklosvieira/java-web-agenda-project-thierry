package com.agenda.dao;

import com.agenda.modelos.Pessoas;

public class PessoaDao {
	public void cadastraDAO(Pessoas pessoa) {
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getSenha());
		System.out.println(pessoa.getEmail());		
		System.out.println(pessoa.getTelefone());
		System.out.println(pessoa.getEndereco());
	}

}
