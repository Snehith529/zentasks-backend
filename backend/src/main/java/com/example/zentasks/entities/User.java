package com.example.zentasks.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name ="users")
public class User {
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	@Id @GeneratedValue private Long id;
    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Task> tasks;
}
