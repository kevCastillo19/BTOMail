package com.btomail.app.interfaz;

import java.util.List;

import com.btomail.app.dto.*;

public interface ICorreoService {
	
	public List<Correo> findAll();
	
	public List<Correo> findByCategoria(boolean Categoria);
	
	public List<Correo> findByDestacado(boolean Destacado);
	
	public List<Correo> findBySpam(boolean Spam);
	
	public List<Correo> findByEliminado(boolean Eliminado);
	
	public CorreoResponse save(Correo Correo);
	
	public CorreoResponse update(Correo Correo);
	
	public CorreoResponse delete(Integer IdCorreo);
	
}
