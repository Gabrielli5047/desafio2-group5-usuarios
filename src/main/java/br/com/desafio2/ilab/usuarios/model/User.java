package br.com.desafio2.ilab.usuarios.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "usuarios")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "name", nullable = false, length = 50)
	private String name;
	
	@Column(name = "cpf", nullable = false, length = 12, unique = true)
	private String cpf;

	@Column(name = "email", nullable = false, length = 50, unique = true)
	private String email;

	@Column(name = "telephone", nullable = false, length = 12, unique = true)
	private String telephone;

	@Column(name = "birth_date")
	private LocalDateTime birthdate;
	

	public User() {
		super();
	}

	public User(Integer id, String name, String email, String telephone, String senha, String cpf, LocalDateTime birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.telephone = telephone;
		this.cpf = cpf;
		this.birthdate = birthdate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public LocalDateTime getbirthdate() {
		return birthdate;
	}

	public void setDataCriacao(LocalDateTime birthdate) {
		this.birthdate = birthdate;
	}
}
