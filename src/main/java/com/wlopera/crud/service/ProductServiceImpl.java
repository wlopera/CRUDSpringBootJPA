package com.wlopera.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wlopera.crud.entity.Product;
import com.wlopera.crud.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	
	/**
	 * Crear producto en Base de Datos (BD)
	 * @param product Producto a generar
	 * @return true/false
	 */
	public Product createProduct(Product product) throws Exception{
		return productRepository.save(product);
	}

	/**
	 * Modificar producto en BD
	 * @param product Producto a modificar
	 * @return Producto modificado
	 */
	public Product updateProduct(Product product) throws Exception {
		return productRepository.save(product);
	}

	/**
	 * Borrar producto en BD
	 * @param idProduct: Identificador del producto a eliminar
	 * @return true/false
	 */
	public void deleteProduct(Integer idProduct) throws Exception {
		productRepository.delete(idProduct);
	}
	
	/**
	 * Consultar todos los productos de BD
	 * @return Lista de productos
	 */
	public Iterable<Product> readALLProduct() throws Exception {
		return productRepository.findAll();
	}

	/**
	 * Consultar todos los productos de BD
	 * @param idProduct: Identificador del producto a consultar
	 * @return Lista de productos
	 */
	public Product readProductById(Integer idProduct) throws Exception {
		return productRepository.findOne(idProduct);
	}

}
