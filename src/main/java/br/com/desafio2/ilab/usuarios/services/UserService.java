package br.com.desafio2.ilab.usuarios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import br.com.desafio2.ilab.usuarios.dao.UserDAO;
import br.com.desafio2.ilab.usuarios.model.User;

@Component
@Primary
public class UserService implements IUserService{

    @Autowired
    private UserDAO dao;

    @Override
    public List<User> listarTodosUsuarios() {
        List<User> usuarios = (List<User>) dao.findAll();
        return usuarios;
    }

    @Override
    public User registerUser(User user) {
        User newUser = dao.save(user);
        return newUser;
    }
    
}
