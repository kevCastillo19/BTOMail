package com.btomail.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.btomail.app.entity.TblCorreo;

@EnableJpaRepositories
@Repository
public interface ICorreoRepository extends JpaRepository<TblCorreo, Integer> {
	//public TblCorreo findByIdCorreo(Integer IdCorreo);
}
