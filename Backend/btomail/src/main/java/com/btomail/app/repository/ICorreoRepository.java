package com.btomail.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.btomail.app.entity.TblCorreo;

@Repository
public interface ICorreoRepository extends JpaRepository<TblCorreo, Integer> {
	
}
