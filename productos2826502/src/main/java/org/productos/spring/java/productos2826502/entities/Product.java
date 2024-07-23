package org.productos.spring.java.productos2826502.entities;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Product {

    private Long id;
    private String nombre;
    private Double precio;
}
