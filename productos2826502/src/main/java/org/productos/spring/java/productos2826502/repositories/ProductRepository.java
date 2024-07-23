package org.productos.spring.java.productos2826502.repositories;

import org.productos.spring.java.productos2826502.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ProductRepository {

    // La lista de un repositorio
    // sea cual sea la fuente
    // la logica de negocio no modifica
    // la lista es una repo
    List<Product> productos = List.of(
            Product.builder()
                    .id(1L)
                    .nombre("Silla Reclinable")
                    .precio(345000.0)
                    .build()
                    ,
            new Product(2l, "Escritorio" , 2000000.0)

    );

    //metodo(comportamiento) para consultar todos
    //los productos del repository
    public List<Product> findAll(){
      return this.productos;

    };
}
