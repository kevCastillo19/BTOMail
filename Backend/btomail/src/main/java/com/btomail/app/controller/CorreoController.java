package com.btomail.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.btomail.app.dto.*;
import com.btomail.app.interfaz.*;

@RestController
public class CorreoController {
	
	@Autowired
	private ICorreoService correoService;

	@GetMapping(value="/Recibidos", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Correo> getCorreo(){
		List<Correo> listado = correoService.findAll();
		return listado;
	}
	
}
