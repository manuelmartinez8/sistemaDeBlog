package com.sistema.blog.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ComentarioDTO {

	private long id;
	
	@NotEmpty(message = "El nombre no debe ser vacio o nulo")
	private String nombre;
	
	@NotEmpty(message = "El email no debe ser vacio o nulo")
	@Email
	private String email;
	
	@NotEmpty
	@Size(min = 10,message = "El cuerpo del comentario debe tener al menos 10 caracteres")
	private String cuerpo; 

}
