package com.btomail.app.interfaz;

import java.util.List;

import com.btomail.app.dto.*;

public interface ICorreoService {
	
	public List<Correo> findAll();
				
	public List<Correo> findByCategoria(Boolean Categoria);
	
	public List<Correo> findByDestacado(Boolean Destacado);
	
	public List<Correo> findBySpam(Boolean Spam);
	
	public List<Correo> findByEliminado(Boolean Eliminado);
	
	public CorreoResponse save(Correo Correo);
	
	public CorreoResponse update(Correo Correo);
		
}
