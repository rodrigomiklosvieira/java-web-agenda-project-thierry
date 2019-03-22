package com.agenda.service;

import com.agenda.dao.PessoaDao;
import com.agenda.modelos.Pessoas;

public class CadastroUsuarioService {

	public void cadastra(Pessoas pessoa) {
		PessoaDao userDAO = new PessoaDao();
			
		userDAO.cadastraDAO(pessoa);
		
	}	

}
