package io.microprofile.tutorial.store.product.entity;

import lombok.Data;

@Data
// @NoArgsConstructor
// @AllArgsConstructor
public class Product {

    private Long id;
    private String name;
    private String description;
    private Double price;
    
    
    public Product() {}
    
	public Product(Long id, String name, String description, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}    
    
}
