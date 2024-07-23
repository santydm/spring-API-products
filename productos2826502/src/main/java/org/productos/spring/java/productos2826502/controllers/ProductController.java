package org.productos.spring.java.productos2826502.controllers;

import org.productos.spring.java.productos2826502.entities.Product;
import org.productos.spring.java.productos2826502.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    //inyectar el servicio
    private ProductService service = new ProductService();

    //primer endpoint
    //Endpoint: un metodo en un controladora
   @GetMapping("/saludo")
    public String saludo(){
        return  "Hola..... 2826502";
    }

    // segundo endpoint
    //Get: Obtener informacion SIN alterarla
    @GetMapping("/{idproducto}")
    public String findProductById(@PathVariable String idproducto){
       return "aqui se mostrara el producto cuyo id es:" + idproducto;

    }

    @GetMapping
    public List<Product> findAllProducts(){
       // Utilizo el servicio
        return service.findAllProducts();

    };
}
