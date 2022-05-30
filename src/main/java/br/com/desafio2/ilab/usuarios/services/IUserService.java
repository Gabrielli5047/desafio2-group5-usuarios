package br.com.desafio2.ilab.usuarios.services;

import java.util.List;

import br.com.desafio2.ilab.usuarios.model.User;

public interface IUserService {

    public List<User> listarTodosUsuarios();

    public User registerUser(User user);
}
