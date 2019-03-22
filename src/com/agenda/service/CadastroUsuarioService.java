package com.agenda.service;

import com.agenda.modelos.Pessoas;

public class CadastroUsuarioService {

	public void cadastra(Pessoas pessoa) {
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getSenha());
		System.out.println(pessoa.getEmail());		
		System.out.println(pessoa.getTelefone());
		System.out.println(pessoa.getEndereco());
		
	}	

}
