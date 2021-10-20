package com.btomail.app.dto;

import java.util.Date;

public class Correo {
	private int IdCorreo; 
	private String NombreEmisor;
	private String CorreoEmisor;
	private Date Fecha;
	private String Asunto;
	private String Mensaje;
	private boolean Categoria;
	private boolean Leido;
	private boolean Destacado;
	private boolean Eliminado;
	private boolean Spam;
	private String CorreoReceptor;
	
	public Correo(Integer idCorreo, String nombreEmisor, String correoEmisor, Date fecha, String asunto, String mensaje,
			boolean categoria, boolean leido, boolean destacado, boolean eliminado, boolean spam,
			String correoReceptor) {
		super();
		IdCorreo = idCorreo;
		NombreEmisor = nombreEmisor;
		CorreoEmisor = correoEmisor;
		Fecha = fecha;
		Asunto = asunto;
		Mensaje = mensaje;
		Categoria = categoria;
		Leido = leido;
		Destacado = destacado;
		Eliminado = eliminado;
		Spam = spam;
		CorreoReceptor = correoReceptor;
	}

	public Correo() {}

	public Integer getIdCorreo() {
		return IdCorreo;
	}

	public void setIdCorreo(Integer idCorreo) {
		IdCorreo = idCorreo;
	}

	public String getNombreEmisor() {
		return NombreEmisor;
	}

	public void setNombreEmisor(String nombreEmisor) {
		NombreEmisor = nombreEmisor;
	}

	public String getCorreoEmisor() {
		return CorreoEmisor;
	}

	public void setCorreoEmisor(String correoEmisor) {
		CorreoEmisor = correoEmisor;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public String getAsunto() {
		return Asunto;
	}

	public void setAsunto(String asunto) {
		Asunto = asunto;
	}

	public String getMensaje() {
		return Mensaje;
	}

	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}

	public boolean isCategoria() {
		return Categoria;
	}

	public void setCategoria(boolean categoria) {
		Categoria = categoria;
	}

	public boolean isLeido() {
		return Leido;
	}

	public void setLeido(boolean leido) {
		Leido = leido;
	}

	public boolean isDestacado() {
		return Destacado;
	}

	public void setDestacado(boolean destacado) {
		Destacado = destacado;
	}

	public boolean isEliminado() {
		return Eliminado;
	}

	public void setEliminado(boolean eliminado) {
		Eliminado = eliminado;
	}

	public boolean isSpam() {
		return Spam;
	}

	public void setSpam(boolean spam) {
		Spam = spam;
	}

	public String getCorreoReceptor() {
		return CorreoReceptor;
	}

	public void setCorreoReceptor(String correoReceptor) {
		CorreoReceptor = correoReceptor;
	}
	
	
}

