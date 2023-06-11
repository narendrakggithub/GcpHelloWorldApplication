package com.narenkg.GCPHelloWorld.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = "username"),
		@UniqueConstraint(columnNames = "email"), @UniqueConstraint(columnNames = "phone") })

public class User   {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 50)
	private String username;

	@Size(max = 50)
	@Email
	private String email;

	@NotBlank
	@Size(max = 15)
	private String phone;

	@NotBlank
	@Size(max = 120)
	private String password;

	private Boolean isVerified;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

}
