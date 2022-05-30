package br.com.desafio2.ilab.usuarios.dao;

import org.springframework.data.repository.CrudRepository;
import br.com.desafio2.ilab.usuarios.model.User;

public interface UserDAO extends CrudRepository<User, Integer>{
	
}
