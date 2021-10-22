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
@CrossOrigin
public class CorreoController {
	
	@Autowired
	private ICorreoService correoService;

	@GetMapping(value="/Correos", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Correo> getCorreo(){
		List<Correo> listado = correoService.findAll();
		return listado;
	}
	
	@GetMapping(value="/Correos/categoria/{categoria}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Correo> getCategoria(@PathVariable(name="categoria") Boolean Categoria){
		List<Correo> listado = correoService.findByCategoria(Categoria);
		return listado;
	}
	
	@GetMapping(value="/Correos/destacado/{destacado}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Correo> getDestacado(@PathVariable(name="destacado") Boolean Destacado){
		List<Correo> listado = correoService.findByDestacado(Destacado);
		return listado;
	}
	
	@GetMapping(value="/Correos/spam/{spam}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Correo> getSpam(@PathVariable(name="spam") Boolean Spam){
		List<Correo> listado = correoService.findBySpam(Spam);
		return listado;
	}
	
	@GetMapping(value="/Correos/eliminado/{eliminado}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Correo> getEliminado(@PathVariable(name="eliminado") Boolean Eliminado){
		List<Correo> listado = correoService.findByEliminado(Eliminado);
		return listado;
	}
	
	@PostMapping(value="/Correos/nuevo", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<CorreoResponse> saveCorreo(@RequestBody Correo correo) {
		
		System.out.print("Test");
		
		CorreoResponse response = correoService.save(correo);
		
		if(response.getCodigoRespuesta() == 0)
			return ResponseEntity.status(HttpStatus.CREATED).body(response);
		else
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);		

	}
	
	/*
	 * @PutMapping(value="/Correos/update", produces =
	 * {MediaType.APPLICATION_JSON_VALUE}) public ResponseEntity<CorreoResponse>
	 * updateCorreo(@RequestBody Correo correo) {
	 * 
	 * CorreoResponse response = correoService.update(correo);
	 * 
	 * if(response.getCodigoRespuesta() == 0) return
	 * ResponseEntity.status(HttpStatus.CREATED).body(response); else return
	 * ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response); }
	 */
}
