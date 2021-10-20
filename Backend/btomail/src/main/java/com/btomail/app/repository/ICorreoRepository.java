package com.btomail.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btomail.app.entity.TblCorreo;

public interface ICorreoRepository extends JpaRepository<TblCorreo, Integer> {
	
}
