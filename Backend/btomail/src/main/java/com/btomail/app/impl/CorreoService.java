package com.btomail.app.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btomail.app.dto.*;
import com.btomail.app.entity.*;
import com.btomail.app.interfaz.*;
import com.btomail.app.repository.*;

@Service
public class CorreoService implements ICorreoService {
	
	@Autowired
	private ICorreoRepository correoRepository;

	@Override
	public List<Correo> findAll() {
		List<TblCorreo> lista = correoRepository.findAll();
		List<Correo> listadoCorreos = entityListToDoList(lista);
		
		return listadoCorreos;
	}

	@Override
	public List<Correo> findByCategoria(Boolean Categoria) {
		List<TblCorreo> listaCompleta = correoRepository.findAll();
		List<Correo> lista = entityListToCategoria(Categoria, listaCompleta);
		
		return lista;
	}

	@Override
	public List<Correo> findByDestacado(Boolean Destacado) {
		List<TblCorreo> listaCompleta = correoRepository.findAll();
		List<Correo> lista = entityListToDestacado(Destacado, listaCompleta);
		
		return lista;
	}

	@Override
	public List<Correo> findBySpam(Boolean Spam) {
		List<TblCorreo> listaCompleta = correoRepository.findAll();
		List<Correo> lista = entityListToSpam(Spam, listaCompleta);
		
		return lista;
	}

	@Override
	public List<Correo> findByEliminado(Boolean Eliminado) {
		List<TblCorreo> listaCompleta = correoRepository.findAll();
		List<Correo> lista = entityListToEliminado(Eliminado, listaCompleta);
		
		return lista;
	}

	@Override
	public CorreoResponse save(Correo correo) {
		CorreoResponse response = new CorreoResponse(); 
		TblCorreo newCorreo = new TblCorreo(correo.getIdCorreo(), correo.getNombreEmisor(), correo.getCorreoEmisor(), correo.getFecha(), correo.getAsunto(), 
											correo.getMensaje(), correo.getCategoria(), correo.getLeido(), correo.getDestacado(), correo.getEliminado(), 
											correo.getSpam(), correo.getCorreoReceptor());
		newCorreo = correoRepository.save(newCorreo);
		
		response.setCodigoRespuesta(0);
		response.setMensajeRespuesta("Se agrego Correctamente");
		
		return response;
	}

	@Override
	public CorreoResponse update(Correo correo) {
		CorreoResponse response = new CorreoResponse();
	
		return response;
	}
	
	//Metodos 
	
	private List<Correo> entityListToDoList(List<TblCorreo> lista) {
		List<Correo> listadoCorreos = new ArrayList<>();

		for (TblCorreo ent : lista) {

			Correo correo = new Correo(ent.getIdCorreo(), ent.getNombreEmisor(), ent.getCorreoEmisor(), ent.getFecha(), ent.getAsunto(), ent.getMensaje(),
										ent.getCategoria(), ent.getLeido(), ent.getDestacado(), ent.getEliminado(), ent.getSpam(), ent.getCorreoReceptor());
			listadoCorreos.add(correo);
		}

		return listadoCorreos;
	}
	
	private List<Correo> entityListToCategoria(Boolean categoria, List<TblCorreo> lista) {
		List<Correo> listadoCorreos =  new ArrayList<>();
		
		for(TblCorreo ent: lista) {
			Correo correo = new Correo(ent.getIdCorreo(), ent.getNombreEmisor(), ent.getCorreoEmisor(), ent.getFecha(), ent.getAsunto(), ent.getMensaje(),
					ent.getCategoria(), ent.getLeido(), ent.getDestacado(), ent.getEliminado(), ent.getSpam(), ent.getCorreoReceptor());
			
			if(correo.getCategoria().equals(categoria)) {
				listadoCorreos.add(correo);
			}
		}
		
		return listadoCorreos;
	}
	
	private List<Correo> entityListToDestacado(Boolean destacado, List<TblCorreo> lista) {
		List<Correo> listadoCorreos =  new ArrayList<>();
		
		for(TblCorreo ent: lista) {
			Correo correo = new Correo(ent.getIdCorreo(), ent.getNombreEmisor(), ent.getCorreoEmisor(), ent.getFecha(), ent.getAsunto(), ent.getMensaje(),
					ent.getCategoria(), ent.getLeido(), ent.getDestacado(), ent.getEliminado(), ent.getSpam(), ent.getCorreoReceptor());
			
			if(correo.getDestacado().equals(destacado)) {
				listadoCorreos.add(correo);
			}
		}
		
		return listadoCorreos;
	}
	
	private List<Correo> entityListToSpam(Boolean spam, List<TblCorreo> lista) {
		List<Correo> listadoCorreos =  new ArrayList<>();
		
		for(TblCorreo ent: lista) {
			Correo correo = new Correo(ent.getIdCorreo(), ent.getNombreEmisor(), ent.getCorreoEmisor(), ent.getFecha(), ent.getAsunto(), ent.getMensaje(),
					ent.getCategoria(), ent.getLeido(), ent.getDestacado(), ent.getEliminado(), ent.getSpam(), ent.getCorreoReceptor());
			
			if(correo.getSpam().equals(spam)) {
				listadoCorreos.add(correo);
			}
		}
		
		return listadoCorreos;
	}
	
	private List<Correo> entityListToEliminado(Boolean eliminado, List<TblCorreo> lista) {
List<Correo> listadoCorreos =  new ArrayList<>();
		
		for(TblCorreo ent: lista) {
			Correo correo = new Correo(ent.getIdCorreo(), ent.getNombreEmisor(), ent.getCorreoEmisor(), ent.getFecha(), ent.getAsunto(), ent.getMensaje(),
					ent.getCategoria(), ent.getLeido(), ent.getDestacado(), ent.getEliminado(), ent.getSpam(), ent.getCorreoReceptor());
			
			if(correo.getEliminado().equals(eliminado)) {
				listadoCorreos.add(correo);
			}
		}
		
		return listadoCorreos;
	}

}
