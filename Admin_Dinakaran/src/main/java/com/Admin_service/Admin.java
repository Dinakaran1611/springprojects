package com.Admin_service;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Admin {
	
	@Id
	@Column(name = "id",nullable = false,unique = true)
	private int id;

	@Column(name = "username",nullable = false)
	private String username;

	@Column(name = "password",nullable = false)
	private String pass;

	@Column(name = "email",nullable = false)
	private String email;

	@Enumerated(EnumType.STRING)
	@Column(name = "role",nullable = false)
	private Role role;
	
	@Column(name = "address",nullable = false)
	private String address;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int id, String username, String pass, String email, Role role, String address) {
		super();
		this.id = id;
		this.username = username;
		this.pass = pass;
		this.email = email;
		this.role = role;
		this.address = address;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", pass=" + pass + ", email=" + email + ", role=" + role
				+ ", address=" + address + "]";
	}

}
