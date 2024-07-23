package org.productos.spring.java.productos2826502.services;

import org.productos.spring.java.productos2826502.entities.Product;
import org.productos.spring.java.productos2826502.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    //Injectar la dependencia
    //al repositorio
    private ProductRepository repository = new ProductRepository();

    //operaciones de logica de negocio
    //casos de uso, historias de usuario
    //requerimientos funcionales

    public List<Product> findAllProducts(){
        return repository.findAll();
    };

}
