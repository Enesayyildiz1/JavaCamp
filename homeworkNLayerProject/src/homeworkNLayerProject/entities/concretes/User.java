package homeworkNLayerProject.entities.concretes;

import homeworkNLayerProject.entities.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String name;
	private String surname;
	private String Email;
	private String Password;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String surname, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		Email = email;
		Password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
}
