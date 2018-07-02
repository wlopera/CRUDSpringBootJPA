package com.wlopera.crud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wlopera.crud.entity.Product;
import com.wlopera.crud.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	// Consultar productos de Base de Datos (BD)
	@RequestMapping(value = "products", method = RequestMethod.GET)
	@ResponseBody
	public List<Product> getProducts() {
		System.out.println("Iniciando ProductService. Servicio getProducts");
		List<Product> products = new ArrayList<>(); 
		try {
			Iterable<Product> iterable = productService.readALLProduct();
			if (null != iterable) {
				for(Product product : iterable) {
					products.add(product);
				}
			}
		} catch (Exception e) {
			System.out.println("Error ProductController. Servicio getProducts");
			e.printStackTrace();
		}
		System.out.println("##=> " + products.toString());
		return products;
	}

	// Consultar producto por identificador en Base de Datos (BD)
	@RequestMapping(value = "product/{id}")
	@ResponseBody
	public Product getProductById(@PathVariable Integer idProduct) {
		try {
			System.out.println("Iniciando ProductService. Servicio getProductById: " + idProduct);
			return productService.readProductById(idProduct);
		} catch (Exception e) {
			System.out.println("Error ProductController. Servicio getProductById");
			e.printStackTrace();
		}
		return null;
	}
	
	// Crear producto en Base de Datos (BD)
	@RequestMapping(value = "product/create", method = RequestMethod.POST)
	public Product createProduct(Product product) {
		try {
			System.out.println("Iniciando ProductService. Servicio createProduct: "+ product.toString());
			return productService.createProduct(product);
		} catch (Exception e) {
			System.out.println("Error ProductController. Servicio createProduct");
			e.printStackTrace();
		}
		return null;
	}

	// Modificar producto en Base de Datos (BD)
	@RequestMapping(value = "product/update", method = RequestMethod.POST)
	@ResponseBody
	public Product updateProduct(Product product) {
		try {
			return productService.updateProduct(product);
		} catch (Exception e) {
			System.out.println("Error ProductController. Servicio updateProduct");
			e.printStackTrace();
		}
		return null;
	}

	// Borrar producto en Base de Datos (BD)
	@RequestMapping(value = "product/delete/{id}")
	public void deleteProduct(@PathVariable Integer idProduct) {
		try {
			System.out.println("Iniciando ProductService. Servicio deleteProduct: " + idProduct);
			productService.deleteProduct(idProduct);
		} catch (Exception e) {
			System.out.println("Error ProductController. Servicio createProduct");
			e.printStackTrace();
		}
	}

}
