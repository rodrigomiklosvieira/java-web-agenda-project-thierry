package com.agenda.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.modelos.Pessoas;
import com.agenda.service.CadastroUsuarioService;

@WebServlet("/busca-contatos")
public class ListaUsuariosServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		try {
			
			CadastroUsuarioService service = new CadastroUsuarioService();
			List<Pessoas> pessoas = service.buscaPessoas();
			
			request.setAttribute("contatos", pessoas);
			request.getRequestDispatcher("ListarContatos.jsp").forward(request, response);
		}catch (Exception e){
			throw new ServletException("A lógica de negócios causou uma exceção", e);
		}
	}
	
}
