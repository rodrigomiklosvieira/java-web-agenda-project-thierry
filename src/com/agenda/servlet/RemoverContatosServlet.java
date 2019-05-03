package com.agenda.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.service.CadastroUsuarioService;


@WebServlet("/remover-contato")
public class RemoverContatosServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
	
	CadastroUsuarioService service = new CadastroUsuarioService();
		
		service.removerContato(null);
		
		System.out.println("Servlet remover executada com sucesso");
	
	}
	
	

}
