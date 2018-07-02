package com.wlopera.crud.service;

import com.wlopera.crud.entity.Product;


public interface ProductService {
	/**
	 * Crear producto en Base de Datos (BD)
	 * @param product Producto a generar
	 * @return Producto creado
	 */
	public Product createProduct(Product product) throws Exception;
	
	/**
	 * Modificar producto en BD
	 * @param product Producto a modificar
	 * @return Producto modificado
	 */
	public Product updateProduct(Product product) throws Exception;
	
	/**
	 * Borrar producto en BD
	 * @param idProduct: Identificador del producto a eliminar
	 */
	public void deleteProduct(Integer idProduct) throws Exception;
	
	/**
	 * Consultar todos los productos de BD
	 * @return Lista de productos
	 */
	public Iterable<Product> readALLProduct() throws Exception;

	/**
	 * Consultar todos los productos de BD
	 * @param idProduct: Identificador del producto a consultar
	 * @return Lista de productos
	 */
	public Product readProductById(Integer idProduct) throws Exception;

}
