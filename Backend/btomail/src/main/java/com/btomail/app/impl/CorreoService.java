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
	public List<Correo> findByCategoria(boolean Categoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Correo> findByDestacado(boolean Destacado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Correo> findBySpam(boolean Spam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Correo> findByEliminado(boolean Eliminado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CorreoResponse save(Correo Correo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CorreoResponse update(Correo Correo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public CorreoResponse delete(Integer IdCorreo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Metodos 
	
	private List<Correo> entityListToDoList(List<TblCorreo> lista) {
		List<Correo> listadoCorreos = new ArrayList<>();

		for (TblCorreo ent : lista) {

			Correo correo = new Correo();
			correo.setIdCorreo(ent.getIdCorreo());
			correo.setNombreEmisor(ent.getNombreEmisor());
			correo.setCorreoEmisor(ent.getCorreoEmisor());
			correo.setFecha(ent.getFecha());
			correo.setAsunto(ent.getAsunto());
			correo.setMensaje(ent.getMensaje());
			correo.setCategoria(ent.isCategoria());
			correo.setLeido(ent.isLeido());
			correo.setDestacado(ent.isDestacado());
			correo.setEliminado(ent.isEliminado());
			correo.setSpam(ent.isSpam());
			correo.setCorreoReceptor(ent.getCorreoReceptor());

			listadoCorreos.add(correo);
		}

		return listadoCorreos;
	}

}
