package com.sistema.blog.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegistroDTO {

	private String nombre;
	private String username;
	private String email;
	private String password;

	 
}
