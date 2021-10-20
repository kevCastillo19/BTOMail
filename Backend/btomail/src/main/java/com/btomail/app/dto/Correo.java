package com.btomail.app.dto;

import java.sql.Date;

public class Correo {
	private Integer IdCorreo; 
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
		this.IdCorreo = idCorreo;
		this.NombreEmisor = nombreEmisor;
		this.CorreoEmisor = correoEmisor;
		this.Fecha = fecha;
		this.Asunto = asunto;
		this.Mensaje = mensaje;
		this.Categoria = categoria;
		this.Leido = leido;
		this.Destacado = destacado;
		this.Eliminado = eliminado;
		this.Spam = spam;
		this.CorreoReceptor = correoReceptor;
	}

	public Correo() {}

	public Integer getIdCorreo() {
		return IdCorreo;
	}

	public void setIdCorreo(Integer idCorreo) {
		this.IdCorreo = idCorreo;
	}

	public String getNombreEmisor() {
		return NombreEmisor;
	}

	public void setNombreEmisor(String nombreEmisor) {
		this.NombreEmisor = nombreEmisor;
	}

	public String getCorreoEmisor() {
		return CorreoEmisor;
	}

	public void setCorreoEmisor(String correoEmisor) {
		this.CorreoEmisor = correoEmisor;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		this.Fecha = fecha;
	}

	public String getAsunto() {
		return Asunto;
	}

	public void setAsunto(String asunto) {
		this.Asunto = asunto;
	}

	public String getMensaje() {
		return Mensaje;
	}

	public void setMensaje(String mensaje) {
		this.Mensaje = mensaje;
	}

	public boolean isCategoria() {
		return Categoria;
	}

	public void setCategoria(boolean categoria) {
		this.Categoria = categoria;
	}

	public boolean isLeido() {
		return Leido;
	}

	public void setLeido(boolean leido) {
		this.Leido = leido;
	}

	public boolean isDestacado() {
		return Destacado;
	}

	public void setDestacado(boolean destacado) {
		this.Destacado = destacado;
	}

	public boolean isEliminado() {
		return Eliminado;
	}

	public void setEliminado(boolean eliminado) {
		this.Eliminado = eliminado;
	}

	public boolean isSpam() {
		return Spam;
	}

	public void setSpam(boolean spam) {
		this.Spam = spam;
	}

	public String getCorreoReceptor() {
		return CorreoReceptor;
	}

	public void setCorreoReceptor(String correoReceptor) {
		this.CorreoReceptor = correoReceptor;
	}
	
	
}

