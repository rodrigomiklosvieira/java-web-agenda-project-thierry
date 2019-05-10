package com.agenda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.agenda.modelos.Pessoas;
import com.agenda.util.ConnectionFactory;

public class PessoaDao {

	private Connection connection;

	public void cadastraDAO(Pessoas pessoa) {

		String SQL = "insert into pessoa (nome, email, telefone, endereco) values (?, ?, ?, ?)";

		try {
			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = this.connection.prepareStatement(SQL);

			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getEmail());
			stmt.setString(3, pessoa.getTelefone());
			stmt.setString(4, pessoa.getEndereco());

			stmt.execute();
			stmt.close();

			buscaPessoas();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Pessoas> buscaPessoas() {
		String SQL = "select * from pessoa";

		try {
			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = this.connection.prepareStatement(SQL);

			List<Pessoas> pessoas = new ArrayList<Pessoas>();

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Pessoas pessoa = new Pessoas();
				pessoa.setId(rs.getLong("id"));
				pessoa.setNome(rs.getString("nome"));
				pessoa.setEmail(rs.getString("email"));
				pessoa.setEndereco(rs.getString("endereco"));
				pessoa.setTelefone(rs.getString("telefone"));
				pessoas.add(pessoa);
			}

			stmt.close();
			this.connection.close();

//			System.out.println(pessoas);
//			return pessoas;

			return pessoas;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void removerContato(Pessoas pessoa) {

		String SQL = "delete from pessoa where id=?";

		try {
			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = connection.prepareStatement(SQL);
			stmt.setLong(1, pessoa.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
