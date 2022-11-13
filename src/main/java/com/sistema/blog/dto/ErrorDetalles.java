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
public class ErrorDetalles {

	private Date marcaDeTiempo;
	private String mensaje;
	private String detalles;

 
}
