package br.com.desafio2.ilab.usuarios.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio2.ilab.usuarios.model.User;
import br.com.desafio2.ilab.usuarios.services.IUserService;

@RestController
public class UserController {

    @Autowired
    private IUserService service;;
    
    @GetMapping("/user")
	public ResponseEntity<List<User>> recuperarTodos() {
		return ResponseEntity.ok(service.listarTodosUsuarios());
	}

    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return service.registerUser(user);
    }
}
