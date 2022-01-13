package com.SimpleCommerce.models.entities;

import com.SimpleCommerce.models.enums.Type;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_product")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_product;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private Type type;

    private Integer stock;

    public Product(){
    }

    public Product(Long id_product, String name, Type type, Integer stock) {
        this.id_product = id_product;
        this.name = name;
        this.type = type;
        this.stock = stock;
    }

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id_product, product.id_product) && Objects.equals(name, product.name) && type == product.type && Objects.equals(stock, product.stock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_product, name, type, stock);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id_product=" + id_product +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", stock=" + stock +
                '}';
    }
}
