/**
 * Un DAO (también conocido como repositorio) es necesario para trabajos con entidades en la tabla de base de datos, 
 * con métodos como guardar, eliminar, actualizar, etc.
 * Con Spring Data JPA un DAO para esta entidad está creado simplemente mediante el uso de la interfaz CrudRepository. 
 * Los métodos siguientes son algunos de los que están disponibles a partir de dicha interfaz: save, delete, findOne y findAll.
 * Estos métodos no deben ser implementadas, y además es posible crear nuevos métodos
 */
package com.wlopera.crud.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.wlopera.crud.entity.Product;

@Transactional
public interface ProductRepository extends CrudRepository<Product, Integer>{

}
