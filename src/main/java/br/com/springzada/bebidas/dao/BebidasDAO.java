package br.com.springzada.bebidas.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.springzada.bebidas.beans.Bebidas;

@Repository
public interface BebidasDAO extends CrudRepository<Bebidas, Long> {

	Bebidas findById(long id);
}
